package com.inmobi.media;

/* loaded from: classes5.dex */
public class Y extends java.lang.RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.ads.InMobiAdRequestStatus f5055a;
    public final com.inmobi.media.V b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(com.inmobi.ads.InMobiAdRequestStatus status, com.inmobi.media.V adFetchError) {
        super(status.getMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFetchError, "adFetchError");
        this.f5055a = status;
        this.b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return "AdFetchFailureException(statusCode=" + this.f5055a.getStatusCode() + ", statusMessage=" + this.f5055a.getMessage() + ", adFetchError=" + this.b + ")";
    }
}
