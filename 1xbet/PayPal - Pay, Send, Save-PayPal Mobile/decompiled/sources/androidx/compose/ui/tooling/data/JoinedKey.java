package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Landroidx/compose/ui/tooling/data/JoinedKey;", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/data/JoinedKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getLeft", "getRight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class JoinedKey {
    public static final int $stable = 8;
    private final java.lang.Object left;
    private final java.lang.Object right;

    public JoinedKey(java.lang.Object obj, java.lang.Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public final java.lang.Object getLeft() {
        return this.left;
    }

    public final java.lang.Object getRight() {
        return this.right;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JoinedKey(left=");
        sb.append(this.left);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Object obj = this.left;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.right;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.tooling.data.JoinedKey)) {
            return false;
        }
        androidx.compose.ui.tooling.data.JoinedKey joinedKey = (androidx.compose.ui.tooling.data.JoinedKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.left, joinedKey.left) && kotlin.jvm.internal.Intrinsics.areEqual(this.right, joinedKey.right);
    }

    public final androidx.compose.ui.tooling.data.JoinedKey copy(java.lang.Object left, java.lang.Object right) {
        return new androidx.compose.ui.tooling.data.JoinedKey(left, right);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getRight() {
        return this.right;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getLeft() {
        return this.left;
    }

    public static /* synthetic */ androidx.compose.ui.tooling.data.JoinedKey copy$default(androidx.compose.ui.tooling.data.JoinedKey joinedKey, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }
}
