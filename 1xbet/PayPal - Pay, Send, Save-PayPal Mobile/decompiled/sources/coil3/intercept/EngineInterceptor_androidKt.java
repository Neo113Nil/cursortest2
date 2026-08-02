package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/Image;", "image", "Lcoil3/request/Options;", "options", "", "Lcoil3/transform/Transformation;", "transformations", "Lcoil3/util/Logger;", "logger", "Landroid/graphics/Bitmap;", "convertImageToBitmap", "(Lcoil3/Image;Lcoil3/request/Options;Ljava/util/List;Lcoil3/util/Logger;)Landroid/graphics/Bitmap;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EngineInterceptor_androidKt {
    public static final android.graphics.Bitmap convertImageToBitmap(coil3.Image image, coil3.view.Options options, java.util.List<? extends coil3.graphics.Transformation> list, coil3.content.Logger logger) {
        if (image instanceof coil3.BitmapImage) {
            android.graphics.Bitmap bitmap = ((coil3.BitmapImage) image).getBitmap();
            android.graphics.Bitmap.Config safeConfig = coil3.content.Bitmap.getSafeConfig(bitmap);
            if (kotlin.collections.ArraysKt.contains(coil3.content.Utils_androidKt.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            if (logger != null) {
                coil3.util.Logger.Level level = coil3.util.Logger.Level.Info;
                if (logger.getMinLevel().compareTo(level) <= 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Converting bitmap with config ");
                    sb.append(safeConfig);
                    sb.append(" to apply transformations: ");
                    sb.append(list);
                    sb.append(".");
                    logger.log(coil3.intercept.EngineInterceptor.TAG, level, sb.toString(), null);
                }
            }
        } else if (logger != null) {
            coil3.util.Logger.Level level2 = coil3.util.Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level2) <= 0) {
                java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(image.getClass()).getGetHighResolutionOutputSizeshNQ4ISI();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Converting image of type ");
                sb2.append(getHighResolutionOutputSizeshNQ4ISI);
                sb2.append(" to apply transformations: ");
                sb2.append(list);
                sb2.append(".");
                logger.log(coil3.intercept.EngineInterceptor.TAG, level2, sb2.toString(), null);
            }
        }
        return coil3.content.DrawableUtils.INSTANCE.convertToBitmap(coil3.Image_androidKt.asDrawable(image, options.getContext().getResources()), coil3.view.ImageRequests_androidKt.getBitmapConfig(options), options.getSize(), options.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(options), options.getPrecision() == coil3.view.Precision.INEXACT);
    }
}
