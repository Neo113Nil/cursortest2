package a3;

import b3.C0284e;

/* renamed from: a3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190i implements InterfaceC0187f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0187f f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final C0188g f3870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0191j f3871c;

    public C0190i(C0191j c0191j, InterfaceC0187f interfaceC0187f, C0188g c0188g) {
        this.f3871c = c0191j;
        this.f3869a = interfaceC0187f;
        this.f3870b = c0188g;
        c0191j.f3873a.d(this, c0188g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3870b.f3867d = true;
        C0189h c0189h = this.f3871c.f3873a;
        c0189h.getClass();
        C0284e c2 = c0189h.c(this);
        try {
            c0189h.f4824a.remove(c2);
            c0189h.e(c2);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement.getClassName().equals(C0190i.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i3 = i2 + 2;
                    int i6 = i2 + 1;
                    if (i6 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i6];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i3 < stackTrace.length) {
                            i3 = i2 + 3;
                        }
                    }
                    if (stackTrace[i3].getMethodName().equals("invokeSuspend")) {
                        i3++;
                    }
                    if (i3 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i3];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() == this.f3870b.f3865b) {
                this.f3869a.close();
                return;
            }
            throw new IllegalStateException("Thread [" + this.f3870b.f3864a + "] opened scope, but thread [" + Thread.currentThread().getName() + "] closed it", this.f3870b);
        } catch (Throwable th) {
            c0189h.e(c2);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f3870b.getMessage();
        return message != null ? message : super.toString();
    }
}
