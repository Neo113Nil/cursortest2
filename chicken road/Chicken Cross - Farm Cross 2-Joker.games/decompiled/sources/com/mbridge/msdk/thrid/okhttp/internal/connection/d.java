package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RouteDatabase.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<c0> f9887a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f9887a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f9887a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f9887a.contains(c0Var);
    }
}
