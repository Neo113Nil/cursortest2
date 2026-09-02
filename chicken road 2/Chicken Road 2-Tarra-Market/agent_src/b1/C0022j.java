package b1;

import java.util.concurrent.CancellationException;

/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f663a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.l f664b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f665c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f666d;

    public C0022j(Object obj, U0.l lVar, Object obj2, Throwable th) {
        this.f663a = obj;
        this.f664b = lVar;
        this.f665c = obj2;
        this.f666d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022j)) {
            return false;
        }
        C0022j c0022j = (C0022j) obj;
        return kotlin.jvm.internal.j.a(this.f663a, c0022j.f663a) && kotlin.jvm.internal.j.a(null, null) && kotlin.jvm.internal.j.a(this.f664b, c0022j.f664b) && kotlin.jvm.internal.j.a(this.f665c, c0022j.f665c) && kotlin.jvm.internal.j.a(this.f666d, c0022j.f666d);
    }

    public final int hashCode() {
        Object obj = this.f663a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        U0.l lVar = this.f664b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f665c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f666d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f663a + ", cancelHandler=null, onCancellation=" + this.f664b + ", idempotentResume=" + this.f665c + ", cancelCause=" + this.f666d + ')';
    }

    public /* synthetic */ C0022j(Object obj, U0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
