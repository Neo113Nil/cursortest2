package org.betup.model.remote.entity.analytics;

import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Date;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferModel.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"org/betup/model/remote/entity/analytics/OfferModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/betup/model/remote/entity/analytics/OfferModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class OfferModel$$serializer implements GeneratedSerializer<OfferModel> {
    public static final int $stable;
    public static final OfferModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private OfferModel$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OfferModel$$serializer offerModel$$serializer = new OfferModel$$serializer();
        INSTANCE = offerModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("org.betup.model.remote.entity.analytics.OfferModel", offerModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("signature", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("betcoins", false);
        pluginGeneratedSerialDescriptor.addElement(UnifiedMediationParams.KEY_ICON_URL, true);
        pluginGeneratedSerialDescriptor.addElement("newStoreCode", false);
        pluginGeneratedSerialDescriptor.addElement("oldStoreCode", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("tickets", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("expiresAt", false);
        pluginGeneratedSerialDescriptor.addElement("elements", false);
        pluginGeneratedSerialDescriptor.addElement("offerType", true);
        pluginGeneratedSerialDescriptor.addElement("htmlTemplateData", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = OfferModel.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, DateSerializer.INSTANCE, lazyArr[10].getValue(), lazyArr[11].getValue(), BuiltinSerializersKt.getNullable(OfferHtmlTemplateData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final OfferModel deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        OfferType offerType;
        OfferHtmlTemplateData offerHtmlTemplateData;
        Date date;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = OfferModel.$childSerializers;
        int i4 = 9;
        int i5 = 7;
        if (beginStructure.decodeSequentially()) {
            String str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 2);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 7);
            String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 8);
            Date date2 = (Date) beginStructure.decodeSerializableElement(serialDescriptor, 9, DateSerializer.INSTANCE, null);
            List list2 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            offerType = (OfferType) beginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            offerHtmlTemplateData = (OfferHtmlTemplateData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, OfferHtmlTemplateData$$serializer.INSTANCE, null);
            date = date2;
            i2 = decodeIntElement2;
            str3 = decodeStringElement5;
            str7 = decodeStringElement6;
            str4 = decodeStringElement3;
            i = 8191;
            list = list2;
            str5 = str8;
            str = decodeStringElement2;
            i3 = decodeIntElement;
            str6 = decodeStringElement;
            str2 = decodeStringElement4;
        } else {
            int i6 = 0;
            int i7 = 12;
            int i8 = 0;
            OfferType offerType2 = null;
            OfferHtmlTemplateData offerHtmlTemplateData2 = null;
            List list3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            boolean z = true;
            Date date3 = null;
            int i9 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 9;
                        i5 = 7;
                    case 0:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                        i6 |= 1;
                        i7 = 12;
                        i4 = 9;
                        i5 = 7;
                    case 1:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i7 = 12;
                    case 2:
                        i8 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 |= 4;
                        i7 = 12;
                    case 3:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i7 = 12;
                    case 4:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i7 = 12;
                    case 5:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i7 = 12;
                    case 6:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i7 = 12;
                    case 7:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, i5);
                        i6 |= 128;
                        i7 = 12;
                    case 8:
                        str15 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i7 = 12;
                    case 9:
                        date3 = (Date) beginStructure.decodeSerializableElement(serialDescriptor, i4, DateSerializer.INSTANCE, date3);
                        i6 |= 512;
                        i7 = 12;
                    case 10:
                        list3 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), list3);
                        i6 |= 1024;
                        i7 = 12;
                    case 11:
                        offerType2 = (OfferType) beginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), offerType2);
                        i6 |= 2048;
                        i7 = 12;
                    case 12:
                        offerHtmlTemplateData2 = (OfferHtmlTemplateData) beginStructure.decodeNullableSerializableElement(serialDescriptor, i7, OfferHtmlTemplateData$$serializer.INSTANCE, offerHtmlTemplateData2);
                        i6 |= 4096;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            String str16 = str9;
            i = i6;
            i2 = i9;
            i3 = i8;
            str = str11;
            str2 = str13;
            str3 = str14;
            offerType = offerType2;
            offerHtmlTemplateData = offerHtmlTemplateData2;
            date = date3;
            str4 = str12;
            str5 = str16;
            list = list3;
            str6 = str10;
            str7 = str15;
        }
        beginStructure.endStructure(serialDescriptor);
        return new OfferModel(i, str5, str6, i3, str, str4, str2, str3, i2, str7, date, list, offerType, offerHtmlTemplateData, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, OfferModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        OfferModel.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
