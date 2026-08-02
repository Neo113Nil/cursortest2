package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class ne implements java.lang.Runnable {
    private java.lang.String b;

    protected abstract void c();

    public ne(java.lang.String str, java.lang.Object... objArr) {
        this.b = com.facetec.sdk.nh.c(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String name2 = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().setName(this.b);
        try {
            c();
        } finally {
            java.lang.Thread.currentThread().setName(name2);
        }
    }
}
