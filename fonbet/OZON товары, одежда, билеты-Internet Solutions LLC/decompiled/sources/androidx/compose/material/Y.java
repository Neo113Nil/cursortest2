package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Y extends AbstractC7737t implements Function1<Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f39969b = new Y(1);

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f7) {
        return Float.valueOf(f7.floatValue() * 0.7f);
    }
}
