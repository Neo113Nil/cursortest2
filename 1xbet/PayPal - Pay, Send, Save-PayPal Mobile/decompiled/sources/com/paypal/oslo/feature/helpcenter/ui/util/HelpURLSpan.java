package com.paypal.oslo.feature.helpcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/HelpURLSpan;", "Landroid/text/style/URLSpan;", "", "url", "<init>", "(Ljava/lang/String;)V", "Landroid/text/TextPaint;", "drawState", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpURLSpan extends android.text.style.URLSpan {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.ui.util.HelpURLSpan.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.util.HelpURLSpan.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("<[/]?(?:a|strong|u)[^>]*>");

    public HelpURLSpan(java.lang.String str) {
        super(str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint drawState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawState, "");
        super.updateDrawState(drawState);
        drawState.setUnderlineText(false);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/HelpURLSpan$Companion;", "", "<init>", "()V", "", "webLinkText", "Landroid/text/Spannable;", "removeUnderlines", "(Ljava/lang/String;)Landroid/text/Spannable;", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.text.Spannable removeUnderlines(java.lang.String webLinkText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webLinkText, "");
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(android.text.Html.fromHtml(com.paypal.oslo.feature.helpcenter.ui.util.HelpURLSpan.Camera2StreamConfigurationMap.replace(webLinkText, "")));
            java.lang.Object[] spans = newSpannable.getSpans(0, newSpannable.length(), android.text.style.URLSpan.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spans, "");
            for (java.lang.Object obj : spans) {
                android.text.style.URLSpan uRLSpan = (android.text.style.URLSpan) obj;
                int spanStart = newSpannable.getSpanStart(uRLSpan);
                int spanEnd = newSpannable.getSpanEnd(uRLSpan);
                newSpannable.removeSpan(uRLSpan);
                newSpannable.setSpan(new com.paypal.oslo.feature.helpcenter.ui.util.HelpURLSpan(uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(newSpannable);
            return newSpannable;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
