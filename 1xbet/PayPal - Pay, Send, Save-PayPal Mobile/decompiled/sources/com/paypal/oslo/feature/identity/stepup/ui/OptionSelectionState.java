package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "options", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;", "selectionType", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;)Lcom/paypal/oslo/feature/identity/stepup/ui/OptionSelectionState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData", "Ljava/util/List;", "getOptions", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;", "getSelectionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionSelectionState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;
    private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> options;
    private final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType;

    public OptionSelectionState(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> list, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionType, "");
        this.challengeData = challengeData;
        this.options = list;
        this.selectionType = selectionType;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
        return this.challengeData;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> getOptions() {
        return this.options;
    }

    public final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType getSelectionType() {
        return this.selectionType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
        java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> list = this.options;
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType = this.selectionType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionSelectionState(challengeData=");
        sb.append(challengeData);
        sb.append(", options=");
        sb.append(list);
        sb.append(", selectionType=");
        sb.append(selectionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.challengeData.hashCode() * 31) + this.options.hashCode()) * 31) + this.selectionType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState)) {
            return false;
        }
        com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState = (com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, optionSelectionState.challengeData) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, optionSelectionState.options) && this.selectionType == optionSelectionState.selectionType;
    }

    public final com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> options, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionType, "");
        return new com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState(challengeData, options, selectionType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType getSelectionType() {
        return this.selectionType;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> component2() {
        return this.options;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
        return this.challengeData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState copy$default(com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState optionSelectionState, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, java.util.List list, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            challengeData = optionSelectionState.challengeData;
        }
        if ((i & 2) != 0) {
            list = optionSelectionState.options;
        }
        if ((i & 4) != 0) {
            selectionType = optionSelectionState.selectionType;
        }
        return optionSelectionState.copy(challengeData, list, selectionType);
    }
}
