package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686h5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8304a;

    public C0686h5(String str) {
        this.f8304a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f8304a);
    }
}
