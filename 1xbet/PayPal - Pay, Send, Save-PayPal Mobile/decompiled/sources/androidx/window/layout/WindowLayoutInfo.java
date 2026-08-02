package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "", "Landroidx/window/layout/DisplayFeature;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getDisplayFeatures", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowLayoutInfo {
    private final java.util.List<androidx.window.layout.DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(java.util.List<? extends androidx.window.layout.DisplayFeature> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.displayFeatures = list;
    }

    public final java.util.List<androidx.window.layout.DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayFeatures, ((androidx.window.layout.WindowLayoutInfo) other).displayFeatures);
    }

    public final int hashCode() {
        return this.displayFeatures.hashCode();
    }
}
