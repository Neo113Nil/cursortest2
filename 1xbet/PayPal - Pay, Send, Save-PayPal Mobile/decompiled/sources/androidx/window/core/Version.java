package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001b\u0010\"\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/window/core/Version;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "compareTo", "(Landroidx/window/core/Version;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "major", com.visa.cbp.getEncExpo.warmup, "getMajor", "minor", "getMinor", "patch", "getPatch", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "()Ljava/math/BigInteger;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Version implements java.lang.Comparable<androidx.window.core.Version> {
    private static final androidx.window.core.Version CURRENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.Version.Companion INSTANCE = new androidx.window.core.Version.Companion(null);
    private static final androidx.window.core.Version UNKNOWN = new androidx.window.core.Version(0, 0, 0, "");
    private static final androidx.window.core.Version VERSION_0_1 = new androidx.window.core.Version(0, 1, 0, "");
    private static final androidx.window.core.Version VERSION_1_0;
    private final java.lang.String description;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final int major;
    private final int minor;
    private final int patch;

    private Version(int i, int i2, int i3, java.lang.String str) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.description = str;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.window.core.Version$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.math.BigInteger or;
                androidx.window.core.Version version = androidx.window.core.Version.this;
                or = java.math.BigInteger.valueOf(version.major).shiftLeft(32).or(java.math.BigInteger.valueOf(version.minor)).shiftLeft(32).or(java.math.BigInteger.valueOf(version.patch));
                return or;
            }
        });
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor() {
        java.lang.Object value = this.getHighSpeedVideoFpsRangesFor.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.math.BigInteger) value;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (!kotlin.text.StringsKt.isBlank(this.description)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("-");
            sb.append(this.description);
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.major);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(this.minor);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(this.patch);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.window.core.Version other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return getHighSpeedVideoFpsRangesFor().compareTo(other.getHighSpeedVideoFpsRangesFor());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.window.core.Version)) {
            return false;
        }
        androidx.window.core.Version version = (androidx.window.core.Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final int hashCode() {
        return ((((this.major + 527) * 31) + this.minor) * 31) + this.patch;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "<init>", "()V", "", "versionString", "Landroidx/window/core/Version;", "parse", "(Ljava/lang/String;)Landroidx/window/core/Version;", "UNKNOWN", "Landroidx/window/core/Version;", "getUNKNOWN", "()Landroidx/window/core/Version;", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "CURRENT", "getCURRENT"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.core.Version getUNKNOWN() {
            return androidx.window.core.Version.UNKNOWN;
        }

        public final androidx.window.core.Version getVERSION_0_1() {
            return androidx.window.core.Version.VERSION_0_1;
        }

        public final androidx.window.core.Version getVERSION_1_0() {
            return androidx.window.core.Version.VERSION_1_0;
        }

        public final androidx.window.core.Version getCURRENT() {
            return androidx.window.core.Version.CURRENT;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.core.Version parse(java.lang.String versionString) {
            java.lang.String group;
            if (versionString != null) {
                java.lang.String str = versionString;
                if (!kotlin.text.StringsKt.isBlank(str)) {
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        int parseInt = java.lang.Integer.parseInt(group);
                        java.lang.String group2 = matcher.group(2);
                        if (group2 != null) {
                            int parseInt2 = java.lang.Integer.parseInt(group2);
                            java.lang.String group3 = matcher.group(3);
                            if (group3 != null) {
                                int parseInt3 = java.lang.Integer.parseInt(group3);
                                java.lang.String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                                kotlin.jvm.internal.Intrinsics.checkNotNull(group4);
                                return new androidx.window.core.Version(parseInt, parseInt2, parseInt3, group4, null);
                            }
                        }
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.window.core.Version version = new androidx.window.core.Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.core.Version parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    public /* synthetic */ Version(int i, int i2, int i3, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str);
    }
}
