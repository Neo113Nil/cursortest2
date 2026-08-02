package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "profileName", "email", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "rawAddress", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "rawPersonName", "profileVisibility", "statementAndTaxes", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "component2", "component3", "component4", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component5", "()Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "component6", "component7", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;)Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemData;", "getProfileName", "getEmail", "getPhoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getRawAddress", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput$Person;", "getRawPersonName", "getProfileVisibility", "getStatementAndTaxes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AccountSettingsData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData email;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData phoneNumber;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileName;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileVisibility;
    private final com.paypal.oslo.core.i18n.domain.model.Address rawAddress;
    private final com.paypal.oslo.core.i18n.domain.model.NameInput.Person rawPersonName;
    private final com.paypal.oslo.feature.settings.domain.model.SettingsItemData statementAndTaxes;

    public AccountSettingsData(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.NameInput.Person person, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemData5, "");
        this.profileName = settingsItemData;
        this.email = settingsItemData2;
        this.phoneNumber = settingsItemData3;
        this.rawAddress = address;
        this.rawPersonName = person;
        this.profileVisibility = settingsItemData4;
        this.statementAndTaxes = settingsItemData5;
    }

    public /* synthetic */ AccountSettingsData(com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.NameInput.Person person, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(settingsItemData, settingsItemData2, settingsItemData3, address, (i & 16) != 0 ? null : person, settingsItemData4, settingsItemData5);
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getProfileName() {
        return this.profileName;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getEmail() {
        return this.email;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPhoneNumber() {
        return this.phoneNumber;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getRawAddress() {
        return this.rawAddress;
    }

    public final com.paypal.oslo.core.i18n.domain.model.NameInput.Person getRawPersonName() {
        return this.rawPersonName;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getProfileVisibility() {
        return this.profileVisibility;
    }

    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getStatementAndTaxes() {
        return this.statementAndTaxes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData = this.profileName;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2 = this.email;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3 = this.phoneNumber;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.rawAddress;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person = this.rawPersonName;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4 = this.profileVisibility;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5 = this.statementAndTaxes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountSettingsData(profileName=");
        sb.append(settingsItemData);
        sb.append(", email=");
        sb.append(settingsItemData2);
        sb.append(", phoneNumber=");
        sb.append(settingsItemData3);
        sb.append(", rawAddress=");
        sb.append(address);
        sb.append(", rawPersonName=");
        sb.append(person);
        sb.append(", profileVisibility=");
        sb.append(settingsItemData4);
        sb.append(", statementAndTaxes=");
        sb.append(settingsItemData5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.profileName.hashCode();
        int hashCode2 = this.email.hashCode();
        int hashCode3 = this.phoneNumber.hashCode();
        com.paypal.oslo.core.i18n.domain.model.Address address = this.rawAddress;
        int hashCode4 = address == null ? 0 : address.hashCode();
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person = this.rawPersonName;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (person != null ? person.hashCode() : 0)) * 31) + this.profileVisibility.hashCode()) * 31) + this.statementAndTaxes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.domain.model.AccountSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.profileName, accountSettingsData.profileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, accountSettingsData.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, accountSettingsData.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawAddress, accountSettingsData.rawAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawPersonName, accountSettingsData.rawPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileVisibility, accountSettingsData.profileVisibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.statementAndTaxes, accountSettingsData.statementAndTaxes);
    }

    public final com.paypal.oslo.feature.settings.domain.model.AccountSettingsData copy(com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileName, com.paypal.oslo.feature.settings.domain.model.SettingsItemData email, com.paypal.oslo.feature.settings.domain.model.SettingsItemData phoneNumber, com.paypal.oslo.core.i18n.domain.model.Address rawAddress, com.paypal.oslo.core.i18n.domain.model.NameInput.Person rawPersonName, com.paypal.oslo.feature.settings.domain.model.SettingsItemData profileVisibility, com.paypal.oslo.feature.settings.domain.model.SettingsItemData statementAndTaxes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileVisibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementAndTaxes, "");
        return new com.paypal.oslo.feature.settings.domain.model.AccountSettingsData(profileName, email, phoneNumber, rawAddress, rawPersonName, profileVisibility, statementAndTaxes);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getStatementAndTaxes() {
        return this.statementAndTaxes;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getProfileVisibility() {
        return this.profileVisibility;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.NameInput.Person getRawPersonName() {
        return this.rawPersonName;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getRawAddress() {
        return this.rawAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.settings.domain.model.SettingsItemData getProfileName() {
        return this.profileName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.AccountSettingsData copy$default(com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData3, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.NameInput.Person person, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData4, com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            settingsItemData = accountSettingsData.profileName;
        }
        if ((i & 2) != 0) {
            settingsItemData2 = accountSettingsData.email;
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData6 = settingsItemData2;
        if ((i & 4) != 0) {
            settingsItemData3 = accountSettingsData.phoneNumber;
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData7 = settingsItemData3;
        if ((i & 8) != 0) {
            address = accountSettingsData.rawAddress;
        }
        com.paypal.oslo.core.i18n.domain.model.Address address2 = address;
        if ((i & 16) != 0) {
            person = accountSettingsData.rawPersonName;
        }
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person2 = person;
        if ((i & 32) != 0) {
            settingsItemData4 = accountSettingsData.profileVisibility;
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsItemData settingsItemData8 = settingsItemData4;
        if ((i & 64) != 0) {
            settingsItemData5 = accountSettingsData.statementAndTaxes;
        }
        return accountSettingsData.copy(settingsItemData, settingsItemData6, settingsItemData7, address2, person2, settingsItemData8, settingsItemData5);
    }
}
