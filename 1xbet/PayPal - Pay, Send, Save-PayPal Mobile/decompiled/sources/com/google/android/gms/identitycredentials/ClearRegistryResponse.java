package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u0003\u0010\u000e"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "isDeleted", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearRegistryResponseCreator")
/* loaded from: classes8.dex */
public final class ClearRegistryResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isDeleted", id = 1)
    private final boolean isDeleted;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearRegistryResponse> CREATOR = new com.google.android.gms.identitycredentials.ClearRegistryResponseCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClearRegistryResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean z) {
        this.isDeleted = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ClearRegistryResponseCreator.writeToParcel(this, dest, flags);
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }
}
