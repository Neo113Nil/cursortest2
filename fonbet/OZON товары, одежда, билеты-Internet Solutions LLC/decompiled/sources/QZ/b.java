package QZ;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<l10.c<C7854a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a<C7854a> f23176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a<C7854a> aVar) {
        super(0);
        this.f23176b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final l10.c<C7854a> invoke() {
        return new l10.c<>(this.f23176b.r());
    }
}
