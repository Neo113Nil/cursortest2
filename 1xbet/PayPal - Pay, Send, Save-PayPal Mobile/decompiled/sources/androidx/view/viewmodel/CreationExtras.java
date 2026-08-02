package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b&\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u0018B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0014\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "<init>", "()V", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "key", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "extras", "Ljava/util/Map;", "getExtras$lifecycle_viewmodel", "()Ljava/util/Map;", "Companion", "Key", "Empty"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CreationExtras {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.viewmodel.CreationExtras.Companion INSTANCE = new androidx.view.viewmodel.CreationExtras.Companion(null);
    private final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> extras = new java.util.LinkedHashMap();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "T", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Key<T> {
    }

    public abstract <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> key);

    public final java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, java.lang.Object> getExtras$lifecycle_viewmodel() {
        return this.extras;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof androidx.view.viewmodel.CreationExtras) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, ((androidx.view.viewmodel.CreationExtras) other).extras);
    }

    public int hashCode() {
        return this.extras.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreationExtras(extras=");
        sb.append(this.extras);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "<init>", "()V", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "key", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends androidx.view.viewmodel.CreationExtras {
        public static final androidx.lifecycle.viewmodel.CreationExtras.Empty INSTANCE = new androidx.lifecycle.viewmodel.CreationExtras.Empty();

        private Empty() {
        }

        @Override // androidx.view.viewmodel.CreationExtras
        public final <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0006\b\u0000\u0010\u0004\u0018\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Companion;", "", "<init>", "()V", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Key", "()Landroidx/lifecycle/viewmodel/CreationExtras$Key;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final /* synthetic */ <T> androidx.lifecycle.viewmodel.CreationExtras.Key<T> Key() {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            return new androidx.lifecycle.viewmodel.CreationExtras.Key<T>() { // from class: androidx.lifecycle.viewmodel.CreationExtras$Companion$Key$1
            };
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
