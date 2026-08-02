package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class J9 extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4524p8 f29281b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f29282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(InterfaceC4524p8 sPayRepository, Vm sPayDataContract) {
        super(9);
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f29281b = sPayRepository;
        this.f29282c = sPayDataContract;
    }
}
