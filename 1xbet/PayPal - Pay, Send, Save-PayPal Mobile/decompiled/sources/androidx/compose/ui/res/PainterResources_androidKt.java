package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "painterResource", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "", "Landroidx/compose/ui/graphics/ImageBitmap;", "Camera2StreamConfigurationMap", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/ImageBitmap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    public static final androidx.compose.ui.graphics.painter.Painter painterResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        android.content.res.Resources resources = (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
        android.util.TypedValue resolveResourcePath = ((androidx.compose.ui.res.ResourceIdCache) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i);
        java.lang.CharSequence charSequence = resolveResourcePath.string;
        boolean z = true;
        if (charSequence != null && kotlin.text.StringsKt.endsWith$default(charSequence, (java.lang.CharSequence) ".xml", false, 2, (java.lang.Object) null)) {
            composer.startReplaceGroup(-1771798434);
            androidx.compose.ui.graphics.vector.VectorPainter rememberVectorPainter = androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(getHighResolutionOutputSizeshNQ4ISI(context.getTheme(), resources, i, resolveResourcePath.changingConfigurations, composer, (i2 << 6) & 896), composer, 0);
            composer.endReplaceGroup();
            bitmapPainter = rememberVectorPainter;
        } else {
            composer.startReplaceGroup(-1771643000);
            java.lang.Object theme = context.getTheme();
            boolean changed = composer.changed(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean changed2 = composer.changed(theme);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed2 | changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = Camera2StreamConfigurationMap(charSequence, resources, i);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter2 = new androidx.compose.ui.graphics.painter.BitmapPainter((androidx.compose.ui.graphics.ImageBitmap) rememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            bitmapPainter = bitmapPainter2;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bitmapPainter;
    }

    private static final androidx.compose.ui.graphics.vector.ImageVector getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        androidx.compose.ui.res.ImageVectorCache imageVectorCache = (androidx.compose.ui.res.ImageVectorCache) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        androidx.compose.ui.res.ImageVectorCache.Key key = new androidx.compose.ui.res.ImageVectorCache.Key(theme, i);
        androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new java.lang.IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntry = androidx.compose.ui.res.VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
            imageVectorCache.set(key, imageVectorEntry);
        }
        androidx.compose.ui.graphics.vector.ImageVector imageVector = imageVectorEntry.getImageVector();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    private static final androidx.compose.ui.graphics.ImageBitmap Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, android.content.res.Resources resources, int i) {
        try {
            return androidx.compose.ui.res.ImageResources_androidKt.imageResource(androidx.compose.ui.graphics.ImageBitmap.INSTANCE, resources, i);
        } catch (java.lang.Exception e) {
            throw new androidx.compose.ui.res.ResourceResolutionException("Error attempting to load resource: ".concat(java.lang.String.valueOf(charSequence)), e);
        }
    }
}
