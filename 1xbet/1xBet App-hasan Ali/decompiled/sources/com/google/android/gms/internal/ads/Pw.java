package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Pw {

    /* renamed from: a, reason: collision with root package name */
    public final Au f11133a = new Au();

    /* renamed from: b, reason: collision with root package name */
    public final String f11134b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f11135c;

    public Pw(Class cls) {
        this.f11134b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f11135c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f11133a) {
            try {
                Logger logger2 = this.f11135c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f11134b);
                this.f11135c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
