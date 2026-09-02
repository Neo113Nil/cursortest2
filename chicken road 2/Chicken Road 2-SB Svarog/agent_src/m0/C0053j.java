package m0;

import java.util.concurrent.CancellationException;

/* renamed from: m0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f929a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.l f930b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f931c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f932d;

    public C0053j(Object obj, f0.l lVar, Object obj2, Throwable th) {
        this.f929a = obj;
        this.f930b = lVar;
        this.f931c = obj2;
        this.f932d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0053j)) {
            return false;
        }
        C0053j c0053j = (C0053j) obj;
        return g0.h.a(this.f929a, c0053j.f929a) && g0.h.a(this.f930b, c0053j.f930b) && g0.h.a(this.f931c, c0053j.f931c) && g0.h.a(this.f932d, c0053j.f932d);
    }

    public final int hashCode() {
        Object obj = this.f929a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        f0.l lVar = this.f930b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f931c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f932d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f929a + ", cancelHandler=null, onCancellation=" + this.f930b + ", idempotentResume=" + this.f931c + ", cancelCause=" + this.f932d + ')';
    }

    public /* synthetic */ C0053j(Object obj, f0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
