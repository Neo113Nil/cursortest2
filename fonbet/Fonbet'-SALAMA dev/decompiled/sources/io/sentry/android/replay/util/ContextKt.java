package io.sentry.android.replay.util;

import android.content.Context;
import t6.h;

/* loaded from: classes2.dex */
public final class ContextKt {
    public static final Context appContext(Context context) {
        h.e(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
