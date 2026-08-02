package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "createCredentialResponse", "<init>", "(Landroid/app/PendingIntent;Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "getCreateCredentialResponse", "()Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CreateCredentialHandleCreator")
/* loaded from: classes8.dex */
public final class CreateCredentialHandle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCreateCredentialResponse", id = 2)
    private final com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent pendingIntent;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CreateCredentialHandle> CREATOR = new com.google.android.gms.identitycredentials.CreateCredentialHandleCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public CreateCredentialHandle(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent pendingIntent, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse) {
        this.pendingIntent = pendingIntent;
        this.createCredentialResponse = createCredentialResponse;
        if (pendingIntent == null && createCredentialResponse == null) {
            throw new java.lang.IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.CreateCredentialHandleCreator.writeToParcel(this, dest, flags);
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final com.google.android.gms.identitycredentials.CreateCredentialResponse getCreateCredentialResponse() {
        return this.createCredentialResponse;
    }
}
