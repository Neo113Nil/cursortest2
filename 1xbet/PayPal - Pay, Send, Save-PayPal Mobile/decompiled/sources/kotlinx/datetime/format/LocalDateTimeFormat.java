package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/format/IncompleteLocalDateTime;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "Lkotlinx/datetime/format/DateTimeFieldContainer;", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "intermediateFromValue", "(Lkotlinx/datetime/LocalDateTime;)Lkotlinx/datetime/format/IncompleteLocalDateTime;", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/IncompleteLocalDateTime;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/IncompleteLocalDateTime;", "emptyIntermediate", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalDateTimeFormat extends kotlinx.datetime.format.AbstractDateTimeFormat<kotlinx.datetime.LocalDateTime, kotlinx.datetime.format.IncompleteLocalDateTime> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.LocalDateTimeFormat.Companion INSTANCE = new kotlinx.datetime.format.LocalDateTimeFormat.Companion(null);
    private final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.DateTimeFieldContainer> actualFormat;

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.IncompleteLocalDateTime> getActualFormat() {
        return this.actualFormat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalDateTimeFormat(kotlinx.datetime.internal.format.CachedFormatStructure<? super kotlinx.datetime.format.DateTimeFieldContainer> cachedFormatStructure) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFormatStructure, "");
        this.actualFormat = cachedFormatStructure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.IncompleteLocalDateTime intermediateFromValue(kotlinx.datetime.LocalDateTime value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.datetime.format.IncompleteLocalDateTime incompleteLocalDateTime = new kotlinx.datetime.format.IncompleteLocalDateTime(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        incompleteLocalDateTime.populateFrom(value);
        return incompleteLocalDateTime;
    }

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.LocalDateTime valueFromIntermediate(kotlinx.datetime.format.IncompleteLocalDateTime intermediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediate, "");
        return intermediate.toLocalDateTime();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.IncompleteLocalDateTime getEmptyIntermediate() {
        kotlinx.datetime.format.IncompleteLocalDateTime incompleteLocalDateTime;
        incompleteLocalDateTime = kotlinx.datetime.format.LocalDateTimeFormatKt.getHighResolutionOutputSizeshNQ4ISI;
        return incompleteLocalDateTime;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/datetime/format/LocalDateTimeFormat;", "build", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/LocalDateTimeFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.datetime.format.LocalDateTimeFormat build(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            kotlinx.datetime.format.LocalDateTimeFormat.Builder builder = new kotlinx.datetime.format.LocalDateTimeFormat.Builder(new kotlinx.datetime.internal.format.AppendableFormatStructure());
            block.invoke(builder);
            return new kotlinx.datetime.format.LocalDateTimeFormat(builder.build());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/DateTimeFieldContainer;", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder", "<init>", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "createEmpty", "()Lkotlinx/datetime/format/LocalDateTimeFormat$Builder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Builder implements kotlinx.datetime.format.AbstractDateTimeFormatBuilder<kotlinx.datetime.format.DateTimeFieldContainer, kotlinx.datetime.format.LocalDateTimeFormat.Builder>, kotlinx.datetime.format.AbstractWithDateTimeBuilder {
        private final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeFieldContainer> actualBuilder;

        public Builder(kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeFieldContainer> appendableFormatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendableFormatStructure, "");
            this.actualBuilder = appendableFormatStructure;
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.DateTimeFieldContainer> getActualBuilder() {
            return this.actualBuilder;
        }

        @Override // kotlinx.datetime.format.AbstractWithDateTimeBuilder
        public final void addFormatStructureForDateTime(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.DateTimeFieldContainer> structure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
            getActualBuilder().add(structure);
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final kotlinx.datetime.format.LocalDateTimeFormat.Builder createEmpty() {
            return new kotlinx.datetime.format.LocalDateTimeFormat.Builder(new kotlinx.datetime.internal.format.AppendableFormatStructure());
        }
    }
}
