package P1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class T extends AbstractC7737t implements Function1<D, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.d f21525b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(Z1.d dVar) {
        super(1);
        this.f21525b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(D d11) {
        D d12 = d11;
        return "'" + d12.a() + "' " + d12.c();
    }
}
