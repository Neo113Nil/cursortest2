package com.discover.mpos.sdk.core.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/core/data/SafeIndexBasedExtractor;", "", "()V", "extractDataSafely", "", "source", "startIndex", "", "endIndex", "extractDataSafelyWithEmptyFallback", "extractSafely", "fallbackArraySize", "mpos-sdk-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class SafeIndexBasedExtractor {
    public final byte[] extractDataSafely(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return a(source, startIndex, endIndex, kotlin.ranges.RangesKt.coerceAtLeast(endIndex - startIndex, 0));
    }

    public final byte[] extractDataSafelyWithEmptyFallback(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return a(source, startIndex, endIndex, 0);
    }

    private static byte[] a(byte[] bArr, int i, int i2, int i3) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.collections.ArraysKt.copyOfRange(bArr, i, i2));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            com.discover.mpos.sdk.core.DiscoverMPos.Companion companion3 = com.discover.mpos.sdk.core.DiscoverMPos.INSTANCE;
            new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), bArr};
            m23436constructorimpl = new byte[i3];
        }
        return (byte[]) m23436constructorimpl;
    }
}
