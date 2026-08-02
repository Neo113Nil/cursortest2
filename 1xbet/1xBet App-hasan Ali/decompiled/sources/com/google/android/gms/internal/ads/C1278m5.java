package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278m5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14470h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14471j;

    public C1278m5(C0965f5 c0965f5, C0919e4 c0919e4, int i, Context context) {
        super(c0965f5, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c0919e4, i, 31);
        this.i = null;
        this.f14471j = context;
    }

    private final void c() {
        if (((View) this.f14471j) == null) {
            return;
        }
        Boolean bool = (Boolean) Q2.r.f5053d.f5056c.a(F7.f8658A2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f16395e.invoke(null, (View) this.f14471j, (Activity) this.i, bool);
        synchronized (this.f16394d) {
            try {
                C0919e4 c0919e4 = this.f16394d;
                long longValue = ((Long) objArr[0]).longValue();
                c0919e4.e();
                C1367o4.x0((C1367o4) c0919e4.f10141l, longValue);
                C0919e4 c0919e42 = this.f16394d;
                long longValue2 = ((Long) objArr[1]).longValue();
                c0919e42.e();
                C1367o4.z0((C1367o4) c0919e42.f10141l, longValue2);
                if (booleanValue) {
                    C0919e4 c0919e43 = this.f16394d;
                    String str = (String) objArr[2];
                    c0919e43.e();
                    C1367o4.y0((C1367o4) c0919e43.f10141l, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        switch (this.f14470h) {
            case 0:
                c();
                return;
            default:
                C0919e4 c0919e4 = this.f16394d;
                c0919e4.e();
                C1367o4.b0((C1367o4) c0919e4.f10141l, -1L);
                C0919e4 c0919e42 = this.f16394d;
                c0919e42.e();
                C1367o4.X((C1367o4) c0919e42.f10141l, -1L);
                Context context = (Context) this.f14471j;
                if (context == null) {
                    context = this.f16391a.f13438a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.f16395e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (this.f16394d) {
                    C0919e4 c0919e43 = this.f16394d;
                    long longValue = ((Long) ((List) this.i).get(0)).longValue();
                    c0919e43.e();
                    C1367o4.b0((C1367o4) c0919e43.f10141l, longValue);
                    C0919e4 c0919e44 = this.f16394d;
                    long longValue2 = ((Long) ((List) this.i).get(1)).longValue();
                    c0919e44.e();
                    C1367o4.X((C1367o4) c0919e44.f10141l, longValue2);
                }
                return;
        }
    }

    public C1278m5(C0965f5 c0965f5, C0919e4 c0919e4, int i, View view, Activity activity) {
        super(c0965f5, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c0919e4, i, 62);
        this.f14471j = view;
        this.i = activity;
    }
}
