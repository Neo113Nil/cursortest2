package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getSourceInfo", "()Ljava/lang/String;", "sourceInfo", "getNode", "node", "", "getData", "()Ljava/lang/Iterable;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getIdentity", "identity", "", "getGroupSize", "()I", "groupSize", "getSlotsSize", "slotsSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CompositionGroup extends androidx.compose.runtime.tooling.CompositionData {
    java.lang.Iterable<java.lang.Object> getData();

    default int getGroupSize() {
        return 0;
    }

    default java.lang.Object getIdentity() {
        return null;
    }

    java.lang.Object getKey();

    java.lang.Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    java.lang.String getSourceInfo();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.runtime.tooling.CompositionGroup find(androidx.compose.runtime.tooling.CompositionGroup compositionGroup, java.lang.Object obj) {
            return androidx.compose.runtime.tooling.CompositionGroup.super.find(obj);
        }

        @java.lang.Deprecated
        public static java.lang.Object getIdentity(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.super.getIdentity();
        }

        @java.lang.Deprecated
        public static int getGroupSize(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.super.getGroupSize();
        }

        @java.lang.Deprecated
        public static int getSlotsSize(androidx.compose.runtime.tooling.CompositionGroup compositionGroup) {
            return androidx.compose.runtime.tooling.CompositionGroup.super.getSlotsSize();
        }
    }
}
