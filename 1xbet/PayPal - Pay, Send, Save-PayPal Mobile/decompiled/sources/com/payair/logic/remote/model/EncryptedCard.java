package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/logic/remote/model/EncryptedCard;", "", "", "alg", "encryptedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/EncryptedCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlg", "getEncryptedData"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EncryptedCard {
    private final java.lang.String alg;
    private final java.lang.String encryptedData;

    public EncryptedCard(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.alg = str;
        this.encryptedData = str2;
    }

    public final java.lang.String getAlg() {
        return this.alg;
    }

    public final java.lang.String getEncryptedData() {
        return this.encryptedData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.alg;
        java.lang.String str2 = this.encryptedData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EncryptedCard(alg=");
        sb.append(str);
        sb.append(", encryptedData=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.encryptedData.hashCode() + (this.alg.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.EncryptedCard)) {
            return false;
        }
        com.payair.logic.remote.model.EncryptedCard encryptedCard = (com.payair.logic.remote.model.EncryptedCard) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alg, encryptedCard.alg) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedData, encryptedCard.encryptedData);
    }

    public final com.payair.logic.remote.model.EncryptedCard copy(java.lang.String alg, java.lang.String encryptedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alg, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedData, "");
        return new com.payair.logic.remote.model.EncryptedCard(alg, encryptedData);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEncryptedData() {
        return this.encryptedData;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAlg() {
        return this.alg;
    }

    public static /* synthetic */ com.payair.logic.remote.model.EncryptedCard copy$default(com.payair.logic.remote.model.EncryptedCard encryptedCard, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = encryptedCard.alg;
        }
        if ((i & 2) != 0) {
            str2 = encryptedCard.encryptedData;
        }
        return encryptedCard.copy(str, str2);
    }
}
