package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939r0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0524ao f9124a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f9125b;

    /* renamed from: c, reason: collision with root package name */
    public Ia f9126c;

    /* renamed from: d, reason: collision with root package name */
    public Ja f9127d;

    public C0939r0() {
        this(new C0524ao());
    }

    public final synchronized Ia a(Context context, Z3 z32) {
        try {
            if (this.f9126c == null) {
                if (a(context)) {
                    this.f9126c = new C0991t0();
                } else {
                    this.f9126c = new C0914q0(context, z32);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9126c;
    }

    public C0939r0(C0524ao c0524ao) {
        this.f9124a = c0524ao;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f9125b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f9125b;
                    if (bool == null) {
                        this.f9124a.getClass();
                        boolean a6 = C0524ao.a(context);
                        bool = Boolean.valueOf(!a6);
                        this.f9125b = bool;
                        if (!a6) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
