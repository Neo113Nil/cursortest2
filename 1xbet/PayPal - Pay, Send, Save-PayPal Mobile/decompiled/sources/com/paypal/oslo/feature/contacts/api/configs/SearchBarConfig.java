package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\rR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;", "", "", "placeholderText", "", "clickable", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "contextualMessage", "invalidInputHintMessage", "autoFocus", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "component4", "component5", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlaceholderText", "Z", "getClickable", "Lcom/paypal/oslo/feature/contacts/api/configs/ContextualMessage;", "getContextualMessage", "getInvalidInputHintMessage", "getAutoFocus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBarConfig {
    public static final int $stable = 0;
    private final boolean autoFocus;
    private final boolean clickable;
    private final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage;
    private final java.lang.String invalidInputHintMessage;
    private final java.lang.String placeholderText;

    public SearchBarConfig(java.lang.String str, boolean z, com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage, java.lang.String str2, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.placeholderText = str;
        this.clickable = z;
        this.contextualMessage = contextualMessage;
        this.invalidInputHintMessage = str2;
        this.autoFocus = z2;
    }

    public /* synthetic */ SearchBarConfig(java.lang.String str, boolean z, com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage, java.lang.String str2, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : contextualMessage, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? true : z2);
    }

    public final java.lang.String getPlaceholderText() {
        return this.placeholderText;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage getContextualMessage() {
        return this.contextualMessage;
    }

    public final java.lang.String getInvalidInputHintMessage() {
        return this.invalidInputHintMessage;
    }

    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.placeholderText;
        boolean z = this.clickable;
        com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage = this.contextualMessage;
        java.lang.String str2 = this.invalidInputHintMessage;
        boolean z2 = this.autoFocus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchBarConfig(placeholderText=");
        sb.append(str);
        sb.append(", clickable=");
        sb.append(z);
        sb.append(", contextualMessage=");
        sb.append(contextualMessage);
        sb.append(", invalidInputHintMessage=");
        sb.append(str2);
        sb.append(", autoFocus=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.placeholderText.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.clickable);
        com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage = this.contextualMessage;
        int hashCode3 = contextualMessage == null ? 0 : contextualMessage.hashCode();
        java.lang.String str = this.invalidInputHintMessage;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.autoFocus);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig = (com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderText, searchBarConfig.placeholderText) && this.clickable == searchBarConfig.clickable && kotlin.jvm.internal.Intrinsics.areEqual(this.contextualMessage, searchBarConfig.contextualMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.invalidInputHintMessage, searchBarConfig.invalidInputHintMessage) && this.autoFocus == searchBarConfig.autoFocus;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig copy(java.lang.String placeholderText, boolean clickable, com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage, java.lang.String invalidInputHintMessage, boolean autoFocus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderText, "");
        return new com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig(placeholderText, clickable, contextualMessage, invalidInputHintMessage, autoFocus);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInvalidInputHintMessage() {
        return this.invalidInputHintMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.configs.ContextualMessage getContextualMessage() {
        return this.contextualMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlaceholderText() {
        return this.placeholderText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig copy$default(com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig, java.lang.String str, boolean z, com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = searchBarConfig.placeholderText;
        }
        if ((i & 2) != 0) {
            z = searchBarConfig.clickable;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            contextualMessage = searchBarConfig.contextualMessage;
        }
        com.paypal.oslo.feature.contacts.api.configs.ContextualMessage contextualMessage2 = contextualMessage;
        if ((i & 8) != 0) {
            str2 = searchBarConfig.invalidInputHintMessage;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            z2 = searchBarConfig.autoFocus;
        }
        return searchBarConfig.copy(str, z3, contextualMessage2, str3, z2);
    }
}
