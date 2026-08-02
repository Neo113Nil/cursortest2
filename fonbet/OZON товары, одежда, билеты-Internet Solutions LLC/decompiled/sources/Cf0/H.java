package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class H extends AbstractC7737t implements Function0<Bf0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(J j11) {
        super(0);
        this.f4842b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bf0.a invoke() {
        J j11 = this.f4842b;
        return new Bf0.a(j11.e(), j11.j());
    }
}
