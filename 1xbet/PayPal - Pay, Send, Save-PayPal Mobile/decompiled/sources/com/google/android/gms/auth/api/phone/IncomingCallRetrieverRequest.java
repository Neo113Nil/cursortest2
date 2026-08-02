package com.google.android.gms.auth.api.phone;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "countryCode", "", "prefix", "startRange", "endRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPrefix", "getStartRange", "getEndRange", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.auth-api-phone_auth-api-phone"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "IncomingCallRetrieverRequestCreator")
/* loaded from: classes8.dex */
public final class IncomingCallRetrieverRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCountryCode", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPrefix", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStartRange", id = 3)
    private final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEndRange", id = 4)
    private final java.lang.String zzd;
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest> CREATOR = new com.google.android.gms.auth.api.phone.zza();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public IncomingCallRetrieverRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(dest);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 1, getZza(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 2, getZzb(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 3, getZzc(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(dest, 4, getZzd(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(dest, beginObjectHeader);
    }

    /* renamed from: getStartRange, reason: from getter */
    public final java.lang.String getZzc() {
        return this.zzc;
    }

    /* renamed from: getPrefix, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    /* renamed from: getEndRange, reason: from getter */
    public final java.lang.String getZzd() {
        return this.zzd;
    }

    /* renamed from: getCountryCode, reason: from getter */
    public final java.lang.String getZza() {
        return this.zza;
    }
}
