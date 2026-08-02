package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Sp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final T2.I f11589a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11590b;

    /* renamed from: c, reason: collision with root package name */
    public final C0606Hd f11591c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f11592d;

    /* renamed from: e, reason: collision with root package name */
    public final C1864z7 f11593e;
    public final Wq f;

    /* renamed from: g, reason: collision with root package name */
    public final U2.a f11594g;

    public Sp(T2.I i, Context context, C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService, C1864z7 c1864z7, Wq wq, U2.a aVar) {
        this.f11589a = i;
        this.f11590b = context;
        this.f11591c = c0606Hd;
        this.f11592d = scheduledExecutorService;
        this.f11593e = c1864z7;
        this.f = wq;
        this.f11594g = aVar;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.f11590b.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.Mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E3.a d() {
        boolean z3;
        E3.a Z4;
        A7 a7 = F7.X9;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            T2.I i = this.f11589a;
            i.o();
            synchronized (i.f5644a) {
                try {
                    SharedPreferences sharedPreferences = i.f;
                    if (sharedPreferences != null) {
                        if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                            z3 = i.f.getBoolean("is_topics_ad_personalization_allowed", false) && !i.f5652k;
                        }
                    }
                    z3 = false;
                } finally {
                }
            }
            if (z3) {
                if (!((Boolean) rVar.f5056c.a(F7.ba)).booleanValue() || this.f.f12098d.f4956I != 2) {
                    if (this.f11594g.f5854m >= ((Integer) rVar.f5056c.a(F7.V9)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) rVar.f5056c.a(F7.W9)).intValue()) {
                            if (((Boolean) rVar.f5056c.a(F7.T9)).booleanValue()) {
                                String str = (String) rVar.f5056c.a(F7.U9);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                Z4 = AbstractC1400ot.l0(this.f11593e.a(false), ((Integer) rVar.f5056c.a(F7.Z9)).intValue(), TimeUnit.MILLISECONDS, this.f11592d);
                            } catch (Exception e3) {
                                Z4 = AbstractC1400ot.Z(e3);
                            }
                            return AbstractC1400ot.l0(AbstractC1400ot.X(AbstractC1400ot.j0(Hw.r(Z4), new C0727Yf(12), this.f11591c), Throwable.class, new N9(12, this), this.f11591c), ((Integer) Q2.r.f5053d.f5056c.a(F7.Z9)).intValue(), TimeUnit.MILLISECONDS, this.f11592d);
                        }
                    }
                }
            }
        }
        return AbstractC1400ot.c0(new C0993fp(-1, 2, ""));
    }
}
