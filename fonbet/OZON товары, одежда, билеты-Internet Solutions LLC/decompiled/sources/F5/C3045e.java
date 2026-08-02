package F5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3045e extends AbstractC7737t implements Function1<Long, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f9022b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f9023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3045e(g gVar, int i11) {
        super(1);
        this.f9022b = gVar;
        this.f9023c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l11) {
        return Boolean.valueOf(g.k(this.f9022b, this.f9023c, l11.longValue()));
    }
}
