package org.betup.model.remote.entity.analytics;

import io.bidmachine.unified.UnifiedMediationParams;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchAd.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"org/betup/model/remote/entity/analytics/HomeMatchAd.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class HomeMatchAd$$serializer implements GeneratedSerializer<HomeMatchAd> {
    public static final int $stable;
    public static final HomeMatchAd$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private HomeMatchAd$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HomeMatchAd$$serializer homeMatchAd$$serializer = new HomeMatchAd$$serializer();
        INSTANCE = homeMatchAd$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("org.betup.model.remote.entity.analytics.HomeMatchAd", homeMatchAd$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("linkId", false);
        pluginGeneratedSerialDescriptor.addElement("linkType", false);
        pluginGeneratedSerialDescriptor.addElement("expirationDate", false);
        pluginGeneratedSerialDescriptor.addElement(UnifiedMediationParams.KEY_IMAGE_URL, false);
        pluginGeneratedSerialDescriptor.addElement("linkName", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final HomeMatchAd deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 6;
        int i5 = 5;
        if (beginStructure.decodeSequentially()) {
            String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 2);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 3);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 5);
            str4 = str6;
            str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            str2 = decodeStringElement2;
            i = decodeIntElement2;
            str3 = str7;
            i2 = decodeIntElement;
            str5 = decodeStringElement;
            i3 = 127;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            int i8 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 5;
                    case 0:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str8);
                        i7 |= 1;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                    case 2:
                        i8 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i7 |= 4;
                    case 3:
                        i6 = beginStructure.decodeIntElement(serialDescriptor, 3);
                        i7 |= 8;
                    case 4:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str10);
                        i7 |= 16;
                    case 5:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 32;
                    case 6:
                        str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str12);
                        i7 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str12;
            str2 = str11;
            str3 = str10;
            i = i6;
            String str13 = str9;
            i2 = i8;
            i3 = i7;
            str4 = str8;
            str5 = str13;
        }
        beginStructure.endStructure(serialDescriptor);
        return new HomeMatchAd(i3, str4, str5, i2, i, str3, str2, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, HomeMatchAd value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        HomeMatchAd.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
