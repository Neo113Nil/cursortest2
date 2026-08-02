package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u0010,J\u0010\u0010:\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0012\u0010;\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b=\u0010*J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0003¢\u0006\u0004\b>\u0010(Jà\u0001\u0010?\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bD\u0010*J\u0010\u0010E\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bE\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bG\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010KR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bN\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bO\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bP\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bQ\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010R\u001a\u0004\bS\u00102R\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u00104\"\u0004\bV\u0010WR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\bY\u0010$R\"\u0010\u0013\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010X\u001a\u0004\bZ\u0010$\"\u0004\b[\u0010\\R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\b]\u0010,R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\b^\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\b_\u0010,R\u001a\u0010\u0017\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\b\u0017\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\ba\u0010<R\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010H\u001a\u0004\bb\u0010*R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\bc\u0010("}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "workflowConfigs", "", "currentIndex", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "idaToken", "authFlowId", "authFlowContext", "partyId", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;", "resultStatusCode", "", "canGoBack", "showIntermediateTutorialPage", "verifyOption", "stepName", "extendedData", "isWebFlow", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "locale", "manualReviewHours", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowResult;", "workflowResults", "<init>", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;ILjava/util/List;)V", "", "incrementIndex", "()V", "hasMoreWorkflows", "()Z", "getCurrentConfig", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowConfig;", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;", "component9", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "component17", "component18", "copy", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;ILjava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getWorkflowConfigs", com.visa.cbp.getEncExpo.warmup, "getCurrentIndex", "setCurrentIndex", "(I)V", "Ljava/lang/String;", "getFlowName", "getIdaToken", "getAuthFlowId", "getAuthFlowContext", "getPartyId", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultType;", "getResultType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;", "getResultStatusCode", "setResultStatusCode", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/ResultStatusCode;)V", "Z", "getCanGoBack", "getShowIntermediateTutorialPage", "setShowIntermediateTutorialPage", "(Z)V", "getVerifyOption", "getStepName", "getExtendedData", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "getLocale", "getManualReviewHours", "getWorkflowResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WorkflowContext {
    public static final int $stable = 8;
    private final java.lang.String authFlowContext;
    private final java.lang.String authFlowId;
    private final boolean canGoBack;
    private int currentIndex;
    private final java.lang.String extendedData;
    private final java.lang.String flowName;
    private final java.lang.String idaToken;
    private final boolean isWebFlow;
    private final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale;
    private final int manualReviewHours;
    private final java.lang.String partyId;
    private com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType;
    private boolean showIntermediateTutorialPage;
    private final java.lang.String stepName;
    private final java.lang.String verifyOption;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults;

    public WorkflowContext(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> list, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType, com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode, boolean z, boolean z2, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z3, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, int i2, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultStatusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.workflowConfigs = list;
        this.currentIndex = i;
        this.flowName = str;
        this.idaToken = str2;
        this.authFlowId = str3;
        this.authFlowContext = str4;
        this.partyId = str5;
        this.resultType = resultType;
        this.resultStatusCode = resultStatusCode;
        this.canGoBack = z;
        this.showIntermediateTutorialPage = z2;
        this.verifyOption = str6;
        this.stepName = str7;
        this.extendedData = str8;
        this.isWebFlow = z3;
        this.locale = supportedLocale;
        this.manualReviewHours = i2;
        this.workflowResults = list2;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> getWorkflowConfigs() {
        return this.workflowConfigs;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String getIdaToken() {
        return this.idaToken;
    }

    public final java.lang.String getAuthFlowId() {
        return this.authFlowId;
    }

    public final java.lang.String getAuthFlowContext() {
        return this.authFlowContext;
    }

    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public /* synthetic */ WorkflowContext(java.util.List list, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType, com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode, boolean z, boolean z2, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z3, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, int i2, java.util.List list2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? 0 : i, str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.FILE : resultType, (i3 & 256) != 0 ? com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode.UNKNOWN : resultStatusCode, (i3 & 512) != 0 ? true : z, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : str7, (i3 & 8192) != 0 ? null : str8, (i3 & 16384) != 0 ? false : z3, (32768 & i3) != 0 ? null : supportedLocale, (65536 & i3) != 0 ? 72 : i2, (i3 & 131072) != 0 ? new java.util.ArrayList() : list2);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType getResultType() {
        return this.resultType;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode getResultStatusCode() {
        return this.resultStatusCode;
    }

    public final void setResultStatusCode(com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultStatusCode, "");
        this.resultStatusCode = resultStatusCode;
    }

    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    public final boolean getShowIntermediateTutorialPage() {
        return this.showIntermediateTutorialPage;
    }

    public final void setShowIntermediateTutorialPage(boolean z) {
        this.showIntermediateTutorialPage = z;
    }

    public final java.lang.String getVerifyOption() {
        return this.verifyOption;
    }

    public final java.lang.String getStepName() {
        return this.stepName;
    }

    public final java.lang.String getExtendedData() {
        return this.extendedData;
    }

    public final boolean isWebFlow() {
        return this.isWebFlow;
    }

    public final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getLocale() {
        return this.locale;
    }

    public final int getManualReviewHours() {
        return this.manualReviewHours;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> getWorkflowResults() {
        return this.workflowResults;
    }

    public final void incrementIndex() {
        this.currentIndex++;
    }

    public final boolean hasMoreWorkflows() {
        return this.currentIndex < this.workflowConfigs.size();
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig getCurrentConfig() {
        if (this.currentIndex < this.workflowConfigs.size()) {
            return this.workflowConfigs.get(this.currentIndex);
        }
        return null;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> list = this.workflowConfigs;
        int i = this.currentIndex;
        java.lang.String str = this.flowName;
        java.lang.String str2 = this.idaToken;
        java.lang.String str3 = this.authFlowId;
        java.lang.String str4 = this.authFlowContext;
        java.lang.String str5 = this.partyId;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType = this.resultType;
        com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode = this.resultStatusCode;
        boolean z = this.canGoBack;
        boolean z2 = this.showIntermediateTutorialPage;
        java.lang.String str6 = this.verifyOption;
        java.lang.String str7 = this.stepName;
        java.lang.String str8 = this.extendedData;
        boolean z3 = this.isWebFlow;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.locale;
        int i2 = this.manualReviewHours;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> list2 = this.workflowResults;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkflowContext(workflowConfigs=");
        sb.append(list);
        sb.append(", currentIndex=");
        sb.append(i);
        sb.append(", flowName=");
        sb.append(str);
        sb.append(", idaToken=");
        sb.append(str2);
        sb.append(", authFlowId=");
        sb.append(str3);
        sb.append(", authFlowContext=");
        sb.append(str4);
        sb.append(", partyId=");
        sb.append(str5);
        sb.append(", resultType=");
        sb.append(resultType);
        sb.append(", resultStatusCode=");
        sb.append(resultStatusCode);
        sb.append(", canGoBack=");
        sb.append(z);
        sb.append(", showIntermediateTutorialPage=");
        sb.append(z2);
        sb.append(", verifyOption=");
        sb.append(str6);
        sb.append(", stepName=");
        sb.append(str7);
        sb.append(", extendedData=");
        sb.append(str8);
        sb.append(", isWebFlow=");
        sb.append(z3);
        sb.append(", locale=");
        sb.append(supportedLocale);
        sb.append(", manualReviewHours=");
        sb.append(i2);
        sb.append(", workflowResults=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.workflowConfigs.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.currentIndex);
        int hashCode3 = this.flowName.hashCode();
        java.lang.String str = this.idaToken;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.authFlowId;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.authFlowContext;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.partyId;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        int hashCode8 = this.resultType.hashCode();
        int hashCode9 = this.resultStatusCode.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.canGoBack);
        int hashCode11 = java.lang.Boolean.hashCode(this.showIntermediateTutorialPage);
        java.lang.String str5 = this.verifyOption;
        int hashCode12 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.stepName;
        int hashCode13 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.extendedData;
        int hashCode14 = str7 == null ? 0 : str7.hashCode();
        int hashCode15 = java.lang.Boolean.hashCode(this.isWebFlow);
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.locale;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (supportedLocale != null ? supportedLocale.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.manualReviewHours)) * 31) + this.workflowResults.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.workflowConfigs, workflowContext.workflowConfigs) && this.currentIndex == workflowContext.currentIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, workflowContext.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.idaToken, workflowContext.idaToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.authFlowId, workflowContext.authFlowId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authFlowContext, workflowContext.authFlowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, workflowContext.partyId) && this.resultType == workflowContext.resultType && this.resultStatusCode == workflowContext.resultStatusCode && this.canGoBack == workflowContext.canGoBack && this.showIntermediateTutorialPage == workflowContext.showIntermediateTutorialPage && kotlin.jvm.internal.Intrinsics.areEqual(this.verifyOption, workflowContext.verifyOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepName, workflowContext.stepName) && kotlin.jvm.internal.Intrinsics.areEqual(this.extendedData, workflowContext.extendedData) && this.isWebFlow == workflowContext.isWebFlow && this.locale == workflowContext.locale && this.manualReviewHours == workflowContext.manualReviewHours && kotlin.jvm.internal.Intrinsics.areEqual(this.workflowResults, workflowContext.workflowResults);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext copy(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> workflowConfigs, int currentIndex, java.lang.String flowName, java.lang.String idaToken, java.lang.String authFlowId, java.lang.String authFlowContext, java.lang.String partyId, com.paypal.oslo.feature.verificationcapture.domain.model.ResultType resultType, com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode resultStatusCode, boolean canGoBack, boolean showIntermediateTutorialPage, java.lang.String verifyOption, java.lang.String stepName, java.lang.String extendedData, boolean isWebFlow, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale, int manualReviewHours, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> workflowResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultStatusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowResults, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext(workflowConfigs, currentIndex, flowName, idaToken, authFlowId, authFlowContext, partyId, resultType, resultStatusCode, canGoBack, showIntermediateTutorialPage, verifyOption, stepName, extendedData, isWebFlow, locale, manualReviewHours, workflowResults);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.ResultStatusCode getResultStatusCode() {
        return this.resultStatusCode;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.ResultType getResultType() {
        return this.resultType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAuthFlowContext() {
        return this.authFlowContext;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAuthFlowId() {
        return this.authFlowId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIdaToken() {
        return this.idaToken;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult> component18() {
        return this.workflowResults;
    }

    /* renamed from: component17, reason: from getter */
    public final int getManualReviewHours() {
        return this.manualReviewHours;
    }

    /* renamed from: component16, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getLocale() {
        return this.locale;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsWebFlow() {
        return this.isWebFlow;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getExtendedData() {
        return this.extendedData;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getStepName() {
        return this.stepName;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getVerifyOption() {
        return this.verifyOption;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowIntermediateTutorialPage() {
        return this.showIntermediateTutorialPage;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig> component1() {
        return this.workflowConfigs;
    }
}
