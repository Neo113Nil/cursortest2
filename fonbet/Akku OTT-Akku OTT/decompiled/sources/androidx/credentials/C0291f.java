package androidx.credentials;

import android.adservices.appsetid.AppSetIdManager;
import android.adservices.measurement.MeasurementManager;
import android.credentials.GetCredentialException;

/* renamed from: androidx.credentials.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0291f {
    public static /* synthetic */ GetCredentialException a(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return AppSetIdManager.class;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MeasurementManager.class;
    }
}
