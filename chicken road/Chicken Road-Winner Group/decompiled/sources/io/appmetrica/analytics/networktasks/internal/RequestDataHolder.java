package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f8914a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f8915b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f8916c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f8917d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8918e;

    public void applySendTime(long j3) {
        this.f8917d = Long.valueOf(j3);
        this.f8918e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j3) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f8915b;
    }

    public NetworkTask.Method getMethod() {
        return this.f8914a;
    }

    public byte[] getPostData() {
        return this.f8916c;
    }

    public Long getSendTimestamp() {
        return this.f8917d;
    }

    public Integer getSendTimezoneSec() {
        return this.f8918e;
    }

    public void setHeader(String str, String... strArr) {
        this.f8915b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f8914a = NetworkTask.Method.POST;
        this.f8916c = bArr;
    }
}
