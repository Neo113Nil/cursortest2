package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtensionProvider;", "providers", "Ljava/util/List;", "getProviders", "()Ljava/util/List;", "getProviders$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtensionsJvmKt {
    private static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> providers;

    public static /* synthetic */ void getProviders$annotations() {
    }

    public static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> getProviders() {
        return providers;
    }

    static {
        java.util.Iterator it = java.util.ServiceLoader.load(io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider.class, io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        providers = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(it));
    }
}
