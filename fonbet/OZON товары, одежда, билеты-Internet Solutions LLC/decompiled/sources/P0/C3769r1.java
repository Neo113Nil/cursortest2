package P0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3769r1 extends AbstractC7737t implements Function0<C3787x1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1.d f21324c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ EnumC3790y1 f21325d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<EnumC3790y1, Boolean> f21326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3769r1(boolean z11, Z1.d dVar, EnumC3790y1 enumC3790y1, Function1 function1) {
        super(0);
        this.f21323b = z11;
        this.f21324c = dVar;
        this.f21325d = enumC3790y1;
        this.f21326e = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C3787x1 invoke() {
        return new C3787x1(this.f21323b, this.f21324c, this.f21325d, this.f21326e);
    }
}
