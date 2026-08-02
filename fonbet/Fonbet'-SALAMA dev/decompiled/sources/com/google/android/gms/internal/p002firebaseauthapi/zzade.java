package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.PhoneAuthCredential;
import i3.C1263a;

/* loaded from: classes.dex */
public class zzade {
    private final zzadf zza;
    private final C1263a zzb;

    public zzade(zzade zzadeVar) {
        this(zzadeVar.zza, zzadeVar.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e7, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending send verification code response.", e7, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending set account info response.", e7, new Object[0]);
        }
    }

    public final void zza(zzafl zzaflVar) {
        try {
            this.zza.zza(zzaflVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending create auth uri response.", e7, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending email verification response.", e7, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e7, new Object[0]);
        }
    }

    public zzade(zzadf zzadfVar, C1263a c1263a) {
        D.i(zzadfVar);
        this.zza = zzadfVar;
        D.i(c1263a);
        this.zzb = c1263a;
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending delete account response.", e7, new Object[0]);
        }
    }

    public final void zza(zzzi zzziVar) {
        try {
            this.zza.zza(zzziVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending failure result with credential", e7, new Object[0]);
        }
    }

    public final void zza(zzzl zzzlVar) {
        try {
            this.zza.zza(zzzlVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending failure result for mfa", e7, new Object[0]);
        }
    }

    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zza(status, phoneAuthCredential);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending failure result.", e7, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending failure result.", e7, new Object[0]);
        }
    }

    public final void zza(zzagh zzaghVar) {
        try {
            this.zza.zza(zzaghVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e7, new Object[0]);
        }
    }

    public final void zza(zzagm zzagmVar) {
        try {
            this.zza.zza(zzagmVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e7, new Object[0]);
        }
    }

    public final void zza(zzagl zzaglVar, zzage zzageVar) {
        try {
            this.zza.zza(zzaglVar, zzageVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending get token and account info user response", e7, new Object[0]);
        }
    }

    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending password reset response.", e7, new Object[0]);
        }
    }

    public final void zza(zzaha zzahaVar) {
        try {
            this.zza.zza(zzahaVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending revoke token response.", e7, new Object[0]);
        }
    }

    public final void zza(zzahh zzahhVar) {
        try {
            this.zza.zza(zzahhVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e7, new Object[0]);
        }
    }

    public final void zza(zzagl zzaglVar) {
        try {
            this.zza.zza(zzaglVar);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending token result.", e7, new Object[0]);
        }
    }

    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zza(phoneAuthCredential);
        } catch (RemoteException e7) {
            this.zzb.b("RemoteException when sending verification completed response.", e7, new Object[0]);
        }
    }
}
