package com.startapp.sdk.internal;

import android.util.Base64;

/* loaded from: classes.dex */
public abstract class z1 {
    public static final String a(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        try {
            byte[] decode = Base64.decode(str, 0);
            kotlin.jvm.internal.j.d(decode, "decode(...)");
            return new String(decode, v2.a.f10417a);
        } catch (Exception unused) {
            return str;
        }
    }
}
