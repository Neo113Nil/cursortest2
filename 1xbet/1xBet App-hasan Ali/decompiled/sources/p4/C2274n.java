package p4;

import java.util.concurrent.CancellationException;

/* renamed from: p4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18805a;

    /* renamed from: b, reason: collision with root package name */
    public final C2265e f18806b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.f f18807c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18808d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f18809e;

    public C2274n(Object obj, C2265e c2265e, i4.f fVar, Object obj2, Throwable th) {
        this.f18805a = obj;
        this.f18806b = c2265e;
        this.f18807c = fVar;
        this.f18808d = obj2;
        this.f18809e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C2274n a(C2274n c2274n, C2265e c2265e, CancellationException cancellationException, int i) {
        Object obj = c2274n.f18805a;
        if ((i & 2) != 0) {
            c2265e = c2274n.f18806b;
        }
        C2265e c2265e2 = c2265e;
        i4.f fVar = c2274n.f18807c;
        Object obj2 = c2274n.f18808d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c2274n.f18809e;
        }
        c2274n.getClass();
        return new C2274n(obj, c2265e2, fVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2274n)) {
            return false;
        }
        C2274n c2274n = (C2274n) obj;
        return kotlin.jvm.internal.l.a(this.f18805a, c2274n.f18805a) && kotlin.jvm.internal.l.a(this.f18806b, c2274n.f18806b) && kotlin.jvm.internal.l.a(this.f18807c, c2274n.f18807c) && kotlin.jvm.internal.l.a(this.f18808d, c2274n.f18808d) && kotlin.jvm.internal.l.a(this.f18809e, c2274n.f18809e);
    }

    public final int hashCode() {
        Object obj = this.f18805a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C2265e c2265e = this.f18806b;
        int hashCode2 = (hashCode + (c2265e == null ? 0 : c2265e.hashCode())) * 31;
        i4.f fVar = this.f18807c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f18808d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f18809e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f18805a + ", cancelHandler=" + this.f18806b + ", onCancellation=" + this.f18807c + ", idempotentResume=" + this.f18808d + ", cancelCause=" + this.f18809e + ')';
    }

    public /* synthetic */ C2274n(Object obj, C2265e c2265e, i4.f fVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c2265e, (i & 4) != 0 ? null : fVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
