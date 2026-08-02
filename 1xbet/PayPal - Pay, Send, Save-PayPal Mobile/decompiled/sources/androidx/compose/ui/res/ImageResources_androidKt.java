package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "Landroid/content/res/Resources;", "res", "", "id", "Landroidx/compose/ui/graphics/ImageBitmap;", "imageResource", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageResources_androidKt {
    public static final androidx.compose.ui.graphics.ImageBitmap imageResource(androidx.compose.ui.graphics.ImageBitmap.Companion companion, android.content.res.Resources resources, int i) {
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(drawable, "");
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
    }

    public static final androidx.compose.ui.graphics.ImageBitmap imageResource(androidx.compose.ui.graphics.ImageBitmap.Companion companion, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-304919470, i2, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        android.content.res.Resources resources = (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new android.util.TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) rememberedValue;
        resources.getValue(i, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        kotlin.jvm.internal.Intrinsics.checkNotNull(charSequence);
        boolean changed = composer.changed(charSequence.toString());
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = imageResource(companion, resources, i);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = (androidx.compose.ui.graphics.ImageBitmap) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return imageBitmap;
    }
}
