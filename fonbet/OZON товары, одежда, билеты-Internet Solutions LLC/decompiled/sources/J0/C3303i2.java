package J0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.i2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3303i2 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3303i2(InterfaceC3295g2 interfaceC3295g2) {
        super(0);
        this.f13239b = interfaceC3295g2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f13239b.dismiss();
        return Boolean.TRUE;
    }
}
