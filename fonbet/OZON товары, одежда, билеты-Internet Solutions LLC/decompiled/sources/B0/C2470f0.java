package B0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import r0.EnumC9142v;

/* renamed from: B0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2470f0 extends AbstractC7737t implements Function0<M1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f1710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2470f0(EnumC9142v enumC9142v) {
        super(0);
        this.f1710b = enumC9142v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M1 invoke() {
        return new M1(this.f1710b);
    }
}
