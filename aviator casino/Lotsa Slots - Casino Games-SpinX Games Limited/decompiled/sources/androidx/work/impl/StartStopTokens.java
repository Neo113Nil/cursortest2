package androidx.work.impl;

/* compiled from: StartStopToken.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "()V", "lock", "runs", "", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/StartStopToken;", "contains", "", "id", "remove", "spec", "Landroidx/work/impl/model/WorkSpec;", "", "workSpecId", "", "tokenFor", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class StartStopTokens {
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> runs = new java.util.LinkedHashMap();

    public final androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkGenerationalId id) {
        androidx.work.impl.StartStopToken startStopToken;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> map = this.runs;
            androidx.work.impl.StartStopToken startStopToken2 = map.get(id);
            if (startStopToken2 == null) {
                startStopToken2 = new androidx.work.impl.StartStopToken(id);
                map.put(id, startStopToken2);
            }
            startStopToken = startStopToken2;
        }
        return startStopToken;
    }

    public final androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkGenerationalId id) {
        androidx.work.impl.StartStopToken remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            remove = this.runs.remove(id);
        }
        return remove;
    }

    public final java.util.List<androidx.work.impl.StartStopToken> remove(java.lang.String workSpecId) {
        java.util.List<androidx.work.impl.StartStopToken> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> map = this.runs;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> entry : map.entrySet()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.util.Iterator it = linkedHashMap2.keySet().iterator();
            while (it.hasNext()) {
                this.runs.remove((androidx.work.impl.model.WorkGenerationalId) it.next());
            }
            list = kotlin.collections.CollectionsKt.toList(linkedHashMap2.values());
        }
        return list;
    }

    public final boolean contains(androidx.work.impl.model.WorkGenerationalId id) {
        boolean containsKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            containsKey = this.runs.containsKey(id);
        }
        return containsKey;
    }

    public final androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkSpec spec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(androidx.work.impl.model.WorkSpecKt.generationalId(spec));
    }

    public final androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkSpec spec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(androidx.work.impl.model.WorkSpecKt.generationalId(spec));
    }
}
