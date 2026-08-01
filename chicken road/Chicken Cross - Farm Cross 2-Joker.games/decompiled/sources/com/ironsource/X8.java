package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class X8 {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f8008a;

    public X8(E0 e0) {
        this.f8008a = e0;
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f8008a.a(B0.INIT_STARTED, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f8008a.a(B0.INIT_ENDED, hashMap);
    }

    public void a() {
        this.f8008a.a(B0.INIT_SUCCESS, null);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f8008a.a(B0.INIT_FAILED, hashMap);
    }
}
