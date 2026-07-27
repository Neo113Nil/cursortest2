package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239x0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0197j f2850a = new C0197j();

    /* renamed from: b, reason: collision with root package name */
    public final String f2851b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f2852c;

    public C0239x0(Class cls) {
        this.f2851b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f2852c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f2850a) {
            try {
                Logger logger2 = this.f2852c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f2851b);
                this.f2852c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
