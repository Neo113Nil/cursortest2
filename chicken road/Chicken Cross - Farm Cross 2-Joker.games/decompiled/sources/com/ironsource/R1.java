package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class R1 {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f7865a;

    public R1(E0 e0) {
        this.f7865a = e0;
    }

    public void a(Double d) {
        HashMap hashMap;
        if (d != null) {
            hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            hashMap = null;
        }
        this.f7865a.a(B0.AUCTION_REQUEST, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f7865a.a(B0.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f7865a.a(B0.AUCTION_RESULT_WATERFALL, hashMap);
    }

    String a(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("interstitial=");
        sb.append(i).append(";rewarded=").append(i2).append(";banner=").append(i3).append(";native=").append(i4);
        return sb.toString();
    }

    public void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f7865a.a(B0.AUCTION_FAILED, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f7865a.a(B0.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f7865a.a(B0.AUCTION_SUCCESS, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        this.f7865a.a(B0.AD_FORMAT_CAPPED, hashMap);
    }
}
