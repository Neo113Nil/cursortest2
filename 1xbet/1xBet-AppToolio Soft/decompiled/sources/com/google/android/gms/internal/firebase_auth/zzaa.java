package com.google.android.gms.internal.firebase_auth;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzaa implements com.google.firebase.auth.api.internal.zzdp<zzj> {
    private static final Logger zzdx = new Logger("EmailLinkSignInRequest", new String[0]);
    private final String zzaf;
    private final String zzah;
    private final String zzdy;

    public zzaa(@NonNull EmailAuthCredential emailAuthCredential, @Nullable String str) {
        this.zzah = Preconditions.checkNotEmpty(emailAuthCredential.getEmail());
        this.zzdy = Preconditions.checkNotEmpty(emailAuthCredential.zzg());
        this.zzaf = str;
    }

    private static String zzi(String str) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains("oobCode")) {
                return parse.getQueryParameter("oobCode");
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter("oobCode");
            }
            return null;
        } catch (UnsupportedOperationException e) {
            Logger logger = zzdx;
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(e.getMessage());
            objArr[0] = valueOf.length() != 0 ? "No oobCode in signInLink: ".concat(valueOf) : new String("No oobCode in signInLink: ");
            logger.v("EmailLinkSignInRequest", objArr);
            return null;
        }
    }

    @Override // com.google.firebase.auth.api.internal.zzdp
    public final /* synthetic */ zzj zzao() {
        zzj zzjVar = new zzj();
        zzjVar.zzah = this.zzah;
        zzjVar.zzag = zzi(this.zzdy);
        zzjVar.zzaf = this.zzaf;
        return zzjVar;
    }
}
