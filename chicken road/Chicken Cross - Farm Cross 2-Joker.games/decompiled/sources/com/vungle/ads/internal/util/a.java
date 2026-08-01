package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d.a(d.f, listener);
    }

    public static void b(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d.f.a(listener);
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d.a(d.f, context);
    }

    public static boolean a() {
        return d.a(d.f);
    }

    public static boolean a(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = d.f;
        if (!d.a(dVar)) {
            dVar.d = new c(new WeakReference(context), intent, intent2, mVar);
            return false;
        }
        return d.a(dVar, context, intent, intent2, mVar);
    }
}
