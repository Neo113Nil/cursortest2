package B90;

import io.sentry.android.core.C7119u;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.PaymentsAnimator;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3176b;

    public /* synthetic */ n0(Object obj, int i11) {
        this.f3175a = i11;
        this.f3176b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3175a) {
            case 0:
                v0.m0((v0) this.f3176b);
                break;
            case 1:
                ((C7119u) this.f3176b).f(null, true);
                break;
            case 2:
                ru.ozon.android.messenger.framework.composer.screen.b.t((ru.ozon.android.messenger.framework.composer.screen.b) this.f3176b);
                break;
            default:
                PaymentsAnimator.moveList$lambda$0((PaymentsAnimator) this.f3176b);
                break;
        }
    }
}
