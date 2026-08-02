package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.yp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4798yp implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4283gr f32613a;

    public C4798yp(C4283gr c4283gr) {
        this.f32613a = c4283gr;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        AbstractC4663u3 abstractC4663u3 = (AbstractC4663u3) obj;
        C4283gr c4283gr = this.f32613a;
        X4.a aVar = c4283gr.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        ((C4403l3) aVar).f31502c.setText(c4283gr.getString(abstractC4663u3.f32175a));
        X4.a aVar2 = c4283gr.f28693b;
        if (aVar2 == null) {
            throw M7.f29463a;
        }
        SPayMaterialButton sPayMaterialButton = ((C4403l3) aVar2).f31504e;
        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton, "binding.spaySlpbineMbPayOtherButton");
        boolean z11 = abstractC4663u3.f32176b;
        sPayMaterialButton.setVisibility(z11 ? 0 : 8);
        X4.a aVar3 = c4283gr.f28693b;
        if (aVar3 == null) {
            throw M7.f29463a;
        }
        SPayTextView sPayTextView = ((C4403l3) aVar3).f31501b;
        Intrinsics.checkNotNullExpressionValue(sPayTextView, "binding.spaySlpbineActvSubtitle");
        sPayTextView.setVisibility(z11 ? 0 : 4);
        return Unit.f71690a;
    }
}
