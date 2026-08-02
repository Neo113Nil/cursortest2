package Ya0;

import androidx.activity.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f34882b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f34883c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f34884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, J j11, InterfaceC8142d interfaceC8142d) {
        super(0);
        this.f34882b = cVar;
        this.f34883c = j11;
        this.f34884d = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f34882b.c().invoke(this.f34883c, this.f34884d);
        return Unit.f71690a;
    }
}
