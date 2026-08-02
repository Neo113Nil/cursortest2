package com.adobe.marketing.mobile.aepcomposeui.uimodels;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepButton;", "", "", "id", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.ACTION_URL, "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;)Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepButton;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionUrl", "getId", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepText;", "getText"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AepButton {
    public static final int $stable = 0;
    private final java.lang.String actionUrl;
    private final java.lang.String id;
    private final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText text;

    public AepButton(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText aepText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepText, "");
        this.id = str;
        this.actionUrl = str2;
        this.text = aepText;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getActionUrl() {
        return this.actionUrl;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText getText() {
        return this.text;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AepButton(id=");
        sb.append(this.id);
        sb.append(", actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.actionUrl.hashCode()) * 31) + this.text.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton)) {
            return false;
        }
        com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton = (com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, aepButton.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionUrl, aepButton.actionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, aepButton.text);
    }

    public final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton copy(java.lang.String id, java.lang.String actionUrl, com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        return new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton(id, actionUrl, text);
    }

    /* renamed from: component3, reason: from getter */
    public final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getActionUrl() {
        return this.actionUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton copy$default(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton, java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText aepText, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aepButton.id;
        }
        if ((i & 2) != 0) {
            str2 = aepButton.actionUrl;
        }
        if ((i & 4) != 0) {
            aepText = aepButton.text;
        }
        return aepButton.copy(str, str2, aepText);
    }
}
