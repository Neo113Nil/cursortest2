package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "<init>", "()V", "Landroidx/work/impl/model/WorkGenerationalId;", "p0", "Landroidx/work/impl/StartStopToken;", "tokenFor", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "remove", "", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class StartStopTokensImpl implements androidx.work.impl.StartStopTokens {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public final androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkGenerationalId p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> map = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.work.impl.StartStopToken startStopToken = map.get(p0);
        if (startStopToken == null) {
            startStopToken = new androidx.work.impl.StartStopToken(p0);
            map.put(p0, startStopToken);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkGenerationalId p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.remove(p0);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final java.util.List<androidx.work.impl.StartStopToken> remove(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Map<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> map = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<androidx.work.impl.model.WorkGenerationalId, androidx.work.impl.StartStopToken> entry : map.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey().getWorkSpecId(), p0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove((androidx.work.impl.model.WorkGenerationalId) it.next());
        }
        return kotlin.collections.CollectionsKt.toList(linkedHashMap2.values());
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(androidx.work.impl.model.WorkGenerationalId p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(p0);
    }
}
