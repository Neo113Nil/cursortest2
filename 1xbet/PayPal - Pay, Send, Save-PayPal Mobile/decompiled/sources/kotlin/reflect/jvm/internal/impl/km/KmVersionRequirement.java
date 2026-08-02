package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmVersionRequirement {
    private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    public kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kind;
    public kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel level;
    public kotlin.reflect.jvm.internal.impl.km.KmVersion version;

    public final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind getKind() {
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.kind;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setKind(kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmVersionRequirementVersionKind, "");
        this.kind = kmVersionRequirementVersionKind;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel getLevel() {
        kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel = this.level;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setLevel(kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel kmVersionRequirementLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmVersionRequirementLevel, "");
        this.level = kmVersionRequirementLevel;
    }

    public final java.lang.Integer getErrorCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setErrorCode(java.lang.Integer num) {
        this.getHighResolutionOutputSizeshNQ4ISI = num;
    }

    public final java.lang.String getMessage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setMessage(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmVersion getVersion() {
        kotlin.reflect.jvm.internal.impl.km.KmVersion kmVersion = this.version;
        if (kmVersion != null) {
            return kmVersion;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setVersion(kotlin.reflect.jvm.internal.impl.km.KmVersion kmVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmVersion, "");
        this.version = kmVersion;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KmVersionRequirement(kind=");
        sb.append(getKind());
        sb.append(", level=");
        sb.append(getLevel());
        sb.append(", version=");
        sb.append(getVersion());
        sb.append(", errorCode=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", message=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }
}
