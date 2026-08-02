package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a0\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\f\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\f\u0010\r\"&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "format", "(Lkotlinx/datetime/format/DateTimeFormat;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlinx/datetime/format/DateTimeComponents$Companion;", "", "input", "parse", "(Lkotlinx/datetime/format/DateTimeComponents$Companion;Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "timeZoneField", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getTimeZoneField", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateTimeComponentsKt {
    private static final kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.DateTimeComponentsContents, java.lang.String> timeZoneField = new kotlinx.datetime.internal.format.GenericFieldSpec<>(new kotlinx.datetime.internal.format.PropertyAccessor(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateTimeComponentsKt$timeZoneField$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
        public final java.lang.Object get(java.lang.Object obj) {
            return ((kotlinx.datetime.format.DateTimeComponentsContents) obj).getTimeZoneId();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
        public final void set(java.lang.Object obj, java.lang.Object obj2) {
            ((kotlinx.datetime.format.DateTimeComponentsContents) obj).setTimeZoneId((java.lang.String) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);
    private static final kotlinx.datetime.format.DateTimeComponentsContents getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.format.DateTimeComponentsContents(null, null, null, null, 15, null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String format(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat, kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeComponents, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.datetime.format.DateTimeComponents dateTimeComponents = new kotlinx.datetime.format.DateTimeComponents(null, 1, 0 == true ? 1 : 0);
        function1.invoke(dateTimeComponents);
        return dateTimeFormat.format(dateTimeComponents);
    }

    public static final kotlinx.datetime.format.DateTimeComponents parse(kotlinx.datetime.format.DateTimeComponents.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        return dateTimeFormat.parse(charSequence);
    }

    public static final kotlinx.datetime.internal.format.GenericFieldSpec<kotlinx.datetime.format.DateTimeComponentsContents, java.lang.String> getTimeZoneField() {
        return timeZoneField;
    }
}
