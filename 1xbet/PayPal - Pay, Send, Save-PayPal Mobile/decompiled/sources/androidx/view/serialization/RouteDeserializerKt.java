package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\r"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "", "Landroidx/navigation/NavType;", "typeMap", "decodeArguments", "(Lkotlinx/serialization/KSerializer;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Lkotlinx/serialization/KSerializer;Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RouteDeserializerKt {
    public static final <T> T decodeArguments(kotlinx.serialization.KSerializer<T> kSerializer, android.os.Bundle bundle, java.util.Map<java.lang.String, ? extends androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return (T) new androidx.view.serialization.RouteDecoder(bundle, map).decodeRouteWithArgs$navigation_common_release(kSerializer);
    }

    public static final <T> T decodeArguments(kotlinx.serialization.KSerializer<T> kSerializer, androidx.view.SavedStateHandle savedStateHandle, java.util.Map<java.lang.String, ? extends androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return (T) new androidx.view.serialization.RouteDecoder(savedStateHandle, map).decodeRouteWithArgs$navigation_common_release(kSerializer);
    }
}
