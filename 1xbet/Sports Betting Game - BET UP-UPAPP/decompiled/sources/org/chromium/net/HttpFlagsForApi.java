package org.chromium.net;

import android.content.Context;
import org.chromium.net.httpflags.HttpFlagsLoader;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetManifest;

/* loaded from: classes4.dex */
final class HttpFlagsForApi {
    HttpFlagsForApi() {
    }

    public static ResolvedFlags getHttpFlags(Context context) {
        return HttpFlagsLoader.getHttpFlags(context, ApiVersion.getCronetVersion(), true, CronetManifest.isAppOptedInForTelemetry(context));
    }
}
