package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import r3.C2350b;

/* loaded from: classes.dex */
public final class Vo implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11939a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11940b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11941c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11942d;

    public Vo(C0568Cd c0568Cd, ScheduledExecutorService scheduledExecutorService, C0606Hd c0606Hd) {
        this.f11939a = 4;
        this.f11940b = c0568Cd;
        this.f11942d = scheduledExecutorService;
        this.f11941c = c0606Hd;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f11939a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            default:
                return 43;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String str5 = null;
        Object obj = this.f11940b;
        Object obj2 = this.f11942d;
        Object obj3 = this.f11941c;
        switch (this.f11939a) {
            case 0:
                Qw qw = (Qw) obj3;
                E3.a j02 = AbstractC1400ot.j0((E3.a) obj, new C0727Yf(9), qw);
                if (((Integer) Q2.r.f5053d.f5056c.a(F7.ac)).intValue() > 0) {
                    j02 = AbstractC1400ot.l0(j02, ((Integer) r4.f5056c.a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return AbstractC1400ot.X(j02, Throwable.class, new C0727Yf(10), qw);
            case 1:
                return ((C0606Hd) obj).d(new S4(11, this));
            case 2:
                Context context = (Context) obj2;
                String str6 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str7 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    T2.H h3 = T2.L.f5672l;
                    Context context2 = C2350b.a(context).f17113k;
                    str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str6, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.oc)).booleanValue()) {
                        try {
                            installSourceInfo = context.getPackageManager().getInstallSourceInfo(str6);
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            str4 = null;
                        }
                        if (installSourceInfo != null) {
                            str4 = installSourceInfo.getInstallingPackageName();
                            try {
                                if (TextUtils.isEmpty(str4)) {
                                    T2.G.m("No installing package name found");
                                    str4 = null;
                                }
                                initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            } catch (PackageManager.NameNotFoundException e5) {
                                e = e5;
                            }
                            try {
                            } catch (PackageManager.NameNotFoundException e6) {
                                e = e6;
                                str5 = initiatingPackageName;
                                P2.o.f4767B.f4774g.i("PackageInfoSignalSource.getInstallSourceInfo", e);
                                str3 = str5;
                                str2 = str4;
                                return AbstractC1400ot.c0(new Ap(str6, valueOf, str7, str, str2, str3));
                            }
                            if (!TextUtils.isEmpty(initiatingPackageName)) {
                                str2 = str4;
                                str3 = initiatingPackageName;
                                return AbstractC1400ot.c0(new Ap(str6, valueOf, str7, str, str2, str3));
                            }
                            T2.G.m("No initiating package name found");
                            str3 = str5;
                            str2 = str4;
                            return AbstractC1400ot.c0(new Ap(str6, valueOf, str7, str, str2, str3));
                        }
                    }
                }
                str2 = null;
                str3 = null;
                return AbstractC1400ot.c0(new Ap(str6, valueOf, str7, str, str2, str3));
            case 3:
                return ((C0606Hd) obj3).d(new S4(24, this));
            default:
                A7 a7 = F7.f8736O2;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (((Boolean) rVar.f5056c.a(F7.f8764T2)).booleanValue()) {
                        D3.o oVar = new D3.o();
                        oVar.f(null);
                        C0606Hd c0606Hd = (C0606Hd) obj3;
                        E3.a j03 = AbstractC1400ot.j0(AbstractC1400ot.d(oVar), new C0727Yf(13), c0606Hd);
                        if (((Boolean) W7.f12023a.s()).booleanValue()) {
                            j03 = AbstractC1400ot.l0(j03, ((Long) W7.f12024b.s()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return AbstractC1400ot.U(j03, Exception.class, new C1383oc(5, this), c0606Hd);
                    }
                }
                return AbstractC1400ot.c0(new C0993fp(-1, 3, null));
        }
    }

    public /* synthetic */ Vo(Object obj, Object obj2, Object obj3, int i) {
        this.f11939a = i;
        this.f11940b = obj;
        this.f11941c = obj2;
        this.f11942d = obj3;
    }
}
