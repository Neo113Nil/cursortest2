package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4731xb {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f8761a;

    public C4731xb(E0 e0) {
        this.f8761a = e0;
    }

    public void a(boolean z) {
        a(z, false);
    }

    public void b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.f8761a.a(B0.SKIP_RELOAD_AD, hashMap);
    }

    public void c() {
        this.f8761a.a(B0.PRELOAD_ADUNIT_LOAD_SUCCESS, new HashMap());
    }

    public void d() {
        this.f8761a.a(B0.RELOAD_AD, new HashMap());
    }

    public void a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f8761a.a(B0.LOAD_AD, hashMap);
    }

    public void b(long j, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f8761a.a(B0.LOAD_AD_NO_FILL, hashMap);
    }

    public void a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.valueOf(i));
        this.f8761a.a(B0.DESTROY_AD, hashMap);
    }

    public void b() {
        this.f8761a.a(B0.PRELOAD_ADUNIT_INITIATED, new HashMap());
    }

    public void a(long j, boolean z) {
        a(j, z, false);
    }

    public void a(long j, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f8761a.a(B0.LOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f8761a.a(B0.RELOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j, int i, boolean z) {
        a(j, i, z, false);
    }

    public void a(long j, int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f8761a.a(B0.LOAD_AD_FAILED, hashMap);
    }

    public void a(long j, int i, String str, boolean z) {
        a(j, i, str, z, false);
    }

    public void a(long j, int i, String str, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f8761a.a(B0.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f8761a.a(B0.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(boolean z, long j, boolean z2) {
        B0 b0;
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        E0 e0 = this.f8761a;
        if (z) {
            b0 = B0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            b0 = B0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        e0.a(b0, hashMap);
    }

    public void a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.f8761a.a(B0.RELOAD_AD_NO_FILL, hashMap);
    }

    public void a(Boolean bool, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f8761a.a(bool.booleanValue() ? B0.AD_READY_TRUE : B0.AD_READY_FALSE, hashMap);
    }

    public void a() {
        this.f8761a.a(B0.PRELOAD_ADUNIT_FAILED, new HashMap());
    }
}
