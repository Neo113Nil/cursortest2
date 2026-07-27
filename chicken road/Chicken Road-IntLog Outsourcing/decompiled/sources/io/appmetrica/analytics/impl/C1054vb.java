package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054vb {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9461a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2 f9462b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC1080wb f9463c;

    public C1054vb(Handler handler, Q2 q22) {
        this.f9461a = handler;
        this.f9462b = q22;
        this.f9463c = new RunnableC1080wb(handler, q22);
    }

    public static void a(Handler handler, Q2 q22, Runnable runnable) {
        handler.removeCallbacks(runnable, q22.f7300b.f7239b.getApiKey());
        handler.postAtTime(runnable, q22.f7300b.f7239b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(q22.f7300b.f7239b.getSessionTimeout(), 10)).intValue() * PermissionsViewModel.DELAY_TIME_CALLBACK_CALL));
    }
}
