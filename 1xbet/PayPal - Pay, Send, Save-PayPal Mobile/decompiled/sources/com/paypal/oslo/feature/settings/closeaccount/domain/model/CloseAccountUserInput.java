package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "", "", "feedback", "", "selectedReasons", "reasonForClosing", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFeedback", "Ljava/util/List;", "getSelectedReasons", "getReasonForClosing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountUserInput {
    public static final int $stable = 8;
    private final java.lang.String feedback;
    private final java.lang.String reasonForClosing;
    private final java.util.List<java.lang.String> selectedReasons;

    public CloseAccountUserInput(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.feedback = str;
        this.selectedReasons = list;
        this.reasonForClosing = str2;
    }

    public /* synthetic */ CloseAccountUserInput(java.lang.String str, java.util.List list, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2);
    }

    public final java.lang.String getFeedback() {
        return this.feedback;
    }

    public final java.util.List<java.lang.String> getSelectedReasons() {
        return this.selectedReasons;
    }

    public final java.lang.String getReasonForClosing() {
        return this.reasonForClosing;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.feedback;
        java.util.List<java.lang.String> list = this.selectedReasons;
        java.lang.String str2 = this.reasonForClosing;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountUserInput(feedback=");
        sb.append(str);
        sb.append(", selectedReasons=");
        sb.append(list);
        sb.append(", reasonForClosing=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.feedback.hashCode() * 31) + this.selectedReasons.hashCode()) * 31) + this.reasonForClosing.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.feedback, closeAccountUserInput.feedback) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedReasons, closeAccountUserInput.selectedReasons) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonForClosing, closeAccountUserInput.reasonForClosing);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput copy(java.lang.String feedback, java.util.List<java.lang.String> selectedReasons, java.lang.String reasonForClosing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedReasons, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasonForClosing, "");
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput(feedback, selectedReasons, reasonForClosing);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReasonForClosing() {
        return this.reasonForClosing;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.selectedReasons;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFeedback() {
        return this.feedback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountUserInput.feedback;
        }
        if ((i & 2) != 0) {
            list = closeAccountUserInput.selectedReasons;
        }
        if ((i & 4) != 0) {
            str2 = closeAccountUserInput.reasonForClosing;
        }
        return closeAccountUserInput.copy(str, list, str2);
    }

    public CloseAccountUserInput() {
        this(null, null, null, 7, null);
    }
}
