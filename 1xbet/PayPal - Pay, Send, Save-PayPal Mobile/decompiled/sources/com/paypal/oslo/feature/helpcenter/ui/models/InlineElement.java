package com.paypal.oslo.feature.helpcenter.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ContentElement;", "Text", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface InlineElement extends com.paypal.oslo.feature.helpcenter.ui.models.ContentElement {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Text;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "Lcom/paypal/pds/core/RichText;", "richText", "<init>", "(Lcom/paypal/pds/core/RichText;)V", "component1", "()Lcom/paypal/pds/core/RichText;", "copy", "(Lcom/paypal/pds/core/RichText;)Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Text;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/RichText;", "getRichText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Text implements com.paypal.oslo.feature.helpcenter.ui.models.InlineElement {
        public static final int $stable = 0;
        private final com.paypal.pds.core.RichText richText;

        public Text(com.paypal.pds.core.RichText richText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            this.richText = richText;
        }

        public final com.paypal.pds.core.RichText getRichText() {
            return this.richText;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.RichText richText = this.richText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Text(richText=");
            sb.append(richText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.richText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text) && kotlin.jvm.internal.Intrinsics.areEqual(this.richText, ((com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text) other).richText);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text copy(com.paypal.pds.core.RichText richText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text(richText);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.RichText getRichText() {
            return this.richText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text copy$default(com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Text text, com.paypal.pds.core.RichText richText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                richText = text.richText;
            }
            return text.copy(richText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement;", "", "src", "", "width", "height", "alt", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSrc", "Ljava/lang/Integer;", "getWidth", "getHeight", "getAlt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Image implements com.paypal.oslo.feature.helpcenter.ui.models.InlineElement {
        public static final int $stable = 0;
        private final java.lang.String alt;
        private final java.lang.Integer height;
        private final java.lang.String src;
        private final java.lang.Integer width;

        public Image(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.src = str;
            this.width = num;
            this.height = num2;
            this.alt = str2;
        }

        public /* synthetic */ Image(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
        }

        public final java.lang.String getSrc() {
            return this.src;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.String getAlt() {
            return this.alt;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.src;
            java.lang.Integer num = this.width;
            java.lang.Integer num2 = this.height;
            java.lang.String str2 = this.alt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(src=");
            sb.append(str);
            sb.append(", width=");
            sb.append(num);
            sb.append(", height=");
            sb.append(num2);
            sb.append(", alt=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.src.hashCode();
            java.lang.Integer num = this.width;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.height;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str = this.alt;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image image = (com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.src, image.src) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, image.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, image.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.alt, image.alt);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image copy(java.lang.String src, java.lang.Integer width, java.lang.Integer height, java.lang.String alt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image(src, width, height, alt);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAlt() {
            return this.alt;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSrc() {
            return this.src;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image copy$default(com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image image, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = image.src;
            }
            if ((i & 2) != 0) {
                num = image.width;
            }
            if ((i & 4) != 0) {
                num2 = image.height;
            }
            if ((i & 8) != 0) {
                str2 = image.alt;
            }
            return image.copy(str, num, num2, str2);
        }
    }
}
