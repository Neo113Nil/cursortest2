package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "", "Template", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CustomNotificationViews {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "", "templateId", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTemplateId", "Ljava/util/Map;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Template implements com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews {
        private final java.util.Map<java.lang.String, java.lang.Object> data;
        private final java.lang.String templateId;

        public Template(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.templateId = str;
            this.data = map;
        }

        public final java.lang.String getTemplateId() {
            return this.templateId;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.templateId;
            java.util.Map<java.lang.String, java.lang.Object> map = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Template(templateId=");
            sb.append(str);
            sb.append(", data=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.templateId.hashCode() * 31) + this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template template = (com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.templateId, template.templateId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, template.data);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template copy(java.lang.String templateId, java.util.Map<java.lang.String, ? extends java.lang.Object> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template(templateId, data);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTemplateId() {
            return this.templateId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template copy$default(com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template template, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = template.templateId;
            }
            if ((i & 2) != 0) {
                map = template.data;
            }
            return template.copy(str, map);
        }
    }
}
