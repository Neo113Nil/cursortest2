package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public final class zzw extends zzq {
    private final Context mContext;

    public zzw(Context context) {
        this.mContext = context;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzn() {
        zzq();
        Storage storage = Storage.getInstance(this.mContext);
        GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        GoogleSignInClient client = GoogleSignIn.getClient(this.mContext, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzo() {
        zzq();
        zzo.zzd(this.mContext).clear();
    }

    private final void zzq() {
        if (UidVerifier.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
    }
}
