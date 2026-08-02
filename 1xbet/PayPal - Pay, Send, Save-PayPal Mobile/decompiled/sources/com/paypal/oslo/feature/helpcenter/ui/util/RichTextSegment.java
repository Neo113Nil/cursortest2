package com.paypal.oslo.feature.helpcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment;", "", "<init>", "()V", "Text", com.google.common.net.HttpHeaders.LINK, "LineBreak", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$LineBreak;", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Link;", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
abstract class RichTextSegment {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Text;", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment;", "", "content", "", "isBold", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Text;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContent", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Text extends com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment {
        public static final int $stable = 0;
        private final java.lang.String content;
        private final boolean isBold;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(java.lang.String str, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.content = str;
            this.isBold = z;
        }

        public /* synthetic */ Text(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getContent() {
            return this.content;
        }

        public final boolean isBold() {
            return this.isBold;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.content;
            boolean z = this.isBold;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Text(content=");
            sb.append(str);
            sb.append(", isBold=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.content.hashCode() * 31) + java.lang.Boolean.hashCode(this.isBold);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text text = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.content, text.content) && this.isBold == text.isBold;
        }

        public final com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text copy(java.lang.String content, boolean isBold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text(content, isBold);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContent() {
            return this.content;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text copy$default(com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Text text, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = text.content;
            }
            if ((i & 2) != 0) {
                z = text.isBold;
            }
            return text.copy(str, z);
        }
    }

    private RichTextSegment() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Link;", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment;", "", "text", "href", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$Link;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "getHref"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Link extends com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment {
        public static final int $stable = 0;
        private final java.lang.String href;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.text = str;
            this.href = str2;
        }

        public final java.lang.String getHref() {
            return this.href;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.String str2 = this.href;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(text=");
            sb.append(str);
            sb.append(", href=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + this.href.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link link = (com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, link.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.href, link.href);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link copy(java.lang.String text, java.lang.String href) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
            return new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link(text, href);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHref() {
            return this.href;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link copy$default(com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.Link link, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = link.text;
            }
            if ((i & 2) != 0) {
                str2 = link.href;
            }
            return link.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment$LineBreak;", "Lcom/paypal/oslo/feature/helpcenter/ui/util/RichTextSegment;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LineBreak extends com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak();

        public final int hashCode() {
            return 727181902;
        }

        private LineBreak() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LineBreak";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.util.RichTextSegment.LineBreak)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RichTextSegment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
