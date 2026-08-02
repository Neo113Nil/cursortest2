package org.betup.ui.dialogs.offer;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"org/betup/ui/dialogs/offer/OfferItemContent.LayoutParams.Constraints.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class OfferItemContent$LayoutParams$Constraints$$serializer implements GeneratedSerializer<OfferItemContent.LayoutParams.Constraints> {
    public static final int $stable;
    public static final OfferItemContent$LayoutParams$Constraints$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private OfferItemContent$LayoutParams$Constraints$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OfferItemContent$LayoutParams$Constraints$$serializer offerItemContent$LayoutParams$Constraints$$serializer = new OfferItemContent$LayoutParams$Constraints$$serializer();
        INSTANCE = offerItemContent$LayoutParams$Constraints$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("org.betup.ui.dialogs.offer.OfferItemContent.LayoutParams.Constraints", offerItemContent$LayoutParams$Constraints$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("startToEndId", false);
        pluginGeneratedSerialDescriptor.addElement("endToStartId", false);
        pluginGeneratedSerialDescriptor.addElement("topToBottomId", false);
        pluginGeneratedSerialDescriptor.addElement("bottomToTopId", false);
        pluginGeneratedSerialDescriptor.addElement("topToTopId", false);
        pluginGeneratedSerialDescriptor.addElement("bottomToBottomId", false);
        pluginGeneratedSerialDescriptor.addElement("startToStartId", false);
        pluginGeneratedSerialDescriptor.addElement("endToEndId", false);
        pluginGeneratedSerialDescriptor.addElement("verticalBias", true);
        pluginGeneratedSerialDescriptor.addElement("horizontalBias", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), FloatSerializer.INSTANCE, FloatSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final OfferItemContent.LayoutParams.Constraints deserialize(Decoder decoder) {
        String str;
        float f;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        float f2;
        String str7;
        int i;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        if (beginStructure.decodeSequentially()) {
            String str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            String str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            String str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            String str13 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            String str14 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            String str15 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            String str16 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 8);
            f = beginStructure.decodeFloatElement(serialDescriptor, 9);
            str8 = str16;
            str7 = str15;
            f2 = decodeFloatElement;
            str2 = str10;
            str5 = str13;
            str4 = str11;
            str = str12;
            str6 = str9;
            str3 = str14;
            i = 1023;
        } else {
            float f3 = 0.0f;
            boolean z = true;
            int i3 = 0;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            str = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            float f4 = 0.0f;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                    case 0:
                        str23 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str23);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        str22 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str22);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        str21 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str21);
                        i3 |= 4;
                        i2 = 9;
                    case 3:
                        str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        i3 |= 8;
                        i2 = 9;
                    case 4:
                        str19 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        i3 |= 16;
                        i2 = 9;
                    case 5:
                        str20 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str20);
                        i3 |= 32;
                        i2 = 9;
                    case 6:
                        str18 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str18);
                        i3 |= 64;
                        i2 = 9;
                    case 7:
                        str17 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str17);
                        i3 |= 128;
                        i2 = 9;
                    case 8:
                        f4 = beginStructure.decodeFloatElement(serialDescriptor, 8);
                        i3 |= 256;
                    case 9:
                        f3 = beginStructure.decodeFloatElement(serialDescriptor, i2);
                        i3 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            f = f3;
            str2 = str22;
            str3 = str20;
            str4 = str21;
            str5 = str19;
            str6 = str23;
            f2 = f4;
            str7 = str18;
            i = i3;
            str8 = str17;
        }
        beginStructure.endStructure(serialDescriptor);
        return new OfferItemContent.LayoutParams.Constraints(i, str6, str2, str4, str, str5, str3, str7, str8, f2, f, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, OfferItemContent.LayoutParams.Constraints value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        OfferItemContent.LayoutParams.Constraints.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
