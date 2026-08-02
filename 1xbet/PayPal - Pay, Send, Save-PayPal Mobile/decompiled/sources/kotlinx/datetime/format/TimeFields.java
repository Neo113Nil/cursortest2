package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\bR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\t\u0010\u0012R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lkotlinx/datetime/format/TimeFields;", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/internal/DecimalFraction;", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getHighSpeedVideoSizes", "Lkotlinx/datetime/format/AmPmMarker;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TimeFields {
    public static final kotlinx.datetime.format.TimeFields INSTANCE = new kotlinx.datetime.format.TimeFields();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getHighResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hour$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getHour();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setHour((java.lang.Integer) obj2);
        }
    }, null, 2, null), 0, 23, null, null, null, 56, null);

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> Camera2StreamConfigurationMap = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$minute$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getMinute();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setMinute((java.lang.Integer) obj2);
        }
    }, null, 2, null), 0, 59, null, null, null, 56, null);

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$second$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getSecond();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setSecond((java.lang.Integer) obj2);
        }
    }, null, 2, null), 0, 59, null, 0, null, 40, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.internal.DecimalFraction> getHighSpeedVideoSizes = new kotlinx.datetime.internal.format.GenericFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$fractionOfSecond$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getFractionOfSecond();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setFractionOfSecond((kotlinx.datetime.internal.DecimalFraction) obj2);
        }
    }, "nanosecond"), null, new kotlinx.datetime.internal.DecimalFraction(0, 9), null, 10, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.format.AmPmMarker> getHighSpeedVideoFpsRanges = new kotlinx.datetime.internal.format.GenericFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$amPm$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getAmPm();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setAmPm((kotlinx.datetime.format.AmPmMarker) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getHighSpeedVideoSizesFor = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.TimeFields$hourOfAmPm$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.TimeFieldContainer) obj).getHourOfAmPm();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.TimeFieldContainer) obj).setHourOfAmPm((java.lang.Integer) obj2);
        }
    }, null, 2, null), 1, 12, null, null, null, 56, null);

    private TimeFields() {
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> Camera2StreamConfigurationMap() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getOutputMinFrameDuration() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.internal.DecimalFraction> getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoSizes;
    }

    public static kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.format.AmPmMarker> getHighSpeedVideoSizes() {
        return getHighSpeedVideoFpsRanges;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.TimeFieldContainer> getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoSizesFor;
    }
}
