package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearExportRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "deleteAll", "", "", "registryIds", "<init>", "(ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getDeleteAll", "()Z", "Ljava/util/List;", "getRegistryIds", "()Ljava/util/List;", "Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "clearRegistryOption", "Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "getClearRegistryOption", "()Lcom/google/android/gms/identitycredentials/ClearRegistryRequest$ClearTypedRegistryOption;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearExportRequestCreator")
/* loaded from: classes8.dex */
public final class ClearExportRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption clearRegistryOption;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeleteAll", id = 1)
    private final boolean deleteAll;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegistryIds", id = 2)
    private final java.util.List<java.lang.String> registryIds;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearExportRequest> CREATOR = new com.google.android.gms.identitycredentials.ClearExportRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClearExportRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.deleteAll = z;
        this.registryIds = list;
        this.clearRegistryOption = new com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption(z, "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", false, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ClearExportRequestCreator.writeToParcel(this, dest, flags);
    }

    public final java.util.List<java.lang.String> getRegistryIds() {
        return this.registryIds;
    }

    public final boolean getDeleteAll() {
        return this.deleteAll;
    }

    public final com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption getClearRegistryOption() {
        return this.clearRegistryOption;
    }
}
