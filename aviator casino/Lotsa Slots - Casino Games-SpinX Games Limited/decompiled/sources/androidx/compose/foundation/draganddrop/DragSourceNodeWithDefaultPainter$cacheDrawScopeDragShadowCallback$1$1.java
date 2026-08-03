package androidx.compose.foundation.draganddrop;

/* compiled from: AndroidDragAndDropSource.android.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult> {
    DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.ui.draw.DrawResult invoke(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        return ((androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }
}
