package D4;

import java.util.concurrent.CancellationException;
import t4.InterfaceC1441l;

/* renamed from: D4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f520a;

    /* renamed from: b, reason: collision with root package name */
    public final C0005e f521b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1441l f522c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f523d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f524e;

    public C0015o(Object obj, C0005e c0005e, InterfaceC1441l interfaceC1441l, Object obj2, Throwable th) {
        this.f520a = obj;
        this.f521b = c0005e;
        this.f522c = interfaceC1441l;
        this.f523d = obj2;
        this.f524e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0015o a(C0015o c0015o, C0005e c0005e, CancellationException cancellationException, int i2) {
        Object obj = c0015o.f520a;
        if ((i2 & 2) != 0) {
            c0005e = c0015o.f521b;
        }
        C0005e c0005e2 = c0005e;
        InterfaceC1441l interfaceC1441l = c0015o.f522c;
        Object obj2 = c0015o.f523d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0015o.f524e;
        }
        c0015o.getClass();
        return new C0015o(obj, c0005e2, interfaceC1441l, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0015o)) {
            return false;
        }
        C0015o c0015o = (C0015o) obj;
        return kotlin.jvm.internal.i.a(this.f520a, c0015o.f520a) && kotlin.jvm.internal.i.a(this.f521b, c0015o.f521b) && kotlin.jvm.internal.i.a(this.f522c, c0015o.f522c) && kotlin.jvm.internal.i.a(this.f523d, c0015o.f523d) && kotlin.jvm.internal.i.a(this.f524e, c0015o.f524e);
    }

    public final int hashCode() {
        Object obj = this.f520a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0005e c0005e = this.f521b;
        int hashCode2 = (hashCode + (c0005e == null ? 0 : c0005e.hashCode())) * 31;
        InterfaceC1441l interfaceC1441l = this.f522c;
        int hashCode3 = (hashCode2 + (interfaceC1441l == null ? 0 : interfaceC1441l.hashCode())) * 31;
        Object obj2 = this.f523d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f524e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f520a + ", cancelHandler=" + this.f521b + ", onCancellation=" + this.f522c + ", idempotentResume=" + this.f523d + ", cancelCause=" + this.f524e + ')';
    }

    public /* synthetic */ C0015o(Object obj, C0005e c0005e, InterfaceC1441l interfaceC1441l, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : c0005e, (i2 & 4) != 0 ? null : interfaceC1441l, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
