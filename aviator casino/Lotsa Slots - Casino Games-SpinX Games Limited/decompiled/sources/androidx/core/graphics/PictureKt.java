package androidx.core.graphics;

/* compiled from: Picture.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\b¨\u0006\n"}, d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PictureKt {
    public static final android.graphics.Picture record(android.graphics.Picture picture, int i, int i2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        android.graphics.Canvas beginRecording = picture.beginRecording(i, i2);
        try {
            function1.invoke(beginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            picture.endRecording();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
