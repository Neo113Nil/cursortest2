package kotlinx.serialization.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.descriptors.n;

@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1797#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
/* loaded from: classes5.dex */
public final class G extends D0 {
    public final m.b l;
    public final Lazy m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(final String name, final int i) {
        super(name, null, i);
        Intrinsics.checkNotNullParameter(name, "name");
        this.l = m.b.a;
        this.m = LazyKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                kotlinx.serialization.descriptors.i c;
                int i2 = i;
                kotlinx.serialization.descriptors.f[] fVarArr = new kotlinx.serialization.descriptors.f[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    c = kotlinx.serialization.descriptors.l.c(name + '.' + this.e[i3], n.d.a, new kotlinx.serialization.descriptors.f[0], new androidx.activity.N(1));
                    fVarArr[i3] = c;
                }
                return fVarArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.D0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kotlinx.serialization.descriptors.f)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        return fVar.getKind() == m.b.a && Intrinsics.areEqual(this.a, fVar.h()) && Intrinsics.areEqual(C1175z0.a(this), C1175z0.a(fVar));
    }

    @Override // kotlinx.serialization.internal.D0, kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.f g(int i) {
        return ((kotlinx.serialization.descriptors.f[]) this.m.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.D0, kotlinx.serialization.descriptors.f
    public final kotlinx.serialization.descriptors.m getKind() {
        return this.l;
    }

    @Override // kotlinx.serialization.internal.D0
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Intrinsics.checkNotNullParameter(this, "<this>");
        kotlinx.serialization.descriptors.j jVar = new kotlinx.serialization.descriptors.j(this);
        int i = 1;
        while (jVar.hasNext()) {
            int i2 = i * 31;
            String str = (String) jVar.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // kotlinx.serialization.internal.D0
    public final String toString() {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(this, "<this>");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(new kotlinx.serialization.descriptors.k(this), ", ", androidx.compose.runtime.t.b('(', this.a, new StringBuilder()), ")", 0, null, null, 56, null);
        return joinToString$default;
    }
}
