package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2994o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8328b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8329c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2990k f8330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2994o(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        super(0);
        this.f8328b = l11;
        this.f8329c = l12;
        this.f8330d = c2990k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2990k.F(this.f8330d, this.f8328b, this.f8329c);
        return Unit.f71690a;
    }
}
