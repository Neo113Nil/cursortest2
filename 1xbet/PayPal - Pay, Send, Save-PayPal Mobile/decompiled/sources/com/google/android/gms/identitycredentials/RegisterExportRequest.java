package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegisterExportRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "matcher", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "<init>", "([B[BLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "[B", "getMatcher", "()[B", "getData", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisterExportRequestCreator")
/* loaded from: classes8.dex */
public final class RegisterExportRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String REQUEST_TYPE = "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getData", id = 2)
    private final byte[] data;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 3)
    private final java.lang.String id;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMatcher", id = 1)
    private final byte[] matcher;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.RegisterExportRequest> CREATOR = new com.google.android.gms.identitycredentials.RegisterExportRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public RegisterExportRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) byte[] bArr, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] bArr2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.matcher = bArr;
        this.data = bArr2;
        this.id = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.RegisterExportRequestCreator.writeToParcel(this, dest, flags);
    }

    public final byte[] getMatcher() {
        return this.matcher;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final byte[] getData() {
        return this.data;
    }
}
