package B4;

import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B4.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2586o extends AbstractC7737t implements Function1<C2581j, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f2700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f2701c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2584m f2702d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f2703e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7704k<C2582k> f2704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2586o(kotlin.jvm.internal.I i11, kotlin.jvm.internal.I i12, C2584m c2584m, boolean z11, C7704k<C2582k> c7704k) {
        super(1);
        this.f2700b = i11;
        this.f2701c = i12;
        this.f2702d = c2584m;
        this.f2703e = z11;
        this.f2704f = c7704k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2581j c2581j) {
        C2581j entry = c2581j;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2700b.f71783a = true;
        this.f2701c.f71783a = true;
        this.f2702d.R(entry, this.f2703e, this.f2704f);
        return Unit.f71690a;
    }
}
