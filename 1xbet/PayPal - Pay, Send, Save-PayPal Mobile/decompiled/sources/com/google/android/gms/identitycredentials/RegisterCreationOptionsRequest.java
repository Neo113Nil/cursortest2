package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "createOptions", "matcher", "", "type", "id", "fulfillmentActionName", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "[B", "getCreateOptions", "()[B", "getMatcher", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getId", "getFulfillmentActionName", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisterCreationOptionsRequestCreator")
/* loaded from: classes8.dex */
public final class RegisterCreationOptionsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCreateOptions", id = 1)
    private final byte[] createOptions;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getFulfillmentActionName", id = 5)
    private final java.lang.String fulfillmentActionName;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 4)
    private final java.lang.String id;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMatcher", id = 2)
    private final byte[] matcher;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 3)
    private final java.lang.String type;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest> CREATOR = new com.google.android.gms.identitycredentials.RegisterCreationOptionsRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public RegisterCreationOptionsRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) byte[] bArr, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] bArr2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.createOptions = bArr;
        this.matcher = bArr2;
        this.type = str;
        this.id = str2;
        this.fulfillmentActionName = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.RegisterCreationOptionsRequestCreator.writeToParcel(this, dest, flags);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final byte[] getMatcher() {
        return this.matcher;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getFulfillmentActionName() {
        return this.fulfillmentActionName;
    }

    public final byte[] getCreateOptions() {
        return this.createOptions;
    }
}
