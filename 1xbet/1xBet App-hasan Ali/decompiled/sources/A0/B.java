package A0;

import android.os.SystemClock;
import android.view.MotionEvent;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f153m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(F f, int i) {
        super(0);
        this.f152l = i;
        this.f153m = f;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        int actionMasked;
        C0053q c0053q;
        switch (this.f152l) {
            case 0:
                F f = this.f153m;
                MotionEvent motionEvent = f.f195C0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    f.f197D0 = SystemClock.uptimeMillis();
                    f.post(f.f206I0);
                }
                return W3.o.f6046a;
            default:
                c0053q = this.f153m.get_viewTreeOwners();
                return c0053q;
        }
    }
}
