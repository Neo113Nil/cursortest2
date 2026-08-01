package com.vungle.ads.internal.network;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public abstract class c0 {
    public static String a(String value) {
        Regex regex;
        Intrinsics.checkNotNullParameter(value, "value");
        regex = e0.d;
        return regex.replace(value, "_");
    }
}
