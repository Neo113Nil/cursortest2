package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes3.dex */
public final class zzu extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.UserMetadata> {
    public zzu(java.lang.String str, int i) {
        super(str, java.util.Arrays.asList(zza(str, "permissionId"), zza(str, "displayName"), zza(str, "picture"), zza(str, "isAuthenticatedUser"), zza(str, androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS)), java.util.Collections.emptyList(), com.google.android.gms.common.util.GmsVersion.VERSION_MANCHEGO);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final boolean zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return dataHolder.hasColumn(zzh("permissionId")) && !dataHolder.hasNull(zzh("permissionId"), i, i2);
    }

    private final java.lang.String zzh(java.lang.String str) {
        return zza(getName(), str);
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        java.lang.String string = dataHolder.getString(zzh("permissionId"), i, i2);
        if (string == null) {
            return null;
        }
        java.lang.String string2 = dataHolder.getString(zzh("displayName"), i, i2);
        java.lang.String string3 = dataHolder.getString(zzh("picture"), i, i2);
        boolean z = dataHolder.getBoolean(zzh("isAuthenticatedUser"), i, i2);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        java.lang.String string4 = dataHolder.getString(zzh(androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), i, i2);
        valueOf.getClass();
        return new com.google.android.gms.drive.UserMetadata(string, string2, string3, z, string4);
    }
}
