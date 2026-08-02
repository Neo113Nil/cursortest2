package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
/* renamed from: kotlinx.serialization.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1148l0<T> {

    @JvmField
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T a(Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        this.reference = new SoftReference<>(invoke);
        return invoke;
    }
}
