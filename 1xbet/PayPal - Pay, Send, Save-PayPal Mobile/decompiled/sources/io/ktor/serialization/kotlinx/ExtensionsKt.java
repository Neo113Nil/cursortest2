package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/serialization/SerialFormat;", "format", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "(Lkotlinx/serialization/SerialFormat;)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtensionsKt {
    public static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtension> extensions(kotlinx.serialization.SerialFormat serialFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialFormat, "");
        java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> providers = io.ktor.serialization.kotlinx.ExtensionsJvmKt.getProviders();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            io.ktor.serialization.kotlinx.KotlinxSerializationExtension extension = ((io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider) it.next()).extension(serialFormat);
            if (extension != null) {
                arrayList.add(extension);
            }
        }
        return arrayList;
    }
}
