package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public final class zzo {
    private static zzo zzcl;
    private Storage zzcm;
    private GoogleSignInAccount zzcn;
    private GoogleSignInOptions zzco;

    private zzo(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zzcm = storage;
        this.zzcn = storage.getSavedDefaultGoogleSignInAccount();
        this.zzco = this.zzcm.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zzo zzd(Context context) {
        zzo zze;
        synchronized (zzo.class) {
            zze = zze(context.getApplicationContext());
        }
        return zze;
    }

    private static synchronized zzo zze(Context context) {
        synchronized (zzo.class) {
            zzo zzoVar = zzcl;
            if (zzoVar != null) {
                return zzoVar;
            }
            zzo zzoVar2 = new zzo(context);
            zzcl = zzoVar2;
            return zzoVar2;
        }
    }

    public final synchronized void clear() {
        this.zzcm.clear();
        this.zzcn = null;
        this.zzco = null;
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zzcm.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzcn = googleSignInAccount;
        this.zzco = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount zzl() {
        return this.zzcn;
    }

    public final synchronized GoogleSignInOptions zzm() {
        return this.zzco;
    }
}
