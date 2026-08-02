package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lkotlinx/datetime/UtcOffset;", "Ljava/io/Serializable;", "Ljava/time/ZoneOffset;", "zoneOffset", "<init>", "(Ljava/time/ZoneOffset;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/io/ObjectInputStream;", "ois", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/ZoneOffset;", "getZoneOffset$kotlinx_datetime", "()Ljava/time/ZoneOffset;", "getTotalSeconds", "totalSeconds", "Companion", "Formats"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.UtcOffsetSerializer.class)
/* loaded from: classes3.dex */
public final class UtcOffset implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.UtcOffset.Companion INSTANCE = new kotlinx.datetime.UtcOffset.Companion(null);
    private static final kotlinx.datetime.UtcOffset ZERO;
    private static final long serialVersionUID = 0;
    private final java.time.ZoneOffset zoneOffset;

    public UtcOffset(java.time.ZoneOffset zoneOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneOffset, "");
        this.zoneOffset = zoneOffset;
    }

    /* renamed from: getZoneOffset$kotlinx_datetime, reason: from getter */
    public final java.time.ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final int getTotalSeconds() {
        return this.zoneOffset.getTotalSeconds();
    }

    public final int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.UtcOffset) && kotlin.jvm.internal.Intrinsics.areEqual(this.zoneOffset, ((kotlinx.datetime.UtcOffset) other).zoneOffset);
    }

    public final java.lang.String toString() {
        java.lang.String zoneOffset = this.zoneOffset.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneOffset, "");
        return zoneOffset;
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/datetime/UtcOffset$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/UtcOffset;", "", "offsetString", "(Ljava/lang/String;)Lkotlinx/datetime/UtcOffset;", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "", "Lkotlin/ExtensionFunctionType;", "block", "Format", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ZERO", "Lkotlinx/datetime/UtcOffset;", "getZERO", "()Lkotlinx/datetime/UtcOffset;", "", "serialVersionUID", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.UtcOffset> serializer() {
            return kotlinx.datetime.serializers.UtcOffsetSerializer.INSTANCE;
        }

        public final kotlinx.datetime.UtcOffset getZERO() {
            return kotlinx.datetime.UtcOffset.ZERO;
        }

        public final kotlinx.datetime.UtcOffset parse(java.lang.CharSequence input, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> format) {
            kotlinx.datetime.UtcOffset highSpeedVideoFpsRangesFor;
            kotlinx.datetime.UtcOffset highSpeedVideoFpsRangesFor2;
            kotlinx.datetime.UtcOffset highSpeedVideoFpsRangesFor3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format == kotlinx.datetime.UtcOffset.Formats.INSTANCE.getISO()) {
                java.time.format.DateTimeFormatter access$getIsoFormat = kotlinx.datetime.UtcOffsetJvmKt.access$getIsoFormat();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getIsoFormat, "");
                highSpeedVideoFpsRangesFor3 = kotlinx.datetime.UtcOffsetJvmKt.getHighSpeedVideoFpsRangesFor(input, access$getIsoFormat);
                return highSpeedVideoFpsRangesFor3;
            }
            if (format == kotlinx.datetime.UtcOffset.Formats.INSTANCE.getISO_BASIC()) {
                java.time.format.DateTimeFormatter access$getIsoBasicFormat = kotlinx.datetime.UtcOffsetJvmKt.access$getIsoBasicFormat();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getIsoBasicFormat, "");
                highSpeedVideoFpsRangesFor2 = kotlinx.datetime.UtcOffsetJvmKt.getHighSpeedVideoFpsRangesFor(input, access$getIsoBasicFormat);
                return highSpeedVideoFpsRangesFor2;
            }
            if (format == kotlinx.datetime.UtcOffset.Formats.INSTANCE.getFOUR_DIGITS()) {
                java.time.format.DateTimeFormatter access$getFourDigitsFormat = kotlinx.datetime.UtcOffsetJvmKt.access$getFourDigitsFormat();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getFourDigitsFormat, "");
                highSpeedVideoFpsRangesFor = kotlinx.datetime.UtcOffsetJvmKt.getHighSpeedVideoFpsRangesFor(input, access$getFourDigitsFormat);
                return highSpeedVideoFpsRangesFor;
            }
            return format.parse(input);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ kotlinx.datetime.UtcOffset parse(java.lang.String offsetString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offsetString, "");
            return parse$default(this, offsetString, null, 2, null);
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> Format(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return kotlinx.datetime.format.UtcOffsetFormat.INSTANCE.build(block);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlinx.datetime.UtcOffset parse$default(kotlinx.datetime.UtcOffset.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat dateTimeFormat, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = kotlinx.datetime.UtcOffsetKt.getIsoUtcOffsetFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.time.ZoneOffset zoneOffset = java.time.ZoneOffset.UTC;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneOffset, "");
        ZERO = new kotlinx.datetime.UtcOffset(zoneOffset);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlinx/datetime/UtcOffset$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;", androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, "getISO_BASIC", "ISO_BASIC", "getFOUR_DIGITS", "FOUR_DIGITS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Formats {
        public static final kotlinx.datetime.UtcOffset.Formats INSTANCE = new kotlinx.datetime.UtcOffset.Formats();

        private Formats() {
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> getISO() {
            return kotlinx.datetime.format.UtcOffsetFormatKt.getISO_OFFSET();
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> getISO_BASIC() {
            return kotlinx.datetime.format.UtcOffsetFormatKt.getISO_OFFSET_BASIC();
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> getFOUR_DIGITS() {
            return kotlinx.datetime.format.UtcOffsetFormatKt.getFOUR_DIGIT_OFFSET();
        }
    }

    private final void readObject(java.io.ObjectInputStream ois) {
        throw new java.io.InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final java.lang.Object writeReplace() {
        return new kotlinx.datetime.Ser(10, this);
    }
}
