package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.descriptors.n;

@SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
/* loaded from: classes5.dex */
public final class I {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r0 = r4.b(r0, kotlin.collections.CollectionsKt.emptyList());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlinx.serialization.descriptors.f a(kotlinx.serialization.descriptors.f descriptor, kotlinx.serialization.modules.d module) {
        kotlinx.serialization.descriptors.f a;
        kotlinx.serialization.b b;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(descriptor.getKind(), m.a.a)) {
            return descriptor.isInline() ? a(descriptor.g(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> a2 = kotlinx.serialization.descriptors.b.a(descriptor);
        kotlinx.serialization.descriptors.f fVar = null;
        if (a2 != null && b != null) {
            fVar = b.getDescriptor();
        }
        return (fVar == null || (a = a(fVar, module)) == null) ? descriptor : a;
    }

    public static final H b(kotlinx.serialization.descriptors.f desc, kotlinx.serialization.json.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        kotlinx.serialization.descriptors.m kind = desc.getKind();
        if (kind instanceof kotlinx.serialization.descriptors.d) {
            return H.f;
        }
        if (Intrinsics.areEqual(kind, n.b.a)) {
            return H.d;
        }
        if (!Intrinsics.areEqual(kind, n.c.a)) {
            return H.c;
        }
        kotlinx.serialization.descriptors.f a = a(desc.g(0), bVar.b);
        kotlinx.serialization.descriptors.m kind2 = a.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.e) || Intrinsics.areEqual(kind2, m.b.a)) {
            return H.e;
        }
        throw o.c(a);
    }
}
