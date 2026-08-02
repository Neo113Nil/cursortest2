package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001f\b\u0007\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "deleteAll", "Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "clearTypedRegistryOption", "<init>", "(ZLcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;)V", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getDeleteAll", "()Z", "Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "getClearTypedRegistryOption", "()Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "Companion", "ClearTypedRegistryOption"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearRegistryRequestCreator")
/* loaded from: classes8.dex */
public final class ClearRegistryRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClearTypedRegistryOption", id = 2)
    private final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "true", getter = "getDeleteAll", id = 1)
    private final boolean deleteAll;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearRegistryRequest> CREATOR = new com.google.android.gms.identitycredentials.ClearRegistryRequestCreator();

    public ClearRegistryRequest() {
        this(true, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ClearRegistryRequestCreator.writeToParcel(this, dest, flags);
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClearRegistryRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption) {
        this.deleteAll = z;
        this.clearTypedRegistryOption = clearTypedRegistryOption;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "deleteAllForType", "", "type", "deleteIdlessRegistry", "", "registryIds", "<init>", "(ZLjava/lang/String;ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getDeleteAllForType", "()Z", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getDeleteIdlessRegistry", "Ljava/util/List;", "getRegistryIds", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearTypedRegistryOptionCreator")
    public static final class ClearTypedRegistryOption extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeleteAllForType", id = 1)
        private final boolean deleteAllForType;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeleteIdlessRegistry", id = 3)
        private final boolean deleteIdlessRegistry;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegistryIds", id = 4)
        private final java.util.List<java.lang.String> registryIds;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 2)
        private final java.lang.String type;
        public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption> CREATOR = new com.google.android.gms.identitycredentials.ClearTypedRegistryOptionCreator();

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        public ClearTypedRegistryOption(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean z2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.deleteAllForType = z;
            this.type = str;
            this.deleteIdlessRegistry = z2;
            this.registryIds = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            com.google.android.gms.identitycredentials.ClearTypedRegistryOptionCreator.writeToParcel(this, dest, flags);
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.util.List<java.lang.String> getRegistryIds() {
            return this.registryIds;
        }

        public final boolean getDeleteIdlessRegistry() {
            return this.deleteIdlessRegistry;
        }

        public final boolean getDeleteAllForType() {
            return this.deleteAllForType;
        }
    }

    public final boolean getDeleteAll() {
        return this.deleteAll;
    }

    public final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption getClearTypedRegistryOption() {
        return this.clearTypedRegistryOption;
    }
}
