package io.ktor.util.date;

/* compiled from: Date.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/util/date/GMTDate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/util/date/GMTDate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/util/date/GMTDate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/util/date/GMTDate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes6.dex */
public /* synthetic */ class GMTDate$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<io.ktor.util.date.GMTDate> {
    public static final io.ktor.util.date.GMTDate$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    private GMTDate$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
    }

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
        pluginGeneratedSerialDescriptor.addElement("year", false);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.C4.a.d, false);
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
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        io.ktor.util.date.WeekDay weekDay;
        int i5;
        int i6;
        int i7;
        io.ktor.util.date.Month month;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = io.ktor.util.date.GMTDate.$childSerializers;
        int i8 = 7;
        if (beginStructure.decodeSequentially()) {
            i = beginStructure.decodeIntElement(serialDescriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
            io.ktor.util.date.WeekDay weekDay2 = (io.ktor.util.date.WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 4);
            int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 5);
            month = (io.ktor.util.date.Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            i6 = beginStructure.decodeIntElement(serialDescriptor, 7);
            i4 = decodeIntElement4;
            i3 = decodeIntElement3;
            weekDay = weekDay2;
            j = beginStructure.decodeLongElement(serialDescriptor, 8);
            i2 = androidx.core.app.FrameMetricsAggregator.EVERY_DURATION;
            i7 = decodeIntElement2;
            i5 = decodeIntElement;
        } else {
            io.ktor.util.date.Month month2 = null;
            io.ktor.util.date.WeekDay weekDay3 = null;
            j = 0;
            i = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        i8 = 7;
                        z = false;
                    case 0:
                        i11 |= 1;
                        i = beginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 = 7;
                    case 1:
                        i14 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i11 |= 2;
                        i8 = 7;
                    case 2:
                        i13 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i11 |= 4;
                    case 3:
                        weekDay3 = (io.ktor.util.date.WeekDay) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), weekDay3);
                        i11 |= 8;
                    case 4:
                        i12 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i11 |= 16;
                    case 5:
                        i10 = beginStructure.decodeIntElement(serialDescriptor, 5);
                        i11 |= 32;
                    case 6:
                        month2 = (io.ktor.util.date.Month) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), month2);
                        i11 |= 64;
                    case 7:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, i8);
                        i11 |= 128;
                    case 8:
                        j = beginStructure.decodeLongElement(serialDescriptor, 8);
                        i11 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i2 = i11;
            i3 = i12;
            i4 = i10;
            weekDay = weekDay3;
            i5 = i14;
            i6 = i9;
            i7 = i13;
            month = month2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new io.ktor.util.date.GMTDate(i2, i, i5, i7, weekDay, i3, i4, month, i6, j, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.ktor.util.date.GMTDate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        io.ktor.util.date.GMTDate.write$Self$ktor_utils(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
