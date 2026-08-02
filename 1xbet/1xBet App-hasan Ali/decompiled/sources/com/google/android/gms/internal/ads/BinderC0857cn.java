package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
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
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import game.betting133.sports1xbet.R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0857cn extends E5 implements InterfaceC0590Fb {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13036r = 0;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f13037k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f13038l;

    /* renamed from: m, reason: collision with root package name */
    public final C1482ql f13039m;

    /* renamed from: n, reason: collision with root package name */
    public final U2.m f13040n;

    /* renamed from: o, reason: collision with root package name */
    public final Xm f13041o;

    /* renamed from: p, reason: collision with root package name */
    public String f13042p;

    /* renamed from: q, reason: collision with root package name */
    public String f13043q;

    public BinderC0857cn(Context context, Xm xm, U2.m mVar, C1482ql c1482ql) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f13037k = new HashMap();
        this.f13038l = context;
        this.f13039m = c1482ql;
        this.f13040n = mVar;
        this.f13041o = xm;
    }

    public static void u3(Context context, C1482ql c1482ql, Xm xm, String str, String str2, Map map) {
        String str3;
        P2.o oVar = P2.o.f4767B;
        String str4 = true != oVar.f4774g.a(context) ? "offline" : "online";
        if (c1482ql != null) {
            C1390oj a5 = c1482ql.a();
            a5.k("gqi", str);
            a5.k("action", str2);
            a5.k("device_connectivity", str4);
            oVar.f4776j.getClass();
            a5.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                a5.k((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = ((C1482ql) a5.f14828m).f15165a.f.a((ConcurrentHashMap) a5.f14827l);
        } else {
            str3 = "";
        }
        String str5 = str3;
        P2.o.f4767B.f4776j.getClass();
        K3 k32 = new K3(System.currentTimeMillis(), str, str5, 2);
        xm.getClass();
        xm.d(new C0709Wb(25, xm, k32));
    }

    public static final PendingIntent w3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, St.a(1140850688, intent), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, St.a(201326592, intent), 201326592);
    }

    public static String x3(String str, int i) {
        Resources b3 = P2.o.f4767B.f4774g.b();
        if (b3 == null) {
            return str;
        }
        try {
            return b3.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    public final void A3(Activity activity, S2.d dVar) {
        T2.L l5 = P2.o.f4767B.f4771c;
        if (new d1.l(activity).a()) {
            z3();
            B3(activity, dVar);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Cv cv = Cv.f8103q;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            y3(this.f13042p, "asnpdi", cv);
        } else {
            AlertDialog.Builder j5 = T2.L.j(activity);
            j5.setTitle(x3("Allow app to send you notifications?", R.string.notifications_permission_title)).setPositiveButton(x3("Allow", R.string.notifications_permission_confirm), new Ym(this, activity, dVar, 0)).setNegativeButton(x3("Don't allow", R.string.notifications_permission_decline), new Zm(0, this, dVar)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0768an(this, dVar, 0));
            j5.create().show();
            y3(this.f13042p, "rtsdi", cv);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(Activity activity, S2.d dVar) {
        XmlResourceParser layout;
        AlertDialog create;
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        AlertDialog.Builder onCancelListener = T2.L.j(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC0649Ne(2, dVar));
        Resources b3 = oVar.f4774g.b();
        if (b3 != null) {
            try {
                layout = b3.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
            if (layout != null) {
                onCancelListener.setMessage(x3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
                create = onCancelListener.create();
            } else {
                try {
                    View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                    onCancelListener.setView(inflate);
                    HashMap hashMap = this.f13037k;
                    Um um = (Um) hashMap.get(this.f13042p);
                    String str = um == null ? "" : um.f11809a;
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                        textView.setVisibility(0);
                        textView.setText(str);
                    }
                    Um um2 = (Um) hashMap.get(this.f13042p);
                    Drawable drawable = um2 != null ? um2.f11811c : null;
                    if (drawable != null) {
                        ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                    }
                    create = onCancelListener.create();
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } catch (Resources.NotFoundException unused2) {
                    onCancelListener.setMessage(x3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
                    create = onCancelListener.create();
                }
            }
            create.show();
            Timer timer = new Timer();
            timer.schedule(new C0813bn(create, timer, dVar), 3000L);
        }
        layout = null;
        if (layout != null) {
        }
        create.show();
        Timer timer2 = new Timer();
        timer2.schedule(new C0813bn(create, timer2, dVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void e3(String[] strArr, int[] iArr, InterfaceC2360a interfaceC2360a) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                Wm wm = (Wm) BinderC2361b.t1(interfaceC2360a);
                Activity activity = wm.f12078a;
                HashMap hashMap = new HashMap();
                int i5 = iArr[i];
                S2.d dVar = wm.f12079b;
                if (i5 == 0) {
                    hashMap.put("dialog_action", "confirm");
                    z3();
                    B3(activity, dVar);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (dVar != null) {
                        dVar.a();
                    }
                }
                y3(this.f13042p, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void g() {
        this.f13041o.d(new C1529ro(24, this.f13040n));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void g0(Intent intent) {
        Xm xm = this.f13041o;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C0568Cd c0568Cd = P2.o.f4767B.f4774g;
            Context context = this.f13038l;
            boolean a5 = c0568Cd.a(context);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r10 = true == a5 ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
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
            y3(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = xm.getWritableDatabase();
                if (r10 == 1) {
                    xm.f12236l.execute(new RunnableC1362o(writableDatabase, stringExtra2, this.f13040n, 5));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e3) {
                U2.j.f("Failed to get writable offline buffering database: ".concat(e3.toString()));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(1:32)|4|(1:6)(1:31)|7|(2:9|(9:11|12|(2:24|25)|14|15|16|17|18|19))|30|(0)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r12.put("notification_not_shown_reason", r11.getMessage());
        r11 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(InterfaceC2360a interfaceC2360a, R2.a aVar) {
        Bitmap bitmap;
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        String str = aVar.f5172k;
        Um um = (Um) this.f13037k.get(this.f13042p);
        String str2 = um == null ? "" : um.f11809a;
        P2.o.f4767B.f4773e.n(context);
        String str3 = aVar.f5173l;
        PendingIntent w32 = w3(context, "offline_notification_clicked", str3, str);
        PendingIntent w33 = w3(context, "offline_notification_dismissed", str3, str);
        d1.g gVar = new d1.g(context, "offline_notification_channel");
        Notification notification = gVar.f16879p;
        if (TextUtils.isEmpty(str2)) {
            gVar.f16870e = d1.g.b(x3("You are back online! Let's pick up where we left off", R.string.offline_notification_title));
        } else {
            gVar.f16870e = d1.g.b(String.format(x3("You are back online! Continue learning about %s", R.string.offline_notification_title_with_advertiser), str2));
        }
        notification.flags |= 16;
        notification.deleteIntent = w33;
        gVar.f16871g = w32;
        notification.icon = context.getApplicationInfo().icon;
        A7 a7 = F7.c8;
        Q2.r rVar = Q2.r.f5053d;
        gVar.i = ((Integer) rVar.f5056c.a(a7)).intValue();
        if (((Boolean) rVar.f5056c.a(F7.e8)).booleanValue()) {
            String str4 = aVar.f5174m;
            if (!str4.isEmpty()) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
                } catch (IOException unused) {
                }
                if (bitmap != null) {
                    try {
                        gVar.c(bitmap);
                        d1.e eVar = new d1.e();
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f6959b = bitmap;
                        eVar.f16862b = iconCompat;
                        eVar.f16863c = null;
                        eVar.f16864d = true;
                        gVar.d(eVar);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                HashMap hashMap = new HashMap();
                notificationManager.notify(str3, 54321, gVar.a());
                String str5 = "offline_notification_impression";
                y3(str3, str5, hashMap);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str3, 54321, gVar.a());
        String str52 = "offline_notification_impression";
        y3(str3, str52, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) F5.a(parcel, Intent.CREATOR);
                F5.b(parcel);
                g0(intent);
                break;
            case 2:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                F5.b(parcel);
                i2(h1, new R2.a(readString, readString2, ""));
                break;
            case 3:
                g();
                break;
            case 4:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                x2(h12);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                e3(createStringArray, createIntArray, h13);
                break;
            case 6:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                R2.a aVar = (R2.a) F5.a(parcel, R2.a.CREATOR);
                F5.b(parcel);
                i2(h14, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void v3(String str, Gj gj) {
        String W4 = gj.W();
        String b3 = gj.b();
        String str2 = "";
        if (TextUtils.isEmpty(W4)) {
            W4 = b3 != null ? b3 : "";
        }
        I8 M5 = gj.M();
        if (M5 != null) {
            try {
                str2 = M5.b().toString();
            } catch (RemoteException unused) {
            }
        }
        I8 N5 = gj.N();
        Drawable drawable = null;
        if (N5 != null) {
            try {
                InterfaceC2360a c5 = N5.c();
                if (c5 != null) {
                    drawable = (Drawable) BinderC2361b.t1(c5);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f13037k.put(str, new Um(W4, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0590Fb
    public final void x2(InterfaceC2360a interfaceC2360a) {
        Wm wm = (Wm) BinderC2361b.t1(interfaceC2360a);
        Activity activity = wm.f12078a;
        this.f13042p = wm.f12080c;
        this.f13043q = wm.f12081d;
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.b8)).booleanValue();
        S2.d dVar = wm.f12079b;
        if (booleanValue) {
            A3(activity, dVar);
            return;
        }
        y3(this.f13042p, "dialog_impression", Cv.f8103q);
        T2.L l5 = P2.o.f4767B.f4771c;
        AlertDialog.Builder j5 = T2.L.j(activity);
        j5.setTitle(x3("Open ad when you're back online.", R.string.offline_opt_in_title)).setMessage(x3("We'll send you a notification with a link to the advertiser site.", R.string.offline_opt_in_message)).setPositiveButton(x3("OK", R.string.offline_opt_in_confirm), new Ym(this, activity, dVar, 1)).setNegativeButton(x3("No thanks", R.string.offline_opt_in_decline), new Zm(1, this, dVar)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0768an(this, dVar, 1));
        j5.create().show();
    }

    public final void y3(String str, String str2, Map map) {
        u3(this.f13038l, this.f13039m, this.f13041o, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z3() {
        boolean z3;
        Context context = this.f13038l;
        try {
            T2.L l5 = P2.o.f4767B.f4771c;
            T2.x a5 = T2.L.a(context);
            BinderC2361b binderC2361b = new BinderC2361b(context);
            String str = this.f13043q;
            String str2 = this.f13042p;
            Um um = (Um) this.f13037k.get(str2);
            z3 = a5.zzg(binderC2361b, new R2.a(str, str2, um == null ? "" : um.f11810b));
            if (!z3) {
                try {
                    z3 = a5.zzf(new BinderC2361b(context), this.f13043q, this.f13042p);
                } catch (RemoteException e3) {
                    e = e3;
                    U2.j.g("Failed to schedule offline notification poster.", e);
                    if (z3) {
                    }
                }
            }
        } catch (RemoteException e5) {
            e = e5;
            z3 = false;
        }
        if (z3) {
            this.f13041o.b(this.f13042p);
            y3(this.f13042p, "offline_notification_worker_not_scheduled", Cv.f8103q);
        }
    }
}
