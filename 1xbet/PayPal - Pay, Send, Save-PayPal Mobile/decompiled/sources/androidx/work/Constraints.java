package androidx.work;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 92\u00020\u0001:\u0003:;9B1\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0018J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0018J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0018J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010(\u001a\u0004\u0018\u00010%8G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b5\u00104R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108"}, d2 = {"Landroidx/work/Constraints;", "", "Landroidx/work/NetworkType;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/Constraints$ContentUriTrigger;", "contentUriTriggers", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkRequestCompat", "(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/Constraints;)V", "()Z", "hasContentUriTriggers", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/work/NetworkType;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "Landroid/net/NetworkRequest;", "getRequiredNetworkRequest", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "Landroidx/work/impl/utils/NetworkRequestCompat;", "getRequiredNetworkRequestCompat$work_runtime_release", "()Landroidx/work/impl/utils/NetworkRequestCompat;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "J", "getContentTriggerUpdateDelayMillis", "()J", "getContentTriggerMaxDelayMillis", "Ljava/util/Set;", "getContentUriTriggers", "()Ljava/util/Set;", "Companion", "Builder", "ContentUriTrigger"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constraints {
    public static final androidx.work.Constraints NONE = new androidx.work.Constraints(null, false, false, false, 15, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final java.util.Set<androidx.work.Constraints.ContentUriTrigger> contentUriTriggers;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;
    private final androidx.work.impl.utils.NetworkRequestCompat requiredNetworkRequestCompat;
    private final androidx.work.NetworkType requiredNetworkType;

    public final androidx.work.NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final android.net.NetworkRequest getRequiredNetworkRequest() {
        return this.requiredNetworkRequestCompat.getNetworkRequest();
    }

    /* renamed from: getRequiredNetworkRequestCompat$work_runtime_release, reason: from getter */
    public final androidx.work.impl.utils.NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
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

    public /* synthetic */ Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.work.NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3) {
        this(networkType, z, false, z2, z3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
    }

    public /* synthetic */ Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.work.NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(networkType, z, z2, z3, z4, -1L, 0L, null, 192, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
    }

    public /* synthetic */ Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.work.NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    public Constraints(androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set<androidx.work.Constraints.ContentUriTrigger> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.requiredNetworkRequestCompat = new androidx.work.impl.utils.NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = networkType;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighSpeedVideoFpsRanges = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public /* synthetic */ Constraints(androidx.work.impl.utils.NetworkRequestCompat networkRequestCompat, androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(networkRequestCompat, (i & 2) != 0 ? androidx.work.NetworkType.NOT_REQUIRED : networkType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? z4 : false, (i & 64) != 0 ? -1L : j, (i & 128) == 0 ? j2 : -1L, (i & 256) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    public Constraints(androidx.work.impl.utils.NetworkRequestCompat networkRequestCompat, androidx.work.NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set<androidx.work.Constraints.ContentUriTrigger> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequestCompat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.requiredNetworkRequestCompat = networkRequestCompat;
        this.requiredNetworkType = networkType;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighSpeedVideoFpsRanges = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public Constraints(androidx.work.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        this.getHighSpeedVideoSizes = constraints.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = constraints.Camera2StreamConfigurationMap;
        this.requiredNetworkRequestCompat = constraints.requiredNetworkRequestCompat;
        this.requiredNetworkType = constraints.requiredNetworkType;
        this.getHighSpeedVideoFpsRangesFor = constraints.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = constraints.getHighSpeedVideoFpsRanges;
        this.contentUriTriggers = constraints.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = constraints.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = constraints.contentTriggerMaxDelayMillis;
    }

    /* renamed from: requiresCharging, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: requiresDeviceIdle, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: requiresBatteryNotLow, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: requiresStorageNotLow, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        androidx.work.Constraints constraints = (androidx.work.Constraints) other;
        if (this.getHighSpeedVideoSizes == constraints.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == constraints.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == constraints.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == constraints.getHighSpeedVideoFpsRanges && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && kotlin.jvm.internal.Intrinsics.areEqual(getRequiredNetworkRequest(), constraints.getRequiredNetworkRequest()) && this.requiredNetworkType == constraints.requiredNetworkType) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.requiredNetworkType.hashCode();
        boolean z = this.getHighSpeedVideoSizes;
        boolean z2 = this.Camera2StreamConfigurationMap;
        boolean z3 = this.getHighSpeedVideoFpsRangesFor;
        boolean z4 = this.getHighSpeedVideoFpsRanges;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.contentTriggerMaxDelayMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int hashCode2 = this.contentUriTriggers.hashCode();
        android.net.NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return (((((((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + hashCode2) * 31) + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.requiredNetworkType);
        sb.append(", requiresCharging=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.contentTriggerUpdateDelayMillis);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.contentTriggerMaxDelayMillis);
        sb.append(", contentUriTriggers=");
        sb.append(this.contentUriTriggers);
        sb.append(", }");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\nJ\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$¢\u0006\u0004\b\"\u0010%J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020$¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010)\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010/R\u0016\u00101\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010*R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u001c\u00103\u001a\b\u0012\u0004\u0012\u000208078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00109"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "<init>", "()V", "Landroidx/work/Constraints;", "constraints", "(Landroidx/work/Constraints;)V", "", "requiresCharging", "setRequiresCharging", "(Z)Landroidx/work/Constraints$Builder;", "requiresDeviceIdle", "setRequiresDeviceIdle", "Landroidx/work/NetworkType;", "networkType", "setRequiredNetworkType", "(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "Landroid/net/NetworkRequest;", "networkRequest", "setRequiredNetworkRequest", "(Landroid/net/NetworkRequest;Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "requiresBatteryNotLow", "setRequiresBatteryNotLow", "requiresStorageNotLow", "setRequiresStorageNotLow", "Landroid/net/Uri;", "uri", "triggerForDescendants", "addContentUriTrigger", "(Landroid/net/Uri;Z)Landroidx/work/Constraints$Builder;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setTriggerContentUpdateDelay", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/Constraints$Builder;", "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/Constraints$Builder;", "setTriggerContentMaxDelay", "build", "()Landroidx/work/Constraints;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "getHighSpeedVideoSizes", "Landroidx/work/impl/utils/NetworkRequestCompat;", "Landroidx/work/impl/utils/NetworkRequestCompat;", "Landroidx/work/NetworkType;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "J", "getOutputFormats", "", "Landroidx/work/Constraints$ContentUriTrigger;", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.util.Set<androidx.work.Constraints.ContentUriTrigger> getInputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.work.NetworkType getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.work.impl.utils.NetworkRequestCompat getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private long getOutputMinFrameDuration;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;
        private long getOutputFormats;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        public Builder() {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.NetworkRequestCompat(null, 1, null);
            this.getHighSpeedVideoFpsRangesFor = androidx.work.NetworkType.NOT_REQUIRED;
            this.getOutputMinFrameDuration = -1L;
            this.getOutputFormats = -1L;
            this.getInputSizeshNQ4ISI = new java.util.LinkedHashSet();
        }

        public Builder(androidx.work.Constraints constraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.NetworkRequestCompat(null, 1, null);
            this.getHighSpeedVideoFpsRangesFor = androidx.work.NetworkType.NOT_REQUIRED;
            this.getOutputMinFrameDuration = -1L;
            this.getOutputFormats = -1L;
            this.getInputSizeshNQ4ISI = new java.util.LinkedHashSet();
            this.getHighSpeedVideoFpsRanges = constraints.getGetHighSpeedVideoSizes();
            this.getHighSpeedVideoSizes = constraints.getCamera2StreamConfigurationMap();
            this.getHighSpeedVideoFpsRangesFor = constraints.getRequiredNetworkType();
            this.Camera2StreamConfigurationMap = constraints.getGetHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoSizesFor = constraints.getGetHighSpeedVideoFpsRanges();
            this.getOutputMinFrameDuration = constraints.getContentTriggerUpdateDelayMillis();
            this.getOutputFormats = constraints.getContentTriggerMaxDelayMillis();
            this.getInputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
        }

        public final androidx.work.Constraints.Builder setRequiresCharging(boolean requiresCharging) {
            this.getHighSpeedVideoFpsRanges = requiresCharging;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.getHighSpeedVideoSizes = requiresDeviceIdle;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiredNetworkType(androidx.work.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            this.getHighSpeedVideoFpsRangesFor = networkType;
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.NetworkRequestCompat(null, 1, null);
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiredNetworkRequest(android.net.NetworkRequest networkRequest, androidx.work.NetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.work.impl.utils.NetworkRequest30.INSTANCE.getNetworkSpecifier(networkRequest) != null) {
                    throw new java.lang.IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.work.impl.utils.NetworkRequestCompat(networkRequest);
                this.getHighSpeedVideoFpsRangesFor = androidx.work.NetworkType.NOT_REQUIRED;
                return this;
            }
            this.getHighSpeedVideoFpsRangesFor = networkType;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.Camera2StreamConfigurationMap = requiresBatteryNotLow;
            return this;
        }

        public final androidx.work.Constraints.Builder setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.getHighSpeedVideoSizesFor = requiresStorageNotLow;
            return this;
        }

        public final androidx.work.Constraints.Builder addContentUriTrigger(android.net.Uri uri, boolean triggerForDescendants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.getInputSizeshNQ4ISI.add(new androidx.work.Constraints.ContentUriTrigger(uri, triggerForDescendants));
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentUpdateDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.getOutputMinFrameDuration = timeUnit.toMillis(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentUpdateDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            this.getOutputMinFrameDuration = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentMaxDelay(long duration, java.util.concurrent.TimeUnit timeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
            this.getOutputFormats = timeUnit.toMillis(duration);
            return this;
        }

        public final androidx.work.Constraints.Builder setTriggerContentMaxDelay(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            this.getOutputFormats = androidx.work.impl.utils.DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final androidx.work.Constraints build() {
            java.util.Set set = kotlin.collections.CollectionsKt.toSet(this.getInputSizeshNQ4ISI);
            return new androidx.work.Constraints(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputFormats, set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Z", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final android.net.Uri uri;

        public ContentUriTrigger(android.net.Uri uri, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
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

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            androidx.work.Constraints.ContentUriTrigger contentUriTrigger = (androidx.work.Constraints.ContentUriTrigger) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public final int hashCode() {
            return (this.uri.hashCode() * 31) + java.lang.Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }
}
