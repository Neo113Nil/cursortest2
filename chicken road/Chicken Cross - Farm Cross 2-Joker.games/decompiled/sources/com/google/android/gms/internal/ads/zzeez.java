package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeez {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    zzeez(Context context, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = executor;
    }

    private final String zzc() {
        String str;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str2 = null;
        if (versionInfoParcel.isClientJar) {
            str = zzclx.class.getName();
        } else {
            try {
                str = (String) new JSONObject(zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqd))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "SdkIE");
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqe));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return ExifInterface.GPS_MEASUREMENT_3D;
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return Fc.e;
        } catch (PatternSyntaxException unused4) {
            return CampaignEx.CLICKMODE_ON;
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        String str2 = new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqf), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqb)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqd)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqe)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqf)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeey
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzeez.this.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            if (((String) atomicReference.get()).isEmpty()) {
                atomicReference.set(zzc());
            }
        }
    }
}
