package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790r0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0375ao f8181a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f8182b;

    /* renamed from: c, reason: collision with root package name */
    public Ia f8183c;

    /* renamed from: d, reason: collision with root package name */
    public Ja f8184d;

    public C0790r0() {
        this(new C0375ao());
    }

    public final synchronized Ia a(Context context, Z3 z3) {
        try {
            if (this.f8183c == null) {
                if (a(context)) {
                    this.f8183c = new C0842t0();
                } else {
                    this.f8183c = new C0765q0(context, z3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8183c;
    }

    public C0790r0(C0375ao c0375ao) {
        this.f8181a = c0375ao;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f8182b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f8182b;
                    if (bool == null) {
                        this.f8181a.getClass();
                        boolean a3 = C0375ao.a(context);
                        bool = Boolean.valueOf(!a3);
                        this.f8182b = bool;
                        if (!a3) {
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
