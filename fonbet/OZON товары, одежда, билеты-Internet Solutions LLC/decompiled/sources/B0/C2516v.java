package B0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2516v extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f1991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2516v(U1 u12) {
        super(0);
        this.f1991b = u12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        U1 u12 = this.f1991b;
        return Boolean.valueOf(u12 != null ? ((Boolean) new X1(u12).invoke()).booleanValue() : false);
    }
}
