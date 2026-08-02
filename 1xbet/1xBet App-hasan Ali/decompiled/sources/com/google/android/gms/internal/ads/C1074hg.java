package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074hg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13770a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.I f13771b;

    /* renamed from: c, reason: collision with root package name */
    public final C1214kn f13772c;

    /* renamed from: d, reason: collision with root package name */
    public final C0766al f13773d;

    /* renamed from: e, reason: collision with root package name */
    public final C0606Hd f13774e;
    public final Qw f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f13775g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0846cc f13776h;
    public InterfaceC0846cc i;

    public C1074hg(Context context, T2.I i, C1214kn c1214kn, C0766al c0766al, C0606Hd c0606Hd, Qw qw, ScheduledExecutorService scheduledExecutorService) {
        this.f13770a = context;
        this.f13771b = i;
        this.f13772c = c1214kn;
        this.f13773d = c0766al;
        this.f13774e = c0606Hd;
        this.f = qw;
        this.f13775g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) Q2.r.f5053d.f5056c.a(F7.L9));
    }

    public final E3.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? AbstractC1400ot.c0(str) : AbstractC1400ot.X(c(str, this.f13773d.f12702a, random), Throwable.class, new C1686v9(this, str, 1), this.f13774e);
    }

    public final E3.a c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        E3.a Z4;
        try {
            A7 a7 = F7.L9;
            Q2.r rVar = Q2.r.f5053d;
            D7 d7 = rVar.f5056c;
            D7 d72 = rVar.f5056c;
            try {
                if (!str.contains((CharSequence) d7.a(a7)) || this.f13771b.n()) {
                    return AbstractC1400ot.c0(str);
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) d72.a(F7.M9), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
                if (motionEvent == null) {
                    try {
                        buildUpon.appendQueryParameter((String) d72.a(F7.N9), "11");
                        return AbstractC1400ot.c0(buildUpon.toString());
                    } catch (Exception e3) {
                        exc = e3;
                        return AbstractC1400ot.Z(exc);
                    }
                }
                C1214kn c1214kn = this.f13772c;
                c1214kn.getClass();
                try {
                    M1.d b3 = M1.d.b(c1214kn.f14285b);
                    c1214kn.f14284a = b3;
                    Z4 = b3 == null ? AbstractC1400ot.Z(new IllegalStateException("MeasurementManagerFutures is null")) : b3.c();
                } catch (Exception e5) {
                    Z4 = AbstractC1400ot.Z(e5);
                }
                return AbstractC1400ot.X(AbstractC1400ot.j0(Hw.r(Z4), new P2.c(this, buildUpon, str, motionEvent, 2), this.f), Throwable.class, new C0565Ca(2, this, buildUpon), this.f13774e);
            } catch (Exception e6) {
                e = e6;
                exc = e;
                return AbstractC1400ot.Z(exc);
            }
        } catch (Exception e7) {
            e = e7;
        }
    }
}
