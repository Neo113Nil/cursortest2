package QZ;

import j10.InterfaceC7238a;
import j10.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<h.b<C7854a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a<C7854a> f23177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a<C7854a> aVar) {
        super(0);
        this.f23177b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final h.b<C7854a> invoke() {
        InterfaceC7238a<C7854a> store = this.f23177b.r();
        Intrinsics.checkNotNullParameter(store, "store");
        return new h.b<>(store);
    }
}
