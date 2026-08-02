package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Wp implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cr f30302a;

    public Wp(Cr cr) {
        this.f30302a = cr;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        String str = (String) obj;
        X4.a aVar = this.f30302a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        SPayTextView spaySllActvLocalSessionId = ((C4368jq) aVar).f31397b;
        Intrinsics.checkNotNullExpressionValue(spaySllActvLocalSessionId, "spaySllActvLocalSessionId");
        spaySllActvLocalSessionId.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str != null) {
            spaySllActvLocalSessionId.setText(str);
        }
        return Unit.f71690a;
    }
}
