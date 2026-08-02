package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V extends AbstractC7737t implements Function0<Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Boolean> f39960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(C5210h<Boolean> c5210h) {
        super(0);
        this.f39960b = c5210h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.f39960b.w());
    }
}
