package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class G extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f8192b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ P f8193c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2990k f8194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C2990k c2990k, P p11, C2990k c2990k2) {
        super(0);
        this.f8192b = c2990k;
        this.f8193c = p11;
        this.f8194d = c2990k2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f8194d.W();
        this.f8192b.i0(this.f8193c);
        return Unit.f71690a;
    }
}
