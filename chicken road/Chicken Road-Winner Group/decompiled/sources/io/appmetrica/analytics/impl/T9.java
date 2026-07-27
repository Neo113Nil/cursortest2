package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final Zm f6653b;

    /* renamed from: c, reason: collision with root package name */
    public final C0457e3 f6654c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f6655d;

    public T9(Context context, Zm zm, C0457e3 c0457e3, SafePackageManager safePackageManager) {
        this.f6652a = context;
        this.f6653b = zm;
        this.f6654c = c0457e3;
        this.f6655d = safePackageManager;
    }

    public T9(Context context) {
        this(context, new Zm(context, "io.appmetrica.analytics.build_id"), new C0457e3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
