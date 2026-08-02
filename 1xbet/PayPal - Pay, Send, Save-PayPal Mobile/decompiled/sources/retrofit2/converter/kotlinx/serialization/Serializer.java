package retrofit2.converter.kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001e\u001f"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer;", "", "<init>", "()V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlinx/serialization/SerializationStrategy;", "saver", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerialFormat;", "getFormat", "()Lkotlinx/serialization/SerialFormat;", "format", "FromString", "FromBytes", "Lretrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lretrofit2/converter/kotlinx/serialization/Serializer$FromString;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Serializer {
    public abstract <T> T fromResponseBody(kotlinx.serialization.DeserializationStrategy<? extends T> loader, okhttp3.ResponseBody body);

    protected abstract kotlinx.serialization.SerialFormat getFormat();

    public abstract <T> okhttp3.RequestBody toRequestBody(okhttp3.MediaType contentType, kotlinx.serialization.SerializationStrategy<? super T> saver, T value);

    private Serializer() {
    }

    public final kotlinx.serialization.KSerializer<java.lang.Object> serializer(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return kotlinx.serialization.SerializersKt.serializer(getFormat().getSerializersModule(), type);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer$FromString;", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "Lkotlinx/serialization/StringFormat;", "format", "<init>", "(Lkotlinx/serialization/StringFormat;)V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlinx/serialization/SerializationStrategy;", "saver", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Lkotlinx/serialization/StringFormat;", "getFormat", "()Lkotlinx/serialization/StringFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FromString extends retrofit2.converter.kotlinx.serialization.Serializer {
        private final kotlinx.serialization.StringFormat format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromString(kotlinx.serialization.StringFormat stringFormat) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "");
            this.format = stringFormat;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final kotlinx.serialization.StringFormat getFormat() {
            return this.format;
        }

        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final <T> T fromResponseBody(kotlinx.serialization.DeserializationStrategy<? extends T> loader, okhttp3.ResponseBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return (T) getFormat().decodeFromString(loader, body.string());
        }

        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final <T> okhttp3.RequestBody toRequestBody(okhttp3.MediaType contentType, kotlinx.serialization.SerializationStrategy<? super T> saver, T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saver, "");
            return okhttp3.RequestBody.INSTANCE.create(getFormat().encodeToString(saver, value), contentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lretrofit2/converter/kotlinx/serialization/Serializer$FromBytes;", "Lretrofit2/converter/kotlinx/serialization/Serializer;", "Lkotlinx/serialization/BinaryFormat;", "format", "<init>", "(Lkotlinx/serialization/BinaryFormat;)V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlinx/serialization/SerializationStrategy;", "saver", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Lkotlinx/serialization/BinaryFormat;", "getFormat", "()Lkotlinx/serialization/BinaryFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes18.dex */
    public static final class FromBytes extends retrofit2.converter.kotlinx.serialization.Serializer {
        private final kotlinx.serialization.BinaryFormat format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromBytes(kotlinx.serialization.BinaryFormat binaryFormat) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
            this.format = binaryFormat;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final kotlinx.serialization.BinaryFormat getFormat() {
            return this.format;
        }

        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final <T> T fromResponseBody(kotlinx.serialization.DeserializationStrategy<? extends T> loader, okhttp3.ResponseBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return (T) getFormat().decodeFromByteArray(loader, body.bytes());
        }

        @Override // retrofit2.converter.kotlinx.serialization.Serializer
        public final <T> okhttp3.RequestBody toRequestBody(okhttp3.MediaType contentType, kotlinx.serialization.SerializationStrategy<? super T> saver, T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saver, "");
            byte[] encodeToByteArray = getFormat().encodeToByteArray(saver, value);
            return okhttp3.RequestBody.INSTANCE.create(encodeToByteArray, contentType, 0, encodeToByteArray.length);
        }
    }

    public /* synthetic */ Serializer(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
