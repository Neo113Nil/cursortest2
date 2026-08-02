package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;", "", "Lcom/paypal/pds/components/BadgeStyle;", "type", "", "text", "<init>", "(Lcom/paypal/pds/components/BadgeStyle;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/components/BadgeStyle;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/pds/components/BadgeStyle;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/components/BadgeStyle;", "getType", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BadgeInfoUi {
    public static final int $stable = 0;
    private final java.lang.String text;
    private final com.paypal.pds.components.BadgeStyle type;

    public BadgeInfoUi(com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        this.type = badgeStyle;
        this.text = str;
    }

    public final com.paypal.pds.components.BadgeStyle getType() {
        return this.type;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.BadgeStyle badgeStyle = this.type;
        java.lang.String str = this.text;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BadgeInfoUi(type=");
        sb.append(badgeStyle);
        sb.append(", text=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.text;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi badgeInfoUi = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, badgeInfoUi.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, badgeInfoUi.text);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi copy(com.paypal.pds.components.BadgeStyle type, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi(type, text);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.BadgeStyle getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi badgeInfoUi, com.paypal.pds.components.BadgeStyle badgeStyle, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            badgeStyle = badgeInfoUi.type;
        }
        if ((i & 2) != 0) {
            str = badgeInfoUi.text;
        }
        return badgeInfoUi.copy(badgeStyle, str);
    }
}
