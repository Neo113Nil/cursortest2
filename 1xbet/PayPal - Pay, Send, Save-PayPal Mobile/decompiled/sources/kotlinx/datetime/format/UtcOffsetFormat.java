package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "intermediateFromValue", "(Lkotlinx/datetime/UtcOffset;)Lkotlinx/datetime/format/IncompleteUtcOffset;", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/IncompleteUtcOffset;)Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/IncompleteUtcOffset;", "emptyIntermediate", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtcOffsetFormat extends kotlinx.datetime.format.AbstractDateTimeFormat<kotlinx.datetime.UtcOffset, kotlinx.datetime.format.IncompleteUtcOffset> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.UtcOffsetFormat.Companion INSTANCE = new kotlinx.datetime.format.UtcOffsetFormat.Companion(null);
    private final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.UtcOffsetFieldContainer> actualFormat;

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.internal.format.CachedFormatStructure<kotlinx.datetime.format.IncompleteUtcOffset> getActualFormat() {
        return this.actualFormat;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/datetime/format/UtcOffsetFormat;", "build", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/UtcOffsetFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.datetime.format.UtcOffsetFormat build(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            kotlinx.datetime.format.UtcOffsetFormat.Builder builder = new kotlinx.datetime.format.UtcOffsetFormat.Builder(new kotlinx.datetime.internal.format.AppendableFormatStructure());
            block.invoke(builder);
            return new kotlinx.datetime.format.UtcOffsetFormat(builder.build());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtcOffsetFormat(kotlinx.datetime.internal.format.CachedFormatStructure<? super kotlinx.datetime.format.UtcOffsetFieldContainer> cachedFormatStructure) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFormatStructure, "");
        this.actualFormat = cachedFormatStructure;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "p0", "<init>", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "", "addFormatStructureForOffset", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class Builder implements kotlinx.datetime.format.AbstractDateTimeFormatBuilder<kotlinx.datetime.format.UtcOffsetFieldContainer, kotlinx.datetime.format.UtcOffsetFormat.Builder>, kotlinx.datetime.format.AbstractWithOffsetBuilder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.UtcOffsetFieldContainer> getHighSpeedVideoFpsRangesFor;

        public Builder(kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.UtcOffsetFieldContainer> appendableFormatStructure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendableFormatStructure, "");
            this.getHighSpeedVideoFpsRangesFor = appendableFormatStructure;
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final kotlinx.datetime.internal.format.AppendableFormatStructure<kotlinx.datetime.format.UtcOffsetFieldContainer> getActualBuilder() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlinx.datetime.format.AbstractWithOffsetBuilder
        public final void addFormatStructureForOffset(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.UtcOffsetFieldContainer> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            getActualBuilder().add(p0);
        }

        @Override // kotlinx.datetime.format.AbstractDateTimeFormatBuilder
        public final /* synthetic */ kotlinx.datetime.format.UtcOffsetFormat.Builder createEmpty() {
            return new kotlinx.datetime.format.UtcOffsetFormat.Builder(new kotlinx.datetime.internal.format.AppendableFormatStructure());
        }
    }

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.IncompleteUtcOffset intermediateFromValue(kotlinx.datetime.UtcOffset value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.datetime.format.IncompleteUtcOffset incompleteUtcOffset = new kotlinx.datetime.format.IncompleteUtcOffset(null, null, null, null, 15, null);
        incompleteUtcOffset.populateFrom(value);
        return incompleteUtcOffset;
    }

    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.UtcOffset valueFromIntermediate(kotlinx.datetime.format.IncompleteUtcOffset intermediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediate, "");
        return intermediate.toUtcOffset();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.datetime.format.AbstractDateTimeFormat
    public final kotlinx.datetime.format.IncompleteUtcOffset getEmptyIntermediate() {
        kotlinx.datetime.format.IncompleteUtcOffset incompleteUtcOffset;
        incompleteUtcOffset = kotlinx.datetime.format.UtcOffsetFormatKt.getHighSpeedVideoFpsRangesFor;
        return incompleteUtcOffset;
    }
}
