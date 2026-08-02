package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@PublishedApi
@SourceDebugExtension({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
/* loaded from: classes5.dex */
public final class S extends D0 {
    public final boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(String name, T generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.l = true;
    }

    @Override // kotlinx.serialization.internal.D0
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
            if (Intrinsics.areEqual(this.a, fVar.h())) {
                S s = (S) obj;
                if (s.l && Arrays.equals((kotlinx.serialization.descriptors.f[]) this.j.getValue(), (kotlinx.serialization.descriptors.f[]) s.j.getValue())) {
                    int d = fVar.d();
                    int i2 = this.c;
                    if (i2 == d) {
                        for (0; i < i2; i + 1) {
                            i = (Intrinsics.areEqual(g(i).h(), fVar.g(i).h()) && Intrinsics.areEqual(g(i).getKind(), fVar.g(i).getKind())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.D0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.D0, kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return this.l;
    }
}
