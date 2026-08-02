package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B.\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "", "contentDescription", "Landroidx/compose/ui/graphics/Color;", "tint", "<init>", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/graphics/Color;", "getTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "setTint-Y2TPw74", "(Landroidx/compose/ui/graphics/Color;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepIconStyle {
    private java.lang.String contentDescription;
    private androidx.compose.ui.Modifier modifier;
    private androidx.compose.ui.graphics.Color tint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle.Companion(null);
    public static final int $stable = 8;

    private AepIconStyle(androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.ui.graphics.Color color) {
        this.modifier = modifier;
        this.contentDescription = str;
        this.tint = color;
    }

    public /* synthetic */ AepIconStyle(androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.ui.graphics.Color color, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : color, null);
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

    /* renamed from: getTint-QN2ZGVo, reason: not valid java name and from getter */
    public final androidx.compose.ui.graphics.Color getTint() {
        return this.tint;
    }

    /* renamed from: setTint-Y2TPw74, reason: not valid java name */
    public final void m9866setTintY2TPw74(androidx.compose.ui.graphics.Color color) {
        this.tint = color;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepIconStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle(null, null, null, 7, null);
            }
            if ((i & 2) != 0) {
                aepIconStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepIconStyle, aepIconStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            java.lang.String contentDescription = overridingStyle.getContentDescription();
            if (contentDescription == null) {
                contentDescription = defaultStyle.getContentDescription();
            }
            androidx.compose.ui.graphics.Color tint = overridingStyle.getTint();
            if (tint == null) {
                tint = defaultStyle.getTint();
            }
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle(modifier, contentDescription, tint, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AepIconStyle(androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.ui.graphics.Color color, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, str, color);
    }
}
