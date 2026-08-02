package com.paypal.oslo.core.network.http.cache;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/http/cache/CacheControl;", "", "<init>", "()V", "ForceNetwork", "MaxAge", "Lcom/paypal/oslo/core/network/http/cache/CacheControl$ForceNetwork;", "Lcom/paypal/oslo/core/network/http/cache/CacheControl$MaxAge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CacheControl {
    private CacheControl() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/cache/CacheControl$ForceNetwork;", "Lcom/paypal/oslo/core/network/http/cache/CacheControl;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ForceNetwork extends com.paypal.oslo.core.network.http.cache.CacheControl {
        public static final com.paypal.oslo.core.network.http.cache.CacheControl.ForceNetwork INSTANCE = new com.paypal.oslo.core.network.http.cache.CacheControl.ForceNetwork();

        private ForceNetwork() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/http/cache/CacheControl$MaxAge;", "Lcom/paypal/oslo/core/network/http/cache/CacheControl;", "Lkotlin/time/Duration;", "ttl", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-UwyO8pc", "()J", "component1", "copy-LRDsOJo", "(J)Lcom/paypal/oslo/core/network/http/cache/CacheControl$MaxAge;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getTtl-UwyO8pc"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxAge extends com.paypal.oslo.core.network.http.cache.CacheControl {
        private final long ttl;

        private MaxAge(long j) {
            super(null);
            this.ttl = j;
        }

        /* renamed from: getTtl-UwyO8pc, reason: not valid java name */
        public final long m11665getTtlUwyO8pc() {
            return this.ttl;
        }

        public final java.lang.String toString() {
            java.lang.String m23977toStringimpl = kotlin.time.Duration.m23977toStringimpl(this.ttl);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxAge(ttl=");
            sb.append(m23977toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return kotlin.time.Duration.m23960hashCodeimpl(this.ttl);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge) && kotlin.time.Duration.m23947equalsimpl0(this.ttl, ((com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge) other).ttl);
        }

        /* renamed from: copy-LRDsOJo, reason: not valid java name */
        public final com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge m11664copyLRDsOJo(long ttl) {
            return new com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge(ttl, null);
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getTtl() {
            return this.ttl;
        }

        /* renamed from: copy-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge m11662copyLRDsOJo$default(com.paypal.oslo.core.network.http.cache.CacheControl.MaxAge maxAge, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = maxAge.ttl;
            }
            return maxAge.m11664copyLRDsOJo(j);
        }

        public /* synthetic */ MaxAge(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public /* synthetic */ CacheControl(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
