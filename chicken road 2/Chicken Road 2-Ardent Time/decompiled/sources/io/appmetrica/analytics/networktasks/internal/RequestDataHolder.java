package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.networktasks.internal.NetworkTask.Method f7417a = io.appmetrica.analytics.networktasks.internal.NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f7418b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f7419c = null;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.Long f7420d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Integer f7421e;

    public void applySendTime(long j2) {
        this.f7420d = java.lang.Long.valueOf(j2);
        this.f7421e = java.lang.Integer.valueOf(((java.util.GregorianCalendar) java.util.Calendar.getInstance()).getTimeZone().getOffset(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j2) * 1000) / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.f7418b;
    }

    public io.appmetrica.analytics.networktasks.internal.NetworkTask.Method getMethod() {
        return this.f7417a;
    }

    public byte[] getPostData() {
        return this.f7419c;
    }

    public java.lang.Long getSendTimestamp() {
        return this.f7420d;
    }

    public java.lang.Integer getSendTimezoneSec() {
        return this.f7421e;
    }

    public void setHeader(java.lang.String str, java.lang.String... strArr) {
        this.f7418b.put(str, java.util.Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f7417a = io.appmetrica.analytics.networktasks.internal.NetworkTask.Method.POST;
        this.f7419c = bArr;
    }
}
