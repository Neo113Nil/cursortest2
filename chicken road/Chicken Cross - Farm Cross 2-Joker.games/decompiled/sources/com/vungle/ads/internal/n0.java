package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12035a;
    public final DisplayMetrics b;

    public n0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12035a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b = displayMetrics;
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.areEqual(this.f12035a, ((n0) obj).f12035a);
    }

    public final int hashCode() {
        return this.f12035a.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=").append(this.f12035a).append(')').toString();
    }
}
