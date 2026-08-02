package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000b\u001a7\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "id", "Landroidx/compose/ui/graphics/vector/ImageVector;", "vectorResource", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "res", "resId", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "loadVectorResourceInner", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorResources_androidKt {
    public static final androidx.compose.ui.graphics.vector.ImageVector vectorResource(androidx.compose.ui.graphics.vector.ImageVector.Companion companion, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(44534090, i2, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        android.content.res.Resources resources = (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
        android.content.res.Resources.Theme theme = context.getTheme();
        java.lang.Object configuration = resources.getConfiguration();
        boolean z = (((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32;
        boolean changed = composer.changed(resources);
        boolean changed2 = composer.changed(theme);
        boolean changed3 = composer.changed(configuration);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = vectorResource(companion, theme, resources, i);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.graphics.vector.ImageVector imageVector = (androidx.compose.ui.graphics.vector.ImageVector) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static /* synthetic */ androidx.compose.ui.graphics.vector.ImageVector vectorResource$default(androidx.compose.ui.graphics.vector.ImageVector.Companion companion, android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i, int i2, java.lang.Object obj) throws org.xmlpull.v1.XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i);
    }

    public static final androidx.compose.ui.graphics.vector.ImageVector vectorResource(androidx.compose.ui.graphics.vector.ImageVector.Companion companion, android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i) throws org.xmlpull.v1.XmlPullParserException {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i, typedValue, true);
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.seekToStartTag(xml);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }

    public static /* synthetic */ androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(android.content.res.Resources.Theme theme, android.content.res.Resources resources, android.content.res.XmlResourceParser xmlResourceParser, int i, int i2, java.lang.Object obj) throws org.xmlpull.v1.XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i);
    }

    public static final androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry loadVectorResourceInner(android.content.res.Resources.Theme theme, android.content.res.Resources resources, android.content.res.XmlResourceParser xmlResourceParser, int i) throws org.xmlpull.v1.XmlPullParserException {
        android.content.res.XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlResourceParser2);
        androidx.compose.ui.graphics.vector.compat.AndroidVectorParser androidVectorParser = new androidx.compose.ui.graphics.vector.compat.AndroidVectorParser(xmlResourceParser2, 0, 2, null);
        androidx.compose.ui.graphics.vector.ImageVector.Builder createVectorImageBuilder = androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.isAtEnd(xmlResourceParser2)) {
            i2 = androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, asAttributeSet, theme, createVectorImageBuilder, i2);
            xmlResourceParser.next();
        }
        return new androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), androidVectorParser.getConfig() | i);
    }
}
