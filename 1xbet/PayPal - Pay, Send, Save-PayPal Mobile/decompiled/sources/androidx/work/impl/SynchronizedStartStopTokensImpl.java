package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0002\u001a\u00020\nH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Landroidx/work/impl/SynchronizedStartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "p0", "<init>", "(Landroidx/work/impl/StartStopTokens;)V", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/StartStopToken;", "tokenFor", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "remove", "", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Camera2StreamConfigurationMap", "Landroidx/work/impl/StartStopTokens;", "getHighSpeedVideoSizes", "", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SynchronizedStartStopTokensImpl implements androidx.work.impl.StartStopTokens {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.work.impl.StartStopTokens getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    public SynchronizedStartStopTokensImpl(androidx.work.impl.StartStopTokens startStopTokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startStopTokens, "");
        this.getHighSpeedVideoSizes = startStopTokens;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public final androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkGenerationalId p0) {
        androidx.work.impl.StartStopToken startStopToken;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            startStopToken = this.getHighSpeedVideoSizes.tokenFor(p0);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkGenerationalId p0) {
        androidx.work.impl.StartStopToken remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            remove = this.getHighSpeedVideoSizes.remove(p0);
        }
        return remove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final java.util.List<androidx.work.impl.StartStopToken> remove(java.lang.String p0) {
        java.util.List<androidx.work.impl.StartStopToken> remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            remove = this.getHighSpeedVideoSizes.remove(p0);
        }
        return remove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(androidx.work.impl.model.WorkGenerationalId p0) {
        boolean contains;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            contains = this.getHighSpeedVideoSizes.contains(p0);
        }
        return contains;
    }
}
