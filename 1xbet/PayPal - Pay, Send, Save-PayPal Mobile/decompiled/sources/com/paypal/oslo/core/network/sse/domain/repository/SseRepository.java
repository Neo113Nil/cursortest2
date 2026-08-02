package com.paypal.oslo.core.network.sse.domain.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJK\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "", "", "endpoint", "", "headers", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/model/SseEvent;", "connect", "(Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;)Lkotlinx/coroutines/flow/Flow;", "Body"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SseRepository {
    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.network.sse.model.SseEvent>> connect(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ kotlinx.coroutines.flow.Flow connect$default(com.paypal.oslo.core.network.sse.domain.repository.SseRepository sseRepository, java.lang.String str, java.util.Map map, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
        }
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            body = null;
        }
        return sseRepository.connect(str, map, body);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;", "", "", "content", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContent", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Body {
        private final java.lang.String content;
        private final java.lang.String mimeType;

        public Body(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.content = str;
            this.mimeType = str2;
        }

        public final java.lang.String getContent() {
            return this.content;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.content;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Body(content=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.content.hashCode() * 31) + this.mimeType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body)) {
                return false;
            }
            com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body = (com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.content, body.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, body.mimeType);
        }

        public final com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body copy(java.lang.String content, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            return new com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body(content, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContent() {
            return this.content;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body copy$default(com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = body.content;
            }
            if ((i & 2) != 0) {
                str2 = body.mimeType;
            }
            return body.copy(str, str2);
        }
    }
}
