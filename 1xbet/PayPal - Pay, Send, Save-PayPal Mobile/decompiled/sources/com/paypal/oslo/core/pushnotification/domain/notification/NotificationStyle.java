package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "", "BigText", "BigPicture", "InboxStyle", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigPicture;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigText;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$InboxStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NotificationStyle {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigText;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BigText implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle {
        private final java.lang.String text;

        public BigText(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BigText(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText) other).text);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText bigText, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bigText.text;
            }
            return bigText.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigPicture;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "Landroid/graphics/Bitmap;", "picture", "", "contentDescription", "summaryText", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$BigPicture;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/graphics/Bitmap;", "getPicture", "Ljava/lang/String;", "getContentDescription", "getSummaryText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BigPicture implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle {
        private final java.lang.String contentDescription;
        private final android.graphics.Bitmap picture;
        private final java.lang.String summaryText;

        public BigPicture(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.picture = bitmap;
            this.contentDescription = str;
            this.summaryText = str2;
        }

        public /* synthetic */ BigPicture(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final android.graphics.Bitmap getPicture() {
            return this.picture;
        }

        public final java.lang.String getContentDescription() {
            return this.contentDescription;
        }

        public final java.lang.String getSummaryText() {
            return this.summaryText;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.picture;
            java.lang.String str = this.contentDescription;
            java.lang.String str2 = this.summaryText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BigPicture(picture=");
            sb.append(bitmap);
            sb.append(", contentDescription=");
            sb.append(str);
            sb.append(", summaryText=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.picture.hashCode();
            java.lang.String str = this.contentDescription;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.summaryText;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture bigPicture = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.picture, bigPicture.picture) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, bigPicture.contentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.summaryText, bigPicture.summaryText);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture copy(android.graphics.Bitmap picture, java.lang.String contentDescription, java.lang.String summaryText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(picture, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture(picture, contentDescription, summaryText);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSummaryText() {
            return this.summaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getPicture() {
            return this.picture;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture bigPicture, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = bigPicture.picture;
            }
            if ((i & 2) != 0) {
                str = bigPicture.contentDescription;
            }
            if ((i & 4) != 0) {
                str2 = bigPicture.summaryText;
            }
            return bigPicture.copy(bitmap, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$InboxStyle;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "", "", "lines", "summaryText", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle$InboxStyle;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getLines", "Ljava/lang/String;", "getSummaryText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InboxStyle implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle {
        private final java.util.List<java.lang.String> lines;
        private final java.lang.String summaryText;

        public InboxStyle(java.util.List<java.lang.String> list, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.lines = list;
            this.summaryText = str;
        }

        public /* synthetic */ InboxStyle(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }

        public final java.util.List<java.lang.String> getLines() {
            return this.lines;
        }

        public final java.lang.String getSummaryText() {
            return this.summaryText;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.lines;
            java.lang.String str = this.summaryText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InboxStyle(lines=");
            sb.append(list);
            sb.append(", summaryText=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.lines.hashCode();
            java.lang.String str = this.summaryText;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle inboxStyle = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.lines, inboxStyle.lines) && kotlin.jvm.internal.Intrinsics.areEqual(this.summaryText, inboxStyle.summaryText);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle copy(java.util.List<java.lang.String> lines, java.lang.String summaryText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lines, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle(lines, summaryText);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSummaryText() {
            return this.summaryText;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.lines;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle inboxStyle, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = inboxStyle.lines;
            }
            if ((i & 2) != 0) {
                str = inboxStyle.summaryText;
            }
            return inboxStyle.copy(list, str);
        }
    }
}
