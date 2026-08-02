package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b \u0018\u0000 *2\u00020\u0001:\u0001*BR\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/style/TextOverflow;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Integer;", "getMaxLines", "()Ljava/lang/Integer;", "setMaxLines", "(Ljava/lang/Integer;)V", "getMinLines", "setMinLines", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/text/style/TextOverflow;", "getOverflow-oLHJmLw", "()Landroidx/compose/ui/text/style/TextOverflow;", "setOverflow-EBpUvns", "(Landroidx/compose/ui/text/style/TextOverflow;)V", "Ljava/lang/Boolean;", "getSoftWrap", "()Ljava/lang/Boolean;", "setSoftWrap", "(Ljava/lang/Boolean;)V", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepTextStyle {
    private java.lang.Integer maxLines;
    private java.lang.Integer minLines;
    private androidx.compose.ui.Modifier modifier;
    private androidx.compose.ui.text.style.TextOverflow overflow;
    private java.lang.Boolean softWrap;
    private androidx.compose.ui.text.TextStyle textStyle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle.Companion INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle.Companion(null);
    public static final int $stable = 8;

    private AepTextStyle(androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.style.TextOverflow textOverflow, java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2) {
        this.modifier = modifier;
        this.textStyle = textStyle;
        this.overflow = textOverflow;
        this.softWrap = bool;
        this.maxLines = num;
        this.minLines = num2;
    }

    public /* synthetic */ AepTextStyle(androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.style.TextOverflow textOverflow, java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modifier, (i & 2) != 0 ? null : textStyle, (i & 4) != 0 ? null : textOverflow, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null, null);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        this.modifier = modifier;
    }

    public final androidx.compose.ui.text.TextStyle getTextStyle() {
        return this.textStyle;
    }

    public final void setTextStyle(androidx.compose.ui.text.TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    /* renamed from: getOverflow-oLHJmLw, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.style.TextOverflow getOverflow() {
        return this.overflow;
    }

    /* renamed from: setOverflow-EBpUvns, reason: not valid java name */
    public final void m9868setOverflowEBpUvns(androidx.compose.ui.text.style.TextOverflow textOverflow) {
        this.overflow = textOverflow;
    }

    public final java.lang.Boolean getSoftWrap() {
        return this.softWrap;
    }

    public final void setSoftWrap(java.lang.Boolean bool) {
        this.softWrap = bool;
    }

    public final java.lang.Integer getMaxLines() {
        return this.maxLines;
    }

    public final void setMaxLines(java.lang.Integer num) {
        this.maxLines = num;
    }

    public final java.lang.Integer getMinLines() {
        return this.minLines;
    }

    public final void setMinLines(java.lang.Integer num) {
        this.minLines = num;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;", "defaultStyle", "overridingStyle", "merge$messaging_phoneRelease", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;)Lcom/adobe/marketing/mobile/aepcomposeui/style/AepTextStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle merge$messaging_phoneRelease$default(com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle.Companion companion, com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle aepTextStyle2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                aepTextStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle(null, null, null, null, null, null, 63, null);
            }
            if ((i & 2) != 0) {
                aepTextStyle2 = null;
            }
            return companion.merge$messaging_phoneRelease(aepTextStyle, aepTextStyle2);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle merge$messaging_phoneRelease(com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle defaultStyle, com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle overridingStyle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultStyle, "");
            if (overridingStyle == null) {
                return defaultStyle;
            }
            androidx.compose.ui.Modifier modifier = overridingStyle.getModifier();
            if (modifier == null) {
                modifier = defaultStyle.getModifier();
            }
            androidx.compose.ui.Modifier modifier2 = modifier;
            androidx.compose.ui.text.TextStyle textStyle = overridingStyle.getTextStyle();
            if (textStyle == null) {
                textStyle = defaultStyle.getTextStyle();
            }
            androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
            androidx.compose.ui.text.style.TextOverflow overflow = overridingStyle.getOverflow();
            if (overflow == null) {
                overflow = defaultStyle.getOverflow();
            }
            androidx.compose.ui.text.style.TextOverflow textOverflow = overflow;
            java.lang.Boolean softWrap = overridingStyle.getSoftWrap();
            if (softWrap == null) {
                softWrap = defaultStyle.getSoftWrap();
            }
            java.lang.Boolean bool = softWrap;
            java.lang.Integer maxLines = overridingStyle.getMaxLines();
            if (maxLines == null) {
                maxLines = defaultStyle.getMaxLines();
            }
            java.lang.Integer num = maxLines;
            java.lang.Integer minLines = overridingStyle.getMinLines();
            return new com.adobe.marketing.mobile.aepcomposeui.style.AepTextStyle(modifier2, textStyle2, textOverflow, bool, num, minLines == null ? defaultStyle.getMinLines() : minLines, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AepTextStyle(androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.style.TextOverflow textOverflow, java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, textStyle, textOverflow, bool, num, num2);
    }
}
