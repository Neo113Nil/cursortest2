package com.payair.csdk;

@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class n0 {
    public static final com.payair.logic.storage.EnrollmentNtrMap$Companion Companion = new com.payair.logic.storage.EnrollmentNtrMap$Companion(null);
    public static final kotlinx.serialization.KSerializer[] b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f4287a;

    static {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        b = new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ n0(int i, java.util.Map map) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.payair.logic.storage.EnrollmentNtrMap$$serializer.INSTANCE.getDescriptor());
        }
        this.f4287a = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.payair.csdk.n0) && kotlin.jvm.internal.Intrinsics.areEqual(this.f4287a, ((com.payair.csdk.n0) obj).f4287a);
    }

    public final int hashCode() {
        return this.f4287a.hashCode();
    }

    public final java.lang.String toString() {
        java.util.Map map = this.f4287a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollmentNtrMap(value=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public n0(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.f4287a = map;
    }
}
