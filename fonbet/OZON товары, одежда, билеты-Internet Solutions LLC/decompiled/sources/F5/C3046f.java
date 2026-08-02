package F5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3046f extends AbstractC7737t implements Function1<Long, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f9024b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f9025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3046f(g gVar, int i11) {
        super(1);
        this.f9024b = gVar;
        this.f9025c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l11) {
        return Boolean.valueOf(g.k(this.f9024b, this.f9025c, l11.longValue()));
    }
}
