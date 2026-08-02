package com.payair.csdk;

@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class r2 {
    public static final com.payair.logic.storage.TimestampMap$Companion Companion = new com.payair.logic.storage.TimestampMap$Companion(null);
    public static final kotlinx.serialization.KSerializer[] b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f4307a;

    static {
        kotlinx.serialization.internal.LongSerializer longSerializer = kotlinx.serialization.internal.LongSerializer.INSTANCE;
        b = new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.LinkedHashMapSerializer(longSerializer, longSerializer)};
    }

    public /* synthetic */ r2(int i, java.util.Map map) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.payair.logic.storage.TimestampMap$$serializer.INSTANCE.getDescriptor());
        }
        this.f4307a = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.payair.csdk.r2) && kotlin.jvm.internal.Intrinsics.areEqual(this.f4307a, ((com.payair.csdk.r2) obj).f4307a);
    }

    public final int hashCode() {
        return this.f4307a.hashCode();
    }

    public final java.lang.String toString() {
        java.util.Map map = this.f4307a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimestampMap(value=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public r2(java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.f4307a = map;
    }
}
