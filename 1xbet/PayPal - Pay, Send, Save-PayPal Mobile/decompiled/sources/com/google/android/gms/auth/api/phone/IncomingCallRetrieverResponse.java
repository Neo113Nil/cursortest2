package com.google.android.gms.auth.api.phone;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B+\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "phoneNumber", "", "incomingCallVerificationStatusCode", "errorDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getIncomingCallVerificationStatusCode", "getErrorDetails", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.auth-api-phone_auth-api-phone"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "IncomingCallRetrieverResponseCreator")
/* loaded from: classes8.dex */
public final class IncomingCallRetrieverResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPhoneNumber", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIncomingCallVerificationStatusCode", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorDetails", id = 3)
    private final java.lang.String zzc;
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.phone.IncomingCallRetrieverResponse> CREATOR = new com.google.android.gms.auth.api.phone.zzb();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public IncomingCallRetrieverResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        if (str != null && !kotlin.jvm.internal.Intrinsics.areEqual(str2, com.google.android.gms.auth.api.phone.IncomingCallRetrieverStatusCodes.INSTANCE.getVerificationStatusCodeString(0))) {
            throw new java.lang.IllegalArgumentException("incomingCallVerificationStatusCode should be SUCCESS when phone number is set.");
        }
        if (str == null && kotlin.jvm.internal.Intrinsics.areEqual(str2, com.google.android.gms.auth.api.phone.IncomingCallRetrieverStatusCodes.INSTANCE.getVerificationStatusCodeString(0))) {
            throw new java.lang.IllegalArgumentException("Phone number must not be null when verificationStatus is SUCCESS.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(dest);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 1, getZza(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 2, getZzb(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 3, getZzc(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(dest, beginObjectHeader);
    }

    /* renamed from: getPhoneNumber, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }

    /* renamed from: getIncomingCallVerificationStatusCode, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    /* renamed from: getErrorDetails, reason: from getter */
    public final java.lang.String getZzc() {
        return this.zzc;
    }
}
