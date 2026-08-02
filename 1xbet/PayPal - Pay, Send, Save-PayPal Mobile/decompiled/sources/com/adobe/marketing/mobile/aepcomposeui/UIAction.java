package com.adobe.marketing.mobile.aepcomposeui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;", "", "<init>", "()V", "Click", "Lcom/adobe/marketing/mobile/aepcomposeui/UIAction$Click;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UIAction {
    public static final int $stable = 0;

    private UIAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/UIAction$Click;", "Lcom/adobe/marketing/mobile/aepcomposeui/UIAction;", "", "id", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.ACTION_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/adobe/marketing/mobile/aepcomposeui/UIAction$Click;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionUrl", "getId"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class Click extends com.adobe.marketing.mobile.aepcomposeui.UIAction {
        public static final int $stable = 0;
        private final java.lang.String actionUrl;
        private final java.lang.String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.actionUrl = str2;
        }

        public final java.lang.String getActionUrl() {
            return this.actionUrl;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Click(id=");
            sb.append(this.id);
            sb.append(", actionUrl=");
            sb.append(this.actionUrl);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.actionUrl;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.adobe.marketing.mobile.aepcomposeui.UIAction.Click)) {
                return false;
            }
            com.adobe.marketing.mobile.aepcomposeui.UIAction.Click click = (com.adobe.marketing.mobile.aepcomposeui.UIAction.Click) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, click.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionUrl, click.actionUrl);
        }

        public final com.adobe.marketing.mobile.aepcomposeui.UIAction.Click copy(java.lang.String id, java.lang.String actionUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(id, actionUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getActionUrl() {
            return this.actionUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.UIAction.Click copy$default(com.adobe.marketing.mobile.aepcomposeui.UIAction.Click click, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = click.id;
            }
            if ((i & 2) != 0) {
                str2 = click.actionUrl;
            }
            return click.copy(str, str2);
        }
    }

    public /* synthetic */ UIAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
