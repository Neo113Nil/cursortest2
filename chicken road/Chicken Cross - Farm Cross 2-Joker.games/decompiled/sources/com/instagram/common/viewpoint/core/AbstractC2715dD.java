package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2715dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C2714dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C2714dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C2714dC A01(C2930gi c2930gi, AbstractC3095jd abstractC3095jd, int i, InterfaceC2712dA interfaceC2712dA) {
        C2714dC c2714dC = new C2714dC(c2930gi, abstractC3095jd, c2930gi.A02().A0A(), i);
        c2714dC.A0b(interfaceC2712dA);
        c2714dC.A0X();
        A01.put(abstractC3095jd.A1D(), new WeakReference<>(c2714dC));
        return c2714dC;
    }

    public static C2714dC A02(String str) {
        WeakReference<C2714dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC3095jd abstractC3095jd, C2714dC c2714dC) {
        A01.put(abstractC3095jd.A1D(), new WeakReference<>(c2714dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
