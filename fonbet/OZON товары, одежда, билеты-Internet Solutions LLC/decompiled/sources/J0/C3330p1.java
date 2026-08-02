package J0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3330p1 extends AbstractC7737t implements Function1<Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.d f13357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3330p1(Z1.d dVar) {
        super(1);
        this.f13357b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f7) {
        float f11;
        f7.floatValue();
        Z1.d dVar = this.f13357b;
        f11 = androidx.compose.material.I.f39904a;
        return Float.valueOf(dVar.v1(f11));
    }
}
