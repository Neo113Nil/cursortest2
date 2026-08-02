package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
/* renamed from: kotlinx.coroutines.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1123z<R> {

    @JvmField
    public final R a;

    @JvmField
    public final InterfaceC1094k b;

    @JvmField
    public final Function3<Throwable, R, CoroutineContext, Unit> c;

    @JvmField
    public final Object d;

    @JvmField
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1123z(R r, InterfaceC1094k interfaceC1094k, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj, Throwable th) {
        this.a = r;
        this.b = interfaceC1094k;
        this.c = function3;
        this.d = obj;
        this.e = th;
    }

    public static C1123z a(C1123z c1123z, InterfaceC1094k interfaceC1094k, Throwable th, int i) {
        R r = c1123z.a;
        if ((i & 2) != 0) {
            interfaceC1094k = c1123z.b;
        }
        InterfaceC1094k interfaceC1094k2 = interfaceC1094k;
        Function3<Throwable, R, CoroutineContext, Unit> function3 = c1123z.c;
        Object obj = c1123z.d;
        if ((i & 16) != 0) {
            th = c1123z.e;
        }
        c1123z.getClass();
        return new C1123z(r, interfaceC1094k2, function3, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1123z)) {
            return false;
        }
        C1123z c1123z = (C1123z) obj;
        return Intrinsics.areEqual(this.a, c1123z.a) && Intrinsics.areEqual(this.b, c1123z.b) && Intrinsics.areEqual(this.c, c1123z.c) && Intrinsics.areEqual(this.d, c1123z.d) && Intrinsics.areEqual(this.e, c1123z.e);
    }

    public final int hashCode() {
        R r = this.a;
        int hashCode = (r == null ? 0 : r.hashCode()) * 31;
        InterfaceC1094k interfaceC1094k = this.b;
        int hashCode2 = (hashCode + (interfaceC1094k == null ? 0 : interfaceC1094k.hashCode())) * 31;
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.c;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj = this.d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C1123z(Object obj, InterfaceC1094k interfaceC1094k, Function3 function3, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC1094k, (Function3<? super Throwable, ? super Object, ? super CoroutineContext, Unit>) ((i & 4) != 0 ? null : function3), (Object) null, (i & 16) != 0 ? null : th);
    }
}
