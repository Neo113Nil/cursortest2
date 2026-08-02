package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "setHorizontalArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/Alignment$Vertical;", "getVerticalAlignment", "()Landroidx/compose/ui/Alignment$Vertical;", "setVerticalAlignment", "(Landroidx/compose/ui/Alignment$Vertical;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepRowStyle {
    private androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement;
    private androidx.compose.ui.Modifier modifier;
    private androidx.compose.ui.Alignment.Vertical verticalAlignment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle.Companion(null);
    public static final int $stable = 8;

    public AepRowStyle(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical) {
        this.modifier = modifier;
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
    }

    public /* synthetic */ AepRowStyle(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : horizontal, (i & 4) != 0 ? null : vertical);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        this.modifier = modifier;
    }

    public final androidx.compose.foundation.layout.Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final void setHorizontalArrangement(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal) {
        this.horizontalArrangement = horizontal;
    }

    public final androidx.compose.ui.Alignment.Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final void setVerticalAlignment(androidx.compose.ui.Alignment.Vertical vertical) {
        this.verticalAlignment = vertical;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle aepRowStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle aepRowStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepRowStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle(null, null, null, 7, null);
            }
            if ((i & 2) != 0) {
                aepRowStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepRowStyle, aepRowStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement = overridingStyle.getHorizontalArrangement();
            if (horizontalArrangement == null) {
                horizontalArrangement = defaultStyle.getHorizontalArrangement();
            }
            androidx.compose.ui.Alignment.Vertical verticalAlignment = overridingStyle.getVerticalAlignment();
            if (verticalAlignment == null) {
                verticalAlignment = defaultStyle.getVerticalAlignment();
            }
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle(modifier, horizontalArrangement, verticalAlignment);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AepRowStyle() {
        this(null, null, null, 7, null);
    }
}
