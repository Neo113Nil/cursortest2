package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Landroidx/paging/LoadState;", "", "", "p0", "<init>", "(Z)V", "endOfPaginationReached", "Z", "getEndOfPaginationReached", "()Z", "NotLoading", "Loading", "Error", "Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState$NotLoading;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LoadState {
    private final boolean endOfPaginationReached;

    private LoadState(boolean z) {
        this.endOfPaginationReached = z;
    }

    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/paging/LoadState$NotLoading;", "Landroidx/paging/LoadState;", "", "endOfPaginationReached", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotLoading extends androidx.paging.LoadState {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.paging.LoadState.NotLoading.Companion INSTANCE = new androidx.paging.LoadState.NotLoading.Companion(null);
        private static final androidx.paging.LoadState.NotLoading Complete = new androidx.paging.LoadState.NotLoading(true);
        private static final androidx.paging.LoadState.NotLoading Incomplete = new androidx.paging.LoadState.NotLoading(false);

        public NotLoading(boolean z) {
            super(z, null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotLoading(endOfPaginationReached=");
            sb.append(getEndOfPaginationReached());
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof androidx.paging.LoadState.NotLoading) && getEndOfPaginationReached() == ((androidx.paging.LoadState.NotLoading) other).getEndOfPaginationReached();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(getEndOfPaginationReached());
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/paging/LoadState$NotLoading$Companion;", "", "<init>", "()V", "Landroidx/paging/LoadState$NotLoading;", "Complete", "Landroidx/paging/LoadState$NotLoading;", "getComplete$paging_common", "()Landroidx/paging/LoadState$NotLoading;", "Incomplete", "getIncomplete$paging_common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public final androidx.paging.LoadState.NotLoading getComplete$paging_common() {
                return androidx.paging.LoadState.NotLoading.Complete;
            }

            public final androidx.paging.LoadState.NotLoading getIncomplete$paging_common() {
                return androidx.paging.LoadState.NotLoading.Incomplete;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/paging/LoadState$Loading;", "Landroidx/paging/LoadState;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends androidx.paging.LoadState {
        public static final androidx.paging.LoadState.Loading INSTANCE = new androidx.paging.LoadState.Loading();

        private Loading() {
            super(false, null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(endOfPaginationReached=");
            sb.append(getEndOfPaginationReached());
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof androidx.paging.LoadState.Loading) && getEndOfPaginationReached() == ((androidx.paging.LoadState.Loading) other).getEndOfPaginationReached();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(getEndOfPaginationReached());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/paging/LoadState$Error;", "Landroidx/paging/LoadState;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error extends androidx.paging.LoadState {
        private final java.lang.Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.Throwable th) {
            super(false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.error = th;
        }

        public final java.lang.Throwable getError() {
            return this.error;
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof androidx.paging.LoadState.Error)) {
                return false;
            }
            androidx.paging.LoadState.Error error = (androidx.paging.LoadState.Error) other;
            return getEndOfPaginationReached() == error.getEndOfPaginationReached() && kotlin.jvm.internal.Intrinsics.areEqual(this.error, error.error);
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(getEndOfPaginationReached()) + this.error.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(endOfPaginationReached=");
            sb.append(getEndOfPaginationReached());
            sb.append(", error=");
            sb.append(this.error);
            sb.append(')');
            return sb.toString();
        }
    }

    public /* synthetic */ LoadState(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
