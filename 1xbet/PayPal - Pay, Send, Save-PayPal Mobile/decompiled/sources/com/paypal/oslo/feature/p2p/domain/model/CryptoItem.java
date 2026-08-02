package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/CryptoItem;", "", "", "id", "name", "symbol", "code", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/domain/model/CryptoItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getSymbol", "getCode", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CryptoItem {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final java.lang.String id;
    private final boolean isSelected;
    private final java.lang.String name;
    private final java.lang.String symbol;

    public CryptoItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.name = str2;
        this.symbol = str3;
        this.code = str4;
        this.isSelected = z;
    }

    public /* synthetic */ CryptoItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.symbol;
        java.lang.String str4 = this.code;
        boolean z = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoItem(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", symbol=");
        sb.append(str3);
        sb.append(", code=");
        sb.append(str4);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.code.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.CryptoItem)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.CryptoItem cryptoItem = (com.paypal.oslo.feature.p2p.domain.model.CryptoItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cryptoItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, cryptoItem.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.symbol, cryptoItem.symbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, cryptoItem.code) && this.isSelected == cryptoItem.isSelected;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.CryptoItem copy(java.lang.String id, java.lang.String name2, java.lang.String symbol, java.lang.String code, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        return new com.paypal.oslo.feature.p2p.domain.model.CryptoItem(id, name2, symbol, code, isSelected);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.CryptoItem copy$default(com.paypal.oslo.feature.p2p.domain.model.CryptoItem cryptoItem, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoItem.id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoItem.name;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cryptoItem.symbol;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cryptoItem.code;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = cryptoItem.isSelected;
        }
        return cryptoItem.copy(str, str5, str6, str7, z);
    }
}
