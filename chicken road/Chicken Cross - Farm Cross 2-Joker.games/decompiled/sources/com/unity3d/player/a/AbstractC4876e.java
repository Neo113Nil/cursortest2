package com.unity3d.player.a;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;

/* renamed from: com.unity3d.player.a.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC4876e {
    public static OnBackInvokedDispatcher a(Object obj) {
        if (obj instanceof Activity) {
            return ((Activity) obj).getOnBackInvokedDispatcher();
        }
        if (obj instanceof Dialog) {
            return ((Dialog) obj).getOnBackInvokedDispatcher();
        }
        throw new IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, C4875d c4875d) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, c4875d);
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, C4875d c4875d) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(c4875d);
    }
}
