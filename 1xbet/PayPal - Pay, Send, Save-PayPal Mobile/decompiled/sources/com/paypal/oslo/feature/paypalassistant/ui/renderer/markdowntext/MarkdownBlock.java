package com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "", "<init>", "()V", "Paragraph", "Heading", "ListItem", "Code", "BlankLine", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$BlankLine;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Code;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Heading;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$ListItem;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Paragraph;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MarkdownBlock {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Paragraph;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "Landroidx/compose/ui/text/AnnotatedString;", "content", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "copy", "(Landroidx/compose/ui/text/AnnotatedString;)Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Paragraph;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Paragraph extends com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.AnnotatedString content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paragraph(androidx.compose.ui.text.AnnotatedString annotatedString) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
            this.content = annotatedString;
        }

        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public final java.lang.String toString() {
            androidx.compose.ui.text.AnnotatedString annotatedString = this.content;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paragraph(content=");
            sb.append((java.lang.Object) annotatedString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, ((com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph) other).content);
        }

        public final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph copy(androidx.compose.ui.text.AnnotatedString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph(content);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph copy$default(com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Paragraph paragraph, androidx.compose.ui.text.AnnotatedString annotatedString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                annotatedString = paragraph.content;
            }
            return paragraph.copy(annotatedString);
        }
    }

    private MarkdownBlock() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Heading;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "Landroidx/compose/ui/text/AnnotatedString;", "content", "", "level", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "component2", "()I", "copy", "(Landroidx/compose/ui/text/AnnotatedString;I)Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Heading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getContent", com.visa.cbp.getEncExpo.warmup, "getLevel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Heading extends com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.AnnotatedString content;
        private final int level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Heading(androidx.compose.ui.text.AnnotatedString annotatedString, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
            this.content = annotatedString;
            this.level = i;
        }

        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public final int getLevel() {
            return this.level;
        }

        public final java.lang.String toString() {
            androidx.compose.ui.text.AnnotatedString annotatedString = this.content;
            int i = this.level;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Heading(content=");
            sb.append((java.lang.Object) annotatedString);
            sb.append(", level=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.content.hashCode() * 31) + java.lang.Integer.hashCode(this.level);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading)) {
                return false;
            }
            com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading heading = (com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.content, heading.content) && this.level == heading.level;
        }

        public final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading copy(androidx.compose.ui.text.AnnotatedString content, int level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading(content, level);
        }

        /* renamed from: component2, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading copy$default(com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Heading heading, androidx.compose.ui.text.AnnotatedString annotatedString, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                annotatedString = heading.content;
            }
            if ((i2 & 2) != 0) {
                i = heading.level;
            }
            return heading.copy(annotatedString, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$ListItem;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "", "prefix", "Landroidx/compose/ui/text/AnnotatedString;", "content", "", "depth", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;I)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/compose/ui/text/AnnotatedString;", "component3", "()I", "copy", "(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;I)Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$ListItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getPrefix", "Landroidx/compose/ui/text/AnnotatedString;", "getContent", com.visa.cbp.getEncExpo.warmup, "getDepth"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListItem extends com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.AnnotatedString content;
        private final int depth;
        private final java.lang.String prefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListItem(java.lang.String str, androidx.compose.ui.text.AnnotatedString annotatedString, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
            this.prefix = str;
            this.content = annotatedString;
            this.depth = i;
        }

        public /* synthetic */ ListItem(java.lang.String str, androidx.compose.ui.text.AnnotatedString annotatedString, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, annotatedString, (i2 & 4) != 0 ? 0 : i);
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public final int getDepth() {
            return this.depth;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            androidx.compose.ui.text.AnnotatedString annotatedString = this.content;
            int i = this.depth;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListItem(prefix=");
            sb.append(str);
            sb.append(", content=");
            sb.append((java.lang.Object) annotatedString);
            sb.append(", depth=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.prefix.hashCode() * 31) + this.content.hashCode()) * 31) + java.lang.Integer.hashCode(this.depth);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem)) {
                return false;
            }
            com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem listItem = (com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, listItem.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, listItem.content) && this.depth == listItem.depth;
        }

        public final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem copy(java.lang.String prefix, androidx.compose.ui.text.AnnotatedString content, int depth) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem(prefix, content, depth);
        }

        /* renamed from: component3, reason: from getter */
        public final int getDepth() {
            return this.depth;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem copy$default(com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.ListItem listItem, java.lang.String str, androidx.compose.ui.text.AnnotatedString annotatedString, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = listItem.prefix;
            }
            if ((i2 & 2) != 0) {
                annotatedString = listItem.content;
            }
            if ((i2 & 4) != 0) {
                i = listItem.depth;
            }
            return listItem.copy(str, annotatedString, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Code;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "Landroidx/compose/ui/text/AnnotatedString;", "content", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "copy", "(Landroidx/compose/ui/text/AnnotatedString;)Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$Code;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Code extends com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock {
        public static final int $stable = 0;
        private final androidx.compose.ui.text.AnnotatedString content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code(androidx.compose.ui.text.AnnotatedString annotatedString) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedString, "");
            this.content = annotatedString;
        }

        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public final java.lang.String toString() {
            androidx.compose.ui.text.AnnotatedString annotatedString = this.content;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Code(content=");
            sb.append((java.lang.Object) annotatedString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, ((com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code) other).content);
        }

        public final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code copy(androidx.compose.ui.text.AnnotatedString content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code(content);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.text.AnnotatedString getContent() {
            return this.content;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code copy$default(com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.Code code, androidx.compose.ui.text.AnnotatedString annotatedString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                annotatedString = code.content;
            }
            return code.copy(annotatedString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock$BlankLine;", "Lcom/paypal/oslo/feature/paypalassistant/ui/renderer/markdowntext/MarkdownBlock;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlankLine extends com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.BlankLine INSTANCE = new com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.BlankLine();

        public final int hashCode() {
            return -1965219413;
        }

        private BlankLine() {
            super(null);
        }

        public final java.lang.String toString() {
            return "BlankLine";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext.MarkdownBlock.BlankLine)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MarkdownBlock(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
