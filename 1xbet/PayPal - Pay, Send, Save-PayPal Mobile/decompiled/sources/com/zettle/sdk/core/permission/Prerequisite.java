package com.zettle.sdk.core.permission;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(I)V", "prio", com.visa.cbp.getEncExpo.warmup, "getPrio$core_publicRelease", "()I", "Authentication", "Permission", "SystemFeature", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Prerequisite implements android.os.Parcelable {
    private final int prio;

    private Prerequisite(int i) {
        this.prio = i;
    }

    /* renamed from: getPrio$core_publicRelease, reason: from getter */
    public final int getPrio() {
        return this.prio;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "Lcom/zettle/sdk/core/permission/Prerequisite;", "<init>", "()V", "Lcom/zettle/sdk/commons/network/Scope;", "getScope", "()Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Elevated", "Granted", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Elevated;", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Granted;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Authentication extends com.zettle.sdk.core.permission.Prerequisite {
        public abstract com.zettle.sdk.commons.network.Scope getScope();

        private Authentication() {
            super(1, null);
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Granted;", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "offlineMode", "<init>", "(Lcom/zettle/sdk/commons/network/Scope;Z)V", "component1", "()Lcom/zettle/sdk/commons/network/Scope;", "component2", "()Z", "copy", "(Lcom/zettle/sdk/commons/network/Scope;Z)Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Granted;", "", "describeContents", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getOfflineMode", "Lcom/zettle/sdk/commons/network/Scope;", "getScope"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Granted extends com.zettle.sdk.core.permission.Prerequisite.Authentication {
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted.Creator();
            private final boolean offlineMode;
            private final com.zettle.sdk.commons.network.Scope scope;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Granted(com.zettle.sdk.commons.network.Scope scope, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
                this.scope = scope;
                this.offlineMode = z;
            }

            public /* synthetic */ Granted(com.zettle.sdk.commons.network.Scope scope, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(scope, (i & 2) != 0 ? false : z);
            }

            public final boolean getOfflineMode() {
                return this.offlineMode;
            }

            @Override // com.zettle.sdk.core.permission.Prerequisite.Authentication
            public final com.zettle.sdk.commons.network.Scope getScope() {
                return this.scope;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.commons.network.Scope scope = getScope();
                boolean z = this.offlineMode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Authentication.Granted(scope=");
                sb.append(scope);
                sb.append(", offlineMode=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.scope.name());
                parcel.writeInt(this.offlineMode ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int hashCode() {
                int hashCode = getScope().hashCode();
                boolean z = this.offlineMode;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return (hashCode * 31) + i;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted)) {
                    return false;
                }
                com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted granted = (com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted) other;
                return getScope() == granted.getScope() && this.offlineMode == granted.offlineMode;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.valueOf(parcel.readString()), parcel.readInt() != 0);
                }
            }

            public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted copy(com.zettle.sdk.commons.network.Scope scope, boolean offlineMode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
                return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(scope, offlineMode);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getOfflineMode() {
                return this.offlineMode;
            }

            public final com.zettle.sdk.commons.network.Scope component1() {
                return getScope();
            }

            public static /* synthetic */ com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted copy$default(com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted granted, com.zettle.sdk.commons.network.Scope scope, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    scope = granted.getScope();
                }
                if ((i & 2) != 0) {
                    z = granted.offlineMode;
                }
                return granted.copy(scope, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Elevated;", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/zettle/sdk/commons/network/Scope;)V", "component1", "()Lcom/zettle/sdk/commons/network/Scope;", "copy", "(Lcom/zettle/sdk/commons/network/Scope;)Lcom/zettle/sdk/core/permission/Prerequisite$Authentication$Elevated;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/commons/network/Scope;", "getScope"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Elevated extends com.zettle.sdk.core.permission.Prerequisite.Authentication {
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated.Creator();
            private final com.zettle.sdk.commons.network.Scope scope;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Elevated(com.zettle.sdk.commons.network.Scope scope) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
                this.scope = scope;
            }

            @Override // com.zettle.sdk.core.permission.Prerequisite.Authentication
            public final com.zettle.sdk.commons.network.Scope getScope() {
                return this.scope;
            }

            public final java.lang.String toString() {
                com.zettle.sdk.commons.network.Scope scope = getScope();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Authentication.Elevated(scope=");
                sb.append(scope);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.scope.name());
            }

            public final int hashCode() {
                return getScope().hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated) && getScope() == ((com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated) other).getScope();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated(com.zettle.sdk.commons.network.Scope.valueOf(parcel.readString()));
                }
            }

            public final com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated copy(com.zettle.sdk.commons.network.Scope scope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
                return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated(scope);
            }

            public final com.zettle.sdk.commons.network.Scope component1() {
                return getScope();
            }

            public static /* synthetic */ com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated copy$default(com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated elevated, com.zettle.sdk.commons.network.Scope scope, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    scope = elevated.getScope();
                }
                return elevated.copy(scope);
            }
        }

        public /* synthetic */ Authentication(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", "Lcom/zettle/sdk/core/permission/Prerequisite;", "", "", "p0", "<init>", "([Ljava/lang/String;)V", "identifier", "[Ljava/lang/String;", "getIdentifier", "()[Ljava/lang/String;", "Bluetooth", "Location", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission$Bluetooth;", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission$Location;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Permission extends com.zettle.sdk.core.permission.Prerequisite {
        private final java.lang.String[] identifier;

        private Permission(java.lang.String[] strArr) {
            super(2, null);
            this.identifier = strArr;
        }

        public java.lang.String[] getIdentifier() {
            return this.identifier;
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Permission$Location;", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Location extends com.zettle.sdk.core.permission.Prerequisite.Permission {
            public static final com.zettle.sdk.core.permission.Prerequisite.Permission.Location INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.Permission.Location();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Permission.Location> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.Permission.Location.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Location() {
                super(new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, null);
            }

            public final java.lang.String toString() {
                java.lang.String joinToString$default = kotlin.collections.ArraysKt.joinToString$default(getIdentifier(), ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Permission.Location(");
                sb.append(joinToString$default);
                sb.append(")");
                return sb.toString();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Permission.Location> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Permission.Location[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.Permission.Location[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Permission.Location createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.Permission.Location.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$Permission$Bluetooth;", "Lcom/zettle/sdk/core/permission/Prerequisite$Permission;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "getIdentifier", "()[Ljava/lang/String;", "identifier"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Bluetooth extends com.zettle.sdk.core.permission.Prerequisite.Permission {
            public static final com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Bluetooth() {
                super(new java.lang.String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"}, null);
            }

            @Override // com.zettle.sdk.core.permission.Prerequisite.Permission
            public final java.lang.String[] getIdentifier() {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    return new java.lang.String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
                }
                return super.getIdentifier();
            }

            public final java.lang.String toString() {
                java.lang.String joinToString$default = kotlin.collections.ArraysKt.joinToString$default(getIdentifier(), ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Permission.Bluetooth(");
                sb.append(joinToString$default);
                sb.append(")");
                return sb.toString();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ Permission(java.lang.String[] strArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "Lcom/zettle/sdk/core/permission/Prerequisite;", "", "p0", "<init>", "(I)V", "Bluetooth", "Location", "NFC", "Network", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Bluetooth;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Location;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$NFC;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Network;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class SystemFeature extends com.zettle.sdk.core.permission.Prerequisite {
        private SystemFeature(int i) {
            super(i, null);
        }

        public /* synthetic */ SystemFeature(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 3 : i, null);
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Network;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Network extends com.zettle.sdk.core.permission.Prerequisite.SystemFeature {
            public static final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Network() {
                super(0, null);
            }

            public final java.lang.String toString() {
                return "SystemFeature.Network";
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Location;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Location extends com.zettle.sdk.core.permission.Prerequisite.SystemFeature {
            public static final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Location() {
                super(0, 1, null);
            }

            public final java.lang.String toString() {
                return "SystemFeature.Location";
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$Bluetooth;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Bluetooth extends com.zettle.sdk.core.permission.Prerequisite.SystemFeature {
            public static final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Bluetooth() {
                super(0, 1, null);
            }

            public final java.lang.String toString() {
                return "SystemFeature.Bluetooth";
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature$NFC;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NFC extends com.zettle.sdk.core.permission.Prerequisite.SystemFeature {
            public static final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC INSTANCE = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC> CREATOR = new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private NFC() {
                super(0, 1, null);
            }

            public final java.lang.String toString() {
                return "SystemFeature.NFC";
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC[] newArray(int i) {
                    return new com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC.INSTANCE;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ SystemFeature(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }
    }

    public /* synthetic */ Prerequisite(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
