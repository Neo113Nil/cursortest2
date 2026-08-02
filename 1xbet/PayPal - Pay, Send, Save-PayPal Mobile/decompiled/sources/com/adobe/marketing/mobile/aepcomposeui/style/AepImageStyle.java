package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 .2\u00020\u0001:\u0001.BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "", "contentDescription", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Ljava/lang/Float;Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Ljava/lang/Float;", "getAlpha", "()Ljava/lang/Float;", "setAlpha", "(Ljava/lang/Float;)V", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepImageStyle {
    private androidx.compose.ui.Alignment alignment;
    private java.lang.Float alpha;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private java.lang.String contentDescription;
    private androidx.compose.ui.layout.ContentScale contentScale;
    private androidx.compose.ui.Modifier modifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle.Companion(null);
    public static final int $stable = 8;

    public AepImageStyle(androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, java.lang.Float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.modifier = modifier;
        this.contentDescription = str;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    public /* synthetic */ AepImageStyle(androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, java.lang.Float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : alignment, (i & 8) != 0 ? null : contentScale, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : colorFilter);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        this.modifier = modifier;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final void setContentDescription(java.lang.String str) {
        this.contentDescription = str;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(androidx.compose.ui.Alignment alignment) {
        this.alignment = alignment;
    }

    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(androidx.compose.ui.layout.ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final java.lang.Float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(java.lang.Float f) {
        this.alpha = f;
    }

    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepImageStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle(null, null, null, null, null, null, 63, null);
            }
            if ((i & 2) != 0) {
                aepImageStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepImageStyle, aepImageStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            androidx.compose.ui.Modifier modifier2 = modifier;
            java.lang.String contentDescription = overridingStyle.getContentDescription();
            if (contentDescription == null) {
                contentDescription = defaultStyle.getContentDescription();
            }
            java.lang.String str = contentDescription;
            androidx.compose.ui.Alignment alignment = overridingStyle.getAlignment();
            if (alignment == null) {
                alignment = defaultStyle.getAlignment();
            }
            androidx.compose.ui.Alignment alignment2 = alignment;
            androidx.compose.ui.layout.ContentScale contentScale = overridingStyle.getContentScale();
            if (contentScale == null) {
                contentScale = defaultStyle.getContentScale();
            }
            androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
            java.lang.Float alpha = overridingStyle.getAlpha();
            if (alpha == null) {
                alpha = defaultStyle.getAlpha();
            }
            java.lang.Float f = alpha;
            androidx.compose.ui.graphics.ColorFilter colorFilter = overridingStyle.getColorFilter();
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle(modifier2, str, alignment2, contentScale2, f, colorFilter == null ? defaultStyle.getColorFilter() : colorFilter);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AepImageStyle() {
        this(null, null, null, null, null, null, 63, null);
    }
}
