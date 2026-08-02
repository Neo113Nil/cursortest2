package com.paypal.oslo.feature.identity.accountswitch.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption;", "", "", "id", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;", "optionType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;", "getOptionType", "OptionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddUserAccountOption {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType;

    public AddUserAccountOption(java.lang.String str, com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        this.id = str;
        this.optionType = optionType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType getOptionType() {
        return this.optionType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/AddUserAccountOption$OptionType;", "", "<init>", "(Ljava/lang/String;I)V", "LINK_EXISTING", "CREATE_BUSINESS", "CREATE_PERSONAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OptionType {
        public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType CREATE_BUSINESS;
        public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType CREATE_PERSONAL;
        public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType LINK_EXISTING;
        private static final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private OptionType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType = new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType("LINK_EXISTING", 0);
            LINK_EXISTING = optionType;
            com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType2 = new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType("CREATE_BUSINESS", 1);
            CREATE_BUSINESS = optionType2;
            com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType3 = new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType("CREATE_PERSONAL", 2);
            CREATE_PERSONAL = optionType3;
            com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType[] optionTypeArr = {optionType, optionType2, optionType3};
            getHighSpeedVideoFpsRangesFor = optionTypeArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(optionTypeArr);
        }

        public static com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType[] values() {
            return (com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType = this.optionType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddUserAccountOption(id=");
        sb.append(str);
        sb.append(", optionType=");
        sb.append(optionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.optionType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption)) {
            return false;
        }
        com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption addUserAccountOption = (com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, addUserAccountOption.id) && this.optionType == addUserAccountOption.optionType;
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption copy(java.lang.String id, com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption(id, optionType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType getOptionType() {
        return this.optionType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption copy$default(com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption addUserAccountOption, java.lang.String str, com.paypal.oslo.feature.identity.accountswitch.domain.model.AddUserAccountOption.OptionType optionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addUserAccountOption.id;
        }
        if ((i & 2) != 0) {
            optionType = addUserAccountOption.optionType;
        }
        return addUserAccountOption.copy(str, optionType);
    }
}
