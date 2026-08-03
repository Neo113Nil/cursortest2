package io.ktor.http;

/* compiled from: Cookie.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/http/Cookie.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/ktor/http/Cookie;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/http/Cookie;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/http/Cookie;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes6.dex */
public /* synthetic */ class Cookie$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<io.ktor.http.Cookie> {
    public static final io.ktor.http.Cookie$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    private Cookie$$serializer() {
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
        io.ktor.http.Cookie$$serializer cookie$$serializer = new io.ktor.http.Cookie$$serializer();
        INSTANCE = cookie$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", cookie$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("encoding", true);
        pluginGeneratedSerialDescriptor.addElement("maxAge", true);
        pluginGeneratedSerialDescriptor.addElement("expires", true);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.X3.j.D, true);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("secure", true);
        pluginGeneratedSerialDescriptor.addElement("httpOnly", true);
        pluginGeneratedSerialDescriptor.addElement("extensions", true);
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
        io.ktor.http.CookieEncoding cookieEncoding;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        int i;
        boolean z2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.Map map;
        io.ktor.util.date.GMTDate gMTDate;
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = io.ktor.http.Cookie.$childSerializers;
        int i2 = 7;
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
            z2 = decodeBooleanElement;
            str3 = str6;
            str2 = str5;
            z = decodeBooleanElement2;
            cookieEncoding = cookieEncoding2;
            str = decodeStringElement;
            num = num2;
            i = 1023;
            gMTDate = gMTDate2;
            str4 = decodeStringElement2;
        } else {
            java.util.Map map2 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            io.ktor.util.date.GMTDate gMTDate3 = null;
            java.lang.Integer num3 = null;
            io.ktor.http.CookieEncoding cookieEncoding3 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            boolean z5 = true;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        i2 = 7;
                        z5 = false;
                    case 0:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        cookieEncoding3 = (io.ktor.http.CookieEncoding) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), cookieEncoding3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        num3 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, num3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        gMTDate3 = (io.ktor.util.date.GMTDate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, io.ktor.util.date.GMTDate$$serializer.INSTANCE, gMTDate3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i3 |= 64;
                        i2 = 7;
                    case 7:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 128;
                    case 8:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i3 |= 256;
                    case 9:
                        map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), map2);
                        i3 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            cookieEncoding = cookieEncoding3;
            str = str9;
            str2 = str7;
            z = z4;
            i = i3;
            z2 = z3;
            str3 = str8;
            str4 = str10;
            map = map2;
            java.lang.Integer num4 = num3;
            gMTDate = gMTDate3;
            num = num4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new io.ktor.http.Cookie(i, str, str4, cookieEncoding, num, gMTDate, str2, str3, z2, z, map, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.ktor.http.Cookie value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        io.ktor.http.Cookie.write$Self$ktor_http(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }
}
