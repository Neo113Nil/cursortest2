package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;

/* compiled from: ViewDataFactory.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f9210a;

    private c() {
    }

    public static c a() {
        if (f9210a == null) {
            synchronized (c.class) {
                if (f9210a == null) {
                    f9210a = new c();
                }
            }
        }
        return f9210a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T t = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("close")) {
            t = new com.mbridge.msdk.dycreator.binding.strategy.c();
        } else if (str.equals("download")) {
            t = new com.mbridge.msdk.dycreator.binding.strategy.b();
        } else if (!str.equals("deeplink") && str.equals("activity")) {
            t = new com.mbridge.msdk.dycreator.binding.strategy.a();
        }
        if (str.equals("feedback")) {
            t = new d();
        }
        if (str.equals("notice")) {
            t = new e();
        }
        if (str.equals("permissionInfo")) {
            t = new f();
        }
        return str.equals("privateAddress") ? new g() : t;
    }
}
