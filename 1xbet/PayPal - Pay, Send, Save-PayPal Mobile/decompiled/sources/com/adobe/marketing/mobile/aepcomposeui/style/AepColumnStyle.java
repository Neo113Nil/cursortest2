package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;)V", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontalAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "setHorizontalAlignment", "(Landroidx/compose/ui/Alignment$Horizontal;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "setVerticalArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepColumnStyle {
    private androidx.compose.ui.Alignment.Horizontal horizontalAlignment;
    private androidx.compose.ui.Modifier modifier;
    private androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle.Companion(null);
    public static final int $stable = 8;

    public AepColumnStyle(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.modifier = modifier;
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    public /* synthetic */ AepColumnStyle(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : vertical, (i & 4) != 0 ? null : horizontal);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        this.modifier = modifier;
    }

    public final androidx.compose.foundation.layout.Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final void setVerticalArrangement(androidx.compose.foundation.layout.Arrangement.Vertical vertical) {
        this.verticalArrangement = vertical;
    }

    public final androidx.compose.ui.Alignment.Horizontal getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final void setHorizontalAlignment(androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.horizontalAlignment = horizontal;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle aepColumnStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle aepColumnStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepColumnStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle(null, null, null, 7, null);
            }
            if ((i & 2) != 0) {
                aepColumnStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepColumnStyle, aepColumnStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement = overridingStyle.getVerticalArrangement();
            if (verticalArrangement == null) {
                verticalArrangement = defaultStyle.getVerticalArrangement();
            }
            androidx.compose.ui.Alignment.Horizontal horizontalAlignment = overridingStyle.getHorizontalAlignment();
            if (horizontalAlignment == null) {
                horizontalAlignment = defaultStyle.getHorizontalAlignment();
            }
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle(modifier, verticalArrangement, horizontalAlignment);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AepColumnStyle() {
        this(null, null, null, 7, null);
    }
}
