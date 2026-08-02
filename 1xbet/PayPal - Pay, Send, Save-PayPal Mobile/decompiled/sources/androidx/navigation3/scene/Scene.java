package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001f\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation3/scene/Scene;", "", "T", "getKey", "()Ljava/lang/Object;", "key", "", "Landroidx/navigation3/runtime/NavEntry;", "getEntries", "()Ljava/util/List;", "entries", "getPreviousEntries", "previousEntries", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "content", "", "", "getMetadata", "()Ljava/util/Map;", "metadata"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Scene<T> {
    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent();

    java.util.List<androidx.navigation3.runtime.NavEntry<T>> getEntries();

    java.lang.Object getKey();

    java.util.List<androidx.navigation3.runtime.NavEntry<T>> getPreviousEntries();

    default java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        java.util.Map<java.lang.String, java.lang.Object> metadata;
        androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) getEntries());
        return (navEntry == null || (metadata = navEntry.getMetadata()) == null) ? kotlin.collections.MapsKt.emptyMap() : metadata;
    }
}
