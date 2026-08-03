package androidx.compose.runtime;

/* compiled from: OpaqueKey.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", com.ironsource.X3.i.W, "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpaqueKey {
    public static final int $stable = 0;
    private final java.lang.String key;

    public static /* synthetic */ androidx.compose.runtime.OpaqueKey copy$default(androidx.compose.runtime.OpaqueKey opaqueKey, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public final androidx.compose.runtime.OpaqueKey copy(java.lang.String key) {
        return new androidx.compose.runtime.OpaqueKey(key);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.runtime.OpaqueKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.key, ((androidx.compose.runtime.OpaqueKey) other).key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public java.lang.String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }

    public OpaqueKey(java.lang.String str) {
        this.key = str;
    }

    public final java.lang.String getKey() {
        return this.key;
    }
}
