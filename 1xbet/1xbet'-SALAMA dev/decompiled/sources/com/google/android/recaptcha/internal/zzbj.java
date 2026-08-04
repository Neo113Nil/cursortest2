package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import p044f6.d;
import p050g6.s;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbh zzc;
    private final zzbg zzd;
    private final String zze;
    private final Map zzf;

    static {
        d dVar = new d(zzrc.JS_NETWORK_ERROR, new zzbj(zzbh.zzc, zzbg.zzd, null));
        zzrc zzrcVar = zzrc.JS_INTERNAL_ERROR;
        zzbh zzbhVar = zzbh.zzb;
        zzb = s.M0(dVar, new d(zzrcVar, new zzbj(zzbhVar, zzbg.zzc, null)), new d(zzrc.JS_INVALID_SITE_KEY, new zzbj(zzbh.zzd, zzbg.zze, null)), new d(zzrc.JS_INVALID_SITE_KEY_TYPE, new zzbj(zzbh.zze, zzbg.zzf, null)), new d(zzrc.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbj(zzbh.zzf, zzbg.zzg, null)), new d(zzrc.JS_INVALID_ACTION, new zzbj(zzbh.zzg, zzbg.zzh, null)), new d(zzrc.JS_PROGRAM_ERROR, new zzbj(zzbhVar, zzbg.zzj, null)));
    }

    public zzbj(zzbh zzbhVar, zzbg zzbgVar, String str) {
        this.zzc = zzbhVar;
        this.zzd = zzbgVar;
        this.zze = str;
        zzbh zzbhVar2 = zzbh.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = s.M0(new d(zzbhVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new d(zzbh.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new d(zzbh.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new d(zzbh.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new d(zzbh.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new d(zzbh.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new d(zzbh.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new d(zzbh.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    public final zzbg zza() {
        return this.zzd;
    }

    public final zzbh zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (h.a(this.zzd, zzbg.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (h.a(this.zzd, zzbg.zzap)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
