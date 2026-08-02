package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.ext.SdkExtensions;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.json.JSONObject;
import q3.AbstractC2309b;
import r3.C2350b;
import t3.C2424c;

/* loaded from: classes.dex */
public final /* synthetic */ class S4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11500b;

    public /* synthetic */ S4(int i, Object obj) {
        this.f11499a = i;
        this.f11500b = obj;
    }

    private final Object a() {
        byte[] bArr;
        AbstractC1314mx abstractC1314mx;
        int i = 0;
        So so = (So) this.f11500b;
        so.getClass();
        String str = null;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.F6)).booleanValue() && "requester_type_2".equals(G4.d.Q(so.f11588c.f12098d))) {
            try {
                Ty ty = Ty.f11706b;
                synchronized (ty) {
                    if (!ty.f11707a.containsKey("AES128_GCM")) {
                        throw new GeneralSecurityException("Name AES128_GCM does not exist");
                    }
                    abstractC1314mx = (AbstractC1314mx) ty.f11707a.get("AES128_GCM");
                }
                if (abstractC1314mx == null) {
                    try {
                        abstractC1314mx = AbstractC0952et.i(((C1181jz) Vy.f11970b.d(null)).f14197b.d());
                    } catch (GeneralSecurityException e3) {
                        throw new D2.e("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e3);
                    }
                }
                C0905dr s2 = C0905dr.s(abstractC1314mx);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GA ga = (GA) s2.f13186l;
                    try {
                        int a5 = ga.a(null);
                        Logger logger = EB.f8469m;
                        if (a5 > 4096) {
                            a5 = 4096;
                        }
                        DB db = new DB(byteArrayOutputStream, a5);
                        ga.q(db);
                        if (db.f8182q > 0) {
                            db.I0();
                        }
                        byteArrayOutputStream.close();
                        bArr = byteArrayOutputStream.toByteArray();
                    } catch (Throwable th) {
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Serialize keyset failed");
                }
            } catch (GeneralSecurityException e5) {
                T2.G.m("Failed to generate key".concat(e5.toString()));
                P2.o.f4767B.f4774g.i("CryptoUtils.generateKey", e5);
                bArr = new byte[0];
            }
            str = Base64.encodeToString(bArr, 11);
        }
        return new To(str, i);
    }

    private final Object b() {
        Q2.r rVar;
        String str;
        Qo qo = (Qo) this.f11500b;
        Ul ul = (Ul) qo.f11262c;
        synchronized (ul) {
            A7 a7 = F7.z8;
            rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && ul.f()) {
                long j5 = ul.f11801q;
                P2.o.f4767B.f4776j.getClass();
                if (j5 < System.currentTimeMillis() / 1000) {
                    ul.f11799o = "{}";
                    ul.f11801q = Long.MAX_VALUE;
                    str = "";
                } else if (!ul.f11799o.equals("{}")) {
                    str = ul.f11799o;
                }
            }
            str = "";
        }
        boolean g5 = ul.g();
        boolean g6 = P2.o.f4767B.f4780n.g();
        Ul ul2 = (Ul) qo.f11262c;
        return new C1800xp(str, g5, g6, ul2.f11800p != null, ul2.f11807w < ((Long) rVar.f5056c.a(F7.U8)).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8774V2)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r2 = com.google.android.gms.internal.ads.Ot.g(r0).f(((java.lang.Long) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8832g3)).longValue(), P2.o.f4767B.f4774g.d().n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        if (((java.lang.Boolean) r6.f5056c.a(com.google.android.gms.internal.ads.F7.f8779W2)).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
    
        r5 = com.google.android.gms.internal.ads.Pt.g(r0);
        r0 = com.google.android.gms.internal.ads.Mt.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        if (((U2.a) r1.f11000e).f5854m < ((java.lang.Integer) r6.f5056c.a(com.google.android.gms.internal.ads.F7.f8811c3)).intValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        r3 = r5.f(((java.lang.Long) r6.f5056c.a(com.google.android.gms.internal.ads.F7.h3)).longValue(), P2.o.f4767B.f4774g.d().n());
        r5 = r0.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011f, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0124, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Mt.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0125, code lost:
    
        r4 = ((android.content.SharedPreferences) ((com.google.android.gms.internal.ads.C1667ur) r0.f10741l).f15915m).getBoolean("paidv2_user_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0133, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Mt.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0134, code lost:
    
        r7 = r4;
        r6 = r5;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (((java.lang.Boolean) r6.f5056c.a(com.google.android.gms.internal.ads.F7.f8789Y2)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8784X2)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Oo oo = (Oo) this.f11500b;
        oo.getClass();
        try {
            Context context = (Context) oo.f10998c;
            boolean b3 = ((Wq) oo.f10997b).b();
            E4.a aVar = new E4.a(7);
            E4.a aVar2 = new E4.a(7);
            if (b3) {
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8794Z2)).booleanValue()) {
                    return new Bp(true);
                }
            }
            if (!b3) {
            }
            if (b3) {
            }
            A7 a7 = F7.f8817d3;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                if (((U2.a) oo.f11000e).f5854m < ((Integer) rVar.f5056c.a(F7.f8811c3)).intValue()) {
                    Pt.g(context).h();
                }
            }
            if (!b3) {
            }
            if (b3) {
            }
            E4.a aVar3 = aVar2;
            boolean z3 = true;
            boolean z5 = true;
            return new Bp(aVar, aVar3, z3, z5, b3);
        } catch (IOException e3) {
            P2.o.f4767B.f4774g.i("PerAppIdSignal", e3);
            return new Bp(((Wq) oo.f10997b).b());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:15|(3:17|(1:20)|21)|22|(3:82|83|(20:85|86|25|26|27|(18:29|30|31|32|33|34|(3:37|(3:40|(11:43|44|45|(1:71)(1:49)|50|(8:62|63|(1:67)|69|(1:55)(1:61)|(1:57)(1:60)|58|59)(1:52)|53|(0)(0)|(0)(0)|58|59)(1:42)|38)|72)|73|45|(1:47)|71|50|(0)(0)|53|(0)(0)|(0)(0)|58|59)|78|34|(3:37|(1:38)|72)|73|45|(0)|71|50|(0)(0)|53|(0)(0)|(0)(0)|58|59))|24|25|26|27|(0)|78|34|(0)|73|45|(0)|71|50|(0)(0)|53|(0)(0)|(0)(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x034e, code lost:
    
        if (r0.contains("banner") == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
    
        r22 = 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x00c8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124 A[Catch: Exception -> 0x0143, TRY_LEAVE, TryCatch #14 {Exception -> 0x0143, blocks: (B:27:0x0118, B:29:0x0124), top: B:26:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x0702 -> B:289:0x070e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j5;
        Bundle bundle;
        InterfaceC0638Ma interfaceC0638Ma;
        int i;
        int i5;
        int extensionVersion;
        int extensionVersion2;
        int i6;
        int i7;
        boolean z3;
        int intExtra;
        boolean z5;
        int intExtra2;
        JSONObject jSONObject;
        String str;
        String str2;
        Bundle bundle2;
        Boolean bool;
        FrameLayout frameLayout;
        ActivityInfo activityInfo;
        PackageInfo c5;
        String str3;
        String str4;
        List<ResolveInfo> queryIntentActivities;
        boolean z6;
        Q2.r rVar;
        String str5;
        String string;
        int i8;
        PackageInfo c6;
        LocaleList localeList;
        int size;
        Locale locale;
        int i9;
        int i10 = -1;
        int i11 = 2;
        int i12 = 3;
        int i13 = 1;
        int i14 = 0;
        boolean z7 = false;
        switch (this.f11499a) {
            case 0:
                Context context = (Context) this.f11500b;
                try {
                    return AbstractC1803xs.g(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                Context context2 = ((C0568Cd) this.f11500b).f8013e;
                int i15 = AbstractC1697vc.f16009a;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo c7 = C2350b.a(context2).c(context2.getApplicationInfo().packageName, 4096);
                    if (c7.requestedPermissions != null && c7.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = c7.requestedPermissions;
                            if (i14 < strArr.length) {
                                if ((c7.requestedPermissionsFlags[i14] & 2) != 0) {
                                    arrayList.add(strArr[i14]);
                                }
                                i14++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 2:
                C1340ne c1340ne = (C1340ne) this.f11500b;
                return Boolean.valueOf(c1340ne.f14662c.s(c1340ne.f14663d, c1340ne.f14664e, c1340ne));
            case 3:
                C0585Ee c0585Ee = (C0585Ee) this.f11500b;
                c0585Ee.getClass();
                C1324n6 c1324n6 = P2.o.f4767B.i;
                C1459q6 c1459q6 = c0585Ee.f8532w;
                synchronized (c1324n6.f14580m) {
                    try {
                        j5 = -2;
                        if (((C1503r6) c1324n6.f14583p) != null) {
                            if (((C1414p6) c1324n6.f14581n).A()) {
                                try {
                                    C1503r6 c1503r6 = (C1503r6) c1324n6.f14583p;
                                    Parcel N5 = c1503r6.N();
                                    F5.c(N5, c1459q6);
                                    Parcel Y4 = c1503r6.Y(N5, 3);
                                    long readLong = Y4.readLong();
                                    Y4.recycle();
                                    j5 = readLong;
                                } catch (RemoteException e3) {
                                    U2.j.g("Unable to call into cache service.", e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j5);
            case 4:
                CookieManager cookieManager = (CookieManager) this.f11500b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) Q2.r.f5053d.f5056c.a(F7.f8740P0));
            case 5:
                return ((Lm) this.f11500b).getWritableDatabase();
            case 6:
                return ((Xm) this.f11500b).getWritableDatabase();
            case 7:
                Oo oo = (Oo) this.f11500b;
                oo.getClass();
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) oo.f11000e;
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("type", parent.getClass().getName());
                        bundle3.putInt("index_of_child", indexOfChild);
                        arrayList2.add(bundle3);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new Po((Context) oo.f10998c, ((Wq) oo.f10997b).f12099e, arrayList2, i14);
                }
                return new Po((Context) oo.f10998c, ((Wq) oo.f10997b).f12099e, arrayList2, i14);
            case 8:
                return a();
            case 9:
                Oo oo2 = (Oo) this.f11500b;
                oo2.getClass();
                List<String> asList = Arrays.asList(((String) Q2.r.f5053d.f5056c.a(F7.f8885q1)).split(";"));
                Bundle bundle4 = new Bundle();
                for (String str6 : asList) {
                    try {
                        C0950er b3 = ((C0900dl) oo2.f10998c).b(str6, new JSONObject());
                        b3.a();
                        boolean z8 = ((Kl) oo2.f10997b).f10229b;
                        bundle = new Bundle();
                        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.ib)).booleanValue();
                        interfaceC0638Ma = b3.f13363a;
                        if (!booleanValue || z8) {
                            try {
                                C1651ub l5 = interfaceC0638Ma.l();
                                if (l5 != null) {
                                    try {
                                        bundle.putString("sdk_version", l5.toString());
                                    } catch (Yq unused3) {
                                    }
                                }
                            } catch (Throwable th) {
                                throw new Yq(th);
                                break;
                            }
                        }
                    } catch (Yq unused4) {
                    }
                    try {
                        C1651ub o5 = interfaceC0638Ma.o();
                        if (o5 != null) {
                            try {
                                bundle.putString("adapter_version", o5.toString());
                            } catch (Yq unused5) {
                            }
                        }
                        bundle4.putBundle(str6, bundle);
                    } catch (Throwable th2) {
                        throw new Yq(th2);
                        break;
                    }
                }
                Yo yo = new Yo(0, bundle4);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.ib)).booleanValue()) {
                    ((Zo) oo2.f11000e).f12526b = yo;
                }
                return yo;
            case 10:
                ContentResolver contentResolver = (ContentResolver) this.f11500b;
                return new C0815bp(i14, Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 11:
                Vo vo = (Vo) this.f11500b;
                return new C0815bp(i11, ((Wq) vo.f11941c).f12102j, ((C0584Ed) vo.f11942d).f8518g);
            case 12:
                U2.a aVar = (U2.a) ((Qo) this.f11500b).f11262c;
                A7 a7 = F7.E9;
                D7 d7 = Q2.r.f5053d.f5056c;
                if (!((Boolean) d7.a(a7)).booleanValue()) {
                    return new C1127ip(0, null);
                }
                T2.L l6 = P2.o.f4767B.f4771c;
                try {
                    i5 = Build.VERSION.SDK_INT;
                } catch (Exception e5) {
                    P2.o.f4767B.f4774g.i("AdUtil.getAdServicesExtensionVersion", e5);
                }
                if (i5 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i = SdkExtensions.getExtensionVersion(1000000);
                        return new C1127ip(0, Integer.valueOf(i));
                    }
                }
                if (((Boolean) d7.a(F7.H9)).booleanValue() && aVar.f5854m >= ((Integer) d7.a(F7.G9)).intValue() && i5 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                        return new C1127ip(0, Integer.valueOf(i));
                    }
                }
                i = 0;
                return new C1127ip(0, Integer.valueOf(i));
            case 13:
                AudioManager audioManager = (AudioManager) ((C0770ap) this.f11500b).f12721c.getSystemService("audio");
                P2.o oVar = P2.o.f4767B;
                float a5 = oVar.f4775h.a();
                boolean d5 = oVar.f4775h.d();
                if (audioManager == null) {
                    return new C1171jp(-1, false, false, -1, -1, -1, -1, -1, a5, d5, true);
                }
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ba)).booleanValue()) {
                    i6 = oVar.f4773e.p(audioManager);
                    i7 = audioManager.getStreamMaxVolume(3);
                } else {
                    i6 = -1;
                    i7 = -1;
                }
                return new C1171jp(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i6, i7, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a5, d5, false);
            case 14:
                C0770ap c0770ap = (C0770ap) this.f11500b;
                c0770ap.getClass();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Db)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) c0770ap.f12721c.getSystemService("batterymanager");
                    r9 = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        z5 = batteryManager.isCharging();
                        return new C1261lp(r9, z5);
                    }
                    Intent b5 = c0770ap.b();
                    z3 = b5 != null && ((intExtra2 = b5.getIntExtra("status", -1)) == 2 || intExtra2 == 5);
                } else {
                    Intent b6 = c0770ap.b();
                    z3 = b6 != null && ((intExtra = b6.getIntExtra("status", -1)) == 2 || intExtra == 5);
                    if (b6 != null) {
                        r9 = b6.getIntExtra("level", -1) / b6.getIntExtra("scale", -1);
                    }
                }
                z5 = z3;
                return new C1261lp(r9, z5);
            case 15:
                Oo oo3 = (Oo) this.f11500b;
                Wq wq = (Wq) oo3.f10997b;
                C0989fl c0989fl = (C0989fl) oo3.f10998c;
                c0989fl.getClass();
                A7 a72 = F7.f8770U3;
                Q2.r rVar2 = Q2.r.f5053d;
                boolean booleanValue2 = ((Boolean) rVar2.f5056c.a(a72)).booleanValue();
                D7 d72 = rVar2.f5056c;
                if (booleanValue2 && (str = wq.f) != null && (str2 = (String) oo3.f11000e) != null) {
                    if (!c0989fl.f13493d) {
                        c0989fl.a();
                        if (((Boolean) d72.a(F7.f8775V3)).booleanValue() && !c0989fl.f.getAndSet(true)) {
                            P2.o.f4767B.f4774g.d().f5646c.add(new RunnableC0944el(c0989fl, 1));
                        }
                    }
                    Map map = (Map) c0989fl.f13490a.get(str2);
                    if (map != null) {
                        JSONObject jSONObject2 = (JSONObject) map.get(str);
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        } else {
                            String m5 = AbstractC1668us.m(c0989fl.f13494e, str, str2);
                            if (m5 != null) {
                                jSONObject = (JSONObject) map.get(m5);
                            }
                        }
                        return new C1530rp(0, jSONObject, ((Boolean) d72.a(F7.f8780W3)).booleanValue() ? null : c0989fl.f13491b);
                    }
                }
                jSONObject = null;
                return new C1530rp(0, jSONObject, ((Boolean) d72.a(F7.f8780W3)).booleanValue() ? null : c0989fl.f13491b);
            case 16:
                C0770ap c0770ap2 = (C0770ap) this.f11500b;
                c0770ap2.getClass();
                T2.L l7 = P2.o.f4767B.f4771c;
                A7 a73 = F7.I5;
                Q2.r rVar3 = Q2.r.f5053d;
                boolean booleanValue3 = ((Boolean) rVar3.f5056c.a(a73)).booleanValue();
                Context context3 = c0770ap2.f12721c;
                String string2 = !booleanValue3 ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                A7 a74 = F7.K5;
                D7 d73 = rVar3.f5056c;
                String string3 = ((Boolean) d73.a(a74)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                if (((Boolean) d73.a(F7.J5)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i16 = 0; i16 < 4; i16++) {
                        String str7 = strArr2[i16];
                        if (defaultSharedPreferences.contains(str7)) {
                            bundle2.putString(str7, defaultSharedPreferences.getString(str7, null));
                        }
                    }
                } else {
                    bundle2 = null;
                }
                return new Po(string2, string3, bundle2, 1);
            case 17:
                C0770ap c0770ap3 = (C0770ap) this.f11500b;
                c0770ap3.getClass();
                T2.L l8 = P2.o.f4767B.f4771c;
                Object systemService = c0770ap3.f12721c.getSystemService("display");
                return new C1127ip(1, systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
            case 18:
                return new No(2, "requester_type_2".equals(G4.d.Q(((So) this.f11500b).f11588c.f12098d)));
            case 19:
                Oo oo4 = (Oo) this.f11500b;
                oo4.getClass();
                A7 a75 = F7.A5;
                Q2.r rVar4 = Q2.r.f5053d;
                boolean booleanValue4 = ((Boolean) rVar4.f5056c.a(a75)).booleanValue();
                Set set = (Set) oo4.f11000e;
                if (booleanValue4 && (frameLayout = (FrameLayout) oo4.f10997b) != null && set.contains("banner")) {
                    return new C1710vp(Boolean.valueOf(frameLayout.isHardwareAccelerated()), 0);
                }
                if (((Boolean) rVar4.f5056c.a(F7.B5)).booleanValue() && set.contains("native")) {
                    Context context4 = (Context) oo4.f10998c;
                    if (context4 instanceof Activity) {
                        Activity activity = (Activity) context4;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused6) {
                                bool = null;
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        return new C1710vp(bool, 0);
                    }
                }
                return new C1710vp(null, 0);
            case 20:
                return b();
            case C1639u7.zzm /* 21 */:
                Oo oo5 = (Oo) this.f11500b;
                return new Po((Wq) oo5.f10997b, (PackageInfo) oo5.f10998c, (T2.I) oo5.f11000e, i11);
            case 22:
                Qo qo = (Qo) this.f11500b;
                qo.getClass();
                A7 a76 = F7.f8750Q4;
                Q2.r rVar5 = Q2.r.f5053d;
                if (((Boolean) rVar5.f5056c.a(a76)).booleanValue()) {
                    A7 a77 = F7.b5;
                    D7 d74 = rVar5.f5056c;
                    if (!((Boolean) d74.a(a77)).booleanValue()) {
                        Set set2 = (Set) qo.f11262c;
                        if (!set2.contains("rewarded")) {
                            if (!set2.contains("interstitial")) {
                                if (!set2.contains("native")) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!((Boolean) d74.a(F7.c5)).booleanValue()) {
                        P2.o.f4767B.f4789w.getClass();
                        return new To(Oi.f(), i12);
                    }
                    if (Qo.f11259d == null) {
                        P2.o.f4767B.f4789w.getClass();
                        Qo.f11259d = Oi.f();
                    }
                    return new To(Qo.f11259d, i12);
                }
                return new To(null, i12);
            case 23:
                return c();
            case 24:
                Vo vo2 = (Vo) this.f11500b;
                C1204kd c1204kd = (C1204kd) vo2.f11940b;
                Context context5 = (Context) vo2.f11942d;
                if (!c1204kd.e(context5)) {
                    return new Ip(null, null, null, null, null);
                }
                String c8 = c1204kd.c(context5);
                String str8 = c8 == null ? "" : c8;
                String b7 = c1204kd.b(context5);
                String str9 = b7 == null ? "" : b7;
                String a6 = c1204kd.a(context5);
                String str10 = a6 == null ? "" : a6;
                String str11 = true != c1204kd.e(context5) ? null : "fa";
                return new Ip(str8, str9, str10, str11 == null ? "" : str11, "TIME_OUT".equals(str9) ? (Long) Q2.r.f5053d.f5056c.a(F7.f8848k0) : null);
            case 25:
                Oo oo6 = (Oo) this.f11500b;
                Context context6 = (Context) oo6.f10998c;
                boolean d6 = C2350b.a(context6).d();
                T2.L l9 = P2.o.f4767B.f4771c;
                boolean e6 = T2.L.e(context6);
                String str12 = ((U2.a) oo6.f10997b).f5852k;
                int myUid = Process.myUid();
                boolean z9 = myUid == 0 || myUid == 1000;
                ApplicationInfo applicationInfo = context6.getApplicationInfo();
                return new Jp(d6, e6, str12, z9, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, C2424c.d(context6, ModuleDescriptor.MODULE_ID, false), C2424c.a(context6, ModuleDescriptor.MODULE_ID), (String) oo6.f11000e);
            case 26:
                C0770ap c0770ap4 = (C0770ap) this.f11500b;
                c0770ap4.getClass();
                return new Yo(3, G4.l.Q(c0770ap4.f12721c, (String) Q2.r.f5053d.f5056c.a(F7.L5)));
            case 27:
                Context context7 = ((C0770ap) this.f11500b).f12721c;
                return new Pp(AbstractC1668us.X(context7, "init_without_write"), AbstractC1668us.X(context7, "crash_without_write"));
            case 28:
                Context context8 = ((C0770ap) this.f11500b).f12721c;
                PackageManager packageManager = context8.getPackageManager();
                Locale locale2 = Locale.getDefault();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                String country = locale2.getCountry();
                T2.L l10 = P2.o.f4767B.f4771c;
                U2.e eVar = C0379q.f.f5048a;
                boolean j6 = U2.e.j();
                boolean g5 = AbstractC2309b.g(context8);
                boolean j7 = AbstractC2309b.j(context8);
                String language = locale2.getLanguage();
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT >= 24) {
                    localeList = LocaleList.getDefault();
                    for (int i17 = 0; i17 < size; i17++) {
                        locale = localeList.get(i17);
                        arrayList3.add(locale.getLanguage());
                    }
                    break;
                }
                ResolveInfo resolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
                if (resolveActivity3 != null && (activityInfo = resolveActivity3.activityInfo) != null) {
                    try {
                        c5 = C2350b.a(context8).c(activityInfo.packageName, 0);
                    } catch (PackageManager.NameNotFoundException unused7) {
                    }
                    if (c5 != null) {
                        str3 = c5.versionCode + "." + activityInfo.packageName;
                        c6 = C2350b.a(context8).c("com.android.vending", 128);
                        if (c6 != null) {
                            int i18 = 1;
                            try {
                                str4 = c6.versionCode + "." + c6.packageName;
                                i13 = 1;
                            } catch (Exception unused8) {
                                i13 = i18;
                                str4 = null;
                                String str13 = Build.FINGERPRINT;
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                                ResolveInfo resolveActivity4 = packageManager.resolveActivity(intent, 0);
                                queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                                if (queryIntentActivities != null) {
                                }
                                z6 = false;
                                T2.L l11 = P2.o.f4767B.f4771c;
                                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                A7 a78 = F7.Ua;
                                rVar = Q2.r.f5053d;
                                if (((Boolean) rVar.f5056c.a(a78)).booleanValue()) {
                                }
                                if (((Boolean) rVar.f5056c.a(F7.Ya)).booleanValue()) {
                                }
                                str5 = string;
                                if (resolveActivity2 == null) {
                                }
                                if (resolveActivity == null) {
                                }
                                String str14 = Build.MODEL;
                                return new Qp(r13, r14, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes, r26, str5, Build.VERSION.SDK_INT);
                            }
                            String str132 = Build.FINGERPRINT;
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity42 = packageManager.resolveActivity(intent2, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
                            if (queryIntentActivities != null && resolveActivity42 != null) {
                                for (i8 = 0; i8 < queryIntentActivities.size(); i8 += i13) {
                                    if (resolveActivity42.activityInfo.name.equals(queryIntentActivities.get(i8).activityInfo.name)) {
                                        z6 = resolveActivity42.activityInfo.packageName.equals(AbstractC0952et.l(context8));
                                        T2.L l112 = P2.o.f4767B.f4771c;
                                        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                        A7 a782 = F7.Ua;
                                        rVar = Q2.r.f5053d;
                                        boolean z10 = (((Boolean) rVar.f5056c.a(a782)).booleanValue() || !T2.L.c(context8)) ? 0 : i13;
                                        if (((Boolean) rVar.f5056c.a(F7.Ya)).booleanValue()) {
                                            try {
                                                Bundle bundle5 = C2350b.a(context8).b(context8.getPackageName(), 128).metaData;
                                                string = (bundle5 != null && bundle5.containsKey("com.google.unity.ads.UNITY_VERSION")) ? bundle5.getString("com.google.unity.ads.UNITY_VERSION") : "";
                                            } catch (PackageManager.NameNotFoundException unused9) {
                                            }
                                            str5 = null;
                                            boolean z11 = resolveActivity2 == null ? i13 : 0;
                                            boolean z12 = resolveActivity == null ? i13 : 0;
                                            String str142 = Build.MODEL;
                                            return new Qp(z12, z11, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes2, z10, str5, Build.VERSION.SDK_INT);
                                        }
                                        str5 = string;
                                        if (resolveActivity2 == null) {
                                        }
                                        if (resolveActivity == null) {
                                        }
                                        String str1422 = Build.MODEL;
                                        return new Qp(z12, z11, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes2, z10, str5, Build.VERSION.SDK_INT);
                                    }
                                }
                            }
                            z6 = false;
                            T2.L l1122 = P2.o.f4767B.f4771c;
                            long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            A7 a7822 = F7.Ua;
                            rVar = Q2.r.f5053d;
                            if (((Boolean) rVar.f5056c.a(a7822)).booleanValue()) {
                            }
                            if (((Boolean) rVar.f5056c.a(F7.Ya)).booleanValue()) {
                            }
                            str5 = string;
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str14222 = Build.MODEL;
                            return new Qp(z12, z11, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes22, z10, str5, Build.VERSION.SDK_INT);
                        }
                        str4 = null;
                        String str1322 = Build.FINGERPRINT;
                        Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity422 = packageManager.resolveActivity(intent22, 0);
                        queryIntentActivities = packageManager.queryIntentActivities(intent22, 65536);
                        if (queryIntentActivities != null) {
                            while (i8 < queryIntentActivities.size()) {
                            }
                        }
                        z6 = false;
                        T2.L l11222 = P2.o.f4767B.f4771c;
                        long availableBytes222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        A7 a78222 = F7.Ua;
                        rVar = Q2.r.f5053d;
                        if (((Boolean) rVar.f5056c.a(a78222)).booleanValue()) {
                        }
                        if (((Boolean) rVar.f5056c.a(F7.Ya)).booleanValue()) {
                        }
                        str5 = string;
                        if (resolveActivity2 == null) {
                        }
                        if (resolveActivity == null) {
                        }
                        String str142222 = Build.MODEL;
                        return new Qp(z12, z11, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes222, z10, str5, Build.VERSION.SDK_INT);
                    }
                }
                str3 = null;
                c6 = C2350b.a(context8).c("com.android.vending", 128);
                if (c6 != null) {
                }
                str4 = null;
                String str13222 = Build.FINGERPRINT;
                Intent intent222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity4222 = packageManager.resolveActivity(intent222, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent222, 65536);
                if (queryIntentActivities != null) {
                }
                z6 = false;
                T2.L l112222 = P2.o.f4767B.f4771c;
                long availableBytes2222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                A7 a782222 = F7.Ua;
                rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a782222)).booleanValue()) {
                }
                if (((Boolean) rVar.f5056c.a(F7.Ya)).booleanValue()) {
                }
                str5 = string;
                if (resolveActivity2 == null) {
                }
                if (resolveActivity == null) {
                }
                String str1422222 = Build.MODEL;
                return new Qp(z12, z11, country, j6, g5, j7, language, arrayList3, str3, str4, z6, availableBytes2222, z10, str5, Build.VERSION.SDK_INT);
            default:
                Context context9 = ((C0770ap) this.f11500b).f12721c;
                TelephonyManager telephonyManager = (TelephonyManager) context9.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                P2.o oVar2 = P2.o.f4767B;
                T2.L l12 = oVar2.f4771c;
                if (T2.L.b(context9, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context9.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                        i9 = type;
                        i10 = ordinal;
                    } else {
                        i9 = -1;
                    }
                    z7 = connectivityManager.isActiveNetworkMetered();
                } else {
                    i9 = -2;
                }
                return new Rp(networkOperator, i9, oVar2.f4773e.r(context9), phoneType, z7, i10);
        }
    }
}
