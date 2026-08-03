package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class c3 implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4182a = -1;
    public boolean b;
    public java.util.Iterator c;
    public final /* synthetic */ com.fyber.inneractive.sdk.protobuf.e3 d;

    public c3(com.fyber.inneractive.sdk.protobuf.e3 e3Var) {
        this.d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4182a + 1 < this.d.b.size()) {
            return true;
        }
        if (!this.d.c.isEmpty()) {
            if (this.c == null) {
                this.c = this.d.c.entrySet().iterator();
            }
            if (this.c.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        this.b = true;
        int i = this.f4182a + 1;
        this.f4182a = i;
        if (i < this.d.b.size()) {
            return (java.util.Map.Entry) this.d.b.get(this.f4182a);
        }
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return (java.util.Map.Entry) this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        com.fyber.inneractive.sdk.protobuf.e3 e3Var = this.d;
        int i = com.fyber.inneractive.sdk.protobuf.e3.h;
        e3Var.a();
        if (this.f4182a >= this.d.b.size()) {
            if (this.c == null) {
                this.c = this.d.c.entrySet().iterator();
            }
            this.c.remove();
            return;
        }
        com.fyber.inneractive.sdk.protobuf.e3 e3Var2 = this.d;
        int i2 = this.f4182a;
        this.f4182a = i2 - 1;
        e3Var2.a();
        java.lang.Object obj = ((com.fyber.inneractive.sdk.protobuf.b3) e3Var2.b.remove(i2)).b;
        if (e3Var2.c.isEmpty()) {
            return;
        }
        java.util.Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.b.add(new com.fyber.inneractive.sdk.protobuf.b3(e3Var2, (java.util.Map.Entry) it.next()));
        it.remove();
    }
}
