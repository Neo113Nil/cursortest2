package androidx.compose.foundation.draganddrop;

/* compiled from: AndroidDragAndDropSource.android.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "", "()V", "cachedPicture", "Landroid/graphics/Picture;", "cachePicture", "Landroidx/compose/ui/draw/DrawResult;", "scope", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawDragShadow", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CacheDrawScopeDragShadowCallback {
    private android.graphics.Picture cachedPicture;

    public final void drawDragShadow(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        android.graphics.Picture picture = this.cachedPicture;
        if (picture == null) {
            throw new java.lang.IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
        }
        androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()).drawPicture(picture);
    }

    public final androidx.compose.ui.draw.DrawResult cachePicture(androidx.compose.ui.draw.CacheDrawScope scope) {
        final android.graphics.Picture picture = new android.graphics.Picture();
        this.cachedPicture = picture;
        final int m1940getWidthimpl = (int) androidx.compose.ui.geometry.Size.m1940getWidthimpl(scope.m1778getSizeNHjbRc());
        final int m1937getHeightimpl = (int) androidx.compose.ui.geometry.Size.m1937getHeightimpl(scope.m1778getSizeNHjbRc());
        return scope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                androidx.compose.ui.graphics.Canvas Canvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(picture.beginRecording(m1940getWidthimpl, m1937getHeightimpl));
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                androidx.compose.ui.unit.LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                long j = contentDrawScope.mo2592getSizeNHjbRc();
                androidx.compose.ui.unit.Density density = contentDrawScope2.getDrawContext().getDensity();
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = contentDrawScope2.getDrawContext().getLayoutDirection();
                androidx.compose.ui.graphics.Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
                long mo2598getSizeNHjbRc = contentDrawScope2.getDrawContext().mo2598getSizeNHjbRc();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
                drawContext.setDensity(contentDrawScope);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(Canvas);
                drawContext.mo2599setSizeuvyYCjk(j);
                Canvas.save();
                contentDrawScope.drawContent();
                Canvas.restore();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = contentDrawScope2.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                picture.endRecording();
                androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope2.getDrawContext().getCanvas()).drawPicture(picture);
            }
        });
    }
}
