package com.google.android.gms.internal.p002firebaseauthapi;

import M4.f;
import Y3.i;
import Y3.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p014b4.d;
import p026d4.b;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
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
        b bVar = (b) FirebaseAuth.getInstance(iVar).f11869v.get();
        if (bVar == null) {
            return null;
        }
        try {
            p014b4.b bVar2 = (p014b4.b) Tasks.await(((d) bVar).b(false));
            j jVar = bVar2.f10130b;
            if (jVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
            }
            return bVar2.f10129a;
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
                return (String) Tasks.await(((M4.d) fVar).a());
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
        String strE;
        if (this.zze) {
            strE = k.e(this.zzc, "/FirebaseUI-Android");
        } else {
            strE = k.e(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzaen(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzadx.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strE);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        i iVar = this.zzd;
        iVar.b();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", iVar.f7665c.f7673b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
