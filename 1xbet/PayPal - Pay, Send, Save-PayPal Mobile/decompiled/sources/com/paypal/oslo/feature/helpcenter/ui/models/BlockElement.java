package com.paypal.oslo.feature.helpcenter.ui.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ContentElement;", "<init>", "()V", "Paragraph", "Header", "ListBlock", "Video", "YouTube", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Header;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$ListBlock;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Paragraph;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$YouTube;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BlockElement implements com.paypal.oslo.feature.helpcenter.ui.models.ContentElement {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Paragraph;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "content", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Paragraph;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Paragraph extends com.paypal.oslo.feature.helpcenter.ui.models.BlockElement {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Paragraph(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.content = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> getContent() {
            return this.content;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list = this.content;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paragraph(content=");
            sb.append(list);
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
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, ((com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph) other).content);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph copy(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph(content);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> component1() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph copy$default(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Paragraph paragraph, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = paragraph.content;
            }
            return paragraph.copy(list);
        }
    }

    private BlockElement() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Header;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "content", "", "level", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Header;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContent", com.visa.cbp.getEncExpo.warmup, "getLevel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Header extends com.paypal.oslo.feature.helpcenter.ui.models.BlockElement {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> content;
        private final int level;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Header(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.content = list;
            this.level = i;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> getContent() {
            return this.content;
        }

        public final int getLevel() {
            return this.level;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> list = this.content;
            int i = this.level;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Header(content=");
            sb.append(list);
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
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header header = (com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.content, header.content) && this.level == header.level;
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header copy(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> content, int level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header(content, level);
        }

        /* renamed from: component2, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.InlineElement> component1() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header copy$default(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Header header, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = header.content;
            }
            if ((i2 & 2) != 0) {
                i = header.level;
            }
            return header.copy(list, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$ListBlock;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ListItem;", "items", "", "isBullet", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$ListBlock;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListBlock extends com.paypal.oslo.feature.helpcenter.ui.models.BlockElement {
        public static final int $stable = 8;
        private final boolean isBullet;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListBlock(java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> list, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.isBullet = z;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> getItems() {
            return this.items;
        }

        public final boolean isBullet() {
            return this.isBullet;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> list = this.items;
            boolean z = this.isBullet;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListBlock(items=");
            sb.append(list);
            sb.append(", isBullet=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.items.hashCode() * 31) + java.lang.Boolean.hashCode(this.isBullet);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock listBlock = (com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, listBlock.items) && this.isBullet == listBlock.isBullet;
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock copy(java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> items, boolean isBullet) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock(items, isBullet);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBullet() {
            return this.isBullet;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ListItem> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock copy$default(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.ListBlock listBlock, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = listBlock.items;
            }
            if ((i & 2) != 0) {
                z = listBlock.isBullet;
            }
            return listBlock.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "", "videoSource", "thumbnailUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVideoSource", "getThumbnailUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Video extends com.paypal.oslo.feature.helpcenter.ui.models.BlockElement {
        public static final int $stable = 0;
        private final java.lang.String thumbnailUrl;
        private final java.lang.String videoSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Video(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.videoSource = str;
            this.thumbnailUrl = str2;
        }

        public /* synthetic */ Video(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final java.lang.String getVideoSource() {
            return this.videoSource;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.videoSource;
            java.lang.String str2 = this.thumbnailUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Video(videoSource=");
            sb.append(str);
            sb.append(", thumbnailUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.videoSource.hashCode();
            java.lang.String str = this.thumbnailUrl;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video = (com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.videoSource, video.videoSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailUrl, video.thumbnailUrl);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video copy(java.lang.String videoSource, java.lang.String thumbnailUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSource, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video(videoSource, thumbnailUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVideoSource() {
            return this.videoSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video copy$default(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = video.videoSource;
            }
            if ((i & 2) != 0) {
                str2 = video.thumbnailUrl;
            }
            return video.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$YouTube;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement;", "", "videoSource", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$YouTube;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVideoSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class YouTube extends com.paypal.oslo.feature.helpcenter.ui.models.BlockElement {
        public static final int $stable = 0;
        private final java.lang.String videoSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YouTube(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.videoSource = str;
        }

        public final java.lang.String getVideoSource() {
            return this.videoSource;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.videoSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("YouTube(videoSource=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.videoSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube) && kotlin.jvm.internal.Intrinsics.areEqual(this.videoSource, ((com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube) other).videoSource);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube copy(java.lang.String videoSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSource, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube(videoSource);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVideoSource() {
            return this.videoSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube copy$default(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube youTube, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = youTube.videoSource;
            }
            return youTube.copy(str);
        }
    }

    public /* synthetic */ BlockElement(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
