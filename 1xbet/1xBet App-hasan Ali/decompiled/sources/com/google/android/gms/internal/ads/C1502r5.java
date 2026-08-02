package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502r5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15265h = 3;
    public final Object i;

    public C1502r5(C0965f5 c0965f5, C0919e4 c0919e4, int i, View view) {
        super(c0965f5, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c0919e4, i, 57);
        this.i = view;
    }

    private final void c() {
        Method method = this.f16395e;
        C1529ro c1529ro = (C1529ro) this.i;
        List list = (List) c1529ro.f15382l;
        c1529ro.f15382l = Collections.EMPTY_LIST;
        int intValue = ((Integer) method.invoke(null, list)).intValue();
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            int t5 = AbstractC1668us.t(intValue);
            c0919e4.e();
            C1367o4.n0((C1367o4) c0919e4.f10141l, t5);
        }
    }

    private final void d() {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
        if (stackTraceElementArr != null) {
            T4 t42 = new T4((String) this.f16395e.invoke(null, stackTraceElementArr));
            synchronized (this.f16394d) {
                try {
                    C0919e4 c0919e4 = this.f16394d;
                    long longValue = t42.f11622h.longValue();
                    c0919e4.e();
                    C1367o4.J((C1367o4) c0919e4.f10141l, longValue);
                    if (((Boolean) t42.i).booleanValue()) {
                        C0919e4 c0919e42 = this.f16394d;
                        int i = true != ((Boolean) t42.f11623j).booleanValue() ? 2 : 1;
                        c0919e42.e();
                        C1367o4.l0((C1367o4) c0919e42.f10141l, i);
                    } else {
                        C0919e4 c0919e43 = this.f16394d;
                        c0919e43.e();
                        C1367o4.l0((C1367o4) c0919e43.f10141l, 3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        switch (this.f15265h) {
            case 0:
                long[] jArr = (long[]) this.f16395e.invoke(null, Long.valueOf(((C1721w) this.i).f16075c), Long.valueOf(((C1721w) this.i).f16076d), Long.valueOf(((C1721w) this.i).f16077e), Long.valueOf(((C1721w) this.i).f));
                synchronized (this.f16394d) {
                    C0919e4 c0919e4 = this.f16394d;
                    long j5 = jArr[0];
                    c0919e4.e();
                    C1367o4.z((C1367o4) c0919e4.f10141l, j5);
                    C0919e4 c0919e42 = this.f16394d;
                    long j6 = jArr[1];
                    c0919e42.e();
                    C1367o4.y((C1367o4) c0919e42.f10141l, j6);
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    A7 a7 = F7.f8881p3;
                    Q2.r rVar = Q2.r.f5053d;
                    Boolean bool = (Boolean) rVar.f5056c.a(a7);
                    Boolean bool2 = (Boolean) rVar.f5056c.a(F7.Aa);
                    String str = (String) this.f16395e.invoke(null, view, this.f16391a.f13438a.getResources().getDisplayMetrics(), bool, bool2);
                    C1100i5 c1100i5 = new C1100i5();
                    HashMap i = AbstractC1803xs.i(str);
                    if (i != null) {
                        c1100i5.f13869g = (Long) i.get(0);
                        c1100i5.f13870h = (Long) i.get(1);
                        c1100i5.i = (Long) i.get(2);
                        c1100i5.f13871j = (Long) i.get(3);
                        c1100i5.f13872k = (Long) i.get(4);
                    }
                    C1277m4 w5 = C1322n4.w();
                    long longValue = c1100i5.f13869g.longValue();
                    w5.e();
                    C1322n4.y((C1322n4) w5.f10141l, longValue);
                    long longValue2 = c1100i5.f13870h.longValue();
                    w5.e();
                    C1322n4.A((C1322n4) w5.f10141l, longValue2);
                    long longValue3 = c1100i5.i.longValue();
                    w5.e();
                    C1322n4.B((C1322n4) w5.f10141l, longValue3);
                    if (bool2.booleanValue()) {
                        long longValue4 = c1100i5.f13872k.longValue();
                        w5.e();
                        C1322n4.z((C1322n4) w5.f10141l, longValue4);
                    }
                    if (bool.booleanValue()) {
                        long longValue5 = c1100i5.f13871j.longValue();
                        w5.e();
                        C1322n4.x((C1322n4) w5.f10141l, longValue5);
                    }
                    C1322n4 c1322n4 = (C1322n4) w5.b();
                    C0919e4 c0919e43 = this.f16394d;
                    c0919e43.e();
                    C1367o4.d0((C1367o4) c0919e43.f10141l, c1322n4);
                    return;
                }
                return;
        }
    }

    public C1502r5(C0965f5 c0965f5, C0919e4 c0919e4, int i, C1721w c1721w) {
        super(c0965f5, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c0919e4, i, 85);
        this.i = c1721w;
    }

    public C1502r5(C0965f5 c0965f5, C0919e4 c0919e4, int i, C1529ro c1529ro) {
        super(c0965f5, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c0919e4, i, 94);
        this.i = c1529ro;
    }

    public C1502r5(C0965f5 c0965f5, C0919e4 c0919e4, int i, StackTraceElement[] stackTraceElementArr) {
        super(c0965f5, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c0919e4, i, 45);
        this.i = stackTraceElementArr;
    }
}
