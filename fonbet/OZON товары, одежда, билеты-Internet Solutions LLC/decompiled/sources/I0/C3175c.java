package I0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3175c extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3214w f11452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3175c(InterfaceC3214w interfaceC3214w) {
        super(0);
        this.f11452b = interfaceC3214w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(P9.a.d(this.f11452b.a()));
    }
}
