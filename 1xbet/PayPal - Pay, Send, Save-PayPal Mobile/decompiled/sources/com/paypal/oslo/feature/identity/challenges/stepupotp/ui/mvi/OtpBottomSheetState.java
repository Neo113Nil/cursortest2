package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "", "<init>", "()V", "MoreOptions", "ContactSelection", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$ContactSelection;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$MoreOptions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpBottomSheetState {
    public static final int $stable = 0;

    private OtpBottomSheetState() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$MoreOptions;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$MoreOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptions extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreOptions(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoreOptions(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions) other).options);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.MoreOptions moreOptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = moreOptions.options;
            }
            return moreOptions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$ContactSelection;", "Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "contacts", "", "currentContactId", "", "isEmailSelection", "shouldFilterCurrentContact", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/OtpBottomSheetState$ContactSelection;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getContacts", "Ljava/lang/String;", "getCurrentContactId", "Z", "getShouldFilterCurrentContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSelection extends com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> contacts;
        private final java.lang.String currentContactId;
        private final boolean isEmailSelection;
        private final boolean shouldFilterCurrentContact;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSelection(java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> list, java.lang.String str, boolean z, boolean z2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
            this.currentContactId = str;
            this.isEmailSelection = z;
            this.shouldFilterCurrentContact = z2;
        }

        public /* synthetic */ ContactSelection(java.util.List list, java.lang.String str, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> getContacts() {
            return this.contacts;
        }

        public final java.lang.String getCurrentContactId() {
            return this.currentContactId;
        }

        public final boolean isEmailSelection() {
            return this.isEmailSelection;
        }

        public final boolean getShouldFilterCurrentContact() {
            return this.shouldFilterCurrentContact;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> list = this.contacts;
            java.lang.String str = this.currentContactId;
            boolean z = this.isEmailSelection;
            boolean z2 = this.shouldFilterCurrentContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSelection(contacts=");
            sb.append(list);
            sb.append(", currentContactId=");
            sb.append(str);
            sb.append(", isEmailSelection=");
            sb.append(z);
            sb.append(", shouldFilterCurrentContact=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.contacts.hashCode();
            java.lang.String str = this.currentContactId;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isEmailSelection)) * 31) + java.lang.Boolean.hashCode(this.shouldFilterCurrentContact);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection contactSelection = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, contactSelection.contacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentContactId, contactSelection.currentContactId) && this.isEmailSelection == contactSelection.isEmailSelection && this.shouldFilterCurrentContact == contactSelection.shouldFilterCurrentContact;
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> contacts, java.lang.String currentContactId, boolean isEmailSelection, boolean shouldFilterCurrentContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection(contacts, currentContactId, isEmailSelection, shouldFilterCurrentContact);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldFilterCurrentContact() {
            return this.shouldFilterCurrentContact;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEmailSelection() {
            return this.isEmailSelection;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrentContactId() {
            return this.currentContactId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.OtpBottomSheetState.ContactSelection contactSelection, java.util.List list, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = contactSelection.contacts;
            }
            if ((i & 2) != 0) {
                str = contactSelection.currentContactId;
            }
            if ((i & 4) != 0) {
                z = contactSelection.isEmailSelection;
            }
            if ((i & 8) != 0) {
                z2 = contactSelection.shouldFilterCurrentContact;
            }
            return contactSelection.copy(list, str, z, z2);
        }
    }

    public /* synthetic */ OtpBottomSheetState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
