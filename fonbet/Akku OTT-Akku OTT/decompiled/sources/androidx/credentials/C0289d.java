package androidx.credentials;

import android.adservices.measurement.DeletionRequest;
import android.credentials.CreateCredentialException;
import android.service.credentials.BeginGetCredentialRequest;

/* renamed from: androidx.credentials.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0289d {
    public static /* synthetic */ DeletionRequest.Builder a() {
        return new DeletionRequest.Builder();
    }

    public static /* synthetic */ CreateCredentialException b(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* synthetic */ BeginGetCredentialRequest.Builder d() {
        return new BeginGetCredentialRequest.Builder();
    }
}
