package com.goldenboot.saga.zone;

import androidx.lifecycle.ClipboardSequence;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PluginVersion extends TransitionTimer implements NavBarInstantiator {
    public final Map growPayload = new LinkedHashMap();
    public static final BounceHandler injectMetric = new BounceHandler(null);
    public static final ClipboardSequence.FeedbackFlow detachStream = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements ClipboardSequence.FeedbackFlow {
        @Override // androidx.lifecycle.ClipboardSequence.FeedbackFlow
        public TransitionTimer evictLayout(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PluginVersion();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PluginVersion evictLayout(AlphaThread viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (PluginVersion) new androidx.lifecycle.ClipboardSequence(viewModelStore, PluginVersion.detachStream, null, 4, null).growPayload(PluginVersion.class);
        }

        public BounceHandler() {
        }
    }

    public final void applyTask(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        AlphaThread alphaThread = (AlphaThread) this.growPayload.remove(backStackEntryId);
        if (alphaThread != null) {
            alphaThread.evictLayout();
        }
    }

    @Override // com.goldenboot.saga.zone.NavBarInstantiator
    public AlphaThread evictLayout(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        AlphaThread alphaThread = (AlphaThread) this.growPayload.get(backStackEntryId);
        if (alphaThread != null) {
            return alphaThread;
        }
        AlphaThread alphaThread2 = new AlphaThread();
        this.growPayload.put(backStackEntryId, alphaThread2);
        return alphaThread2;
    }

    @Override // com.goldenboot.saga.zone.TransitionTimer
    public void flushSample() {
        Iterator it = this.growPayload.values().iterator();
        while (it.hasNext()) {
            ((AlphaThread) it.next()).evictLayout();
        }
        this.growPayload.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.growPayload.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
