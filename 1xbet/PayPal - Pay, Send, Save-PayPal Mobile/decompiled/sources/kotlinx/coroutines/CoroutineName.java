package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoroutineName extends kotlin.coroutines.AbstractCoroutineContextElement {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineName.Companion INSTANCE = new kotlinx.coroutines.CoroutineName.Companion(null);
    private final java.lang.String name;

    public final java.lang.String getName() {
        return this.name;
    }

    public CoroutineName(java.lang.String str) {
        super(INSTANCE);
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineName;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.CoroutineName$Key, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineName> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CoroutineName(");
        sb.append(this.name);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof kotlinx.coroutines.CoroutineName) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((kotlinx.coroutines.CoroutineName) other).name);
    }

    public final kotlinx.coroutines.CoroutineName copy(java.lang.String name2) {
        return new kotlinx.coroutines.CoroutineName(name2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineName copy$default(kotlinx.coroutines.CoroutineName coroutineName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = coroutineName.name;
        }
        return coroutineName.copy(str);
    }
}
