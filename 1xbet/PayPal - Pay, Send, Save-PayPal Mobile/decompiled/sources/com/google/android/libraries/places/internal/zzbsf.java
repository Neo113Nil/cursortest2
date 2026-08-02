package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbsf extends com.google.android.libraries.places.internal.zzbmz {
    private static final boolean zza = com.google.android.libraries.places.internal.zzbkx.zza(com.google.android.libraries.places.internal.zzbsf.class.getClassLoader());

    @Override // com.google.android.libraries.places.internal.zzbmt
    public final com.google.android.libraries.places.internal.zzbmy zza(java.net.URI uri, com.google.android.libraries.places.internal.zzbmr zzbmrVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(uri.getPath(), "targetPath");
        com.google.common.base.Preconditions.checkArgument(str.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new com.google.android.libraries.places.internal.zzbse(uri.getAuthority(), str.substring(1), zzbmrVar, com.google.android.libraries.places.internal.zzbsz.zzm, com.google.common.base.Stopwatch.createUnstarted(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbmz
    protected final boolean zzc() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbmz
    public final int zzd() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbmz
    public final java.util.Collection zze() {
        return java.util.Collections.singleton(java.net.InetSocketAddress.class);
    }

    @Override // com.google.android.libraries.places.internal.zzbmt
    public final java.lang.String zzb() {
        return "dns";
    }
}
