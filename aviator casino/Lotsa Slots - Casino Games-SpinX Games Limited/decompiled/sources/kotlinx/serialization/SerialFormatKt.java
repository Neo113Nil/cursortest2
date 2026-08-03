package kotlinx.serialization;

/* compiled from: SerialFormat.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0002\u0010\u0012\u001a\"\u0010\t\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0013\u001a\"\u0010\u000e\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"encodeToString", "", "T", "Lkotlinx/serialization/StringFormat;", "value", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromString", "string", "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "encodeToHexString", "Lkotlinx/serialization/BinaryFormat;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromHexString", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "hex", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "encodeToByteArray", "", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", "decodeFromByteArray", "bytes", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerialFormatKt {
    public static final /* synthetic */ <T> java.lang.String encodeToString(kotlinx.serialization.StringFormat stringFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "<this>");
        kotlinx.serialization.modules.SerializersModule serializersModule = stringFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return stringFormat.encodeToString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromString(kotlinx.serialization.StringFormat stringFormat, java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.modules.SerializersModule serializersModule = stringFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) stringFormat.decodeFromString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), string);
    }

    public static final <T> java.lang.String encodeToHexString(kotlinx.serialization.BinaryFormat binaryFormat, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        return kotlinx.serialization.internal.InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializer, t), true);
    }

    public static final <T> T decodeFromHexString(kotlinx.serialization.BinaryFormat binaryFormat, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, java.lang.String hex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hex, "hex");
        return (T) binaryFormat.decodeFromByteArray(deserializer, kotlinx.serialization.internal.InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final /* synthetic */ <T> java.lang.String encodeToHexString(kotlinx.serialization.BinaryFormat binaryFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString(binaryFormat, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(kotlinx.serialization.BinaryFormat binaryFormat, java.lang.String hex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hex, "hex");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(binaryFormat, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), hex);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(kotlinx.serialization.BinaryFormat binaryFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return binaryFormat.encodeToByteArray(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromByteArray(kotlinx.serialization.BinaryFormat binaryFormat, byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) binaryFormat.decodeFromByteArray(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bytes);
    }
}
