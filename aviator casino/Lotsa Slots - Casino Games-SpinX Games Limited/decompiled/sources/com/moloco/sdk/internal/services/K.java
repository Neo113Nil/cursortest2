package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class K implements com.moloco.sdk.internal.services.J {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7207a = 0;

    @Override // com.moloco.sdk.internal.services.J
    public long a() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.moloco.sdk.internal.services.J
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.moloco.sdk.internal.services.J
    @kotlin.Deprecated(message = "Use currentTime() instead", replaceWith = @kotlin.ReplaceWith(expression = "currentTime()", imports = {}))
    public long invoke() {
        return java.lang.System.currentTimeMillis();
    }
}
