package org.chromium.net.impl;

import internal.org.jni_zero.JNINamespace;
import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

@JNINamespace("cronet")
/* loaded from: classes4.dex */
public final class CronetMetrics extends RequestFinishedInfo.Metrics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    private final long mPushEndMs;
    private final long mPushStartMs;
    private final Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final long mRequestStartMs;
    private final long mResponseStartMs;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    private final Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    private final Long mTotalTimeMs;
    private final Long mTtfbMs;

    private static boolean checkOrder(long start, long end) {
        return (end >= start && start != -1) || end == -1;
    }

    private static Date toDate(long timestamp) {
        if (timestamp != -1) {
            return new Date(timestamp);
        }
        return null;
    }

    static long getDateDeltaMillisOrDefault(Date before, Date after, long defaultValue) {
        return (before == null || after == null) ? defaultValue : after.getTime() - before.getTime();
    }

    public static CronetMetrics empty() {
        return new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L);
    }

    public CronetMetrics(long requestStartMs, long dnsStartMs, long dnsEndMs, long connectStartMs, long connectEndMs, long sslStartMs, long sslEndMs, long sendingStartMs, long sendingEndMs, long pushStartMs, long pushEndMs, long responseStartMs, long requestEndMs, boolean socketReused, long sentByteCount, long receivedByteCount) {
        this.mRequestStartMs = requestStartMs;
        this.mDnsStartMs = dnsStartMs;
        this.mDnsEndMs = dnsEndMs;
        this.mConnectStartMs = connectStartMs;
        this.mConnectEndMs = connectEndMs;
        this.mSslStartMs = sslStartMs;
        this.mSslEndMs = sslEndMs;
        this.mSendingStartMs = sendingStartMs;
        this.mSendingEndMs = sendingEndMs;
        this.mPushStartMs = pushStartMs;
        this.mPushEndMs = pushEndMs;
        this.mResponseStartMs = responseStartMs;
        this.mRequestEndMs = requestEndMs;
        this.mSocketReused = socketReused;
        this.mSentByteCount = Long.valueOf(sentByteCount);
        this.mReceivedByteCount = Long.valueOf(receivedByteCount);
        if (requestStartMs != -1 && responseStartMs != -1) {
            this.mTtfbMs = Long.valueOf(responseStartMs - requestStartMs);
        } else {
            this.mTtfbMs = null;
        }
        if (requestStartMs != -1 && requestEndMs != -1) {
            this.mTotalTimeMs = Long.valueOf(requestEndMs - requestStartMs);
        } else {
            this.mTotalTimeMs = null;
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getRequestStart() {
        return toDate(this.mRequestStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getDnsStart() {
        return toDate(this.mDnsStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getDnsEnd() {
        return toDate(this.mDnsEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getConnectStart() {
        return toDate(this.mConnectStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getConnectEnd() {
        return toDate(this.mConnectEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSslStart() {
        return toDate(this.mSslStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSslEnd() {
        return toDate(this.mSslEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSendingStart() {
        return toDate(this.mSendingStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getSendingEnd() {
        return toDate(this.mSendingEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getPushStart() {
        return toDate(this.mPushStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getPushEnd() {
        return toDate(this.mPushEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getResponseStart() {
        return toDate(this.mResponseStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Date getRequestEnd() {
        return toDate(this.mRequestEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public boolean getSocketReused() {
        return this.mSocketReused;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Long getTtfbMs() {
        return this.mTtfbMs;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Long getTotalTimeMs() {
        return this.mTotalTimeMs;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Long getSentByteCount() {
        return this.mSentByteCount;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public Long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }
}
