package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J^\u0010\f\u001a\u00020\b24\u0010\n\u001a\u001b\u0012\u0017\b\u0001\u0012\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0006\"\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Target", "ActualSelf", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "createEmpty", "()Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "otherFormats", "mainFormat", "appendAlternativeParsingImpl", "([Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "onZero", "format", "appendOptionalImpl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "chars", "(Ljava/lang/String;)V", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "build", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AbstractDateTimeFormatBuilder<Target, ActualSelf extends kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf>> extends kotlinx.datetime.format.DateTimeFormatBuilder {
    ActualSelf createEmpty();

    kotlinx.datetime.internal.format.AppendableFormatStructure<Target> getActualBuilder();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <Target, ActualSelf extends kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf>> void appendAlternativeParsingImpl(kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf> abstractDateTimeFormatBuilder, kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit>[] function1Arr, kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1Arr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlinx.datetime.format.AbstractDateTimeFormatBuilder.super.appendAlternativeParsingImpl(function1Arr, function1);
        }

        @java.lang.Deprecated
        public static <Target, ActualSelf extends kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf>> void appendOptionalImpl(kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf> abstractDateTimeFormatBuilder, java.lang.String str, kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlinx.datetime.format.AbstractDateTimeFormatBuilder.super.appendOptionalImpl(str, function1);
        }

        @java.lang.Deprecated
        public static <Target, ActualSelf extends kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf>> void chars(kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf> abstractDateTimeFormatBuilder, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlinx.datetime.format.AbstractDateTimeFormatBuilder.super.chars(str);
        }

        @java.lang.Deprecated
        public static <Target, ActualSelf extends kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf>> kotlinx.datetime.internal.format.CachedFormatStructure<Target> build(kotlinx.datetime.format.AbstractDateTimeFormatBuilder<Target, ActualSelf> abstractDateTimeFormatBuilder) {
            return kotlinx.datetime.format.AbstractDateTimeFormatBuilder.super.build();
        }
    }

    default void appendOptionalImpl(java.lang.String onZero, kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onZero, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlinx.datetime.internal.format.AppendableFormatStructure<Target> actualBuilder = getActualBuilder();
        ActualSelf createEmpty = createEmpty();
        format.invoke(createEmpty);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        actualBuilder.add(new kotlinx.datetime.internal.format.OptionalFormatStructure(onZero, createEmpty.getActualBuilder().build()));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder
    default void chars(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        getActualBuilder().add(new kotlinx.datetime.internal.format.ConstantFormatStructure(value));
    }

    default kotlinx.datetime.internal.format.CachedFormatStructure<Target> build() {
        return new kotlinx.datetime.internal.format.CachedFormatStructure<>(getActualBuilder().build().getFormats());
    }

    default void appendAlternativeParsingImpl(kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit>[] otherFormats, kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit> mainFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherFormats, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainFormat, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(otherFormats.length);
        for (kotlin.jvm.functions.Function1<? super ActualSelf, kotlin.Unit> function1 : otherFormats) {
            ActualSelf createEmpty = createEmpty();
            function1.invoke(createEmpty);
            arrayList.add(createEmpty.getActualBuilder().build());
        }
        ActualSelf createEmpty2 = createEmpty();
        mainFormat.invoke(createEmpty2);
        getActualBuilder().add(new kotlinx.datetime.internal.format.AlternativesParsingFormatStructure(createEmpty2.getActualBuilder().build(), arrayList));
    }
}
