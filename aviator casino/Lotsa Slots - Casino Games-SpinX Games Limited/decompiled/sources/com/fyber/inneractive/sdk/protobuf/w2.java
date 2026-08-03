package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class w2 implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4225a;
    public java.util.Iterator b;
    public final /* synthetic */ com.fyber.inneractive.sdk.protobuf.e3 c;

    public w2(com.fyber.inneractive.sdk.protobuf.e3 e3Var) {
        this.c = e3Var;
        this.f4225a = e3Var.b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4225a;
        if (i <= 0 || i > this.c.b.size()) {
            if (this.b == null) {
                this.b = this.c.f.entrySet().iterator();
            }
            if (!this.b.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        if (this.b.hasNext()) {
            if (this.b == null) {
                this.b = this.c.f.entrySet().iterator();
            }
            return (java.util.Map.Entry) this.b.next();
        }
        java.util.List list = this.c.b;
        int i = this.f4225a - 1;
        this.f4225a = i;
        return (java.util.Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
