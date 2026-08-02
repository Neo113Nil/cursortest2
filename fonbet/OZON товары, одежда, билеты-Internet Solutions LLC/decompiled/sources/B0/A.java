package B0;

import K1.C3422b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A extends AbstractC7737t implements Function0<C3422b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f1323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3422b f1324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(U1 u12, C3422b c3422b) {
        super(0);
        this.f1323b = u12;
        this.f1324c = c3422b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C3422b invoke() {
        C3422b e11;
        U1 u12 = this.f1323b;
        return (u12 == null || (e11 = u12.e()) == null) ? this.f1324c : e11;
    }
}
