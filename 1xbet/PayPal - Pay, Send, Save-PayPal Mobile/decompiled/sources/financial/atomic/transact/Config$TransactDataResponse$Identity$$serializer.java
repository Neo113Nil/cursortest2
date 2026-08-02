package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$Identity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TransactDataResponse$Identity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TransactDataResponse.Identity> {
    public static final financial.atomic.transact.Config$TransactDataResponse$Identity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TransactDataResponse$Identity$$serializer config$TransactDataResponse$Identity$$serializer = new financial.atomic.transact.Config$TransactDataResponse$Identity$$serializer();
        INSTANCE = config$TransactDataResponse$Identity$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TransactDataResponse.Identity", config$TransactDataResponse$Identity$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("firstName", true);
        pluginGeneratedSerialDescriptor.addElement("lastName", true);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, true);
        pluginGeneratedSerialDescriptor.addElement("address", true);
        pluginGeneratedSerialDescriptor.addElement("address2", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("phone", true);
        pluginGeneratedSerialDescriptor.addElement("email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TransactDataResponse.Identity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 3;
        java.lang.String str10 = null;
        if (beginStructure.decodeSequentially()) {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str5 = str18;
            str = str17;
            str2 = str16;
            str8 = str14;
            str4 = str15;
            str9 = str13;
            str7 = str11;
            str6 = str12;
            i = 511;
        } else {
            int i6 = 0;
            boolean z = true;
            java.lang.String str19 = null;
            java.lang.String str20 = null;
            java.lang.String str21 = null;
            java.lang.String str22 = null;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            java.lang.String str25 = null;
            java.lang.String str26 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 3;
                    case 0:
                        str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str24);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 3;
                    case 1:
                        str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str26);
                        i6 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        i6 |= 4;
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str22);
                        i6 |= 8;
                    case 4:
                        str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str21);
                        i6 |= 16;
                    case 5:
                        str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str20);
                        i6 |= 32;
                    case 6:
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i6 |= 64;
                    case 7:
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i6 |= 128;
                    case 8:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i6 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str27 = str24;
            java.lang.String str28 = str25;
            java.lang.String str29 = str26;
            str = str19;
            str2 = str20;
            str3 = str10;
            str4 = str21;
            str5 = str23;
            i = i6;
            str6 = str29;
            str7 = str27;
            str8 = str22;
            str9 = str28;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TransactDataResponse.Identity(i, str7, str6, str9, str8, str4, str2, str, str5, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TransactDataResponse.Identity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TransactDataResponse.Identity.write$Self$transact_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private Config$TransactDataResponse$Identity$$serializer() {
    }
}
