package androidx.compose.foundation.lazy.layout;

import S0.M;
import S0.N;
import androidx.compose.foundation.lazy.layout.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class d extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f.a f39634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f.a aVar) {
        super(1);
        this.f39634b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        return new c(this.f39634b);
    }
}
