package B90;

import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.presentation.FreshPaymentsAnimator;

/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3163b;

    public /* synthetic */ j0(Object obj, int i11) {
        this.f3162a = i11;
        this.f3163b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3162a) {
            case 0:
                v0.v0((v0) this.f3163b);
                break;
            case 1:
                ((W.f0) this.f3163b).D();
                break;
            default:
                FreshPaymentsAnimator.moveList$lambda$0((FreshPaymentsAnimator) this.f3163b);
                break;
        }
    }
}
