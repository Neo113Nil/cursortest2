package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001f\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "deleteAll", "Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "clearTypedRegistryOption", "<init>", "(ZLcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;)V", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getDeleteAll", "()Z", "Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "getClearTypedRegistryOption", "()Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "Companion", "ClearTypedCreationOption"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearCreationOptionsRequestCreator")
/* loaded from: classes8.dex */
public final class ClearCreationOptionsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClearTypedRegistryOption", id = 2)
    private final com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedRegistryOption;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "true", getter = "getDeleteAll", id = 1)
    private final boolean deleteAll;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearCreationOptionsRequest> CREATOR = new com.google.android.gms.identitycredentials.ClearCreationOptionsRequestCreator();

    public ClearCreationOptionsRequest() {
        this(true, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ClearCreationOptionsRequestCreator.writeToParcel(this, dest, flags);
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClearCreationOptionsRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedCreationOption) {
        this.deleteAll = z;
        this.clearTypedRegistryOption = clearTypedCreationOption;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearCreationOptionsRequest$ClearTypedCreationOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "deleteAllForType", "", "type", "", "registryIds", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getDeleteAllForType", "()Z", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/List;", "getRegistryIds", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearTypedCreationOptionCreator")
    public static final class ClearTypedCreationOption extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeleteAllForType", id = 1)
        private final boolean deleteAllForType;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegistryIds", id = 3)
        private final java.util.List<java.lang.String> registryIds;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 2)
        private final java.lang.String type;
        public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption> CREATOR = new com.google.android.gms.identitycredentials.ClearTypedCreationOptionCreator();

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        public ClearTypedCreationOption(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.deleteAllForType = z;
            this.type = str;
            this.registryIds = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            com.google.android.gms.identitycredentials.ClearTypedCreationOptionCreator.writeToParcel(this, dest, flags);
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final java.util.List<java.lang.String> getRegistryIds() {
            return this.registryIds;
        }

        public final boolean getDeleteAllForType() {
            return this.deleteAllForType;
        }
    }

    public final boolean getDeleteAll() {
        return this.deleteAll;
    }

    public final com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption getClearTypedRegistryOption() {
        return this.clearTypedRegistryOption;
    }
}
