package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\n*\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation3/runtime/MetadataScope;", "", "Lkotlin/ExtensionFunctionType;", "builder", "", "", "", "metadata", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "T", "Landroidx/navigation3/runtime/NavMetadataKey;", "key", "get", "(Ljava/util/Map;Landroidx/navigation3/runtime/NavMetadataKey;)Ljava/lang/Object;", "", "contains", "(Ljava/util/Map;Landroidx/navigation3/runtime/NavMetadataKey;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavMetadataKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> metadata(kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.MetadataScope, kotlin.Unit> function1) {
        androidx.navigation3.runtime.MetadataScope metadataScope = new androidx.navigation3.runtime.MetadataScope();
        function1.invoke(metadataScope);
        return metadataScope.build();
    }

    public static final <T> T get(java.util.Map<java.lang.String, ? extends java.lang.Object> map, androidx.navigation3.runtime.NavMetadataKey<T> navMetadataKey) {
        T t = (T) map.get(navMetadataKey.toString());
        if (t == null) {
            return null;
        }
        return t;
    }

    public static final <T> boolean contains(java.util.Map<java.lang.String, ? extends java.lang.Object> map, androidx.navigation3.runtime.NavMetadataKey<T> navMetadataKey) {
        return map.containsKey(navMetadataKey.toString());
    }
}
