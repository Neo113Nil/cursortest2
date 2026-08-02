package androidx.compose.animation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7825i0;

/* loaded from: classes8.dex */
final class d extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f38773b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Boolean> f38774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(boolean z11, Function0<Boolean> function0) {
        super(1);
        this.f38773b = z11;
        this.f38774c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        interfaceC7825i0.x(!this.f38773b && this.f38774c.invoke().booleanValue());
        return Unit.f71690a;
    }
}
