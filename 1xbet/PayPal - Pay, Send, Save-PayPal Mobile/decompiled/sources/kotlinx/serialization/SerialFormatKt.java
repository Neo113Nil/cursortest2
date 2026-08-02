package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\f\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\f\u0010\u0013\u001a$\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0014\u001a$\u0010\u0016\u001a\u00020\u0015\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a$\u0010\u0019\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"T", "Lkotlinx/serialization/StringFormat;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeToString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "string", "decodeFromString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/BinaryFormat;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeToHexString", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "hex", "decodeFromHexString", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "", "encodeToByteArray", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "decodeFromByteArray", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerialFormatKt {
    public static final /* synthetic */ <T> java.lang.String encodeToString(kotlinx.serialization.StringFormat stringFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = stringFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return stringFormat.encodeToString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromString(kotlinx.serialization.StringFormat stringFormat, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = stringFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) stringFormat.decodeFromString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str);
    }

    public static final <T> java.lang.String encodeToHexString(kotlinx.serialization.BinaryFormat binaryFormat, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return kotlinx.serialization.internal.InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializationStrategy, t), true);
    }

    public static final <T> T decodeFromHexString(kotlinx.serialization.BinaryFormat binaryFormat, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return (T) binaryFormat.decodeFromByteArray(deserializationStrategy, kotlinx.serialization.internal.InternalHexConverter.INSTANCE.parseHexBinary(str));
    }

    public static final /* synthetic */ <T> java.lang.String encodeToHexString(kotlinx.serialization.BinaryFormat binaryFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString(binaryFormat, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(kotlinx.serialization.BinaryFormat binaryFormat, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(binaryFormat, kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), str);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(kotlinx.serialization.BinaryFormat binaryFormat, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return binaryFormat.encodeToByteArray(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromByteArray(kotlinx.serialization.BinaryFormat binaryFormat, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlinx.serialization.modules.SerializersModule serializersModule = binaryFormat.getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) binaryFormat.decodeFromByteArray(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), bArr);
    }
}
