package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727w5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1143j5 f16095h;
    public final long i;

    public C1727w5(C0965f5 c0965f5, C0919e4 c0919e4, int i, ViewOnAttachStateChangeListenerC1143j5 viewOnAttachStateChangeListenerC1143j5) {
        super(c0965f5, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c0919e4, i, 53);
        this.f16095h = viewOnAttachStateChangeListenerC1143j5;
        if (viewOnAttachStateChangeListenerC1143j5 != null) {
            if (viewOnAttachStateChangeListenerC1143j5.f14073v <= -2) {
                WeakReference weakReference = viewOnAttachStateChangeListenerC1143j5.f14069r;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    viewOnAttachStateChangeListenerC1143j5.f14073v = -3L;
                }
            }
            this.i = viewOnAttachStateChangeListenerC1143j5.f14073v;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        if (this.f16095h != null) {
            long longValue = ((Long) this.f16395e.invoke(null, Long.valueOf(this.i))).longValue();
            C0919e4 c0919e4 = this.f16394d;
            c0919e4.e();
            C1367o4.T((C1367o4) c0919e4.f10141l, longValue);
        }
    }
}
