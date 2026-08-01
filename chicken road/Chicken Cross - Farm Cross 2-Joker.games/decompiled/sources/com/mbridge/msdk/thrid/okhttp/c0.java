package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route.java */
/* loaded from: classes6.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    final a f9871a;
    final Proxy b;
    final InetSocketAddress c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f9871a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public a a() {
        return this.f9871a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.f9871a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.f9871a.equals(this.f9871a) && c0Var.b.equals(this.b) && c0Var.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9871a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + "}";
    }
}
