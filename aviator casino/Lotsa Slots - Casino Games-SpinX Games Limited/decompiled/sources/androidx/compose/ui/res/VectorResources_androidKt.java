package androidx.compose.ui.res;

/* compiled from: VectorResources.android.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorResources_androidKt {
    public static final androidx.compose.ui.graphics.vector.ImageVector vectorResource(androidx.compose.ui.graphics.vector.ImageVector.Companion companion, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceableGroup(44534090);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(vectorResource)48@1967L7,49@1989L11,52@2043L90:VectorResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(44534090, i2, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.res.Resources resources = androidx.compose.ui.res.Resources_androidKt.resources(composer, 0);
        android.content.res.Resources.Theme theme = ((android.content.Context) consume).getTheme();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i), resources, theme, resources.getConfiguration()};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = vectorResource(companion, theme, resources, i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.ui.graphics.vector.ImageVector imageVector = (androidx.compose.ui.graphics.vector.ImageVector) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
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
        return new androidx.compose.ui.res.ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), i);
    }
}
