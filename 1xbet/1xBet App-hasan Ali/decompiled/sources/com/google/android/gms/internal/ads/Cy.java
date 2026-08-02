package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Cy {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f8126c = Logger.getLogger(Cy.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final Cy f8127d = new Cy();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8128a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8129b = new ConcurrentHashMap();

    public final synchronized void a(Iy iy) {
        b(iy, 1);
    }

    public final synchronized void b(Iy iy, int i) {
        if (!AbstractC0952et.s(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(iy);
    }

    public final synchronized Iy c(String str) {
        if (!this.f8128a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (Iy) this.f8128a.get(str);
    }

    public final synchronized void d(Iy iy) {
        try {
            String str = iy.f9654a;
            if (this.f8129b.containsKey(str) && !((Boolean) this.f8129b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((Iy) this.f8128a.get(str)) != null && !Iy.class.equals(Iy.class)) {
                f8126c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + Iy.class.getName() + ", cannot be re-registered with " + Iy.class.getName());
            }
            this.f8128a.putIfAbsent(str, iy);
            this.f8129b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
