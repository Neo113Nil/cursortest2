package B90;

import android.content.Context;
import androidx.lifecycle.InterfaceC5431s;
import j80.C7308a;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.PaymentsAnimator;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsLoaderDelegate;
import ru.ozon.app.android.utils.ApplicationUtilsKt;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapper;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3180b;

    public /* synthetic */ o0(Object obj, int i11) {
        this.f3179a = i11;
        this.f3180b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3179a) {
            case 0:
                v0.i0((v0) this.f3180b);
                break;
            case 1:
                InterfaceC5431s U10 = ((C7308a) this.f3180b).U();
                if (U10 instanceof I30.b) {
                    ((I30.b) U10).o(true);
                    break;
                }
                break;
            case 2:
                ((Function0) this.f3180b).invoke();
                break;
            case 3:
                PinProgressWrapper.bindState$lambda$1$lambda$0((PinProgressWrapper) this.f3180b);
                break;
            case 4:
                NewCredentialsLoaderDelegate.onHideLoaderRequested$lambda$0((NewCredentialsLoaderDelegate) this.f3180b);
                break;
            case 5:
                ApplicationUtilsKt.restartApp$lambda$0((Context) this.f3180b);
                break;
            default:
                PaymentsAnimator.moveList$lambda$1((PaymentsAnimator) this.f3180b);
                break;
        }
    }
}
