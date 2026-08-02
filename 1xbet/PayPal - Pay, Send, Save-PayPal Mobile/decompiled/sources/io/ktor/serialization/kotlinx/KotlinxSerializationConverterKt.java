package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t"}, d2 = {"Lio/ktor/serialization/Configuration;", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlinx/serialization/BinaryFormat;", "format", "", "serialization", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Lkotlinx/serialization/BinaryFormat;)V", "Lkotlinx/serialization/StringFormat;", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;Lkotlinx/serialization/StringFormat;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationConverterKt {
    public static final void serialization(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, kotlinx.serialization.BinaryFormat binaryFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryFormat, "");
        io.ktor.serialization.Configuration.DefaultImpls.register$default(configuration, contentType, new io.ktor.serialization.kotlinx.KotlinxSerializationConverter(binaryFormat), null, 4, null);
    }

    public static final void serialization(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, kotlinx.serialization.StringFormat stringFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringFormat, "");
        io.ktor.serialization.Configuration.DefaultImpls.register$default(configuration, contentType, new io.ktor.serialization.kotlinx.KotlinxSerializationConverter(stringFormat), null, 4, null);
    }
}
