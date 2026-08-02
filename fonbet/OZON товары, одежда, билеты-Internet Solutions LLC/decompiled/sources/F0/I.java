package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class I extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f8198b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ P f8199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2990k f8200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C2990k c2990k, P p11, C2990k c2990k2) {
        super(0);
        this.f8198b = c2990k;
        this.f8199c = p11;
        this.f8200d = c2990k2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f8200d.X();
        this.f8198b.i0(this.f8199c);
        return Unit.f71690a;
    }
}
