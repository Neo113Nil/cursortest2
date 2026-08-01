package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1262 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final Map f3567;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ExecutorService f3568;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List f3569;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1298 f3570;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1158 f3571;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f3572;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("fQ+SdgnBoVJ6BIFkFMO4fX0e\n", "E2rmAWazyhQ=\n"), 1);
        hashMap.put(StringFog.decrypt("Xdr5jKvOqqhd2vu2usCqq13G\n", "OLSP5dmhxMU=\n"), 2);
        hashMap.put(StringFog.decrypt("ZxZ8PZOIs8BOAnoxgYe1zGweeiA=\n", "D3cOWeTpwaU=\n"), 1);
        hashMap.put(StringFog.decrypt("NBvqrPO6Wmk3EtGo66BaaQ==\n", "Vn6CzYXTNRs=\n"), 2);
        f3567 = Collections.unmodifiableMap(hashMap);
    }

    public C1262(Context context, List list) {
        C1158 c1158 = new C1158();
        C1298 c1298 = new C1298();
        this.f3572 = context;
        this.f3571 = c1158;
        this.f3570 = c1298;
        this.f3569 = Collections.unmodifiableList(new ArrayList(list));
        this.f3568 = Executors.newSingleThreadExecutor();
    }
}
