package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7523a;

    /* renamed from: b, reason: collision with root package name */
    public final Zm f7524b;

    /* renamed from: c, reason: collision with root package name */
    public final C0606e3 f7525c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f7526d;

    public T9(Context context, Zm zm, C0606e3 c0606e3, SafePackageManager safePackageManager) {
        this.f7523a = context;
        this.f7524b = zm;
        this.f7525c = c0606e3;
        this.f7526d = safePackageManager;
    }

    public T9(Context context) {
        this(context, new Zm(context, "io.appmetrica.analytics.build_id"), new C0606e3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
