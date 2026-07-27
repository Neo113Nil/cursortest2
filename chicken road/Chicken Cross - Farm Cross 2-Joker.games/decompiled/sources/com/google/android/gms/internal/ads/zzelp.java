package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzelp extends zzbzl {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzeaj zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzele zze;
    private String zzf;
    private String zzg;

    public zzelp(Context context, zzele zzeleVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzeaj zzeajVar) {
        this.zzb = context;
        this.zzc = zzeajVar;
        this.zzd = zzuVar;
        this.zze = zzeleVar;
    }

    public static void zzc(Context context, zzeaj zzeajVar, zzele zzeleVar, String str, String str2) {
        zzd(context, zzeajVar, zzeleVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzeaj zzeajVar, zzele zzeleVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzt.zzh().zzt(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzeajVar != null) {
            zzeai zza = zzeajVar.zza();
            zza.zzc("gqi", str);
            zza.zzc("action", str2);
            zza.zzc("device_connectivity", str4);
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zzg();
        } else {
            str3 = "";
        }
        zzeleVar.zze(new zzelg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(ShareConstants.MEDIA_URI, str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzgrj.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        ClipData clipData = zzgrj.zza;
        return zzgrj.zzb(context, 0, intent, 1140850688, 0);
    }

    private final void zzr(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzs();
            zzt(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzv(this.zzf, "asnpdi", zzgxp.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity);
            zzN.setTitle(zzw(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzw(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzelk
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    zzelp.this.zzn(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzw(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzell
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    zzelp.this.zzo(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzelm
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    zzelp.this.zzp(zzmVar, dialogInterface);
                }
            });
            zzN.create().show();
            zzv(this.zzf, "rtsdi", zzgxp.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs() {
        boolean z;
        boolean z2;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            IObjectWrapper wrap = ObjectWrapper.wrap(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzekw zzekwVar = (zzekw) this.zza.get(str2);
            z = zzC.zzg(wrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzekwVar == null ? "" : zzekwVar.zzb()));
            if (z) {
                z2 = true;
            } else {
                try {
                    z2 = zzC.zze(ObjectWrapper.wrap(context), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
                    z2 = z;
                    if (z2) {
                    }
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            z = false;
        }
        if (z2) {
            this.zze.zzd(this.zzf);
            zzv(this.zzf, "offline_notification_worker_not_scheduled", zzgxp.zza());
        }
    }

    private final void zzt(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog zzu = zzu(activity, zzmVar);
        zzu.show();
        Timer timer = new Timer();
        timer.schedule(new zzelh(this, zzu, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzu(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzN(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zza();
                }
            }
        });
        XmlResourceParser zzx = zzx(R.layout.offline_ads_dialog);
        if (zzx == null) {
            onCancelListener.setMessage(zzw(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzx, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzy = zzy();
            if (!TextUtils.isEmpty(zzy)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzy);
            }
            zzekw zzekwVar = (zzekw) this.zza.get(this.zzf);
            Drawable zzc = zzekwVar != null ? zzekwVar.zzc() : null;
            if (zzc != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zzc);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzw(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzv(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzw(int i, String str) {
        Resources zzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        if (zzg == null) {
            return str;
        }
        try {
            return zzg.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser zzx(int i) {
        Resources zzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        if (zzg == null) {
            return null;
        }
        try {
            return zzg.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzy() {
        zzekw zzekwVar = (zzekw) this.zza.get(this.zzf);
        return zzekwVar == null ? "" : zzekwVar.zza();
    }

    public final void zzb(String str, zzdqr zzdqrVar) {
        String zzQ = zzdqrVar.zzQ();
        String zzB = zzdqrVar.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzQ)) {
            zzQ = zzB != null ? zzB : "";
        }
        zzbmv zzD = zzdqrVar.zzD();
        if (zzD != null) {
            try {
                str2 = zzD.zzb().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbmv zzP = zzdqrVar.zzP();
        Drawable drawable = null;
        if (zzP != null) {
            try {
                IObjectWrapper zza = zzP.zza();
                if (zza != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zza);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzekt(zzQ, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra(ShareConstants.MEDIA_URI);
                Context context = this.zzb;
                boolean zzt = com.google.android.gms.ads.internal.zzt.zzh().zzt(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == zzt ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzv(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r9 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzele.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) {
                zzele.zzf(com.google.android.gms.ads.internal.util.client.zzu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzelr zzelrVar = (zzelr) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzelrVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzelrVar.zzb();
        this.zzf = zzelrVar.zzc();
        this.zzg = zzelrVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjQ)).booleanValue()) {
            zzr(zza, zzb);
            return;
        }
        zzv(this.zzf, "dialog_impression", zzgxp.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza);
        zzN.setTitle(zzw(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzw(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzw(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                zzelp.this.zzk(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzw(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                zzelp.this.zzl(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzelp.this.zzm(zzb, dialogInterface);
            }
        });
        zzN.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzelr zzelrVar = (zzelr) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzelrVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzelrVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzs();
                    zzt(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zza();
                    }
                }
                zzv(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        String zzy = zzy();
        com.google.android.gms.ads.internal.zzt.zzf().zze(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzq = zzq(context, "offline_notification_clicked", str2, str);
        PendingIntent zzq2 = zzq(context, "offline_notification_dismissed", str2, str);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(zzy)) {
            builder.setContentTitle(zzw(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzw(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzy));
        }
        builder.setAutoCancel(true).setDeleteIntent(zzq2).setContentIntent(zzq).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjR)).intValue());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjT)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    builder.setLargeIcon(bitmap).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, builder.build());
            String str4 = "offline_notification_impression";
            zzv(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, builder.build());
        String str42 = "offline_notification_impression";
        zzv(str2, str42, hashMap2);
    }

    final /* synthetic */ void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzv(this.zzf, "dialog_click", hashMap);
        zzr(activity, zzmVar);
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }

    final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzv(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzg(activity));
        zzs();
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zza();
        }
    }
}
