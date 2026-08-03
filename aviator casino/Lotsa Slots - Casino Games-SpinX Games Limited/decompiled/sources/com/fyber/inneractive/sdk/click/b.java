package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.click.q f3570a;
    public final java.lang.Throwable b;
    public final java.lang.String c;
    public final java.lang.String d;
    public long e;
    public final java.util.ArrayList f = new java.util.ArrayList();

    public b(java.lang.String str, com.fyber.inneractive.sdk.click.q qVar, java.lang.String str2, java.lang.Exception exc) {
        this.d = str;
        this.f3570a = qVar;
        this.c = str2;
        this.b = exc;
    }

    public final java.lang.String toString() {
        com.fyber.inneractive.sdk.click.q qVar = this.f3570a;
        if (qVar == com.fyber.inneractive.sdk.click.q.FAILED) {
            java.lang.Throwable th = this.b;
            return "Open result: Failed! error: " + (th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.c;
    }
}
