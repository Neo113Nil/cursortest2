package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.ui.draw.DrawResult invoke(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        return ((androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }

    DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }
}
