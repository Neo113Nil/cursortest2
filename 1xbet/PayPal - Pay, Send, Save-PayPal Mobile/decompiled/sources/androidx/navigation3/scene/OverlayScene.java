package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation3/scene/OverlayScene;", "", "T", "Landroidx/navigation3/scene/Scene;", "", "onRemove", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/navigation3/runtime/NavEntry;", "getOverlaidEntries", "()Ljava/util/List;", "overlaidEntries"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OverlayScene<T> extends androidx.navigation3.scene.Scene<T> {
    java.util.List<androidx.navigation3.runtime.NavEntry<T>> getOverlaidEntries();

    static /* synthetic */ <T> java.lang.Object onRemove$suspendImpl(androidx.navigation3.scene.OverlayScene<T> overlayScene, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    default java.lang.Object onRemove(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return onRemove$suspendImpl(this, continuation);
    }
}
