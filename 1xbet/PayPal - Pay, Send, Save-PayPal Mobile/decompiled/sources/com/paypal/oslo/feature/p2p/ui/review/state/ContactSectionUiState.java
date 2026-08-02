package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\rHÆ\u0003¢\u0006\u0004\b2\u0010,J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010#J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u0010#J\u0010\u00109\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b9\u0010#J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010#Jî\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u00042\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\b\u0005\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bG\u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bH\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010'R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\b\n\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010*R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010.R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\b\u0011\u0010#R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\b\u0012\u0010#R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bQ\u0010#R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bR\u0010,R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bS\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bT\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u00106R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\b\u001a\u0010#R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\b\u001b\u0010#R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\b\u001c\u0010#R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\b\u001d\u0010#R\u0011\u0010W\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bW\u0010#R\u0011\u0010Y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bX\u0010#R\u0011\u0010Z\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bZ\u0010#R\u0011\u0010[\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b[\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "", "isContactsAccessPermissionGranted", "selectedItemNote", "paymentId", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updateReceiverAttempt", "isLoading", "", "errorResId", "", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "recommendedContacts", "selectedContact", "isPaymentLinkSelection", "isPaymentLinkSelected", "contingenciesDetected", "Lcom/paypal/oslo/feature/p2p/domain/model/Contingency;", "pendingContingencies", "showContingencySheet", "contingencyResolutionError", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "scamContingencyAlertType", "isContactSyncEnabled", "isPpLinkEnabled", "isQrcFlowEnabled", "isPublicProfileEnabled", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;ZLjava/lang/Integer;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;ZZZLjava/util/List;ZLjava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;ZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/util/List;", "component9", "()Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;ZLjava/lang/Integer;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;ZZZLjava/util/List;ZLjava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;ZZZZ)Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Z", "getSelectedItemNote", "getPaymentId", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "getUpdateReceiverAttempt", "Ljava/lang/Integer;", "getErrorResId", "Ljava/util/List;", "getRecommendedContacts", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "getSelectedContact", "getContingenciesDetected", "getPendingContingencies", "getShowContingencySheet", "getContingencyResolutionError", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "getScamContingencyAlertType", "isContactSelected", "getNoItemSelectedYet", "noItemSelectedYet", "isFirstSelection", "isWaitingForReceiverResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ContactSectionUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final boolean contingenciesDetected;
    private final java.lang.String contingencyResolutionError;
    private final java.lang.Integer errorResId;
    private final boolean isContactSyncEnabled;
    private final boolean isContactsAccessPermissionGranted;
    private final boolean isLoading;
    private final boolean isPaymentLinkSelected;
    private final boolean isPaymentLinkSelection;
    private final boolean isPpLinkEnabled;
    private final boolean isPublicProfileEnabled;
    private final boolean isQrcFlowEnabled;
    private final java.lang.String name;
    private final java.lang.String paymentId;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> pendingContingencies;
    private final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> recommendedContacts;
    private final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamContingencyAlertType;
    private final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem selectedContact;
    private final java.lang.String selectedItemNote;
    private final boolean showContingencySheet;
    private final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;

    public ContactSectionUiState(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, boolean z2, java.lang.Integer num, java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> list, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, boolean z3, boolean z4, boolean z5, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list2, boolean z6, java.lang.String str4, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, boolean z7, boolean z8, boolean z9, boolean z10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.name = str;
        this.isContactsAccessPermissionGranted = z;
        this.selectedItemNote = str2;
        this.paymentId = str3;
        this.updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        this.isLoading = z2;
        this.errorResId = num;
        this.recommendedContacts = list;
        this.selectedContact = p2PContactItem;
        this.isPaymentLinkSelection = z3;
        this.isPaymentLinkSelected = z4;
        this.contingenciesDetected = z5;
        this.pendingContingencies = list2;
        this.showContingencySheet = z6;
        this.contingencyResolutionError = str4;
        this.scamContingencyAlertType = scamAlertType;
        this.isContactSyncEnabled = z7;
        this.isPpLinkEnabled = z8;
        this.isQrcFlowEnabled = z9;
        this.isPublicProfileEnabled = z10;
    }

    public /* synthetic */ ContactSectionUiState(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, boolean z2, java.lang.Integer num, java.util.List list, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, boolean z3, boolean z4, boolean z5, java.util.List list2, boolean z6, java.lang.String str4, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, boolean z7, boolean z8, boolean z9, boolean z10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ContactSectionUiState" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : updatePaymentTransferAttemptReceiver, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : p2PContactItem, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? null : scamAlertType, (i & 65536) != 0 ? false : z7, (i & 131072) != 0 ? false : z8, (i & 262144) != 0 ? false : z9, (i & 524288) != 0 ? false : z10);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean isContactsAccessPermissionGranted() {
        return this.isContactsAccessPermissionGranted;
    }

    public final java.lang.String getSelectedItemNote() {
        return this.selectedItemNote;
    }

    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
        return this.updateReceiverAttempt;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> getRecommendedContacts() {
        return this.recommendedContacts;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getSelectedContact() {
        return this.selectedContact;
    }

    public final boolean isPaymentLinkSelection() {
        return this.isPaymentLinkSelection;
    }

    public final boolean isPaymentLinkSelected() {
        return this.isPaymentLinkSelected;
    }

    public final boolean getContingenciesDetected() {
        return this.contingenciesDetected;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> getPendingContingencies() {
        return this.pendingContingencies;
    }

    public final boolean getShowContingencySheet() {
        return this.showContingencySheet;
    }

    public final java.lang.String getContingencyResolutionError() {
        return this.contingencyResolutionError;
    }

    public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamContingencyAlertType() {
        return this.scamContingencyAlertType;
    }

    public final boolean isContactSyncEnabled() {
        return this.isContactSyncEnabled;
    }

    public final boolean isPpLinkEnabled() {
        return this.isPpLinkEnabled;
    }

    public final boolean isQrcFlowEnabled() {
        return this.isQrcFlowEnabled;
    }

    public final boolean isPublicProfileEnabled() {
        return this.isPublicProfileEnabled;
    }

    public final boolean isContactSelected() {
        return this.selectedContact != null || this.isPaymentLinkSelected;
    }

    public final boolean getNoItemSelectedYet() {
        return this.selectedContact == null && !this.isPaymentLinkSelected;
    }

    public final boolean isFirstSelection() {
        return (this.selectedContact != null || this.isPaymentLinkSelection) && this.updateReceiverAttempt == null;
    }

    public final boolean isWaitingForReceiverResponse() {
        return this.isLoading || this.updateReceiverAttempt == null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        boolean z = this.isContactsAccessPermissionGranted;
        java.lang.String str2 = this.selectedItemNote;
        java.lang.String str3 = this.paymentId;
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
        boolean z2 = this.isLoading;
        java.lang.Integer num = this.errorResId;
        java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> list = this.recommendedContacts;
        com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.selectedContact;
        boolean z3 = this.isPaymentLinkSelection;
        boolean z4 = this.isPaymentLinkSelected;
        boolean z5 = this.contingenciesDetected;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list2 = this.pendingContingencies;
        boolean z6 = this.showContingencySheet;
        java.lang.String str4 = this.contingencyResolutionError;
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = this.scamContingencyAlertType;
        boolean z7 = this.isContactSyncEnabled;
        boolean z8 = this.isPpLinkEnabled;
        boolean z9 = this.isQrcFlowEnabled;
        boolean z10 = this.isPublicProfileEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSectionUiState(name=");
        sb.append(str);
        sb.append(", isContactsAccessPermissionGranted=");
        sb.append(z);
        sb.append(", selectedItemNote=");
        sb.append(str2);
        sb.append(", paymentId=");
        sb.append(str3);
        sb.append(", updateReceiverAttempt=");
        sb.append(updatePaymentTransferAttemptReceiver);
        sb.append(", isLoading=");
        sb.append(z2);
        sb.append(", errorResId=");
        sb.append(num);
        sb.append(", recommendedContacts=");
        sb.append(list);
        sb.append(", selectedContact=");
        sb.append(p2PContactItem);
        sb.append(", isPaymentLinkSelection=");
        sb.append(z3);
        sb.append(", isPaymentLinkSelected=");
        sb.append(z4);
        sb.append(", contingenciesDetected=");
        sb.append(z5);
        sb.append(", pendingContingencies=");
        sb.append(list2);
        sb.append(", showContingencySheet=");
        sb.append(z6);
        sb.append(", contingencyResolutionError=");
        sb.append(str4);
        sb.append(", scamContingencyAlertType=");
        sb.append(scamAlertType);
        sb.append(", isContactSyncEnabled=");
        sb.append(z7);
        sb.append(", isPpLinkEnabled=");
        sb.append(z8);
        sb.append(", isQrcFlowEnabled=");
        sb.append(z9);
        sb.append(", isPublicProfileEnabled=");
        sb.append(z10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isContactsAccessPermissionGranted);
        int hashCode3 = this.selectedItemNote.hashCode();
        int hashCode4 = this.paymentId.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
        int hashCode5 = updatePaymentTransferAttemptReceiver == null ? 0 : updatePaymentTransferAttemptReceiver.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.Integer num = this.errorResId;
        int hashCode7 = num == null ? 0 : num.hashCode();
        int hashCode8 = this.recommendedContacts.hashCode();
        com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.selectedContact;
        int hashCode9 = p2PContactItem == null ? 0 : p2PContactItem.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.isPaymentLinkSelection);
        int hashCode11 = java.lang.Boolean.hashCode(this.isPaymentLinkSelected);
        int hashCode12 = java.lang.Boolean.hashCode(this.contingenciesDetected);
        int hashCode13 = this.pendingContingencies.hashCode();
        int hashCode14 = java.lang.Boolean.hashCode(this.showContingencySheet);
        java.lang.String str = this.contingencyResolutionError;
        int hashCode15 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = this.scamContingencyAlertType;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (scamAlertType != null ? scamAlertType.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isContactSyncEnabled)) * 31) + java.lang.Boolean.hashCode(this.isPpLinkEnabled)) * 31) + java.lang.Boolean.hashCode(this.isQrcFlowEnabled)) * 31) + java.lang.Boolean.hashCode(this.isPublicProfileEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState contactSectionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, contactSectionUiState.name) && this.isContactsAccessPermissionGranted == contactSectionUiState.isContactsAccessPermissionGranted && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedItemNote, contactSectionUiState.selectedItemNote) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, contactSectionUiState.paymentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateReceiverAttempt, contactSectionUiState.updateReceiverAttempt) && this.isLoading == contactSectionUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.errorResId, contactSectionUiState.errorResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedContacts, contactSectionUiState.recommendedContacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedContact, contactSectionUiState.selectedContact) && this.isPaymentLinkSelection == contactSectionUiState.isPaymentLinkSelection && this.isPaymentLinkSelected == contactSectionUiState.isPaymentLinkSelected && this.contingenciesDetected == contactSectionUiState.contingenciesDetected && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingContingencies, contactSectionUiState.pendingContingencies) && this.showContingencySheet == contactSectionUiState.showContingencySheet && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyResolutionError, contactSectionUiState.contingencyResolutionError) && this.scamContingencyAlertType == contactSectionUiState.scamContingencyAlertType && this.isContactSyncEnabled == contactSectionUiState.isContactSyncEnabled && this.isPpLinkEnabled == contactSectionUiState.isPpLinkEnabled && this.isQrcFlowEnabled == contactSectionUiState.isQrcFlowEnabled && this.isPublicProfileEnabled == contactSectionUiState.isPublicProfileEnabled;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState copy(java.lang.String name2, boolean isContactsAccessPermissionGranted, java.lang.String selectedItemNote, java.lang.String paymentId, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt, boolean isLoading, java.lang.Integer errorResId, java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> recommendedContacts, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem selectedContact, boolean isPaymentLinkSelection, boolean isPaymentLinkSelected, boolean contingenciesDetected, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> pendingContingencies, boolean showContingencySheet, java.lang.String contingencyResolutionError, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamContingencyAlertType, boolean isContactSyncEnabled, boolean isPpLinkEnabled, boolean isQrcFlowEnabled, boolean isPublicProfileEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedItemNote, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedContacts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingContingencies, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState(name2, isContactsAccessPermissionGranted, selectedItemNote, paymentId, updateReceiverAttempt, isLoading, errorResId, recommendedContacts, selectedContact, isPaymentLinkSelection, isPaymentLinkSelected, contingenciesDetected, pendingContingencies, showContingencySheet, contingencyResolutionError, scamContingencyAlertType, isContactSyncEnabled, isPpLinkEnabled, isQrcFlowEnabled, isPublicProfileEnabled);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getSelectedContact() {
        return this.selectedContact;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> component8() {
        return this.recommendedContacts;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
        return this.updateReceiverAttempt;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSelectedItemNote() {
        return this.selectedItemNote;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsPublicProfileEnabled() {
        return this.isPublicProfileEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsContactsAccessPermissionGranted() {
        return this.isContactsAccessPermissionGranted;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsQrcFlowEnabled() {
        return this.isQrcFlowEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsPpLinkEnabled() {
        return this.isPpLinkEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsContactSyncEnabled() {
        return this.isContactSyncEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamContingencyAlertType() {
        return this.scamContingencyAlertType;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getContingencyResolutionError() {
        return this.contingencyResolutionError;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowContingencySheet() {
        return this.showContingencySheet;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> component13() {
        return this.pendingContingencies;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getContingenciesDetected() {
        return this.contingenciesDetected;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPaymentLinkSelected() {
        return this.isPaymentLinkSelected;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPaymentLinkSelection() {
        return this.isPaymentLinkSelection;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public ContactSectionUiState() {
        this(null, false, null, null, null, false, null, null, null, false, false, false, null, false, null, null, false, false, false, false, 1048575, null);
    }
}
