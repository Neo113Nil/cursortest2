package B4;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2594x extends AbstractC7737t implements Function1<C2581j, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f2717b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2584m f2718c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ H f2719d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f2720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2594x(kotlin.jvm.internal.I i11, C2584m c2584m, H h11, Bundle bundle) {
        super(1);
        this.f2717b = i11;
        this.f2718c = c2584m;
        this.f2719d = h11;
        this.f2720e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2581j c2581j) {
        C2581j it = c2581j;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f2717b.f71783a = true;
        C2584m.o(this.f2718c, this.f2719d, this.f2720e, it);
        return Unit.f71690a;
    }
}
