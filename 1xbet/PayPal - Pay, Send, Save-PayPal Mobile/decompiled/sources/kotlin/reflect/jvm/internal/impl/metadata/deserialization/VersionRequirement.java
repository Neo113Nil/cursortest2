package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class VersionRequirement {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion(null);
    private final kotlin.DeprecationLevel Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getHighSpeedVideoFpsRangesFor;
    private final java.lang.Integer getHighSpeedVideoSizes;

    public VersionRequirement(kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind, kotlin.DeprecationLevel deprecationLevel, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deprecationLevel, "");
        this.getHighResolutionOutputSizeshNQ4ISI = version;
        this.getHighSpeedVideoFpsRangesFor = versionKind;
        this.Camera2StreamConfigurationMap = deprecationLevel;
        this.getHighSpeedVideoSizes = num;
        this.getHighSpeedVideoFpsRanges = str;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.DeprecationLevel getLevel() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.Integer getErrorCode() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getMessage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final class Version {
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion(null);
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version INFINITY = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(256, 256, 256);
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoSizes;

        public Version(int i, int i2, int i3) {
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.Camera2StreamConfigurationMap = i3;
        }

        public final java.lang.String asString() {
            java.lang.StringBuilder sb;
            int i;
            if (this.Camera2StreamConfigurationMap == 0) {
                sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                i = this.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                i = this.Camera2StreamConfigurationMap;
            }
            sb.append(i);
            return sb.toString();
        }

        public final void encode(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12) {
            int i;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(this, INFINITY)) {
                return;
            }
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 > 7 || (i = this.getHighResolutionOutputSizeshNQ4ISI) > 15 || (i2 = this.Camera2StreamConfigurationMap) > 127) {
                function12.invoke(java.lang.Integer.valueOf((this.getHighResolutionOutputSizeshNQ4ISI << 8) | i3 | (this.Camera2StreamConfigurationMap << 16)));
            } else {
                function1.invoke(java.lang.Integer.valueOf((i << 3) | i3 | (i2 << 7)));
            }
        }

        public final java.lang.String toString() {
            return asString();
        }

        public static final class Companion {
            private Companion() {
            }

            public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version decode(java.lang.Integer num, java.lang.Integer num2) {
                if (num2 != null) {
                    return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.INFINITY;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version version = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version) obj;
            return this.getHighSpeedVideoSizes == version.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == version.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == version.Camera2StreamConfigurationMap;
        }

        public final int component3() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int component2() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int component1() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("since ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(' ');
        sb.append(this.Camera2StreamConfigurationMap);
        java.lang.String str2 = "";
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" error ");
            sb2.append(this.getHighSpeedVideoSizes.intValue());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(": ");
            sb3.append(this.getHighSpeedVideoFpsRanges);
            str2 = sb3.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement create(int i, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable) {
            kotlin.DeprecationLevel deprecationLevel;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement versionRequirement = versionRequirementTable.get(i);
            if (versionRequirement == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version decode = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version.Companion.decode(versionRequirement.hasVersion() ? java.lang.Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? java.lang.Integer.valueOf(versionRequirement.getVersionFull()) : null);
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level level = versionRequirement.getLevel();
            kotlin.jvm.internal.Intrinsics.checkNotNull(level);
            int i2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Companion.WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = kotlin.DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = kotlin.DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                deprecationLevel = kotlin.DeprecationLevel.HIDDEN;
            }
            kotlin.DeprecationLevel deprecationLevel2 = deprecationLevel;
            java.lang.Integer valueOf = versionRequirement.hasErrorCode() ? java.lang.Integer.valueOf(versionRequirement.getErrorCode()) : null;
            java.lang.String string = versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirement.getVersionKind();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionKind, "");
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement(decode, versionKind, deprecationLevel2, valueOf, string);
        }

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.values().length];
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
