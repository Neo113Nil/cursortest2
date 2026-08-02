package D6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0137u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0128k f1877b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1878c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1879d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1880e;

    public C0137u(Object obj, AbstractC0128k abstractC0128k, Function1 function1, Object obj2, Throwable th) {
        this.f1876a = obj;
        this.f1877b = abstractC0128k;
        this.f1878c = function1;
        this.f1879d = obj2;
        this.f1880e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0137u a(C0137u c0137u, AbstractC0128k abstractC0128k, CancellationException cancellationException, int i7) {
        Object obj = c0137u.f1876a;
        if ((i7 & 2) != 0) {
            abstractC0128k = c0137u.f1877b;
        }
        AbstractC0128k abstractC0128k2 = abstractC0128k;
        Function1 function1 = c0137u.f1878c;
        Object obj2 = c0137u.f1879d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0137u.f1880e;
        }
        c0137u.getClass();
        return new C0137u(obj, abstractC0128k2, function1, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137u)) {
            return false;
        }
        C0137u c0137u = (C0137u) obj;
        return t6.h.a(this.f1876a, c0137u.f1876a) && t6.h.a(this.f1877b, c0137u.f1877b) && t6.h.a(this.f1878c, c0137u.f1878c) && t6.h.a(this.f1879d, c0137u.f1879d) && t6.h.a(this.f1880e, c0137u.f1880e);
    }

    public final int hashCode() {
        Object obj = this.f1876a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0128k abstractC0128k = this.f1877b;
        int hashCode2 = (hashCode + (abstractC0128k == null ? 0 : abstractC0128k.hashCode())) * 31;
        Function1 function1 = this.f1878c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f1879d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1880e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1876a + ", cancelHandler=" + this.f1877b + ", onCancellation=" + this.f1878c + ", idempotentResume=" + this.f1879d + ", cancelCause=" + this.f1880e + ')';
    }

    public /* synthetic */ C0137u(Object obj, AbstractC0128k abstractC0128k, Function1 function1, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : abstractC0128k, (i7 & 4) != 0 ? null : function1, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}
