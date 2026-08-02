package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213km implements InterfaceC1752wm {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14277h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C1071hd f14278a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f14279b;

    /* renamed from: c, reason: collision with root package name */
    public final Wq f14280c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f14281d;

    /* renamed from: e, reason: collision with root package name */
    public final Qm f14282e;
    public final Mr f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f14283g;

    public C1213km(Context context, Wq wq, C1071hd c1071hd, C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService, Qm qm, Mr mr) {
        this.f14283g = context;
        this.f14280c = wq;
        this.f14278a = c1071hd;
        this.f14279b = c0606Hd;
        this.f14281d = scheduledExecutorService;
        this.f14282e = qm;
        this.f = mr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1752wm
    public final E3.a a(C1428pc c1428pc) {
        E3.a X4;
        C1071hd c1071hd = this.f14278a;
        String str = c1428pc.f14998n;
        T2.L l5 = P2.o.f4767B.f4771c;
        boolean d5 = T2.L.d(str);
        C0606Hd c0606Hd = (C0606Hd) c1071hd.f13762m;
        if (d5) {
            X4 = AbstractC1400ot.Z(new C1797xm(1));
        } else {
            X4 = AbstractC1400ot.X(((C0606Hd) c1071hd.f13761l).d(new A4(5, c1071hd, c1428pc)), ExecutionException.class, new C0727Yf(2), c0606Hd);
        }
        C0777aw X5 = AbstractC1400ot.X(X4, C1797xm.class, new C1035gm(c1071hd, c1428pc, Binder.getCallingUid(), 0), c0606Hd);
        Jr j5 = AbstractC1668us.j(this.f14283g, 11);
        AbstractC1803xs.M(X5, j5);
        AbstractC1403ow j02 = AbstractC1400ot.j0(X5, new N9(7, this), this.f14279b);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.l5)).booleanValue()) {
            j02 = AbstractC1400ot.X(AbstractC1400ot.l0(j02, ((Integer) r2.f5056c.a(F7.m5)).intValue(), TimeUnit.SECONDS, this.f14281d), TimeoutException.class, new C0727Yf(3), AbstractC0613Id.f9544g);
        }
        AbstractC1803xs.c0(j02, this.f, j5, false);
        j02.a(new Kw(0, j02, new Qt(20, this)), AbstractC0613Id.f9544g);
        return j02;
    }
}
