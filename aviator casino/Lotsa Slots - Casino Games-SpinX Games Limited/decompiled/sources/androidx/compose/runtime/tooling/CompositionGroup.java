package androidx.compose.runtime.tooling;

/* compiled from: CompositionData.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "data", "", "", "getData", "()Ljava/lang/Iterable;", "groupSize", "", "getGroupSize", "()I", "identity", "getIdentity", "()Ljava/lang/Object;", com.ironsource.X3.i.W, "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositionGroup extends androidx.compose.runtime.tooling.CompositionData {
    java.lang.Iterable<java.lang.Object> getData();

    int getGroupSize();

    java.lang.Object getIdentity();

    java.lang.Object getKey();

    java.lang.Object getNode();

    int getSlotsSize();

    java.lang.String getSourceInfo();

    /* compiled from: CompositionData.kt */
    /* renamed from: androidx.compose.runtime.tooling.CompositionGroup$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getGroupSize(androidx.compose.runtime.tooling.CompositionGroup _this) {
            return 0;
        }

        public static java.lang.Object $default$getIdentity(androidx.compose.runtime.tooling.CompositionGroup _this) {
            return null;
        }

        public static int $default$getSlotsSize(androidx.compose.runtime.tooling.CompositionGroup _this) {
            return 0;
        }
    }

    /* compiled from: CompositionData.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.runtime.tooling.CompositionGroup find(androidx.compose.runtime.tooling.CompositionGroup compositionGroup, java.lang.Object obj) {
            return androidx.compose.runtime.tooling.CompositionData.CC.$default$find(compositionGroup, obj);
        }

        @java.lang.Deprecated
        public static java.lang.Object getIdentity(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getIdentity(compositionGroup);
        }

        @java.lang.Deprecated
        public static int getGroupSize(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getGroupSize(compositionGroup);
        }

        @java.lang.Deprecated
        public static int getSlotsSize(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getSlotsSize(compositionGroup);
        }
    }
}
