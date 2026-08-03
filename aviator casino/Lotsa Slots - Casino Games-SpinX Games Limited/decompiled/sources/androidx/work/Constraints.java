package androidx.work;

/* compiled from: Constraints.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001d\u001e\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B[\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0006\u0010\n\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/work/Constraints;", "", "other", "(Landroidx/work/Constraints;)V", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresCharging", "", "requiresDeviceIdle", "requiresBatteryNotLow", "requiresStorageNotLow", "contentTriggerUpdateDelayMillis", "", "contentTriggerMaxDelayMillis", "contentUriTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "getContentTriggerMaxDelayMillis", "()J", "getContentTriggerUpdateDelayMillis", "getContentUriTriggers", "()Ljava/util/Set;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "equals", "hasContentUriTriggers", "hashCode", "", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ContentUriTrigger", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Constraints {
    public static final androidx.work.Constraints NONE = new androidx.work.Constraints(null, false, false, false, false, 0, 0, null, 255, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final java.util.Set<androidx.work.Constraints.ContentUriTrigger> contentUriTriggers;
    private final androidx.work.NetworkType requiredNetworkType;
    private final boolean requiresBatteryNotLow;
    private final boolean requiresCharging;
    private final boolean requiresDeviceIdle;
    private final boolean requiresStorageNotLow;

    public Constraints() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public Constraints(androidx.work.NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set<androidx.work.Constraints.ContentUriTrigger> contentUriTriggers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = contentUriTriggers;
    }

    public /* synthetic */ Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.work.NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    public final androidx.work.NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    public final java.util.Set<androidx.work.Constraints.ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Constraints(androidx.work.Constraints other) {
        this(other.requiredNetworkType, r3, r4, other.requiresBatteryNotLow, other.requiresStorageNotLow, other.contentTriggerUpdateDelayMillis, other.contentTriggerMaxDelayMillis, other.contentUriTriggers);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        boolean z = other.requiresCharging;
        boolean z2 = other.requiresDeviceIdle;
    }

    /* renamed from: requiresCharging, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* renamed from: requiresDeviceIdle, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* renamed from: requiresBatteryNotLow, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* renamed from: requiresStorageNotLow, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        androidx.work.Constraints constraints = (androidx.work.Constraints) other;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && this.requiredNetworkType == constraints.requiredNetworkType) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.contentTriggerMaxDelayMillis;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.contentUriTriggers.hashCode();
    }

    /* compiled from: Constraints.kt */
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "()V", "constraints", "Landroidx/work/Constraints;", "(Landroidx/work/Constraints;)V", "contentUriTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresBatteryNotLow", "", "requiresCharging", "requiresDeviceIdle", "requiresStorageNotLow", "triggerContentMaxDelay", "", "triggerContentUpdateDelay", "addContentUriTrigger", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "triggerForDescendants", "build", "setRequiredNetworkType", "networkType", "setRequiresBatteryNotLow", "setRequiresCharging", "setRequiresDeviceIdle", "setRequiresStorageNotLow", "setTriggerContentMaxDelay", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Ljava/time/Duration;", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "setTriggerContentUpdateDelay", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private java.util.Set<androidx.work.Constraints.ContentUriTrigger> contentUriTriggers;
        private androidx.work.NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkType = androidx.work.NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new java.util.LinkedHashSet();
        }

        public Builder(androidx.work.Constraints constraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.requiredNetworkType = androidx.work.NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new java.util.LinkedHashSet();
            this.requiresCharging = constraints.getRequiresCharging();
            this.requiresDeviceIdle = android.os.Build.VERSION.SDK_INT >= 23 && constraints.getRequiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.getRequiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.getRequiresStorageNotLow();
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
                this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
                this.contentUriTriggers = kotlin.collections.CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
            }
        }

        public final androidx.work.Constraints.Builder setRequiresCharging(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiredNetworkType(androidx.work.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.requiredNetworkType = networkType;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        public final androidx.work.Constraints.Builder addContentUriTrigger(android.net.Uri uri, boolean triggerForDescendants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            this.contentUriTriggers.add(new androidx.work.Constraints.ContentUriTrigger(uri, triggerForDescendants));
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentUpdateDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentUpdateDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentUpdateDelay = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentMaxDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentMaxDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentMaxDelay = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final androidx.work.Constraints build() {
            java.util.Set emptySet;
            long j;
            long j2;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                emptySet = kotlin.collections.CollectionsKt.toSet(this.contentUriTriggers);
                j = this.triggerContentUpdateDelay;
                j2 = this.triggerContentMaxDelay;
            } else {
                emptySet = kotlin.collections.SetsKt.emptySet();
                j = -1;
                j2 = -1;
            }
            return new androidx.work.Constraints(this.requiredNetworkType, this.requiresCharging, android.os.Build.VERSION.SDK_INT >= 23 && this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j, j2, emptySet);
        }
    }

    /* compiled from: Constraints.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "isTriggeredForDescendants", "", "(Landroid/net/Uri;Z)V", "()Z", "getUri", "()Landroid/net/Uri;", "equals", "other", "hashCode", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final android.net.Uri uri;

        public ContentUriTrigger(android.net.Uri uri, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        /* renamed from: isTriggeredForDescendants, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            androidx.work.Constraints.ContentUriTrigger contentUriTrigger = (androidx.work.Constraints.ContentUriTrigger) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isTriggeredForDescendants);
        }
    }
}
