package P0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3778u1 extends AbstractC7737t implements Function1<EnumC3790y1, C3787x1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21396b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1.d f21397c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<EnumC3790y1, Boolean> f21398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3778u1(boolean z11, Z1.d dVar, Function1 function1) {
        super(1);
        this.f21396b = z11;
        this.f21397c = dVar;
        this.f21398d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3787x1 invoke(EnumC3790y1 enumC3790y1) {
        Z1.d dVar = this.f21397c;
        Function1<EnumC3790y1, Boolean> function1 = this.f21398d;
        return new C3787x1(this.f21396b, dVar, enumC3790y1, function1);
    }
}
