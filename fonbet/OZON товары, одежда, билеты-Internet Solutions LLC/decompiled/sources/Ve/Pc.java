package Ve;

import Lm0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class Pc extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fh f29690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pc(Fh fh2) {
        super(0);
        this.f29690b = fh2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a.b bVar = Lm0.a.f17149a;
        bVar.b("setState");
        bVar.d("setState: " + this.f29690b, new Object[0]);
        return Unit.f71690a;
    }
}
