package w2;

import java.util.concurrent.CancellationException;

/* renamed from: w2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10511a;

    /* renamed from: b, reason: collision with root package name */
    public final D f10512b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.l f10513c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10514d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f10515e;

    public C1234m(Object obj, D d3, o2.l lVar, Object obj2, Throwable th) {
        this.f10511a = obj;
        this.f10512b = d3;
        this.f10513c = lVar;
        this.f10514d = obj2;
        this.f10515e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C1234m a(C1234m c1234m, D d3, CancellationException cancellationException, int i3) {
        Object obj = c1234m.f10511a;
        if ((i3 & 2) != 0) {
            d3 = c1234m.f10512b;
        }
        D d4 = d3;
        o2.l lVar = c1234m.f10513c;
        Object obj2 = c1234m.f10514d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c1234m.f10515e;
        }
        c1234m.getClass();
        return new C1234m(obj, d4, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234m)) {
            return false;
        }
        C1234m c1234m = (C1234m) obj;
        return kotlin.jvm.internal.j.a(this.f10511a, c1234m.f10511a) && kotlin.jvm.internal.j.a(this.f10512b, c1234m.f10512b) && kotlin.jvm.internal.j.a(this.f10513c, c1234m.f10513c) && kotlin.jvm.internal.j.a(this.f10514d, c1234m.f10514d) && kotlin.jvm.internal.j.a(this.f10515e, c1234m.f10515e);
    }

    public final int hashCode() {
        Object obj = this.f10511a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d3 = this.f10512b;
        int hashCode2 = (hashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        o2.l lVar = this.f10513c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f10514d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10515e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f10511a + ", cancelHandler=" + this.f10512b + ", onCancellation=" + this.f10513c + ", idempotentResume=" + this.f10514d + ", cancelCause=" + this.f10515e + ')';
    }

    public /* synthetic */ C1234m(Object obj, D d3, o2.l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : d3, (i3 & 4) != 0 ? null : lVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
