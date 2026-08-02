package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class H extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f8195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ P f8196c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2990k f8197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C2990k c2990k, P p11, C2990k c2990k2) {
        super(0);
        this.f8195b = c2990k;
        this.f8196c = p11;
        this.f8197d = c2990k2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f8197d.D();
        this.f8195b.i0(this.f8196c);
        return Unit.f71690a;
    }
}
