package com.pgl.ssdk;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public class ap extends am {
    private Context n;
    private final int o;

    public ap(Context context, int i) {
        super(context);
        this.n = context;
        this.o = i;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        StringBuilder append;
        String str;
        int i = this.o;
        if (i == 222) {
            append = new StringBuilder("/ssdk/v2/r?os=0&ver=8.1.0.0.overseas-rc.2&mode=1&app_ver=").append(ab.h(this.n)).append("&region=").append(ad.a()).append("&did=").append(com.pgl.ssdk.ces.b.b()).append("&aid=");
            str = com.pgl.ssdk.ces.b.a();
        } else {
            if (i != 301) {
                return null;
            }
            append = new StringBuilder("/ssdk/sd/token?os=android&app_id=").append(com.pgl.ssdk.ces.b.a()).append("&did=").append(com.pgl.ssdk.ces.b.b()).append("&app_ver=").append(ab.h(this.n));
            str = "&platform=android&ver=8.1.0.0.overseas-rc.2&mode=1";
        }
        return append.append(str).toString();
    }

    @Override // com.pgl.ssdk.am
    public void a(int i, byte[] bArr) {
        try {
            int i2 = this.o;
            if (i2 == 222) {
                ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue();
            } else if (i2 == 301) {
                a4.a(bArr);
            }
        } catch (Throwable unused) {
        }
    }
}
