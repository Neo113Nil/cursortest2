package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "getHighSpeedVideoFpsRanges", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class EventStorageImpl$deleteInternal$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> {
    final /* synthetic */ java.io.File $getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
        return getHighSpeedVideoFpsRanges(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r3.$getHighSpeedVideoFpsRangesFor.delete() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean getHighSpeedVideoFpsRanges(int i) {
        boolean z;
        try {
            if (this.$getHighSpeedVideoFpsRangesFor.exists()) {
            }
            z = true;
        } catch (java.io.IOException e) {
            com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to delete to file, attempt number ".concat(java.lang.String.valueOf(i)), e);
        }
        return java.lang.Boolean.valueOf(z);
        z = false;
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStorageImpl$deleteInternal$1(java.io.File file) {
        super(1);
        this.$getHighSpeedVideoFpsRangesFor = file;
    }
}
