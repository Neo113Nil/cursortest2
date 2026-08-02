package q0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15752a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15754c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15755d;

    public n(Object obj) {
        this.f15752a = obj;
    }

    public void a() {
        boolean z4 = this.f15753b;
        Object obj = this.f15752a;
        if (z4) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (this.f15754c) {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
        if (!this.f15755d) {
            this.f15753b = true;
        } else {
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + obj);
        }
    }

    public final boolean b() {
        return this.f15753b || this.f15754c || this.f15755d;
    }

    public abstract void c(Object obj);

    public final void d(Bundle bundle) {
        boolean z4 = this.f15754c;
        Object obj = this.f15752a;
        if (z4 || this.f15755d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + obj);
        }
        this.f15755d = true;
        throw new UnsupportedOperationException("It is not supported to send an error for " + obj);
    }

    public final void e(Object obj) {
        if (this.f15754c || this.f15755d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f15752a);
        }
        this.f15754c = true;
        c(obj);
    }
}
