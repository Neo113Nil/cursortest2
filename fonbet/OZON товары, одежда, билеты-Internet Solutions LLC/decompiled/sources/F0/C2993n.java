package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2993n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8326c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2990k f8327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2993n(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        super(0);
        this.f8325b = l11;
        this.f8326c = l12;
        this.f8327d = c2990k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2990k.F(this.f8327d, this.f8325b, this.f8326c);
        return Unit.f71690a;
    }
}
