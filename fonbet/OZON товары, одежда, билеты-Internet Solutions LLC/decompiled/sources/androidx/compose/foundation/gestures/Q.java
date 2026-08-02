package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes.dex */
final class Q extends AbstractC7737t implements Function2<Float, Float, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f39095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(N n11) {
        super(2);
        this.f39095b = n11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Float f7, Float f11) {
        float floatValue = f7.floatValue();
        float floatValue2 = f11.floatValue();
        N n11 = this.f39095b;
        C10727i.c(n11.getCoroutineScope(), null, null, new P(n11, floatValue, floatValue2, null), 3);
        return Boolean.TRUE;
    }
}
