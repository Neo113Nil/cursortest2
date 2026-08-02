package androidx.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001aH\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001d\b\u0002\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u00060\u0003¢\u0006\u0004\b\b\u0010\f"}, d2 = {"", "T", "Landroidx/lifecycle/SavedStateHandle;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p0", "toRoute", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "p1", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/reflect/KClass;Ljava/util/Map;)Ljava/lang/Object;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/SavedStateHandleKt")
/* loaded from: classes7.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    public static /* synthetic */ java.lang.Object toRoute$default(androidx.view.SavedStateHandle savedStateHandle, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return androidx.view.SavedStateHandleKt.toRoute(savedStateHandle, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), map);
    }

    public static final /* synthetic */ <T> T toRoute(androidx.view.SavedStateHandle savedStateHandle, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) androidx.view.SavedStateHandleKt.toRoute(savedStateHandle, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), map);
    }

    public static /* synthetic */ java.lang.Object toRoute$default(androidx.view.SavedStateHandle savedStateHandle, kotlin.reflect.KClass kClass, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return androidx.view.SavedStateHandleKt.toRoute(savedStateHandle, kClass, map);
    }

    public static final <T> T toRoute(androidx.view.SavedStateHandle savedStateHandle, kotlin.reflect.KClass<T> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer(kClass);
        for (androidx.view.NamedNavArgument namedNavArgument : androidx.view.serialization.RouteSerializerKt.generateNavArguments(serializer, map)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) androidx.view.serialization.RouteDeserializerKt.decodeArguments(serializer, savedStateHandle, linkedHashMap);
    }
}
