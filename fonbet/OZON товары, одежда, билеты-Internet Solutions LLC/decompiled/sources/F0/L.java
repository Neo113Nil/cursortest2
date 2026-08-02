package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class L extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f8205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C2990k c2990k, C8960o c8960o) {
        super(0);
        this.f8205b = c8960o;
        this.f8206c = c2990k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f8206c.W();
        C8961p.a(this.f8205b);
        return Unit.f71690a;
    }
}
