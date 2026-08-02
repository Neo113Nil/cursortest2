package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0007\u0010\r"}, d2 = {"Lkotlinx/datetime/format/OffsetFields;", "", "<init>", "()V", "Lkotlinx/datetime/format/OffsetFields$sign$1;", "getHighSpeedVideoFpsRanges", "Lkotlinx/datetime/format/OffsetFields$sign$1;", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighSpeedVideoSizes", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class OffsetFields {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighResolutionOutputSizeshNQ4ISI;
    public static final kotlinx.datetime.format.OffsetFields INSTANCE = new kotlinx.datetime.format.OffsetFields();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlinx.datetime.format.OffsetFields$sign$1 Camera2StreamConfigurationMap;
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighSpeedVideoFpsRangesFor;
    private static final kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighSpeedVideoSizes;

    private OffsetFields() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.datetime.format.OffsetFields$sign$1] */
    static {
        ?? r0 = new kotlinx.datetime.internal.format.FieldSign<kotlinx.datetime.format.UtcOffsetFieldContainer>() { // from class: kotlinx.datetime.format.OffsetFields$sign$1
            private final kotlinx.datetime.internal.format.PropertyAccessor<kotlinx.datetime.format.UtcOffsetFieldContainer, java.lang.Boolean> isNegative = new kotlinx.datetime.internal.format.PropertyAccessor<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$sign$1$isNegative$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).getOffsetIsNegative();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(java.lang.Object obj, java.lang.Object obj2) {
                    ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).setOffsetIsNegative((java.lang.Boolean) obj2);
                }
            }, null, 2, null);

            @Override // kotlinx.datetime.internal.format.FieldSign
            public final kotlinx.datetime.internal.format.Accessor<kotlinx.datetime.format.UtcOffsetFieldContainer, java.lang.Boolean> isNegative() {
                return this.isNegative;
            }

            @Override // kotlinx.datetime.internal.format.FieldSign
            public final boolean isZero(kotlinx.datetime.format.UtcOffsetFieldContainer obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
                java.lang.Integer offsetHours = obj.getOffsetHours();
                if (offsetHours != null && offsetHours.intValue() != 0) {
                    return false;
                }
                java.lang.Integer offsetMinutesOfHour = obj.getOffsetMinutesOfHour();
                if (offsetMinutesOfHour != null && offsetMinutesOfHour.intValue() != 0) {
                    return false;
                }
                java.lang.Integer offsetSecondsOfMinute = obj.getOffsetSecondsOfMinute();
                return offsetSecondsOfMinute == null || offsetSecondsOfMinute.intValue() == 0;
            }
        };
        Camera2StreamConfigurationMap = r0;
        kotlinx.datetime.internal.format.FieldSign fieldSign = (kotlinx.datetime.internal.format.FieldSign) r0;
        getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$totalHoursAbs$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).getOffsetHours();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).setOffsetHours((java.lang.Integer) obj2);
            }
        }, null, 2, null), 0, 18, null, 0, fieldSign, 8, null);
        getHighSpeedVideoSizes = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$minutesOfHour$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).getOffsetMinutesOfHour();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).setOffsetMinutesOfHour((java.lang.Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, fieldSign, 8, null);
        getHighResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.internal.format.UnsignedFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.OffsetFields$secondsOfMinute$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).getOffsetSecondsOfMinute();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlinx.datetime.format.UtcOffsetFieldContainer) obj).setOffsetSecondsOfMinute((java.lang.Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, fieldSign, 8, null);
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighSpeedVideoSizes() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoSizes;
    }

    public static kotlinx.datetime.internal.format.UnsignedFieldSpec<kotlinx.datetime.format.UtcOffsetFieldContainer> Camera2StreamConfigurationMap() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
