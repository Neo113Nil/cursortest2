package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.C1153o;
import kotlinx.serialization.internal.C1160s;
import kotlinx.serialization.internal.C1164u;
import kotlinx.serialization.internal.C1172y;
import kotlinx.serialization.internal.C1174z;
import kotlinx.serialization.internal.InterfaceC1171x0;
import kotlinx.serialization.internal.O0;

@SourceDebugExtension({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n78#1:81\n78#1:82\n78#2:80\n78#2:83\n78#2:84\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n22#1:81\n28#1:82\n54#1:80\n28#1:83\n45#1:84\n*E\n"})
/* loaded from: classes5.dex */
public final class o {
    public static final O0<? extends Object> a;
    public static final O0<Object> b;
    public static final InterfaceC1171x0<? extends Object> c;
    public static final InterfaceC1171x0<Object> d;

    static {
        l factory = new l();
        boolean z = C1153o.a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        boolean z2 = C1153o.a;
        a = z2 ? new C1160s<>(factory) : new C1172y<>(factory);
        androidx.work.impl.utils.f factory2 = new androidx.work.impl.utils.f(1);
        Intrinsics.checkNotNullParameter(factory2, "factory");
        b = z2 ? new C1160s<>(factory2) : new C1172y<>(factory2);
        m factory3 = new m();
        Intrinsics.checkNotNullParameter(factory3, "factory");
        c = z2 ? new C1164u<>(factory3) : new C1174z<>(factory3);
        n factory4 = new n();
        Intrinsics.checkNotNullParameter(factory4, "factory");
        d = z2 ? new C1164u<>(factory4) : new C1174z<>(factory4);
    }
}
