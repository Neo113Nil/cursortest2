package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;

/* loaded from: classes2.dex */
public final class AnrIntegrationFactory {
    public static Integration create(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
