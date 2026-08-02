package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n160#2:135\n160#2:139\n1797#3,3:136\n1797#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
/* loaded from: classes5.dex */
public final class E0 {
    public static final int a(kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f[] typeParams) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (fVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int d = fVar.d();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(d > 0)) {
                break;
            }
            int i3 = d - 1;
            int i4 = i * 31;
            String h = fVar.g(fVar.d() - d).h();
            if (h != null) {
                i2 = h.hashCode();
            }
            i = i4 + i2;
            d = i3;
        }
        int d2 = fVar.d();
        int i5 = 1;
        while (true) {
            if (!(d2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = d2 - 1;
            int i7 = i5 * 31;
            kotlinx.serialization.descriptors.m kind = fVar.g(fVar.d() - d2).getKind();
            i5 = i7 + (kind != null ? kind.hashCode() : 0);
            d2 = i6;
        }
    }
}
