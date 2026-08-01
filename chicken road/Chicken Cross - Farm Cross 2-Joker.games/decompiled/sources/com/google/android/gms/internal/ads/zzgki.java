package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgki implements zzgkh {
    private final Context zza;
    private final zzgrh zzb;
    private final zzgid zzc;
    private final String zzd;
    private final boolean zze;

    zzgki(Context context, zzgrh zzgrhVar, zzgid zzgidVar, zzgei zzgeiVar) {
        this.zza = context;
        this.zzb = zzgrhVar;
        this.zzc = zzgidVar;
        this.zzd = zzgeiVar.zzd();
        this.zze = zzgeiVar.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final String zza(boolean z, long j) {
        String str = ExifInterface.LONGITUDE_EAST;
        try {
            this.zzb.zza(55).zza();
            zzazl zza = zzazm.zza();
            zza.zzb(this.zzd);
            zza.zza("0.904631200");
            Context context = this.zza;
            zza.zzd(context.getPackageName());
            zza.zzc(System.currentTimeMillis() / 1000);
            zza.zzf((System.currentTimeMillis() - j) / 1000);
            if (this.zze) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            String hexString = Integer.toHexString(b & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        str = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                zza.zzg(str);
            }
            try {
                Context context2 = this.zza;
                zza.zze(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
                zza.zze(-1L);
            }
            zzgid zzgidVar = this.zzc;
            if (!zzgidVar.zzc()) {
                zzgidVar.zza();
            }
            zzazs zzf = zzgidVar.zzf(((zzazm) zza.zzbu()).zzaN(), null);
            zzf.zzc(5);
            zzf.zzd(2);
            return zzgfd.zza(((zzazt) zzf.zzbu()).zzaN(), true);
        } finally {
        }
    }
}
