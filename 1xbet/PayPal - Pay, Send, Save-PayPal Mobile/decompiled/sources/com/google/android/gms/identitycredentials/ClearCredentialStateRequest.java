package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/google/android/gms/identitycredentials/ClearCredentialStateRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClearCredentialStateRequestCreator")
/* loaded from: classes8.dex */
public final class ClearCredentialStateRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ClearCredentialStateRequest> CREATOR = new com.google.android.gms.identitycredentials.ClearCredentialStateRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClearCredentialStateRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ClearCredentialStateRequestCreator.writeToParcel(this, dest, flags);
    }
}
