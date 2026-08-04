package com.google.android.gms.internal.ads;

import E2.o;
import F.G;
import F.H;
import F.t;
import F.w;
import F2.C0254t;
import H2.j;
import I2.J;
import I2.P;
import I2.z;
import J2.n;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
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
import androidx.core.graphics.drawable.IconCompat;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzeaq extends zzbsg {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdqq zzc;
    private final n zzd;
    private final zzeaf zze;
    private String zzf;
    private String zzg;

    public zzeaq(Context context, zzeaf zzeafVar, n nVar, zzdqq zzdqqVar) {
        this.zzb = context;
        this.zzc = zzdqqVar;
        this.zzd = nVar;
        this.zze = zzeafVar;
    }

    public static /* synthetic */ void zzc(zzeaq zzeaqVar, j jVar, DialogInterface dialogInterface, int i7) {
        zzeaqVar.zze.zzc(zzeaqVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "rtsdc", map);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzeaq zzeaqVar, j jVar, DialogInterface dialogInterface) {
        zzeaqVar.zze.zzc(zzeaqVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "rtsdc", map);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static void zzk(zzeaq zzeaqVar, Activity activity, j jVar, DialogInterface dialogInterface, int i7) {
        zzeaqVar.zzw(zzeaqVar.zzf, "rtsdc", k.m("dialog_action", "confirm"));
        activity.startActivity(o.f1952C.f1959e.a(activity));
        zzeaqVar.zzx();
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static /* synthetic */ void zzl(zzeaq zzeaqVar, j jVar, DialogInterface dialogInterface, int i7) {
        zzeaqVar.zze.zzc(zzeaqVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "dialog_click", map);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static /* synthetic */ void zzm(zzeaq zzeaqVar, Activity activity, j jVar, DialogInterface dialogInterface, int i7) {
        zzeaqVar.zzw(zzeaqVar.zzf, "dialog_click", k.m("dialog_action", "confirm"));
        zzeaqVar.zzy(activity, jVar);
    }

    public static /* synthetic */ void zzn(zzeaq zzeaqVar, j jVar, DialogInterface dialogInterface) {
        zzeaqVar.zze.zzc(zzeaqVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "dialog_click", map);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static void zzo(Context context, zzdqq zzdqqVar, zzeaf zzeafVar, String str, String str2) {
        zzp(context, zzdqqVar, zzeafVar, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdqq zzdqqVar, zzeaf zzeafVar, String str, String str2, Map map) {
        String strZze;
        o oVar = o.f1952C;
        String str3 = true != oVar.f1961g.zzA(context) ? "offline" : "online";
        if (zzdqqVar != null) {
            zzdqp zzdqpVarZza = zzdqqVar.zza();
            zzdqpVarZza.zzb("gqi", str);
            zzdqpVarZza.zzb("action", str2);
            zzdqpVarZza.zzb("device_connectivity", str3);
            oVar.j.getClass();
            zzdqpVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdqpVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdqpVarZza.zze();
        } else {
            strZze = "";
        }
        String str4 = strZze;
        o.f1952C.j.getClass();
        zzeafVar.zzd(new zzeah(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzfqe.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzfqe.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, final j jVar) {
        P p5 = o.f1952C.f1957c;
        AlertDialog.Builder onCancelListener = P.j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                j jVar2 = jVar;
                if (jVar2 != null) {
                    jVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzt = zzt(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzt, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzu = zzu();
            if (!TextUtils.isEmpty(strZzu)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            zzdzx zzdzxVar = (zzdzx) this.zza.get(this.zzf);
            Drawable drawableZza = zzdzxVar != null ? zzdzxVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i7) {
        Resources resourcesZze = o.f1952C.f1961g.zze();
        if (resourcesZze == null) {
            return null;
        }
        try {
            return resourcesZze.getLayout(i7);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzdzx zzdzxVar = (zzdzx) this.zza.get(this.zzf);
        return zzdzxVar == null ? "" : zzdzxVar.zzb();
    }

    private static String zzv(int i7, String str) {
        Resources resourcesZze = o.f1952C.f1961g.zze();
        if (resourcesZze == null) {
            return str;
        }
        try {
            return resourcesZze.getString(i7);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private final void zzx() {
        boolean zZzg;
        try {
            P p5 = o.f1952C.f1957c;
            z zVarA = P.a(this.zzb);
            p105o3.b bVar = new p105o3.b(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzdzx zzdzxVar = (zzdzx) this.zza.get(str2);
            zZzg = zVarA.zzg(bVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzdzxVar == null ? "" : zzdzxVar.zzc()));
            if (!zZzg) {
                try {
                    zZzg = zVarA.zzf(new p105o3.b(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e7) {
                    e = e7;
                    int i7 = J.f3546b;
                    J2.j.e("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e8) {
            e = e8;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.zze.zzc(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", zzfwk.zzd());
    }

    private final void zzy(final Activity activity, final j jVar) {
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        if (G.a(new H(activity).f2425a)) {
            zzx();
            zzz(activity, jVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzfwk.zzd());
                return;
            }
            P p7 = oVar.f1957c;
            AlertDialog.Builder builderJ = P.j(activity);
            builderJ.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeaj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    zzeaq.zzk(this.zza, activity, jVar, dialogInterface, i7);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeak
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    zzeaq.zzc(this.zza, jVar, dialogInterface, i7);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeal
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeaq.zzd(this.zza, jVar, dialogInterface);
                }
            });
            builderJ.create().show();
            zzw(this.zzf, "rtsdi", zzfwk.zzd());
        }
    }

    private final void zzz(Activity activity, j jVar) {
        AlertDialog alertDialogZzs = zzs(activity, jVar);
        alertDialogZzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzeap(this, alertDialogZzs, timer, jVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                boolean zZzA = o.f1952C.f1961g.zzA(this.zzb);
                HashMap map = new HashMap();
                char c3 = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c3 = true == zZzA ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        this.zzb.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c3 == 1) {
                        this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeaf.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e7) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e7.toString());
                    int i7 = J.f3546b;
                    J2.j.d(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(String[] strArr, int[] iArr, p105o3.a aVar) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeas zzeasVar = (zzeas) p105o3.b.t0(aVar);
                Activity activityZza = zzeasVar.zza();
                j jVarZzb = zzeasVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i7] == 0) {
                    map.put("dialog_action", "confirm");
                    zzx();
                    zzz(activityZza, jVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (jVarZzb != null) {
                        jVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(p105o3.a aVar) {
        zzeas zzeasVar = (zzeas) p105o3.b.t0(aVar);
        final Activity activityZza = zzeasVar.zza();
        final j jVarZzb = zzeasVar.zzb();
        this.zzf = zzeasVar.zzc();
        this.zzg = zzeasVar.zzd();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziw)).booleanValue()) {
            zzy(activityZza, jVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzfwk.zzd());
        P p5 = o.f1952C.f1957c;
        AlertDialog.Builder builderJ = P.j(activityZza);
        builderJ.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeam
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                zzeaq.zzm(this.zza, activityZza, jVarZzb, dialogInterface, i7);
            }
        }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzean
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                zzeaq.zzl(this.zza, jVarZzb, dialogInterface, i7);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzeaq.zzn(this.zza, jVarZzb, dialogInterface);
            }
        });
        builderJ.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzh() {
        final n nVar = this.zzd;
        this.zze.zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                zzeaf.zzb(nVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzi(p105o3.a aVar, String str, String str2) {
        zzj(aVar, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a7  */
    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzj(p105o3.a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) p105o3.b.t0(aVar);
        String str2 = zzaVar.f10795a;
        String strZzu = zzu();
        o.f1952C.f1959e.c(context);
        String str3 = zzaVar.f10796b;
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        w wVar = new w(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzu)) {
            wVar.f2460e = w.b(zzv(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            wVar.f2460e = w.b(String.format(zzv(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzu));
        }
        wVar.c(16);
        wVar.f2473s.deleteIntent = pendingIntentZzr2;
        wVar.f2462g = pendingIntentZzr;
        wVar.f2473s.icon = context.getApplicationInfo().icon;
        zzbbp zzbbpVar = zzbby.zzix;
        C0254t c0254t = C0254t.f2723d;
        wVar.f2464i = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zziz)).booleanValue()) {
            String str4 = zzaVar.f10797c;
            if (str4.isEmpty()) {
                bitmapDecodeStream = null;
            } else {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
                } catch (IOException unused) {
                    bitmapDecodeStream = null;
                }
            }
        } else {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            try {
                wVar.d(bitmapDecodeStream);
                t tVar = new t();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f9057b = bitmapDecodeStream;
                tVar.f2452c = iconCompat;
                tVar.f2453d = null;
                tVar.f2454e = true;
                wVar.e(tVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, wVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e7) {
            map.put("notification_not_shown_reason", e7.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final void zzq(String str, zzdhc zzdhcVar) {
        String strZzx = zzdhcVar.zzx();
        String strZzB = zzdhcVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzx)) {
            strZzx = strZzB != null ? strZzB : "";
        }
        zzbfj zzbfjVarZzm = zzdhcVar.zzm();
        if (zzbfjVarZzm != null) {
            try {
                string = zzbfjVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfj zzbfjVarZzn = zzdhcVar.zzn();
        Drawable drawable = null;
        if (zzbfjVarZzn != null) {
            try {
                p105o3.a aVarZzf = zzbfjVarZzn.zzf();
                if (aVarZzf != null) {
                    drawable = (Drawable) p105o3.b.t0(aVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzdzt(strZzx, string, drawable));
    }
}
