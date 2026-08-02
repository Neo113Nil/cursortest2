package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroid/graphics/Picture;IILkotlin/jvm/functions/Function1;)Landroid/graphics/Picture;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PictureKt {
    public static final android.graphics.Picture record(android.graphics.Picture picture, int i, int i2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        try {
            function1.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
