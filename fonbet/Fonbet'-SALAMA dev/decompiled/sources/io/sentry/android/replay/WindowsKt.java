package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import t6.h;

/* loaded from: classes2.dex */
public final class WindowsKt {
    public static final Window getPhoneWindow(View view) {
        h.e(view, "<this>");
        WindowSpy windowSpy = WindowSpy.INSTANCE;
        View rootView = view.getRootView();
        h.d(rootView, "rootView");
        return windowSpy.pullWindow(rootView);
    }
}
