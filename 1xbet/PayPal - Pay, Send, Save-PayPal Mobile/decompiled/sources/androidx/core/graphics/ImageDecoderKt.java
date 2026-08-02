package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\t\u001a\u00020\b*\u00020\u00002/\b\u0004\u0010\u0007\u001a)\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b*\u00020\u00002/\b\u0004\u0010\u0007\u001a)\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "action", "Landroid/graphics/Bitmap;", "decodeBitmap", "(Landroid/graphics/ImageDecoder$Source;Lkotlin/jvm/functions/Function3;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "decodeDrawable", "(Landroid/graphics/ImageDecoder$Source;Lkotlin/jvm/functions/Function3;)Landroid/graphics/drawable/Drawable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageDecoderKt {
    public static final android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source source, final kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> function3) {
        return android.graphics.ImageDecoder.decodeBitmap(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                function3.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }

    public static final android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source source, final kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> function3) {
        return android.graphics.ImageDecoder.decodeDrawable(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                function3.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }
}
