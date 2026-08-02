package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Hh extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4449mk f29161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hh(C4449mk c4449mk) {
        super(1);
        this.f29161b = c4449mk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C4449mk c4449mk = this.f29161b;
        c4449mk.f31600f.setValue(Boolean.TRUE);
        ((C4238fb) c4449mk.f31598d).b(new C4244fh(it, c4449mk.f31599e));
        return Unit.f71690a;
    }
}
