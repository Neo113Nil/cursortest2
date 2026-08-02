package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class F0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f20626b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20627c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0 f20628d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z1.s f20629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F0(P p11, Function0<Unit> function0, C0 c02, Z1.s sVar) {
        super(0);
        this.f20626b = p11;
        this.f20627c = function0;
        this.f20628d = c02;
        this.f20629e = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f20626b.f(this.f20627c, this.f20628d, this.f20629e);
        return Unit.f71690a;
    }
}
