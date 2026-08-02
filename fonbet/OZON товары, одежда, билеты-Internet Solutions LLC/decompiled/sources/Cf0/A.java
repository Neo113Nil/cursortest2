package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class A extends AbstractC7737t implements Function0<Zf0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(J j11) {
        super(0);
        this.f4835b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Zf0.a invoke() {
        Ld0.c cVar;
        cVar = this.f4835b.f4844a;
        return new Zf0.a(cVar);
    }
}
