package financial.atomic.transact;

/* loaded from: classes17.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.Function2 f6892a;
    public final boolean b;
    public final boolean c;

    public a(kotlin.jvm.functions.Function2<? super financial.atomic.transact.Emitter.Event<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.f6892a = function2;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof financial.atomic.transact.a ? kotlin.jvm.internal.Intrinsics.areEqual(this.f6892a, ((financial.atomic.transact.a) obj).f6892a) : super.equals(obj);
    }

    public final kotlin.jvm.functions.Function2<financial.atomic.transact.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHandler() {
        return this.f6892a;
    }

    public final boolean getOnce() {
        return this.c;
    }

    public final boolean getRemovable() {
        return this.b;
    }

    public final int hashCode() {
        return this.f6892a.hashCode();
    }

    public /* synthetic */ a(kotlin.jvm.functions.Function2 function2, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(handler=");
        sb.append(this.f6892a);
        sb.append(", removable=");
        sb.append(this.b);
        sb.append(", once=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public final financial.atomic.transact.a copy(kotlin.jvm.functions.Function2<? super financial.atomic.transact.Emitter.Event<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return new financial.atomic.transact.a(function2, z, z2);
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component2() {
        return this.b;
    }

    public final kotlin.jvm.functions.Function2<financial.atomic.transact.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
        return this.f6892a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ financial.atomic.transact.a copy$default(financial.atomic.transact.a aVar, kotlin.jvm.functions.Function2 function2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = aVar.f6892a;
        }
        if ((i & 2) != 0) {
            z = aVar.b;
        }
        if ((i & 4) != 0) {
            z2 = aVar.c;
        }
        return aVar.copy(function2, z, z2);
    }
}
