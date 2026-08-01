package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐟ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0743 extends AbstractC0599 {
    static {
        StringFog.decrypt("1h/jhypxwT7bA+eEMnE=\n", "tW2G5l4Uk0s=\n");
        StringFog.decrypt("/OIma0DWxc/gwyBWS/rA\n", "jpdIJC6bpKY=\n");
        StringFog.decrypt("iK7PB1qzaTeRr+gbZ7hFMg==\n", "+MG8cxXdJFY=\n");
        StringFog.decrypt("W1WztMNxje1SX6SP6VmA5UVuqLLidYU=\n", "KzrAwIcU4Yw=\n");
        StringFog.decrypt("VrxemsOYvo9KrFOhwqmFiVasUbE=\n", "JMkw1a3b0eE=\n");
        StringFog.decrypt("W1MAjHfcwZBFUhabTN3wq0NOFplc\n", "Kzxz+Diygv8=\n");
        StringFog.decrypt("tw/gAt9sTde+Bfc59UpO2KkF8AL0e3XetQXyEg==\n", "x2CTdpsJIbY=\n");
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static void m5641(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5891(m5648(c1226, c1074, arrayList));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static void m5642(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5892(m5648(c1226, c1074, arrayList));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m5643(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5893(m5648(c1226, c1074, arrayList));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5644(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5895(m5648(c1226, c1074, arrayList));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5645(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5894(m5648(c1226, c1074, arrayList), m5647(arrayList));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5646(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        AbstractC1145.m5896(m5648(c1226, c1074, arrayList), m5647(arrayList));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractRunnableC0730 m5648(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        try {
            if (AbstractC0599.m5553(arrayList, 0, AbstractRunnableC0730.class)) {
                return (AbstractRunnableC0730) AbstractC0599.m5554(arrayList, 0, AbstractRunnableC0730.class);
            }
            return new C0745(arrayList.size() > 2 ? AbstractC0599.m5555(arrayList, 2) : AbstractC0599.m5555(arrayList, 1), (C0623) AbstractC0599.m5554(arrayList, 0, C0623.class), c1074, c1226);
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.m5929(), StringFog.decrypt("0U0Viq3EeOvxXhOMsYM79PFLD4q7xGns+lEGh7OB\n", "lD9n5d/kG5k=\n"), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m5647(ArrayList arrayList) {
        int intValue;
        if (arrayList.size() > 1 && AbstractC0599.m5553(arrayList, 1, Integer.class)) {
            intValue = ((Integer) AbstractC0599.m5554(arrayList, 1, Integer.class)).intValue();
        } else {
            if (arrayList.size() <= 2) {
                return 0L;
            }
            intValue = ((Integer) AbstractC0599.m5554(arrayList, 2, Integer.class)).intValue();
        }
        return intValue;
    }
}
