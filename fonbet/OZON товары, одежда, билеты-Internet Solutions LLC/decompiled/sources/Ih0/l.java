package Ih0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f12546b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f12547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, n nVar) {
        super(0);
        this.f12546b = mVar;
        this.f12547c = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        m.d(this.f12546b, null, this.f12547c, false, false);
        return Unit.f71690a;
    }
}
