package androidx.credentials;

import android.adservices.adselection.AdSelectionConfig;
import android.credentials.CreateCredentialRequest;
import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class B {
    public static /* synthetic */ AdSelectionConfig.Builder a() {
        return new AdSelectionConfig.Builder();
    }

    public static /* synthetic */ CreateCredentialRequest.Builder b(String str, Bundle bundle, Bundle bundle2) {
        return new CreateCredentialRequest.Builder(str, bundle, bundle2);
    }
}
