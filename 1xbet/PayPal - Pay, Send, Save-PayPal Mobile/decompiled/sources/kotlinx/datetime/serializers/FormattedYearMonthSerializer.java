package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/serializers/FormattedYearMonthSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/YearMonth;", "", "name", "Lkotlinx/datetime/format/DateTimeFormat;", "format", "<init>", "(Ljava/lang/String;Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/YearMonth;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/YearMonth;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FormattedYearMonthSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.YearMonth> {
    private final /* synthetic */ kotlinx.serialization.KSerializer<kotlinx.datetime.YearMonth> getHighResolutionOutputSizeshNQ4ISI;

    public FormattedYearMonthSerializer(java.lang.String str, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.datetime.serializers.LocalDateSerializersKt.asKSerializer(dateTimeFormat, "kotlinx.datetime.YearMonth/serializer/".concat(java.lang.String.valueOf(str)));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.YearMonth value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public kotlinx.datetime.YearMonth deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.deserialize(decoder);
    }
}
