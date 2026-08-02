package P0;

import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;

/* renamed from: P0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3779v extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f21414b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f21415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3779v(float f7, long j11) {
        super(1);
        this.f21414b = f7;
        this.f21415c = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
        float f7 = this.f21414b;
        float f11 = 2;
        interfaceC8412e2.U(this.f21415c, P9.a.a(0.0f, interfaceC8412e2.v1(f7) / f11), P9.a.a(C7464j.f(interfaceC8412e2.i()), interfaceC8412e2.v1(f7) / f11), interfaceC8412e2.v1(f7), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        return Unit.f71690a;
    }
}
