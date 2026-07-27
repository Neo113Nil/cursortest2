package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԍ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0554 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static AbstractC0554 f1252;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1254 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashSet f1253 = new HashSet();

    static {
        StringFog.decrypt("Lsi5gBRjjgoPwbWbFmOnLwDXoocbarAwDNagixZq\n", "aaTW4nUPwmM=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized AbstractC0554 m5521() {
        AbstractC0554 abstractC0554;
        synchronized (AbstractC0554.class) {
            if (f1252 == null) {
                f1252 = new C0565();
            }
            abstractC0554 = f1252;
        }
        return abstractC0554;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo5522();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ArrayList m5523() {
        return new ArrayList(this.f1253);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo5524();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo5525(Application application, Activity activity);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m5526(C1082 c1082) {
        this.f1253.add(c1082);
    }
}
