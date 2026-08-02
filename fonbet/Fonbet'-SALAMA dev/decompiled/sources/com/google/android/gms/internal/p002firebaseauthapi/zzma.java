package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes.dex */
public final class zzma {
    private static final Object zza = new Object();
    private static final String zzb = "zzma";
    private zzcc zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbg zze = null;
        private boolean zzf = true;
        private zzbu zzg = null;
        private zzvu zzh = null;
        private zzcc zzi;

        private static zzcc zza(byte[] bArr) {
            return zzcc.zza(zzbh.zza(zzbf.zza(bArr)));
        }

        private final zzbg zzb() {
            zzma.zzd();
            zzmf zzmfVar = new zzmf();
            try {
                boolean zzc = zzmf.zzc(this.zzd);
                try {
                    return zzmfVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e7) {
                    if (!zzc) {
                        throw new KeyStoreException(AbstractC0486a1.h("the master key ", this.zzd, " exists but is unusable"), e7);
                    }
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e7);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e8);
                return null;
            }
        }

        public final zza zza(zzvu zzvuVar) {
            this.zzh = zzvuVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public final zza zza(Context context, String str, String str2) {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzma zza() {
            zzma zzmaVar;
            try {
                if (this.zzb != null) {
                    zzvu zzvuVar = this.zzh;
                    if (zzvuVar != null && this.zzg == null) {
                        this.zzg = zzbu.zza(zzcp.zza(zzvuVar.zzk()));
                    }
                    synchronized (zzma.zza) {
                        try {
                            byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                            if (zzb == null) {
                                if (this.zzd != null) {
                                    this.zze = zzb();
                                }
                                zzbu zzbuVar = this.zzg;
                                if (zzbuVar != null) {
                                    zzbt zza = zzbt.zza(zzbuVar);
                                    zzma.zza(zza, new zzmh(this.zza, this.zzb, this.zzc), this.zze);
                                    this.zzi = zzcc.zza(zza);
                                } else {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                            } else if (this.zzd != null) {
                                zzma.zzd();
                                this.zzi = zzb(zzb);
                            } else {
                                this.zzi = zza(zzb);
                            }
                            zzmaVar = new zzma(this);
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmaVar;
        }

        private final zzcc zzb(byte[] bArr) {
            try {
                this.zze = new zzmf().zza(this.zzd);
                try {
                    return zzcc.zza(zzbt.zza(zzbf.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e7) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e7;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                try {
                    zzcc zza = zza(bArr);
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e8);
                    return zza;
                } catch (IOException unused2) {
                    throw e8;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return zzyt.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(AbstractC0486a1.h("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbt zza() {
        return this.zzc.zza();
    }

    private zzma(zza zzaVar) {
        new zzmh(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbt zzbtVar, zzce zzceVar, zzbg zzbgVar) {
        try {
            if (zzbgVar != null) {
                zzbtVar.zza(zzceVar, zzbgVar, new byte[0]);
            } else {
                zzcf.zza(zzbtVar, zzceVar, zzbq.zza());
            }
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
