package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/format/DateTimeComponentsFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "intermediateFromValue", "(Lkotlinx/datetime/format/DateTimeComponents;)Lkotlinx/datetime/format/DateTimeComponentsContents;", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/DateTimeComponentsContents;)Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/DateTimeComponentsContents;", "emptyIntermediate", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimeComponentsFormat extends kotlinx.datetime.format.AbstractDateTimeFormat<kotlinx.datetime.format.DateTimeComponents, kotlinx.datetime.format.DateTimeComponentsContents> {
    private final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.DateTimeComponentsContents> actualFormat;

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.DateTimeComponentsContents> getActualFormat() {
        return this.actualFormat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateTimeComponentsFormat(kotlinx.datetime.internal.format.CachedFormatStructure<? super kotlinx.datetime.format.DateTimeComponentsContents> cachedFormatStructure) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFormatStructure, "");
        this.actualFormat = cachedFormatStructure;
    }

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.DateTimeComponentsContents intermediateFromValue(kotlinx.datetime.format.DateTimeComponents value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return value.getContents();
    }

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.DateTimeComponents valueFromIntermediate(kotlinx.datetime.format.DateTimeComponentsContents intermediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediate, "");
        return new kotlinx.datetime.format.DateTimeComponents(intermediate);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.DateTimeComponentsContents getEmptyIntermediate() {
        kotlinx.datetime.format.DateTimeComponentsContents dateTimeComponentsContents;
        dateTimeComponentsContents = kotlinx.datetime.format.DateTimeComponentsKt.getHighSpeedVideoFpsRangesFor;
        return dateTimeComponentsContents;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder", "<init>", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/DateTimeFieldContainer;", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "addFormatStructureForOffset", "timeZoneId", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "format", "dateTimeComponents", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "createEmpty", "()Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder implements kotlinx.datetime.format.AbstractDateTimeFormatBuilder<kotlinx.datetime.format.DateTimeComponentsContents, kotlinx.datetime.format.DateTimeComponentsFormat.Builder>, kotlinx.datetime.format.AbstractWithDateTimeBuilder, kotlinx.datetime.format.AbstractWithOffsetBuilder, kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents {
        private final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeComponentsContents> actualBuilder;

        public Builder(kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeComponentsContents> appendableFormatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendableFormatStructure, "");
            this.actualBuilder = appendableFormatStructure;
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeComponentsContents> getActualBuilder() {
            return this.actualBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.datetime.format.AbstractWithDateTimeBuilder
        public final void addFormatStructureForDateTime(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateTimeFieldContainer> structure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
            getActualBuilder().add(structure);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.datetime.format.AbstractWithOffsetBuilder
        public final void addFormatStructureForOffset(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.UtcOffsetFieldContainer> structure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
            getActualBuilder().add(structure);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents
        public final void timeZoneId() {
            getActualBuilder().add(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.TimeZoneIdDirective()));
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents
        public final void dateTimeComponents(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format instanceof kotlinx.datetime.format.DateTimeComponentsFormat) {
                getActualBuilder().add(((kotlinx.datetime.format.DateTimeComponentsFormat) format).getActualFormat());
            }
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final kotlinx.datetime.format.DateTimeComponentsFormat.Builder createEmpty() {
            return new kotlinx.datetime.format.DateTimeComponentsFormat.Builder(new kotlinx.datetime.internal.format.AppendableFormatStructure());
        }
    }
}
