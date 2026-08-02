package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormUiState;", "", "", "title", "stepsToReproduce", "selectedFrequency", "employeeEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getStepsToReproduce", "getSelectedFrequency", "getEmployeeEmail", "isEmailValid", "()Z", "isSubmitEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BugReportFormUiState {
    public static final int $stable = 0;
    private final java.lang.String employeeEmail;
    private final java.lang.String selectedFrequency;
    private final java.lang.String stepsToReproduce;
    private final java.lang.String title;

    public BugReportFormUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.stepsToReproduce = str2;
        this.selectedFrequency = str3;
        this.employeeEmail = str4;
    }

    public /* synthetic */ BugReportFormUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "ALWAYS" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getStepsToReproduce() {
        return this.stepsToReproduce;
    }

    public final java.lang.String getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final java.lang.String getEmployeeEmail() {
        return this.employeeEmail;
    }

    public final boolean isEmailValid() {
        return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.EmailValidationKt.isValidPayPalEmail(this.employeeEmail);
    }

    public final boolean isSubmitEnabled() {
        return this.title.length() >= 5 && this.stepsToReproduce.length() >= 10 && isEmailValid();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.stepsToReproduce;
        java.lang.String str3 = this.selectedFrequency;
        java.lang.String str4 = this.employeeEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BugReportFormUiState(title=");
        sb.append(str);
        sb.append(", stepsToReproduce=");
        sb.append(str2);
        sb.append(", selectedFrequency=");
        sb.append(str3);
        sb.append(", employeeEmail=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.stepsToReproduce.hashCode()) * 31) + this.selectedFrequency.hashCode()) * 31) + this.employeeEmail.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState)) {
            return false;
        }
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState bugReportFormUiState = (com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, bugReportFormUiState.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepsToReproduce, bugReportFormUiState.stepsToReproduce) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFrequency, bugReportFormUiState.selectedFrequency) && kotlin.jvm.internal.Intrinsics.areEqual(this.employeeEmail, bugReportFormUiState.employeeEmail);
    }

    public final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState copy(java.lang.String title, java.lang.String stepsToReproduce, java.lang.String selectedFrequency, java.lang.String employeeEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsToReproduce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(employeeEmail, "");
        return new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState(title, stepsToReproduce, selectedFrequency, employeeEmail);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEmployeeEmail() {
        return this.employeeEmail;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStepsToReproduce() {
        return this.stepsToReproduce;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState copy$default(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState bugReportFormUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bugReportFormUiState.title;
        }
        if ((i & 2) != 0) {
            str2 = bugReportFormUiState.stepsToReproduce;
        }
        if ((i & 4) != 0) {
            str3 = bugReportFormUiState.selectedFrequency;
        }
        if ((i & 8) != 0) {
            str4 = bugReportFormUiState.employeeEmail;
        }
        return bugReportFormUiState.copy(str, str2, str3, str4);
    }

    public BugReportFormUiState() {
        this(null, null, null, null, 15, null);
    }
}
