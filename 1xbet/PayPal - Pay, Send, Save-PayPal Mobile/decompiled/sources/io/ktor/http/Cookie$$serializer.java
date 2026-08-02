package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lio/ktor/http/Cookie$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/http/Cookie;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/http/Cookie;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/http/Cookie;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Cookie$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<io.ktor.http.Cookie> {
    public static final io.ktor.http.Cookie$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        io.ktor.http.Cookie$$serializer cookie$$serializer = new io.ktor.http.Cookie$$serializer();
        INSTANCE = cookie$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", cookie$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, false);
        pluginGeneratedSerialDescriptor.addElement("encoding", true);
        pluginGeneratedSerialDescriptor.addElement("maxAge", true);
        pluginGeneratedSerialDescriptor.addElement("expires", true);
        pluginGeneratedSerialDescriptor.addElement("domain", true);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("secure", true);
        pluginGeneratedSerialDescriptor.addElement("httpOnly", true);
        pluginGeneratedSerialDescriptor.addElement(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = io.ktor.http.Cookie.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(io.ktor.util.date.GMTDate$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[9].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final io.ktor.http.Cookie deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        java.util.Map map;
        java.lang.String str;
        java.lang.String str2;
        boolean z2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Integer num;
        io.ktor.http.CookieEncoding cookieEncoding;
        io.ktor.util.date.GMTDate gMTDate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = io.ktor.http.Cookie.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            io.ktor.http.CookieEncoding cookieEncoding2 = (io.ktor.http.CookieEncoding) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.Integer num2 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            io.ktor.util.date.GMTDate gMTDate2 = (io.ktor.util.date.GMTDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, io.ktor.util.date.GMTDate$$serializer.INSTANCE, null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            map = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            z = decodeBooleanElement;
            str2 = str6;
            str = str5;
            num = num2;
            z2 = decodeBooleanElement2;
            gMTDate = gMTDate2;
            str3 = decodeStringElement2;
            cookieEncoding = cookieEncoding2;
            str4 = decodeStringElement;
            i = 1023;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i5 = 0;
            io.ktor.util.date.GMTDate gMTDate3 = null;
            java.util.Map map2 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.Integer num3 = null;
            io.ktor.http.CookieEncoding cookieEncoding3 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        cookieEncoding3 = (io.ktor.http.CookieEncoding) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), cookieEncoding3);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 3:
                        num3 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, num3);
                        i5 |= 8;
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        gMTDate3 = (io.ktor.util.date.GMTDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, io.ktor.util.date.GMTDate$$serializer.INSTANCE, gMTDate3);
                        i5 |= 16;
                        i2 = 7;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i5 |= 32;
                    case 6:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i5 |= 64;
                    case 7:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 128;
                    case 8:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i5 |= 256;
                    case 9:
                        map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), map2);
                        i5 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.Integer num4 = num3;
            io.ktor.http.CookieEncoding cookieEncoding4 = cookieEncoding3;
            z = z4;
            map = map2;
            str = str7;
            str2 = str10;
            z2 = z5;
            i = i5;
            str3 = str8;
            str4 = str9;
            num = num4;
            cookieEncoding = cookieEncoding4;
            gMTDate = gMTDate3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new io.ktor.http.Cookie(i, str4, str3, cookieEncoding, num, gMTDate, str, str2, z, z2, map, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.ktor.http.Cookie value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        io.ktor.http.Cookie.write$Self$ktor_http(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private Cookie$$serializer() {
    }
}
