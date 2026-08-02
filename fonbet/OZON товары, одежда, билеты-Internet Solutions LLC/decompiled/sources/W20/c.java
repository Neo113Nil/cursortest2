package W20;

import i1.C6987g;
import i1.C6992l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<C6987g, C6992l> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f33219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(AbstractC7799Q abstractC7799Q) {
        super(1);
        this.f33219b = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g c6987g) {
        C6987g drawWithCache = c6987g;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.t(new b(this.f33219b));
    }
}
