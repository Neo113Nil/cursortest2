package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/CardDetails;", "", "Lcom/zettle/sdk/CardDetails$EntryMode;", "entryMode", "<init>", "(Lcom/zettle/sdk/CardDetails$EntryMode;)V", "component1", "()Lcom/zettle/sdk/CardDetails$EntryMode;", "copy", "(Lcom/zettle/sdk/CardDetails$EntryMode;)Lcom/zettle/sdk/CardDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/CardDetails$EntryMode;", "getEntryMode", "EntryMode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CardDetails {
    private final com.zettle.sdk.CardDetails.EntryMode entryMode;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/zettle/sdk/CardDetails$EntryMode;", "", "<init>", "(Ljava/lang/String;I)V", "Magstripe", "Chip", "Contactless"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EntryMode {
        Magstripe,
        Chip,
        Contactless
    }

    public CardDetails(com.zettle.sdk.CardDetails.EntryMode entryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryMode, "");
        this.entryMode = entryMode;
    }

    public final com.zettle.sdk.CardDetails.EntryMode getEntryMode() {
        return this.entryMode;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.CardDetails.EntryMode entryMode = this.entryMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetails(entryMode=");
        sb.append(entryMode);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.entryMode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.CardDetails) && this.entryMode == ((com.zettle.sdk.CardDetails) other).entryMode;
    }

    public final com.zettle.sdk.CardDetails copy(com.zettle.sdk.CardDetails.EntryMode entryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryMode, "");
        return new com.zettle.sdk.CardDetails(entryMode);
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.CardDetails.EntryMode getEntryMode() {
        return this.entryMode;
    }

    public static /* synthetic */ com.zettle.sdk.CardDetails copy$default(com.zettle.sdk.CardDetails cardDetails, com.zettle.sdk.CardDetails.EntryMode entryMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            entryMode = cardDetails.entryMode;
        }
        return cardDetails.copy(entryMode);
    }
}
