package androidx.credentials;

import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.credentials.CredentialOption;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: androidx.credentials.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0313y {
    public static /* synthetic */ WebTriggerRegistrationRequest.Builder c(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ CredentialOption.Builder d(String str, Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder(str, bundle, bundle2);
    }
}
