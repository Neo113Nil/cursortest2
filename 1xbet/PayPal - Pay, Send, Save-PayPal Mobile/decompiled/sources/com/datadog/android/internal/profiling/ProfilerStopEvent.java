package com.datadog.android.internal.profiling;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/datadog/android/internal/profiling/ProfilerStopEvent;", "", "<init>", "()V", "TTID", "Lcom/datadog/android/internal/profiling/ProfilerStopEvent$TTID;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ProfilerStopEvent {
    private ProfilerStopEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/internal/profiling/ProfilerStopEvent$TTID;", "Lcom/datadog/android/internal/profiling/ProfilerStopEvent;", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "rumContext", "<init>", "(Lcom/datadog/android/internal/profiling/TTIDRumContext;)V", "component1", "()Lcom/datadog/android/internal/profiling/TTIDRumContext;", "copy", "(Lcom/datadog/android/internal/profiling/TTIDRumContext;)Lcom/datadog/android/internal/profiling/ProfilerStopEvent$TTID;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "getRumContext"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TTID extends com.datadog.android.internal.profiling.ProfilerStopEvent {
        private final com.datadog.android.internal.profiling.TTIDRumContext rumContext;

        public /* synthetic */ TTID(com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tTIDRumContext);
        }

        public final com.datadog.android.internal.profiling.TTIDRumContext getRumContext() {
            return this.rumContext;
        }

        public TTID(com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext) {
            super(null);
            this.rumContext = tTIDRumContext;
        }

        public final java.lang.String toString() {
            com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext = this.rumContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TTID(rumContext=");
            sb.append(tTIDRumContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext = this.rumContext;
            if (tTIDRumContext == null) {
                return 0;
            }
            return tTIDRumContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.internal.profiling.ProfilerStopEvent.TTID) && kotlin.jvm.internal.Intrinsics.areEqual(this.rumContext, ((com.datadog.android.internal.profiling.ProfilerStopEvent.TTID) other).rumContext);
        }

        public final com.datadog.android.internal.profiling.ProfilerStopEvent.TTID copy(com.datadog.android.internal.profiling.TTIDRumContext rumContext) {
            return new com.datadog.android.internal.profiling.ProfilerStopEvent.TTID(rumContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.internal.profiling.TTIDRumContext getRumContext() {
            return this.rumContext;
        }

        public static /* synthetic */ com.datadog.android.internal.profiling.ProfilerStopEvent.TTID copy$default(com.datadog.android.internal.profiling.ProfilerStopEvent.TTID ttid, com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tTIDRumContext = ttid.rumContext;
            }
            return ttid.copy(tTIDRumContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TTID() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ProfilerStopEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
