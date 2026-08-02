package F4;

import bj.C5678f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F4.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3029i extends AbstractC7737t implements Function0<M<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xe.I f8917b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5678f f8918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3029i(xe.I i11, C5678f c5678f) {
        super(0);
        this.f8917b = i11;
        this.f8918c = c5678f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M<Object, Object> invoke() {
        return new C3037q(this.f8917b, this.f8918c.a());
    }
}
