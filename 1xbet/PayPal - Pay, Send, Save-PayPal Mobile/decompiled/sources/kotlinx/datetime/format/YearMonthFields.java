package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/datetime/format/YearMonthFields;", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "", "getHighSpeedVideoFpsRanges", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Camera2StreamConfigurationMap", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighSpeedVideoSizes", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class YearMonthFields {
    public static final kotlinx.datetime.format.YearMonthFields INSTANCE = new kotlinx.datetime.format.YearMonthFields();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.YearMonthFieldContainer, java.lang.Integer> getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.internal.format.GenericFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.YearMonthFields$year$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.YearMonthFieldContainer) obj).getYear();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.YearMonthFieldContainer) obj).setYear((java.lang.Integer) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.YearMonthFieldContainer> getHighSpeedVideoFpsRanges = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.YearMonthFields$month$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.YearMonthFieldContainer) obj).getMonthNumber();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.YearMonthFieldContainer) obj).setMonthNumber((java.lang.Integer) obj2);
        }
    }, null, 2, null), 1, 12, null, null, null, 56, null);

    private YearMonthFields() {
    }

    public static kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.YearMonthFieldContainer, java.lang.Integer> Camera2StreamConfigurationMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.YearMonthFieldContainer> getHighSpeedVideoSizes() {
        return getHighSpeedVideoFpsRanges;
    }
}
