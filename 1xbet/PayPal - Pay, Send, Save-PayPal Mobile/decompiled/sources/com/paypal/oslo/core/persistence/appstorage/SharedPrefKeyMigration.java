package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "", "", "legacyKey", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "newKey", "moduleName", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/lang/String;Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "component3", "component4", "()Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;Ljava/lang/String;Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;)Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLegacyKey", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "getNewKey", "getModuleName", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefDataType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SharedPrefKeyMigration {
    private final java.lang.String legacyKey;
    private final java.lang.String moduleName;
    private final com.paypal.oslo.core.persistence.appstorage.AppStorageKey newKey;
    private final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType type;

    public SharedPrefKeyMigration(java.lang.String str, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str2, com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorageKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPrefDataType, "");
        this.legacyKey = str;
        this.newKey = appStorageKey;
        this.moduleName = str2;
        this.type = sharedPrefDataType;
    }

    public final java.lang.String getLegacyKey() {
        return this.legacyKey;
    }

    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey getNewKey() {
        return this.newKey;
    }

    public final java.lang.String getModuleName() {
        return this.moduleName;
    }

    public final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.legacyKey;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey = this.newKey;
        java.lang.String str2 = this.moduleName;
        com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedPrefKeyMigration(legacyKey=");
        sb.append(str);
        sb.append(", newKey=");
        sb.append(appStorageKey);
        sb.append(", moduleName=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(sharedPrefDataType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.legacyKey.hashCode() * 31) + this.newKey.hashCode()) * 31) + this.moduleName.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration)) {
            return false;
        }
        com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration sharedPrefKeyMigration = (com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.legacyKey, sharedPrefKeyMigration.legacyKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.newKey, sharedPrefKeyMigration.newKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.moduleName, sharedPrefKeyMigration.moduleName) && this.type == sharedPrefKeyMigration.type;
    }

    public final com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration copy(java.lang.String legacyKey, com.paypal.oslo.core.persistence.appstorage.AppStorageKey newKey, java.lang.String moduleName, com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration(legacyKey, newKey, moduleName, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getModuleName() {
        return this.moduleName;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey getNewKey() {
        return this.newKey;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLegacyKey() {
        return this.legacyKey;
    }

    public static /* synthetic */ com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration copy$default(com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration sharedPrefKeyMigration, java.lang.String str, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, java.lang.String str2, com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType sharedPrefDataType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sharedPrefKeyMigration.legacyKey;
        }
        if ((i & 2) != 0) {
            appStorageKey = sharedPrefKeyMigration.newKey;
        }
        if ((i & 4) != 0) {
            str2 = sharedPrefKeyMigration.moduleName;
        }
        if ((i & 8) != 0) {
            sharedPrefDataType = sharedPrefKeyMigration.type;
        }
        return sharedPrefKeyMigration.copy(str, appStorageKey, str2, sharedPrefDataType);
    }
}
