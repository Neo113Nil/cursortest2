package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\t"}, d2 = {"Lkotlinx/datetime/format/DateFields;", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Lkotlinx/datetime/format/DateFieldContainer;", "getHighSpeedVideoSizes", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighSpeedVideoFpsRanges", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DateFields {
    public static final kotlinx.datetime.format.DateFields INSTANCE = new kotlinx.datetime.format.DateFields();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> Camera2StreamConfigurationMap = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$day$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.DateFieldContainer) obj).getDay();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.DateFieldContainer) obj).setDay((java.lang.Integer) obj2);
        }
    }, null, 2, null), 1, 31, null, null, null, 56, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> getHighResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$isoDayOfWeek$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.DateFieldContainer) obj).getDayOfWeek();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.DateFieldContainer) obj).setDayOfWeek((java.lang.Integer) obj2);
        }
    }, null, 2, null), 1, 7, null, null, null, 56, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateFields$dayOfYear$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.DateFieldContainer) obj).getDayOfYear();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.DateFieldContainer) obj).setDayOfYear((java.lang.Integer) obj2);
        }
    }, null, 2, null), 1, 366, null, null, null, 56, null);

    private DateFields() {
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.DateFieldContainer> getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
