package io.ktor.util.date;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lio/ktor/util/date/GMTDate$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/util/date/GMTDate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/util/date/GMTDate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/util/date/GMTDate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class GMTDate$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<io.ktor.util.date.GMTDate> {
    public static final io.ktor.util.date.GMTDate$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        io.ktor.util.date.GMTDate$$serializer gMTDate$$serializer = new io.ktor.util.date.GMTDate$$serializer();
        INSTANCE = gMTDate$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", gMTDate$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("seconds", false);
        pluginGeneratedSerialDescriptor.addElement("minutes", false);
        pluginGeneratedSerialDescriptor.addElement("hours", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfYear", false);
        pluginGeneratedSerialDescriptor.addElement("month", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = io.ktor.util.date.GMTDate.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, lazyArr[3].getValue(), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, lazyArr[6].getValue(), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final io.ktor.util.date.GMTDate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        io.ktor.util.date.WeekDay weekDay;
        int i6;
        long j;
        io.ktor.util.date.Month month;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = io.ktor.util.date.GMTDate.$childSerializers;
        int i8 = 7;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 0);
            i6 = beginStructure.decodeIntElement(serialDescriptor, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
            io.ktor.util.date.WeekDay weekDay2 = (io.ktor.util.date.WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 4);
            int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 5);
            month = (io.ktor.util.date.Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            i4 = decodeIntElement;
            i = beginStructure.decodeIntElement(serialDescriptor, 7);
            i5 = decodeIntElement4;
            i3 = decodeIntElement3;
            j = beginStructure.decodeLongElement(serialDescriptor, 8);
            i7 = decodeIntElement2;
            weekDay = weekDay2;
            i2 = 511;
        } else {
            boolean z = true;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            long j2 = 0;
            io.ktor.util.date.WeekDay weekDay3 = null;
            int i13 = 0;
            int i14 = 0;
            io.ktor.util.date.Month month2 = null;
            int i15 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i8 = 7;
                    case 0:
                        i14 |= 1;
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 = 7;
                    case 1:
                        i12 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        i8 = 7;
                    case 2:
                        i11 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                    case 3:
                        weekDay3 = (io.ktor.util.date.WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), weekDay3);
                        i14 |= 8;
                    case 4:
                        i10 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                    case 5:
                        i13 = beginStructure.decodeIntElement(serialDescriptor, 5);
                        i14 |= 32;
                    case 6:
                        month2 = (io.ktor.util.date.Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), month2);
                        i14 |= 64;
                    case 7:
                        i15 = beginStructure.decodeIntElement(serialDescriptor, i8);
                        i14 |= 128;
                    case 8:
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 8);
                        i14 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i15;
            i2 = i14;
            i3 = i10;
            i4 = i9;
            i5 = i13;
            weekDay = weekDay3;
            i6 = i12;
            j = j2;
            int i16 = i11;
            month = month2;
            i7 = i16;
        }
        beginStructure.endStructure(serialDescriptor);
        return new io.ktor.util.date.GMTDate(i2, i4, i6, i7, weekDay, i3, i5, month, i, j, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.ktor.util.date.GMTDate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        io.ktor.util.date.GMTDate.write$Self$ktor_utils(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private GMTDate$$serializer() {
    }
}
