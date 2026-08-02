package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* loaded from: classes10.dex */
public final class S3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bc f29944b;

    public /* synthetic */ S3(Bc bc2, int i11) {
        this.f29943a = i11;
        this.f29944b = bc2;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29943a) {
            case 0:
                ((L5) obj).a(new C4494o7((S7) this.f29944b));
                return Unit.f71690a;
            default:
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) obj;
                X4.a aVar = ((C1) this.f29944b).f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                C4746x1 c4746x1 = (C4746x1) aVar;
                ButtonBnpl buttonBnpl = paymentPlanBnplResponseBody.getButtonBnpl();
                String header = buttonBnpl != null ? buttonBnpl.getHeader() : null;
                if (header == null) {
                    header = "";
                }
                c4746x1.f32444f.setText(header);
                return Unit.f71690a;
        }
    }
}
