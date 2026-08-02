package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensionProvider;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtensionProvider;", "<init>", "()V", "Lkotlinx/serialization/SerialFormat;", "format", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extension", "(Lkotlinx/serialization/SerialFormat;)Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationJsonExtensionProvider implements io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider {
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider
    public final io.ktor.serialization.kotlinx.KotlinxSerializationExtension extension(kotlinx.serialization.SerialFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.serialization.json.Json) {
            return new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions((kotlinx.serialization.json.Json) format);
        }
        return null;
    }
}
