package com.datadog.trace.core;

/* loaded from: classes3.dex */
public interface CoreSpan<T extends com.datadog.trace.core.CoreSpan<T>> {
    /* renamed from: addThrowable */
    T mo10033addThrowable(java.lang.Throwable th);

    long getDurationNano();

    int getError();

    short getHttpStatusCode();

    /* renamed from: getLocalRootSpan */
    T mo10034getLocalRootSpan();

    java.lang.CharSequence getOperationName();

    java.lang.CharSequence getOrigin();

    long getParentId();

    java.lang.CharSequence getResourceName();

    java.lang.String getServiceName();

    long getSpanId();

    long getStartTime();

    <U> U getTag(java.lang.CharSequence charSequence);

    <U> U getTag(java.lang.CharSequence charSequence, U u);

    com.datadog.trace.api.DDTraceId getTraceId();

    java.lang.CharSequence getType();

    boolean hasSamplingPriority();

    boolean isForceKeep();

    boolean isMeasured();

    boolean isTopLevel();

    void processTagsAndBaggage(com.datadog.trace.core.MetadataConsumer metadataConsumer);

    T removeTag(java.lang.String str);

    /* renamed from: setErrorMessage */
    T mo10035setErrorMessage(java.lang.String str);

    T setFlag(java.lang.CharSequence charSequence, boolean z);

    /* renamed from: setMeasured */
    T mo10036setMeasured(boolean z);

    /* renamed from: setMetric */
    T mo10037setMetric(java.lang.CharSequence charSequence, double d);

    T setMetric(java.lang.CharSequence charSequence, float f);

    /* renamed from: setMetric */
    T mo10038setMetric(java.lang.CharSequence charSequence, int i);

    /* renamed from: setMetric */
    T mo10039setMetric(java.lang.CharSequence charSequence, long j);

    /* renamed from: setSamplingPriority */
    T mo10040setSamplingPriority(int i, int i2);

    T setSamplingPriority(int i, java.lang.CharSequence charSequence, double d, int i2);

    T setSpanSamplingPriority(double d, int i);

    /* renamed from: setTag */
    T mo10041setTag(java.lang.String str, double d);

    /* renamed from: setTag */
    T mo10042setTag(java.lang.String str, int i);

    /* renamed from: setTag */
    T mo10043setTag(java.lang.String str, long j);

    /* renamed from: setTag */
    T mo10044setTag(java.lang.String str, java.lang.CharSequence charSequence);

    /* renamed from: setTag */
    T mo10045setTag(java.lang.String str, java.lang.Number number);

    /* renamed from: setTag */
    T mo10046setTag(java.lang.String str, java.lang.Object obj);

    /* renamed from: setTag */
    T mo10047setTag(java.lang.String str, java.lang.String str2);

    /* renamed from: setTag */
    T mo10048setTag(java.lang.String str, boolean z);
}
