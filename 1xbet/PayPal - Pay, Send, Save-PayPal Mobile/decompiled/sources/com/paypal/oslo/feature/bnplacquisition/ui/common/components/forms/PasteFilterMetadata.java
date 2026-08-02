package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/PasteFilterMetadata;", "", "", "onlyDigits", "", "", "charsToFilter", "<init>", "(ZLjava/util/Set;)V", "component1", "()Z", "component2", "()Ljava/util/Set;", "copy", "(ZLjava/util/Set;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/PasteFilterMetadata;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getOnlyDigits", "Ljava/util/Set;", "getCharsToFilter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PasteFilterMetadata {
    public static final int $stable = 0;
    private final java.util.Set<java.lang.Character> charsToFilter;
    private final boolean onlyDigits;

    public PasteFilterMetadata(boolean z, java.util.Set<java.lang.Character> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.onlyDigits = z;
        this.charsToFilter = set;
    }

    public final boolean getOnlyDigits() {
        return this.onlyDigits;
    }

    public /* synthetic */ PasteFilterMetadata(boolean z, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    public final java.util.Set<java.lang.Character> getCharsToFilter() {
        return this.charsToFilter;
    }

    public final java.lang.String toString() {
        boolean z = this.onlyDigits;
        java.util.Set<java.lang.Character> set = this.charsToFilter;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasteFilterMetadata(onlyDigits=");
        sb.append(z);
        sb.append(", charsToFilter=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.onlyDigits) * 31) + this.charsToFilter.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata pasteFilterMetadata = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata) other;
        return this.onlyDigits == pasteFilterMetadata.onlyDigits && kotlin.jvm.internal.Intrinsics.areEqual(this.charsToFilter, pasteFilterMetadata.charsToFilter);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata copy(boolean onlyDigits, java.util.Set<java.lang.Character> charsToFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charsToFilter, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata(onlyDigits, charsToFilter);
    }

    public final java.util.Set<java.lang.Character> component2() {
        return this.charsToFilter;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOnlyDigits() {
        return this.onlyDigits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata pasteFilterMetadata, boolean z, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pasteFilterMetadata.onlyDigits;
        }
        if ((i & 2) != 0) {
            set = pasteFilterMetadata.charsToFilter;
        }
        return pasteFilterMetadata.copy(z, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PasteFilterMetadata() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
