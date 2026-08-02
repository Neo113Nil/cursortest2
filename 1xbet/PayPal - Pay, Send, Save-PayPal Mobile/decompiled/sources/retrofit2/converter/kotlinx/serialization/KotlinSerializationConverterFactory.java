package retrofit2.converter.kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"Lkotlinx/serialization/StringFormat;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lretrofit2/Converter$Factory;", "create", "(Lkotlinx/serialization/StringFormat;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;", "Lkotlinx/serialization/BinaryFormat;", "(Lkotlinx/serialization/BinaryFormat;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KotlinSerializationConverterFactory {
    public static final retrofit2.Converter.Factory create(kotlinx.serialization.StringFormat stringFormat, okhttp3.MediaType mediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        return new retrofit2.converter.kotlinx.serialization.Factory(mediaType, new retrofit2.converter.kotlinx.serialization.Serializer.FromString(stringFormat));
    }

    public static final retrofit2.Converter.Factory create(kotlinx.serialization.BinaryFormat binaryFormat, okhttp3.MediaType mediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
        return new retrofit2.converter.kotlinx.serialization.Factory(mediaType, new retrofit2.converter.kotlinx.serialization.Serializer.FromBytes(binaryFormat));
    }
}
