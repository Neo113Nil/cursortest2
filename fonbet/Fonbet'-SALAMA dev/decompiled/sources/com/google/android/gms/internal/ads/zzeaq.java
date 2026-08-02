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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e1.k;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
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
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "rtsdc", hashMap);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzeaq zzeaqVar, j jVar, DialogInterface dialogInterface) {
        zzeaqVar.zze.zzc(zzeaqVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "rtsdc", hashMap);
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
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "dialog_click", hashMap);
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
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeaqVar.zzw(zzeaqVar.zzf, "dialog_click", hashMap);
        if (jVar != null) {
            jVar.zzb();
        }
    }

    public static void zzo(Context context, zzdqq zzdqqVar, zzeaf zzeafVar, String str, String str2) {
        zzp(context, zzdqqVar, zzeafVar, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdqq zzdqqVar, zzeaf zzeafVar, String str, String str2, Map map) {
        String str3;
        o oVar = o.f1952C;
        String str4 = true != oVar.f1961g.zzA(context) ? "offline" : "online";
        if (zzdqqVar != null) {
            zzdqp zza = zzdqqVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            oVar.j.getClass();
            zza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = "";
        }
        String str5 = str3;
        o.f1952C.j.getClass();
        zzeafVar.zzd(new zzeah(System.currentTimeMillis(), str, str5, 2));
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
                j jVar2 = j.this;
                if (jVar2 != null) {
                    jVar2.zzb();
                }
            }
        });
        XmlResourceParser zzt = zzt(R.layout.offline_ads_dialog);
        if (zzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(zzt, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzu = zzu();
            if (!TextUtils.isEmpty(zzu)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzu);
            }
            zzdzx zzdzxVar = (zzdzx) this.zza.get(this.zzf);
            Drawable zza = zzdzxVar != null ? zzdzxVar.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i7) {
        Resources zze = o.f1952C.f1961g.zze();
        if (zze == null) {
            return null;
        }
        try {
            return zze.getLayout(i7);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzdzx zzdzxVar = (zzdzx) this.zza.get(this.zzf);
        return zzdzxVar == null ? "" : zzdzxVar.zzb();
    }

    private static String zzv(int i7, String str) {
        Resources zze = o.f1952C.f1961g.zze();
        if (zze == null) {
            return str;
        }
        try {
            return zze.getString(i7);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzx() {
        boolean z4;
        try {
            P p5 = o.f1952C.f1957c;
            z a2 = P.a(this.zzb);
            BinderC1507b binderC1507b = new BinderC1507b(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzdzx zzdzxVar = (zzdzx) this.zza.get(str2);
            z4 = a2.zzg(binderC1507b, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzdzxVar == null ? "" : zzdzxVar.zzc()));
            if (!z4) {
                try {
                    z4 = a2.zzf(new BinderC1507b(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e7) {
                    e = e7;
                    int i7 = J.f3546b;
                    J2.j.e("Failed to schedule offline notification poster.", e);
                    if (z4) {
                    }
                }
            }
        } catch (RemoteException e8) {
            e = e8;
            z4 = false;
        }
        if (z4) {
            this.zze.zzc(this.zzf);
            zzw(this.zzf, "offline_notification_worker_not_scheduled", zzfwk.zzd());
        }
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
            AlertDialog.Builder j = P.j(activity);
            j.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeaj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    zzeaq.zzk(zzeaq.this, activity, jVar, dialogInterface, i7);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeak
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    zzeaq.zzc(zzeaq.this, jVar, dialogInterface, i7);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeal
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeaq.zzd(zzeaq.this, jVar, dialogInterface);
                }
            });
            j.create().show();
            zzw(this.zzf, "rtsdi", zzfwk.zzd());
        }
    }

    private final void zzz(Activity activity, j jVar) {
        AlertDialog zzs = zzs(activity, jVar);
        zzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzeap(this, zzs, timer, jVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                boolean zzA = o.f1952C.f1961g.zzA(this.zzb);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r8 = true == zzA ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        this.zzb.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r8 == 1) {
                        this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeaf.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e7) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e7.toString());
                    int i7 = J.f3546b;
                    J2.j.d(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(String[] strArr, int[] iArr, InterfaceC1506a interfaceC1506a) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeas zzeasVar = (zzeas) BinderC1507b.t0(interfaceC1506a);
                Activity zza = zzeasVar.zza();
                j zzb = zzeasVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i7] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzx();
                    zzz(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(InterfaceC1506a interfaceC1506a) {
        zzeas zzeasVar = (zzeas) BinderC1507b.t0(interfaceC1506a);
        final Activity zza = zzeasVar.zza();
        final j zzb = zzeasVar.zzb();
        this.zzf = zzeasVar.zzc();
        this.zzg = zzeasVar.zzd();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziw)).booleanValue()) {
            zzy(zza, zzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzfwk.zzd());
        P p5 = o.f1952C.f1957c;
        AlertDialog.Builder j = P.j(zza);
        j.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeam
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                zzeaq.zzm(zzeaq.this, zza, zzb, dialogInterface, i7);
            }
        }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzean
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                zzeaq.zzl(zzeaq.this, zzb, dialogInterface, i7);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzeaq.zzn(zzeaq.this, zzb, dialogInterface);
            }
        });
        j.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzh() {
        final n nVar = this.zzd;
        this.zze.zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                zzeaf.zzb(n.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzi(InterfaceC1506a interfaceC1506a, String str, String str2) {
        zzj(interfaceC1506a, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(2:6|(9:8|9|(2:21|22)|11|12|13|14|15|16))|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dd, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        String str = zzaVar.f10795a;
        String zzu = zzu();
        o.f1952C.f1959e.c(context);
        String str2 = zzaVar.f10796b;
        PendingIntent zzr = zzr(context, "offline_notification_clicked", str2, str);
        PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str2, str);
        w wVar = new w(context, "offline_notification_channel");
        if (TextUtils.isEmpty(zzu)) {
            wVar.f2460e = w.b(zzv(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            wVar.f2460e = w.b(String.format(zzv(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzu));
        }
        wVar.c(16);
        wVar.f2473s.deleteIntent = zzr2;
        wVar.f2462g = zzr;
        wVar.f2473s.icon = context.getApplicationInfo().icon;
        zzbbp zzbbpVar = zzbby.zzix;
        C0254t c0254t = C0254t.f2723d;
        wVar.f2464i = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zziz)).booleanValue()) {
            String str3 = zzaVar.f10797c;
            if (!str3.isEmpty()) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
                } catch (IOException unused) {
                }
                if (bitmap != null) {
                    try {
                        wVar.d(bitmap);
                        t tVar = new t();
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f9057b = bitmap;
                        tVar.f2452c = iconCompat;
                        tVar.f2453d = null;
                        tVar.f2454e = true;
                        wVar.e(tVar);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                HashMap hashMap = new HashMap();
                notificationManager.notify(str2, 54321, wVar.a());
                String str4 = "offline_notification_impression";
                zzw(str2, str4, hashMap);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, wVar.a());
        String str42 = "offline_notification_impression";
        zzw(str2, str42, hashMap2);
    }

    public final void zzq(String str, zzdhc zzdhcVar) {
        String zzx = zzdhcVar.zzx();
        String zzB = zzdhcVar.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzx)) {
            zzx = zzB != null ? zzB : "";
        }
        zzbfj zzm = zzdhcVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfj zzn = zzdhcVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                InterfaceC1506a zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) BinderC1507b.t0(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzdzt(zzx, str2, drawable));
    }
}
