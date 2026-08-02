package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class zzdr {
    public static final void zza(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
        } catch (SocketTimeoutException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzad, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbj(zzbh.zzc, zzbg.zzae, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbj(zzbh.zzc, zzbg.zzak, e9.getMessage());
        }
    }

    public static final zzbj zzb(int i7) {
        return i7 != 403 ? i7 != 404 ? i7 != 503 ? new zzbj(zzbh.zzb, zzbg.zzK, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null) : new zzbj(zzbh.zzc, zzbg.zzi, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null);
    }

    public static final InputStream zzc(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e8.getMessage());
        }
    }

    public static final OutputStream zzd(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getOutputStream();
        } catch (IOException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e7.getMessage());
        } catch (Exception e8) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e8.getMessage());
        }
    }
}
