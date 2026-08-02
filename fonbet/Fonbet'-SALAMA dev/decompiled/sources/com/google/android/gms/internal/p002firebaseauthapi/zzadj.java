package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import a.AbstractC0603a;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;
import i3.C1263a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import v0.AbstractC1663a;
import w1.L;

/* loaded from: classes.dex */
public final class zzadj extends AsyncTask<Void, Void, zzadi> {
    private static final C1263a zza = new C1263a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzadl> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final i zzg;

    public zzadj(String str, String str2, Intent intent, i iVar, zzadl zzadlVar) {
        D.e(str);
        this.zzb = str;
        D.i(iVar);
        this.zzg = iVar;
        D.e(str2);
        D.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        D.e(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzadlVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        D.i(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadlVar);
        this.zze = zzadlVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadi doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzadl zzadlVar = this.zzd.get();
            HttpURLConnection zza2 = zzadlVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzadu(zzadlVar.zza(), this.zzg, zzads.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c("Error getting project config. Failed with " + zza3 + " " + responseCode, new Object[0]);
                return zzadi.zzb(zza3);
            }
            zzagk zzagkVar = new zzagk();
            zzagkVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagkVar.zza().contains(this.zzf) ? zzadi.zzb("UNAUTHORIZED_DOMAIN") : zzadi.zza(this.zzf);
            }
            for (String str : zzagkVar.zza()) {
                if (zza(str)) {
                    return zzadi.zza(str);
                }
            }
            return null;
        } catch (zzabg e7) {
            zza.c(L.i("ConversionException encountered: ", e7.getMessage()), new Object[0]);
            return null;
        } catch (IOException e8) {
            zza.c(L.i("IOException occurred: ", e8.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e9) {
            zza.c(L.i("Null pointer encountered: ", e9.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzadi zzadiVar) {
        onPostExecute((zzadi) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzadr.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e7) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e7)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadi zzadiVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzadl zzadlVar = this.zzd.get();
        if (zzadiVar != null) {
            str = zzadiVar.zza();
            str2 = zzadiVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzadlVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzadlVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f11869v);
        } else {
            zzadlVar.zza(this.zzb, AbstractC0603a.y0(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e7) {
            zza.c(AbstractC1663a.f("Error parsing URL for auth domain check: ", str, ". ", e7.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
