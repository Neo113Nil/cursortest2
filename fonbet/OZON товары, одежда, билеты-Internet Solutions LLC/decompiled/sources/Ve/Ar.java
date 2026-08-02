package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ar extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4524p8 f28649b;

    /* renamed from: c, reason: collision with root package name */
    public final Vm f28650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ar(InterfaceC4524p8 sPayRepository, Vm sPayDataContract) {
        super(9);
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f28649b = sPayRepository;
        this.f28650c = sPayDataContract;
    }
}
