package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class u9 extends y1 {
    public final d9 n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f4453o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f4454p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f4455q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f4456r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f4457s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f4458t0;

    /* renamed from: u0, reason: collision with root package name */
    public Map f4459u0;

    public u9(d9 d9Var) {
        super(8);
        this.n0 = d9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.y1
    public final void a(se seVar) {
        super.a(seVar);
        d9 d9Var = this.n0;
        Long l3 = d9Var.f3577h;
        String l4 = l3 != null ? l3.toString() : AbstractC0253g.a();
        seVar.a(AbstractC0253g.f3737b, l4, true, true);
        seVar.a(AbstractC0253g.f3738c, AbstractC0253g.a(l4), true, true);
        seVar.a("category", d9Var.f3571a.f3629a, true, true);
        seVar.a("value", d9Var.f3574d, false, true);
        seVar.a("d", d9Var.f3576g, false, true);
        seVar.a("appActivity", d9Var.f3578i, false, true);
        seVar.a("details", d9Var.f3575e, false, true);
        seVar.a("detailsJson", d9Var.f, false, true);
        seVar.a("isService", Boolean.valueOf(d9Var.f3579j), false, true);
        seVar.a("orientation", this.f4453o0, false, true);
        seVar.a("usedRam", this.f4454p0, false, true);
        seVar.a("freeRam", this.f4455q0, false, true);
        seVar.a("sessionTime", null, false, true);
        seVar.a("cellScanRes", this.f4456r0, false, true);
        seVar.a("sens", this.f4457s0, false, true);
        seVar.a("bt", this.f4458t0, false, true);
        Pair a3 = com.startapp.sdk.adsbase.g.a();
        Pair b3 = com.startapp.sdk.adsbase.g.b();
        seVar.a((String) a3.first, a3.second, false, true);
        seVar.a((String) b3.first, b3.second, false, true);
        Map map = this.f4459u0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                seVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        seVar.a("rcd", null, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(8:5|(1:7)(1:(1:24))|8|9|10|(1:12)|14|15)|25|8|9|10|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (com.startapp.sdk.internal.si.a(r10, java.lang.SecurityException.class) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        com.startapp.sdk.internal.d9.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:10:0x0029, B:12:0x0033), top: B:9:0x0029 }] */
    @Override // com.startapp.sdk.internal.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, AdPreferences adPreferences) {
        String str;
        ActivityManager activityManager;
        Configuration configuration;
        super.b(context, adPreferences);
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            int i3 = configuration.orientation;
            if (i3 == 2) {
                str = "landscape";
            } else if (i3 == 1) {
                str = "portrait";
            }
            this.f4453o0 = str;
            String[] strArr = {null, null};
            activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                strArr[0] = Long.toString(memoryInfo.availMem / 1048576);
                strArr[1] = Long.toString((p0.a(memoryInfo).longValue() - memoryInfo.availMem) / 1048576);
            }
            this.f4455q0 = strArr[0];
            this.f4454p0 = strArr[1];
        }
        str = StringUtils.UNDEFINED;
        this.f4453o0 = str;
        String[] strArr2 = {null, null};
        activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
        }
        this.f4455q0 = strArr2[0];
        this.f4454p0 = strArr2[1];
    }

    public final String toString() {
        return this.n0.toString();
    }
}
