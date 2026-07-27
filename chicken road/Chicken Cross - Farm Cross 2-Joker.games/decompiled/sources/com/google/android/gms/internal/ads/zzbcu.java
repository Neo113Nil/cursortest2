package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbcu extends zzbdt {
    private static final zzbdu zzh = new zzbdu();
    private final zzaxt zzi;
    private final Context zzj;
    private final zzbaa zzk;

    public zzbcu(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, Context context, zzaxm zzaxmVar, zzaxt zzaxtVar, zzbaa zzbaaVar) {
        super(zzbcgVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzayaVar, i, 27);
        this.zzj = context;
        this.zzi = zzaxtVar;
        this.zzk = zzbaaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzazx zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        zzbix zzbixVar = zzbjg.zzdJ;
        int zzb = (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue() <= 0 || ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue();
        zzazx zzazxVar = new zzazx((String) this.zze.invoke(null, this.zzj, false, ""));
        zzbaa zzbaaVar = this.zzk;
        if (zzbaaVar != null && zzbaaVar.zza() != null) {
            try {
                str = (String) zzbaaVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzazxVar.zza = str;
            return zzazxVar;
        }
        str = ExifInterface.LONGITUDE_EAST;
        zzazxVar.zza = str;
        return zzazxVar;
    }

    private final String zzd() {
        try {
            zzbcg zzbcgVar = this.zza;
            if (zzbcgVar.zzm() != null) {
                zzbcgVar.zzm().get();
            }
            zzaza zzl = zzbcgVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzazx zzazxVar;
        zzazx zzazxVar2;
        zzbdu zzbduVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzbduVar.zza(context.getPackageName());
        synchronized (zza) {
            zzazx zzazxVar3 = (zzazx) zza.get();
            if (zzazxVar3 == null || zzbcj.zzc(zzazxVar3.zza) || zzazxVar3.zza.equals(ExifInterface.LONGITUDE_EAST) || zzazxVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (zzbcj.zzc(null)) {
                    (!zzbcj.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzazxVar = zzc();
                } else {
                    if (i == 3 && !this.zzi.zza()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdv);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdu)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzbcj.zzc(zzb)) {
                        zzb = zzd();
                    }
                    zzazx zzazxVar4 = new zzazx((String) this.zze.invoke(null, context, valueOf, zzb));
                    String str = zzazxVar4.zza;
                    if (zzbcj.zzc(str) || str.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzbcj.zzc(zzd)) {
                                zzazxVar4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzazxVar = zzazxVar4;
                }
                zza.set(zzazxVar);
            }
            zzazxVar2 = (zzazx) zza.get();
        }
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            if (zzazxVar2 != null) {
                zzayaVar.zzo(zzazxVar2.zza);
                zzayaVar.zzu(zzazxVar2.zzb);
                zzayaVar.zzt(zzazxVar2.zzc);
                zzayaVar.zzD(zzazxVar2.zzd);
                zzayaVar.zzE(zzazxVar2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzb = zzbcj.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdw));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbcj.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdx)))));
            }
            Context context = this.zzj;
            return zzbdw.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
