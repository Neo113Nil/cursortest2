package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "<init>", "(Landroid/app/PendingIntent;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PendingGetCredentialHandleCreator")
/* loaded from: classes8.dex */
public final class PendingGetCredentialHandle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent pendingIntent;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.PendingGetCredentialHandle> CREATOR = new com.google.android.gms.identitycredentials.PendingGetCredentialHandleCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PendingGetCredentialHandle(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.pendingIntent = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.PendingGetCredentialHandleCreator.writeToParcel(this, dest, flags);
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }
}
