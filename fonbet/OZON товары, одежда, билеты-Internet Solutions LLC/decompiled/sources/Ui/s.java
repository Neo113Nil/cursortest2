package Ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class s extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4069c f27819b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(C4069c c4069c) {
        super(0);
        this.f27819b = c4069c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C4069c c4069c = this.f27819b;
        c4069c.g0();
        androidx.fragment.app.r activity = c4069c.getActivity();
        if (activity != null) {
            Ti.i iVar = c4069c.f27741j;
            if (iVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            iVar.f(activity, Ti.h.f27190b);
        }
        return Unit.f71690a;
    }
}
