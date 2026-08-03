package androidx.compose.ui.res;

/* compiled from: PainterResources.android.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a1\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "path", "", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "changingConfigurations", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final java.lang.String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    public static final androidx.compose.ui.graphics.painter.Painter painterResource(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter;
        composer.startReplaceableGroup(473971343);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(painterResource)57@2406L7,58@2428L11,59@2456L25:PainterResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.Context context = (android.content.Context) consume;
        android.content.res.Resources resources = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0);
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new android.util.TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        android.util.TypedValue typedValue = (android.util.TypedValue) rememberedValue;
        resources.getValue(i, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null && kotlin.text.StringsKt.endsWith$default(charSequence, (java.lang.CharSequence) ".xml", false, 2, (java.lang.Object) null)) {
            composer.startReplaceableGroup(-738265327);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "64@2687L72,65@2768L34");
            androidx.compose.ui.graphics.vector.VectorPainter rememberVectorPainter = androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i, typedValue.changingConfigurations, composer, ((i2 << 6) & 896) | 72), composer, 0);
            composer.endReplaceableGroup();
            bitmapPainter = rememberVectorPainter;
        } else {
            composer.startReplaceableGroup(-738265172);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "68@2888L96");
            java.lang.Object valueOf = java.lang.Integer.valueOf(i);
            java.lang.Object theme = context.getTheme();
            composer.startReplaceableGroup(1618982084);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf) | composer.changed(charSequence) | composer.changed(theme);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = loadImageBitmapResource(charSequence, resources, i);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter2 = new androidx.compose.ui.graphics.painter.BitmapPainter((androidx.compose.ui.graphics.ImageBitmap) rememberedValue2, 0L, 0L, 6, null);
            composer.endReplaceableGroup();
            bitmapPainter = bitmapPainter2;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bitmapPainter;
    }

    private static final androidx.compose.ui.graphics.vector.ImageVector loadVectorResource(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        composer.startReplaceableGroup(21855625);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(loadVectorResource)P(3,2,1)87@3470L7:PainterResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.res.ImageVectorCache> localImageVectorCache = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalImageVectorCache();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localImageVectorCache);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.ui.res.ImageVectorCache imageVectorCache = (androidx.compose.ui.res.ImageVectorCache) consume;
        androidx.compose.ui.res.ImageVectorCache.Key key = new androidx.compose.ui.res.ImageVectorCache.Key(theme, i);
        androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new java.lang.IllegalArgumentException(errorMessage);
            }
            imageVectorEntry = androidx.compose.ui.res.VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
            imageVectorCache.set(key, imageVectorEntry);
        }
        androidx.compose.ui.graphics.vector.ImageVector imageVector = imageVectorEntry.getImageVector();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.ImageBitmap loadImageBitmapResource(java.lang.CharSequence charSequence, android.content.res.Resources resources, int i) {
        try {
            return androidx.compose.ui.res.ImageResources_androidKt.imageResource(androidx.compose.ui.graphics.ImageBitmap.INSTANCE, resources, i);
        } catch (java.lang.Exception e) {
            throw new androidx.compose.ui.res.ResourceResolutionException("Error attempting to load resource: " + ((java.lang.Object) charSequence), e);
        }
    }
}
