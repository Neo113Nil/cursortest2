package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 .2\u00020\u0001:\u0001.BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/material3/CardColors;", "colors", "Landroidx/compose/material3/CardElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "<init>", "(Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;)V", "Landroidx/compose/foundation/BorderStroke;", "getBorder", "()Landroidx/compose/foundation/BorderStroke;", "setBorder", "(Landroidx/compose/foundation/BorderStroke;)V", "Landroidx/compose/material3/CardColors;", "getColors", "()Landroidx/compose/material3/CardColors;", "setColors", "(Landroidx/compose/material3/CardColors;)V", "Landroidx/compose/material3/CardElevation;", "getElevation", "()Landroidx/compose/material3/CardElevation;", "setElevation", "(Landroidx/compose/material3/CardElevation;)V", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepCardStyle {
    private androidx.compose.foundation.BorderStroke border;
    private androidx.compose.material3.CardColors colors;
    private androidx.compose.material3.CardElevation elevation;
    private java.lang.Boolean enabled;
    private androidx.compose.ui.Modifier modifier;
    private androidx.compose.ui.graphics.Shape shape;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle.Companion(null);
    public static final int $stable = 8;

    public AepCardStyle(androidx.compose.ui.Modifier modifier, java.lang.Boolean bool, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.CardColors cardColors, androidx.compose.material3.CardElevation cardElevation, androidx.compose.foundation.BorderStroke borderStroke) {
        this.modifier = modifier;
        this.enabled = bool;
        this.shape = shape;
        this.colors = cardColors;
        this.elevation = cardElevation;
        this.border = borderStroke;
    }

    public /* synthetic */ AepCardStyle(androidx.compose.ui.Modifier modifier, java.lang.Boolean bool, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.CardColors cardColors, androidx.compose.material3.CardElevation cardElevation, androidx.compose.foundation.BorderStroke borderStroke, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : shape, (i & 8) != 0 ? null : cardColors, (i & 16) != 0 ? null : cardElevation, (i & 32) != 0 ? null : borderStroke);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        this.modifier = modifier;
    }

    public final java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(java.lang.Boolean bool) {
        this.enabled = bool;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    public final void setShape(androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    public final androidx.compose.material3.CardColors getColors() {
        return this.colors;
    }

    public final void setColors(androidx.compose.material3.CardColors cardColors) {
        this.colors = cardColors;
    }

    public final androidx.compose.material3.CardElevation getElevation() {
        return this.elevation;
    }

    public final void setElevation(androidx.compose.material3.CardElevation cardElevation) {
        this.elevation = cardElevation;
    }

    public final androidx.compose.foundation.BorderStroke getBorder() {
        return this.border;
    }

    public final void setBorder(androidx.compose.foundation.BorderStroke borderStroke) {
        this.border = borderStroke;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepCardStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle aepCardStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepCardStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle(null, null, null, null, null, null, 63, null);
            }
            if ((i & 2) != 0) {
                aepCardStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepCardStyle, aepCardStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            androidx.compose.ui.Modifier modifier2 = modifier;
            java.lang.Boolean enabled = overridingStyle.getEnabled();
            if (enabled == null) {
                enabled = defaultStyle.getEnabled();
            }
            java.lang.Boolean bool = enabled;
            androidx.compose.ui.graphics.Shape shape = overridingStyle.getShape();
            if (shape == null) {
                shape = defaultStyle.getShape();
            }
            androidx.compose.ui.graphics.Shape shape2 = shape;
            androidx.compose.material3.CardColors colors = overridingStyle.getColors();
            if (colors == null) {
                colors = defaultStyle.getColors();
            }
            androidx.compose.material3.CardColors cardColors = colors;
            androidx.compose.material3.CardElevation elevation = overridingStyle.getElevation();
            if (elevation == null) {
                elevation = defaultStyle.getElevation();
            }
            androidx.compose.material3.CardElevation cardElevation = elevation;
            androidx.compose.foundation.BorderStroke border = overridingStyle.getBorder();
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepCardStyle(modifier2, bool, shape2, cardColors, cardElevation, border == null ? defaultStyle.getBorder() : border);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AepCardStyle() {
        this(null, null, null, null, null, null, 63, null);
    }
}
