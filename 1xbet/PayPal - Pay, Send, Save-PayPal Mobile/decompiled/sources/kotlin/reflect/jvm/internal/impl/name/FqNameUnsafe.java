package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class FqNameUnsafe {
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.Companion Companion = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;
    private transient kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private transient kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private transient kotlin.reflect.jvm.internal.impl.name.Name getOutputFormats;

    public FqNameUnsafe(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = fqName;
    }

    public FqNameUnsafe(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
    }

    private FqNameUnsafe(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = fqNameUnsafe;
        this.getOutputFormats = name2;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt == '.' && !z) {
                    break;
                }
                if (charAt == '`') {
                    z = !z;
                } else if (charAt == '\\') {
                    length--;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length >= 0) {
            java.lang.String substring = this.getHighSpeedVideoSizes.substring(length + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            this.getOutputFormats = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(substring);
            java.lang.String substring2 = this.getHighSpeedVideoSizes.substring(0, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(substring2);
            return;
        }
        this.getOutputFormats = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.name.FqName.ROOT.toUnsafe();
    }

    public final java.lang.String asString() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isSafe() {
        return this.getHighSpeedVideoFpsRanges != null || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) asString(), kotlin.text.Typography.less, 0, false, 6, (java.lang.Object) null) < 0;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName toSafe() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.getHighSpeedVideoFpsRanges;
        if (fqName != null) {
            return fqName;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName(this);
        this.getHighSpeedVideoFpsRanges = fqName2;
        return fqName2;
    }

    public final boolean isRoot() {
        return this.getHighSpeedVideoSizes.length() == 0;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe parent() {
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = this.getHighSpeedVideoFpsRangesFor;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        getHighSpeedVideoFpsRangesFor();
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe2 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe child(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (isRoot()) {
            obj = name2.asString();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(name2.asString());
            obj = sb.toString();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(obj, this, name2);
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name shortName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.getOutputFormats;
        if (name2 != null) {
            return name2;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        getHighSpeedVideoFpsRangesFor();
        kotlin.reflect.jvm.internal.impl.name.Name name3 = this.getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNull(name3);
        return name3;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name shortNameOrSpecial() {
        if (isRoot()) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        return shortName();
    }

    private static final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new java.util.ArrayList();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fqNameUnsafe.parent());
        highResolutionOutputSizeshNQ4ISI.add(fqNameUnsafe.shortName());
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments() {
        return getHighResolutionOutputSizeshNQ4ISI(this);
    }

    public final boolean startsWith(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (isRoot()) {
            return false;
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.getHighSpeedVideoSizes, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            indexOf$default = this.getHighSpeedVideoSizes.length();
        }
        int i = indexOf$default;
        java.lang.String asString = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return i == asString.length() && kotlin.text.StringsKt.regionMatches$default(this.getHighSpeedVideoSizes, 0, asString, 0, i, false, 16, (java.lang.Object) null);
    }

    public final java.lang.String toString() {
        if (!isRoot()) {
            return this.getHighSpeedVideoSizes;
        }
        java.lang.String asString = getHighResolutionOutputSizeshNQ4ISI.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe) obj).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe topLevel(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.lang.String asString = name2.asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
            return new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(asString, kotlin.reflect.jvm.internal.impl.name.FqName.ROOT.toUnsafe(), name2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special("<root>");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
        getHighResolutionOutputSizeshNQ4ISI = special;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\.");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        Camera2StreamConfigurationMap = compile;
    }

    public /* synthetic */ FqNameUnsafe(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name2);
    }
}
