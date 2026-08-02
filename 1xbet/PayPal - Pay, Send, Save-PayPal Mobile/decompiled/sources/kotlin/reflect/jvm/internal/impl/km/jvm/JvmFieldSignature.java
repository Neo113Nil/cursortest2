package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes17.dex */
public final class JvmFieldSignature extends kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFieldSignature(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String getDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getName());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(getDescriptor());
        return sb.toString();
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature jvmFieldSignature = (kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, jvmFieldSignature.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, jvmFieldSignature.getHighResolutionOutputSizeshNQ4ISI);
    }
}
