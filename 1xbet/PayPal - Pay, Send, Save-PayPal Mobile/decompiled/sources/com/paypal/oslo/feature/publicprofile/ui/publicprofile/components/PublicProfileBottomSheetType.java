package com.paypal.oslo.feature.publicprofile.ui.publicprofile.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "ProfileActions", "ReportConfirmation", "BlockConfirmation", "UnblockConfirmation", "RemoveConfirmation", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$BlockConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$None;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ProfileActions;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$RemoveConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ReportConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$UnblockConfirmation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PublicProfileBottomSheetType {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$None;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.None INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.None();

        public final int hashCode() {
            return -809935191;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ProfileActions;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", "isInContacts", "isBlocked", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ProfileActions;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileActions implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        private final boolean isBlocked;
        private final boolean isInContacts;

        public ProfileActions(boolean z, boolean z2) {
            this.isInContacts = z;
            this.isBlocked = z2;
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }

        public final boolean isInContacts() {
            return this.isInContacts;
        }

        public final java.lang.String toString() {
            boolean z = this.isInContacts;
            boolean z2 = this.isBlocked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileActions(isInContacts=");
            sb.append(z);
            sb.append(", isBlocked=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isInContacts) * 31) + java.lang.Boolean.hashCode(this.isBlocked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions profileActions = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions) other;
            return this.isInContacts == profileActions.isInContacts && this.isBlocked == profileActions.isBlocked;
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions copy(boolean isInContacts, boolean isBlocked) {
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions(isInContacts, isBlocked);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInContacts() {
            return this.isInContacts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions profileActions, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = profileActions.isInContacts;
            }
            if ((i & 2) != 0) {
                z2 = profileActions.isBlocked;
            }
            return profileActions.copy(z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ReportConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$ReportConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportConfirmation implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String name;

        public ReportConfirmation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportConfirmation(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation) other).name);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation reportConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportConfirmation.name;
            }
            return reportConfirmation.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$BlockConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$BlockConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockConfirmation implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String name;

        public BlockConfirmation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockConfirmation(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation) other).name);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation blockConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = blockConfirmation.name;
            }
            return blockConfirmation.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$UnblockConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$UnblockConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnblockConfirmation implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String name;

        public UnblockConfirmation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnblockConfirmation(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation) other).name);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation unblockConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unblockConfirmation.name;
            }
            return unblockConfirmation.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$RemoveConfirmation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType$RemoveConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveConfirmation implements com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String name;

        public RemoveConfirmation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveConfirmation(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation) other).name);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation removeConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = removeConfirmation.name;
            }
            return removeConfirmation.copy(str);
        }
    }
}
