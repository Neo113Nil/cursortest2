package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class X extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P0 f40757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(P0 p02) {
        super(1);
        this.f40757b = p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new W(this.f40757b);
    }
}
