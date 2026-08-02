package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"T", "Landroidx/navigation/NavBackStackEntry;", "toRoute", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "route", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/reflect/KClass;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackEntryKt {
    public static final /* synthetic */ <T> T toRoute(androidx.view.NavBackStackEntry navBackStackEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) toRoute(navBackStackEntry, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public static final <T> T toRoute(androidx.view.NavBackStackEntry navBackStackEntry, kotlin.reflect.KClass<?> kClass) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        android.os.Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            if (emptyMap.isEmpty()) {
                pairArr = new kotlin.Pair[0];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
                for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                    arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
                }
                pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
            }
            arguments = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
            androidx.view.SavedStateWriter.m9382constructorimpl(arguments);
        }
        java.util.Map<java.lang.String, androidx.view.NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(arguments2.size()));
        java.util.Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((androidx.view.NavArgument) entry2.getValue()).getType());
        }
        return (T) androidx.view.serialization.RouteDeserializerKt.decodeArguments(kotlinx.serialization.SerializersKt.serializer(kClass), arguments, linkedHashMap);
    }
}
