package QZ;

import j10.InterfaceC7238a;
import j10.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<h.a<C7854a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a<C7854a> f23178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a<C7854a> aVar) {
        super(0);
        this.f23178b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final h.a<C7854a> invoke() {
        InterfaceC7238a<C7854a> store = this.f23178b.r();
        Intrinsics.checkNotNullParameter(store, "store");
        return new h.a<>(store);
    }
}
