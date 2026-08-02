package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzdb;

/* loaded from: classes.dex */
final class zzdw implements zzew {
    private static final zzeg zzsz = new zzdx();
    private final zzeg zzsy;

    public zzdw() {
        this(new zzdy(zzda.zzdy(), zzes()));
    }

    private zzdw(zzeg zzegVar) {
        this.zzsy = (zzeg) zzdd.zza(zzegVar, "messageInfoFactory");
    }

    private static boolean zza(zzef zzefVar) {
        return zzefVar.zzez() == zzdb.zze.zzrm;
    }

    private static zzeg zzes() {
        try {
            return (zzeg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzsz;
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzew
    public final <T> zzev<T> zze(Class<T> cls) {
        zzex.zzg(cls);
        zzef zzc = this.zzsy.zzc(cls);
        return zzc.zzfa() ? zzdb.class.isAssignableFrom(cls) ? zzem.zza(zzex.zzfl(), zzcr.zzdn(), zzc.zzfb()) : zzem.zza(zzex.zzfj(), zzcr.zzdo(), zzc.zzfb()) : zzdb.class.isAssignableFrom(cls) ? zza(zzc) ? zzel.zza(cls, zzc, zzeq.zzfe(), zzdr.zzer(), zzex.zzfl(), zzcr.zzdn(), zzee.zzex()) : zzel.zza(cls, zzc, zzeq.zzfe(), zzdr.zzer(), zzex.zzfl(), null, zzee.zzex()) : zza(zzc) ? zzel.zza(cls, zzc, zzeq.zzfd(), zzdr.zzeq(), zzex.zzfj(), zzcr.zzdo(), zzee.zzew()) : zzel.zza(cls, zzc, zzeq.zzfd(), zzdr.zzeq(), zzex.zzfk(), null, zzee.zzew());
    }
}
