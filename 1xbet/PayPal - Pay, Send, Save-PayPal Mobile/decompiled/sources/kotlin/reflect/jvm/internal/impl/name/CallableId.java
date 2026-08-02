package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class CallableId {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.name.CallableId.Companion Companion = new kotlin.reflect.jvm.internal.impl.name.CallableId.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getOutputMinFrameDuration;

    private CallableId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name2, byte b) {
        this.getInputSizeshNQ4ISI = fqName;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = name2;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.name.SpecialNames.LOCAL;
        getHighSpeedVideoFpsRangesFor = name2;
        Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.name.FqName.Companion.topLevel(name2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        this(fqName, name2, (byte) 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.name.CallableId)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.CallableId callableId = (kotlin.reflect.jvm.internal.impl.name.CallableId) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, callableId.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, callableId.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, callableId.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        int hashCode = this.getInputSizeshNQ4ISI.hashCode();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.getHighSpeedVideoFpsRanges;
        return ((((hashCode + 527) * 31) + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.replace$default(this.getInputSizeshNQ4ISI.asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.getHighSpeedVideoFpsRanges;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }
}
