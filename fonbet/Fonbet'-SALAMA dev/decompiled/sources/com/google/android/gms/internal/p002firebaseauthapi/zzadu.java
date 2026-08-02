package com.google.android.gms.internal.p002firebaseauthapi;

import M4.d;
import M4.f;
import Y3.i;
import Y3.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b4.C0782b;
import b4.C0784d;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import e1.k;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import w1.L;

/* loaded from: classes.dex */
public final class zzadu {
    private Context zza;
    private zzaen zzb;
    private String zzc;
    private final i zzd;
    private boolean zze;
    private String zzf;

    public zzadu(Context context, i iVar, String str) {
        this.zze = false;
        D.i(context);
        this.zza = context;
        D.i(iVar);
        this.zzd = iVar;
        this.zzc = L.i("Android/Fallback/", str);
    }

    private static String zza(i iVar) {
        InterfaceC0965b interfaceC0965b = (InterfaceC0965b) FirebaseAuth.getInstance(iVar).f11869v.get();
        if (interfaceC0965b == null) {
            return null;
        }
        try {
            C0782b c0782b = (C0782b) Tasks.await(((C0784d) interfaceC0965b).b(false));
            j jVar = c0782b.f10130b;
            if (jVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
            }
            return c0782b.f10129a;
        } catch (InterruptedException e7) {
            e = e7;
            L.n("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            L.n("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        }
    }

    private static String zzb(i iVar) {
        f fVar = (f) FirebaseAuth.getInstance(iVar).f11870w.get();
        if (fVar != null) {
            try {
                return (String) Tasks.await(((d) fVar).a());
            } catch (InterruptedException | ExecutionException e7) {
                L.l("Unable to get heartbeats: ", e7.getMessage(), "LocalRequestInterceptor");
            }
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzadu(i iVar, String str) {
        this(iVar.f7663a, iVar, str);
        iVar.b();
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String e7;
        if (this.zze) {
            e7 = k.e(this.zzc, "/FirebaseUI-Android");
        } else {
            e7 = k.e(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzaen(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzadx.zza());
        uRLConnection.setRequestProperty("X-Client-Version", e7);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        i iVar = this.zzd;
        iVar.b();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", iVar.f7665c.f7673b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
