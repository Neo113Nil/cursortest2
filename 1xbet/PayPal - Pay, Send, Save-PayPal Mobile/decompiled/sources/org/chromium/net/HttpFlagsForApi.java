package org.chromium.net;

/* loaded from: classes18.dex */
final class HttpFlagsForApi {
    HttpFlagsForApi() {
    }

    public static org.chromium.net.httpflags.ResolvedFlags getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        return org.chromium.net.httpflags.HttpFlagsLoader.getHttpFlags(context, org.chromium.net.ApiVersion.getCronetVersion(), true, org.chromium.net.impl.CronetManifest.isAppOptedInForTelemetry(context));
    }
}
