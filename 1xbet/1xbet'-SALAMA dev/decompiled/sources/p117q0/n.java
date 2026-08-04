package p117q0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15761d;

    public n(Object obj) {
        this.f15758a = obj;
    }

    public void a() {
        boolean z4 = this.f15759b;
        Object obj = this.f15758a;
        if (z4) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (this.f15760c) {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
        if (!this.f15761d) {
            this.f15759b = true;
        } else {
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + obj);
        }
    }

    public final boolean b() {
        return this.f15759b || this.f15760c || this.f15761d;
    }

    public abstract void c(Object obj);

    public final void d(Bundle bundle) {
        boolean z4 = this.f15760c;
        Object obj = this.f15758a;
        if (z4 || this.f15761d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + obj);
        }
        this.f15761d = true;
        throw new UnsupportedOperationException("It is not supported to send an error for " + obj);
    }

    public final void e(Object obj) {
        if (this.f15760c || this.f15761d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f15758a);
        }
        this.f15760c = true;
        c(obj);
    }
}
