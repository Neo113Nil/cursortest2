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
    private NetworkTask.Method f9891a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f9892b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f9893c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f9894d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f9895e;

    public void applySendTime(long j2) {
        this.f9894d = Long.valueOf(j2);
        this.f9895e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j2) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f9892b;
    }

    public NetworkTask.Method getMethod() {
        return this.f9891a;
    }

    public byte[] getPostData() {
        return this.f9893c;
    }

    public Long getSendTimestamp() {
        return this.f9894d;
    }

    public Integer getSendTimezoneSec() {
        return this.f9895e;
    }

    public void setHeader(String str, String... strArr) {
        this.f9892b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f9891a = NetworkTask.Method.POST;
        this.f9893c = bArr;
    }
}
