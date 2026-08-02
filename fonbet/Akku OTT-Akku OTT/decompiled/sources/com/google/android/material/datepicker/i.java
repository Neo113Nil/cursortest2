package com.google.android.material.datepicker;

/* loaded from: classes4.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public i(j jVar, int i) {
        this.b = jVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l.smoothScrollToPosition(this.a);
    }
}
