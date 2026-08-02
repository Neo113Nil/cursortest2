package J20;

import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class v extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f13738b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.h f13739c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v(Function1<? super String, Unit> function1, a.h hVar) {
        super(1);
        this.f13738b = function1;
        this.f13739c = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f13738b.invoke(it);
        Function1<String, Unit> f7 = this.f13739c.f();
        if (f7 != null) {
            f7.invoke(it);
        }
        return Unit.f71690a;
    }
}
