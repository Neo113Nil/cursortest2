package androidx.credentials;

import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.CallingAppInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class E {
    public static /* synthetic */ BeginCreateCredentialRequest b(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }
}
