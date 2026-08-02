package androidx.credentials.provider.utils;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.ReportImpressionRequest;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;

/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static /* synthetic */ ReportImpressionRequest a(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* synthetic */ BeginGetCredentialOption d(String str, String str2) {
        return new BeginGetCredentialOption(str, str2, Bundle.EMPTY);
    }
}
