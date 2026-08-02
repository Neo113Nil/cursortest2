package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes5.dex */
public final class JvmTypeExtension implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType TYPE = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension.class));
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    private boolean getHighSpeedVideoFpsRangesFor;

    public final boolean isRaw() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setRaw(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType getType() {
        return TYPE;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension jvmTypeExtension = (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension) obj;
        return this.getHighSpeedVideoFpsRangesFor == jvmTypeExtension.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, jvmTypeExtension.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
