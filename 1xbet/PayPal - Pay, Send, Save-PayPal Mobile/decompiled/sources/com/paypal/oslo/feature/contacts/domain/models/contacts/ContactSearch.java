package com.paypal.oslo.feature.contacts.domain.models.contacts;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "ContactItem", "HeaderItem", "CustomActionItem", "UnilateralItem", "ContactShimmer", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactShimmer;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$CustomActionItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$HeaderItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$UnilateralItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchItem {
    public static final int $stable = 0;
    private final java.lang.String id;

    private ContactSearch(java.lang.String str) {
        this.id = str;
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactSearchItem
    public java.lang.String getId() {
        return this.id;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BÕ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u0010(J\u0010\u00102\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010\u001fJä\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b=\u00103J\u0010\u0010>\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b>\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bB\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bE\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bG\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\b\r\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bI\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bJ\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bM\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bN\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\b\u0014\u0010(R\u001a\u0010\u0015\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\b\u0015\u0010(R\u001a\u0010\u0016\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\b\u0016\u0010(R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bP\u00103R\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\bR\u00105R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\bS\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "", "id", "firstName", "lastName", "Lcom/paypal/oslo/feature/contacts/api/ContactType;", "type", "phoneNumber", "email", "avatarUrl", "", "isExternalWallet", "externalWalletName", "externalWalletLogoUrl", "Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "handle", "location", "isBlocked", "isFavorite", "isMobile", "", "totalCompletedPayments", "Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "contactNameType", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactActionType;Ljava/lang/String;Ljava/lang/String;ZZZILcom/paypal/oslo/feature/contacts/api/ContactNameType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/contacts/api/ContactType;", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", "component12", "component13", "component14", "component15", "component16", "component17", "()I", "component18", "()Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactActionType;Ljava/lang/String;Ljava/lang/String;ZZZILcom/paypal/oslo/feature/contacts/api/ContactNameType;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactItem;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getId", "getFirstName", "getLastName", "Lcom/paypal/oslo/feature/contacts/api/ContactType;", "getType", "getPhoneNumber", "getEmail", "getAvatarUrl", "Z", "getExternalWalletName", "getExternalWalletLogoUrl", "Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", "getActionType", "getHandle", "getLocation", com.visa.cbp.getEncExpo.warmup, "getTotalCompletedPayments", "Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "getContactNameType", "getAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactItem extends com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchContactItem {
        public static final int $stable = 0;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.contacts.api.ContactActionType actionType;
        private final java.lang.String avatarUrl;
        private final com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType;
        private final java.lang.String email;
        private final java.lang.String externalWalletLogoUrl;
        private final java.lang.String externalWalletName;
        private final java.lang.String firstName;
        private final java.lang.String handle;
        private final java.lang.String id;
        private final boolean isBlocked;
        private final boolean isExternalWallet;
        private final boolean isFavorite;
        private final boolean isMobile;
        private final java.lang.String lastName;
        private final java.lang.String location;
        private final java.lang.String phoneNumber;
        private final int totalCompletedPayments;
        private final com.paypal.oslo.feature.contacts.api.ContactType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactItem(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.contacts.api.ContactType contactType, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.contacts.api.ContactActionType contactActionType, java.lang.String str9, java.lang.String str10, boolean z2, boolean z3, boolean z4, int i, com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType, java.lang.String str11) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNameType, "");
            this.id = str;
            this.firstName = str2;
            this.lastName = str3;
            this.type = contactType;
            this.phoneNumber = str4;
            this.email = str5;
            this.avatarUrl = str6;
            this.isExternalWallet = z;
            this.externalWalletName = str7;
            this.externalWalletLogoUrl = str8;
            this.actionType = contactActionType;
            this.handle = str9;
            this.location = str10;
            this.isBlocked = z2;
            this.isFavorite = z3;
            this.isMobile = z4;
            this.totalCompletedPayments = i;
            this.contactNameType = contactNameType;
            this.accountId = str11;
        }

        @Override // com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch, com.paypal.oslo.feature.contacts.api.ContactSearchItem
        public final java.lang.String getId() {
            return this.id;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getLastName() {
            return this.lastName;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final com.paypal.oslo.feature.contacts.api.ContactType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getEmail() {
            return this.email;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final boolean isExternalWallet() {
            return this.isExternalWallet;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getExternalWalletName() {
            return this.externalWalletName;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getExternalWalletLogoUrl() {
            return this.externalWalletLogoUrl;
        }

        public /* synthetic */ ContactItem(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.contacts.api.ContactType contactType, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.contacts.api.ContactActionType contactActionType, java.lang.String str9, java.lang.String str10, boolean z2, boolean z3, boolean z4, int i, com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType, java.lang.String str11, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i2 & 8) != 0 ? null : contactType, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? com.paypal.oslo.feature.contacts.api.ContactActionType.Info : contactActionType, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? false : z3, (32768 & i2) != 0 ? false : z4, (65536 & i2) != 0 ? 0 : i, (131072 & i2) != 0 ? com.paypal.oslo.feature.contacts.api.ContactNameType.PERSON : contactNameType, (i2 & 262144) != 0 ? null : str11);
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final com.paypal.oslo.feature.contacts.api.ContactActionType getActionType() {
            return this.actionType;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getHandle() {
            return this.handle;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final boolean isBlocked() {
            return this.isBlocked;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final boolean isFavorite() {
            return this.isFavorite;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final boolean isMobile() {
            return this.isMobile;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final int getTotalCompletedPayments() {
            return this.totalCompletedPayments;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final com.paypal.oslo.feature.contacts.api.ContactNameType getContactNameType() {
            return this.contactNameType;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchContactItem
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.firstName;
            java.lang.String str3 = this.lastName;
            com.paypal.oslo.feature.contacts.api.ContactType contactType = this.type;
            java.lang.String str4 = this.phoneNumber;
            java.lang.String str5 = this.email;
            java.lang.String str6 = this.avatarUrl;
            boolean z = this.isExternalWallet;
            java.lang.String str7 = this.externalWalletName;
            java.lang.String str8 = this.externalWalletLogoUrl;
            com.paypal.oslo.feature.contacts.api.ContactActionType contactActionType = this.actionType;
            java.lang.String str9 = this.handle;
            java.lang.String str10 = this.location;
            boolean z2 = this.isBlocked;
            boolean z3 = this.isFavorite;
            boolean z4 = this.isMobile;
            int i = this.totalCompletedPayments;
            com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType = this.contactNameType;
            java.lang.String str11 = this.accountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactItem(id=");
            sb.append(str);
            sb.append(", firstName=");
            sb.append(str2);
            sb.append(", lastName=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(contactType);
            sb.append(", phoneNumber=");
            sb.append(str4);
            sb.append(", email=");
            sb.append(str5);
            sb.append(", avatarUrl=");
            sb.append(str6);
            sb.append(", isExternalWallet=");
            sb.append(z);
            sb.append(", externalWalletName=");
            sb.append(str7);
            sb.append(", externalWalletLogoUrl=");
            sb.append(str8);
            sb.append(", actionType=");
            sb.append(contactActionType);
            sb.append(", handle=");
            sb.append(str9);
            sb.append(", location=");
            sb.append(str10);
            sb.append(", isBlocked=");
            sb.append(z2);
            sb.append(", isFavorite=");
            sb.append(z3);
            sb.append(", isMobile=");
            sb.append(z4);
            sb.append(", totalCompletedPayments=");
            sb.append(i);
            sb.append(", contactNameType=");
            sb.append(contactNameType);
            sb.append(", accountId=");
            sb.append(str11);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.firstName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.lastName;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.contacts.api.ContactType contactType = this.type;
            int hashCode4 = contactType == null ? 0 : contactType.hashCode();
            java.lang.String str3 = this.phoneNumber;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.email;
            int hashCode6 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.avatarUrl;
            int hashCode7 = str5 == null ? 0 : str5.hashCode();
            int hashCode8 = java.lang.Boolean.hashCode(this.isExternalWallet);
            java.lang.String str6 = this.externalWalletName;
            int hashCode9 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.externalWalletLogoUrl;
            int hashCode10 = str7 == null ? 0 : str7.hashCode();
            int hashCode11 = this.actionType.hashCode();
            java.lang.String str8 = this.handle;
            int hashCode12 = str8 == null ? 0 : str8.hashCode();
            java.lang.String str9 = this.location;
            int hashCode13 = str9 == null ? 0 : str9.hashCode();
            int hashCode14 = java.lang.Boolean.hashCode(this.isBlocked);
            int hashCode15 = java.lang.Boolean.hashCode(this.isFavorite);
            int hashCode16 = java.lang.Boolean.hashCode(this.isMobile);
            int hashCode17 = java.lang.Integer.hashCode(this.totalCompletedPayments);
            int hashCode18 = this.contactNameType.hashCode();
            java.lang.String str10 = this.accountId;
            return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem contactItem = (com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, contactItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, contactItem.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, contactItem.lastName) && this.type == contactItem.type && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, contactItem.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, contactItem.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatarUrl, contactItem.avatarUrl) && this.isExternalWallet == contactItem.isExternalWallet && kotlin.jvm.internal.Intrinsics.areEqual(this.externalWalletName, contactItem.externalWalletName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalWalletLogoUrl, contactItem.externalWalletLogoUrl) && this.actionType == contactItem.actionType && kotlin.jvm.internal.Intrinsics.areEqual(this.handle, contactItem.handle) && kotlin.jvm.internal.Intrinsics.areEqual(this.location, contactItem.location) && this.isBlocked == contactItem.isBlocked && this.isFavorite == contactItem.isFavorite && this.isMobile == contactItem.isMobile && this.totalCompletedPayments == contactItem.totalCompletedPayments && this.contactNameType == contactItem.contactNameType && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, contactItem.accountId);
        }

        public final com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem copy(java.lang.String id, java.lang.String firstName, java.lang.String lastName, com.paypal.oslo.feature.contacts.api.ContactType type, java.lang.String phoneNumber, java.lang.String email, java.lang.String avatarUrl, boolean isExternalWallet, java.lang.String externalWalletName, java.lang.String externalWalletLogoUrl, com.paypal.oslo.feature.contacts.api.ContactActionType actionType, java.lang.String handle, java.lang.String location, boolean isBlocked, boolean isFavorite, boolean isMobile, int totalCompletedPayments, com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType, java.lang.String accountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNameType, "");
            return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactItem(id, firstName, lastName, type, phoneNumber, email, avatarUrl, isExternalWallet, externalWalletName, externalWalletLogoUrl, actionType, handle, location, isBlocked, isFavorite, isMobile, totalCompletedPayments, contactNameType, accountId);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getExternalWalletName() {
            return this.externalWalletName;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsExternalWallet() {
            return this.isExternalWallet;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastName() {
            return this.lastName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component19, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component18, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactNameType getContactNameType() {
            return this.contactNameType;
        }

        /* renamed from: component17, reason: from getter */
        public final int getTotalCompletedPayments() {
            return this.totalCompletedPayments;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getIsMobile() {
            return this.isMobile;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getLocation() {
            return this.location;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getHandle() {
            return this.handle;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.ContactActionType getActionType() {
            return this.actionType;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getExternalWalletLogoUrl() {
            return this.externalWalletLogoUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$HeaderItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchHeaderItem;", "", "title", "Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "action", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/HeaderAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/HeaderAction;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$HeaderItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HeaderItem extends com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem {
        public static final int $stable = com.paypal.oslo.feature.contacts.api.HeaderAction.$stable;
        private final com.paypal.oslo.feature.contacts.api.HeaderAction action;
        private final java.lang.String title;

        public /* synthetic */ HeaderItem(java.lang.String str, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : headerAction);
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem
        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem
        public final com.paypal.oslo.feature.contacts.api.HeaderAction getAction() {
            return this.action;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HeaderItem(java.lang.String str, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction) {
            super(r1, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.title = str;
            this.action = headerAction;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            com.paypal.oslo.feature.contacts.api.HeaderAction headerAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderItem(title=");
            sb.append(str);
            sb.append(", action=");
            sb.append(headerAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode();
            com.paypal.oslo.feature.contacts.api.HeaderAction headerAction = this.action;
            return (hashCode * 31) + (headerAction == null ? 0 : headerAction.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem = (com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, headerItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, headerItem.action);
        }

        public final com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem copy(java.lang.String title, com.paypal.oslo.feature.contacts.api.HeaderAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem(title, action);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.HeaderAction getAction() {
            return this.action;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem copy$default(com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.HeaderItem headerItem, java.lang.String str, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = headerItem.title;
            }
            if ((i & 2) != 0) {
                headerAction = headerItem.action;
            }
            return headerItem.copy(str, headerAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$CustomActionItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchCustomActionItem;", "Lcom/paypal/oslo/feature/contacts/api/CustomActionType;", "type", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/CustomActionType;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/CustomActionType;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/CustomActionType;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$CustomActionItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/CustomActionType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomActionItem extends com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.contacts.api.CustomActionType type;

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem
        public final com.paypal.oslo.feature.contacts.api.CustomActionType getType() {
            return this.type;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CustomActionItem(com.paypal.oslo.feature.contacts.api.CustomActionType customActionType) {
            super(r1, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customActionType, "");
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.type = customActionType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.CustomActionType customActionType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomActionItem(type=");
            sb.append(customActionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem) && this.type == ((com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem) other).type;
        }

        public final com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem copy(com.paypal.oslo.feature.contacts.api.CustomActionType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.CustomActionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem copy$default(com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.CustomActionItem customActionItem, com.paypal.oslo.feature.contacts.api.CustomActionType customActionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customActionType = customActionItem.type;
            }
            return customActionItem.copy(customActionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$UnilateralItem;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchUnilateralItem;", "Lcom/paypal/oslo/feature/contacts/api/UnilateralType;", "type", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/contacts/api/UnilateralType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/UnilateralType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/UnilateralType;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$UnilateralItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/contacts/api/UnilateralType;", "getType", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnilateralItem extends com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.contacts.api.UnilateralType type;
        private final java.lang.String value;

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem
        public final com.paypal.oslo.feature.contacts.api.UnilateralType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem
        public final java.lang.String getValue() {
            return this.value;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnilateralItem(com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType, java.lang.String str) {
            super(r1, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unilateralType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            this.type = unilateralType;
            this.value = str;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType = this.type;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnilateralItem(type=");
            sb.append(unilateralType);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem unilateralItem = (com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem) other;
            return this.type == unilateralItem.type && kotlin.jvm.internal.Intrinsics.areEqual(this.value, unilateralItem.value);
        }

        public final com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem copy(com.paypal.oslo.feature.contacts.api.UnilateralType type, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem(type, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.api.UnilateralType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem copy$default(com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.UnilateralItem unilateralItem, com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unilateralType = unilateralItem.type;
            }
            if ((i & 2) != 0) {
                str = unilateralItem.value;
            }
            return unilateralItem.copy(unilateralType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch$ContactShimmer;", "Lcom/paypal/oslo/feature/contacts/domain/models/contacts/ContactSearch;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchShimmerItem;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactShimmer extends com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch implements com.paypal.oslo.feature.contacts.api.ContactSearchShimmerItem {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactShimmer INSTANCE = new com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactShimmer();

        public final int hashCode() {
            return -846567810;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ContactShimmer() {
            super(r0, null);
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        }

        public final java.lang.String toString() {
            return "ContactShimmer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.domain.models.contacts.ContactSearch.ContactShimmer)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContactSearch(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
