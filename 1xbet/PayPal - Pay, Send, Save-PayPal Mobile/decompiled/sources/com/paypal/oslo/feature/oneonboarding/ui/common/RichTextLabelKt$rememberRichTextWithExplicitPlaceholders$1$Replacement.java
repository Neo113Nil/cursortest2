package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u008a\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/common/RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement;", "", "", "startIndex", "endIndex", "", "text", "url", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(IILjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/ui/common/RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "getEndIndex", "Ljava/lang/String;", "getText", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement {
    private final int endIndex;
    private final int startIndex;
    private final java.lang.String text;
    private final java.lang.String url;

    public RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement(int i, int i2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.startIndex = i;
        this.endIndex = i2;
        this.text = str;
        this.url = str2;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String toString() {
        int i = this.startIndex;
        int i2 = this.endIndex;
        java.lang.String str = this.text;
        java.lang.String str2 = this.url;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Replacement(startIndex=");
        sb.append(i);
        sb.append(", endIndex=");
        sb.append(i2);
        sb.append(", text=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.startIndex) * 31) + java.lang.Integer.hashCode(this.endIndex)) * 31) + this.text.hashCode()) * 31) + this.url.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement = (com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement) other;
        return this.startIndex == richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.startIndex && this.endIndex == richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.endIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.text, richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.url);
    }

    public final com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement copy(int startIndex, int endIndex, java.lang.String text, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return new com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement(startIndex, endIndex, text, url);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement copy$default(com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement, int i, int i2, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.startIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.endIndex;
        }
        if ((i3 & 4) != 0) {
            str = richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.text;
        }
        if ((i3 & 8) != 0) {
            str2 = richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.url;
        }
        return richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.copy(i, i2, str, str2);
    }
}
