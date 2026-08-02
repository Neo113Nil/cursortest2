package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\f"}, d2 = {"Landroidx/paging/PagingConfig;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSize", "maxSize", "jumpThreshold", "<init>", "(IIZIII)V", com.visa.cbp.getEncExpo.warmup, "Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagingConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.paging.PagingConfig.Companion INSTANCE = new androidx.paging.PagingConfig.Companion(null);
    public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
    public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
    public final boolean enablePlaceholders;
    public final int initialLoadSize;
    public final int jumpThreshold;
    public final int maxSize;
    public final int pageSize;
    public final int prefetchDistance;

    public PagingConfig(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.pageSize = i;
        this.prefetchDistance = i2;
        this.enablePlaceholders = z;
        this.initialLoadSize = i3;
        this.maxSize = i4;
        this.jumpThreshold = i5;
        if (!z && i2 == 0) {
            throw new java.lang.IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i4 == Integer.MAX_VALUE || i4 >= (i2 * 2) + i) {
            if (i5 != Integer.MIN_VALUE && i5 <= 0) {
                throw new java.lang.IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
            sb.append(i);
            sb.append(", prefetchDist=");
            sb.append(i2);
            sb.append(", maxSize=");
            sb.append(i4);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public /* synthetic */ PagingConfig(int i, int i2, boolean z, int i3, int i4, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i6 & 2) != 0 ? i : i2, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? i * 3 : i3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i4, (i6 & 32) != 0 ? Integer.MIN_VALUE : i5);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/paging/PagingConfig$Companion;", "", "<init>", "()V", "", "MAX_SIZE_UNBOUNDED", com.visa.cbp.getEncExpo.warmup, "getMAX_SIZE_UNBOUNDED$annotations", "DEFAULT_INITIAL_PAGE_MULTIPLIER"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PagingConfig(int i, int i2, boolean z, int i3, int i4) {
        this(i, i2, z, i3, i4, 0, 32, null);
    }

    public PagingConfig(int i, int i2, boolean z, int i3) {
        this(i, i2, z, i3, 0, 0, 48, null);
    }

    public PagingConfig(int i, int i2, boolean z) {
        this(i, i2, z, 0, 0, 0, 56, null);
    }

    public PagingConfig(int i, int i2) {
        this(i, i2, false, 0, 0, 0, 60, null);
    }

    public PagingConfig(int i) {
        this(i, 0, false, 0, 0, 0, 62, null);
    }
}
