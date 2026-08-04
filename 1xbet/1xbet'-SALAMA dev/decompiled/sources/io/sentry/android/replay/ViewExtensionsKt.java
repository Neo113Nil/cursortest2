package io.sentry.android.replay;

import android.view.View;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewExtensionsKt {
    public static final void sentryReplayMask(View view) {
        h.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, "mask");
    }

    public static final void sentryReplayUnmask(View view) {
        h.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, "unmask");
    }
}
