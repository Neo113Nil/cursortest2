package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "id", "<init>", "(J)V", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "component1", "()J", "copy", "(J)Lkotlinx/coroutines/CoroutineId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getId", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CoroutineId extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.lang.String> {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineId.Companion INSTANCE = new kotlinx.coroutines.CoroutineId.Companion(null);
    private final long id;

    public final long getId() {
        return this.id;
    }

    public CoroutineId(long j) {
        super(INSTANCE);
        this.id = j;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.CoroutineId$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineId> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CoroutineId(");
        sb.append(this.id);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final java.lang.String updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        java.lang.String str;
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (str = coroutineName.getName()) == null) {
            str = "coroutine";
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.String name2 = currentThread.getName();
        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) name2, " @", 0, false, 6, (java.lang.Object) null);
        if (lastIndexOf$default < 0) {
            lastIndexOf$default = name2.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + lastIndexOf$default + 10);
        java.lang.String substring = name2.substring(0, lastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.id);
        currentThread.setName(sb.toString());
        return name2;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void restoreThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.String oldState) {
        java.lang.Thread.currentThread().setName(oldState);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.id);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof kotlinx.coroutines.CoroutineId) && this.id == ((kotlinx.coroutines.CoroutineId) other).id;
    }

    public final kotlinx.coroutines.CoroutineId copy(long id) {
        return new kotlinx.coroutines.CoroutineId(id);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineId copy$default(kotlinx.coroutines.CoroutineId coroutineId, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = coroutineId.id;
        }
        return coroutineId.copy(j);
    }
}
