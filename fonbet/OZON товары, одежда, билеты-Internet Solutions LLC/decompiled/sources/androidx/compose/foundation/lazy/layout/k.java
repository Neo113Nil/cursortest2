package androidx.compose.foundation.lazy.layout;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import x0.InterfaceC10620y;

/* loaded from: classes.dex */
final class k extends AbstractC7737t implements Function0<InterfaceC10620y> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f39654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f39654b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC10620y invoke() {
        return (InterfaceC10620y) ((Function0) this.f39654b.getValue()).invoke();
    }
}
