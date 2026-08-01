package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class Z extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f6983a;
    public final W b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(InMobiAdRequestStatus status, W adFetchError) {
        super(status.getMessage());
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adFetchError, "adFetchError");
        this.f6983a = status;
        this.b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.f6983a.getStatusCode() + ", statusMessage=" + this.f6983a.getMessage() + ", adFetchError=" + this.b + ")";
    }
}
