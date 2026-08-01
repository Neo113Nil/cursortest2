package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: CommonUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f10040a;
    private static volatile Boolean b;

    public static boolean a() {
        if (f10040a == null) {
            try {
                Boolean valueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2);
                f10040a = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e);
                }
            }
        }
        return f10040a != null && f10040a.booleanValue();
    }

    public static boolean b() {
        if (b == null) {
            try {
                Boolean valueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1);
                b = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e);
                }
            }
        }
        return b != null && b.booleanValue();
    }
}
