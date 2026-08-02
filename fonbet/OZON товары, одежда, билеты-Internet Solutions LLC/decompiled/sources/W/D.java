package W;

import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.Y0;
import java.util.concurrent.Executor;
import v.C10132s;

/* loaded from: classes8.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32862d;

    public /* synthetic */ D(Object obj, Object obj2, Object obj3, int i11) {
        this.f32859a = i11;
        this.f32860b = obj;
        this.f32861c = obj2;
        this.f32862d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32859a) {
            case 0:
                K.h((K) this.f32860b, (C.s0) this.f32861c, (Y0) this.f32862d);
                break;
            default:
                C10132s.r((C10132s) this.f32860b, (Executor) this.f32861c, (AbstractC5111p) this.f32862d);
                break;
        }
    }
}
