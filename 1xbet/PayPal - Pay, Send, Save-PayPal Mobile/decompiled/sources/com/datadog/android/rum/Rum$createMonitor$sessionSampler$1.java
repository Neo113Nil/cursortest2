package com.datadog.android.rum;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class Rum$createMonitor$sessionSampler$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.ULong> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.ULong invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.ULong.m23493boximpl(((com.datadog.android.rum.internal.sampling.SessionSamplingIdProvider) this.receiver).m10023provideIdI7RO_PI(str2));
    }

    Rum$createMonitor$sessionSampler$1(java.lang.Object obj) {
        super(1, obj, com.datadog.android.rum.internal.sampling.SessionSamplingIdProvider.class, "provideId", "provideId-I7RO_PI(Ljava/lang/String;)J", 0);
    }
}
