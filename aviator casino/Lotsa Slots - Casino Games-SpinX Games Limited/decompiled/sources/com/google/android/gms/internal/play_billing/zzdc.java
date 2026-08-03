package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public class zzdc extends java.io.IOException {
    private com.google.android.gms.internal.play_billing.zzec zza;

    public zzdc(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static com.google.android.gms.internal.play_billing.zzdb zza() {
        return new com.google.android.gms.internal.play_billing.zzdb("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.play_billing.zzdc zzb() {
        return new com.google.android.gms.internal.play_billing.zzdc("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.play_billing.zzdc zzc() {
        return new com.google.android.gms.internal.play_billing.zzdc("Protocol message had invalid UTF-8.");
    }

    static com.google.android.gms.internal.play_billing.zzdc zzd() {
        return new com.google.android.gms.internal.play_billing.zzdc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.play_billing.zzdc zze() {
        return new com.google.android.gms.internal.play_billing.zzdc("Failed to parse the message.");
    }

    static com.google.android.gms.internal.play_billing.zzdc zzg() {
        return new com.google.android.gms.internal.play_billing.zzdc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final com.google.android.gms.internal.play_billing.zzdc zzf(com.google.android.gms.internal.play_billing.zzec zzecVar) {
        this.zza = zzecVar;
        return this;
    }

    public zzdc(java.lang.String str) {
        super(str);
        this.zza = null;
    }
}
