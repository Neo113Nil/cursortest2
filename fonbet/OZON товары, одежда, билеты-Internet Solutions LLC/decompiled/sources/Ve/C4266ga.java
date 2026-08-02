package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.ga, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4266ga implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f31100a;

    public C4266ga(H2 h22) {
        this.f31100a = h22;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        SPayTextView sPayTextView = this.f31100a.f29111j;
        GraphBnpl graphBnpl = ((PaymentPlanBnplResponseBody) obj).getGraphBnpl();
        String header = graphBnpl != null ? graphBnpl.getHeader() : null;
        if (header == null) {
            header = "";
        }
        sPayTextView.setText(header);
        return Unit.f71690a;
    }
}
