package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes5.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    private a f4552a;
    private String b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    protected x3(a aVar, String str) {
        this.f4552a = aVar;
        this.b = str;
    }

    public a a() {
        return this.f4552a;
    }

    public String b() {
        return this.b;
    }

    public static x3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new x3(a.AD_UNIT_ID, str);
    }

    public static x3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new x3(a.AD_FORMAT, label);
    }

    public static x3 a(c3 c3Var) {
        String T = c3Var.T();
        MaxAdFormat format = c3Var.getFormat();
        if (TextUtils.isEmpty(T) || format == null) {
            return null;
        }
        return new u3(new n3(T, format));
    }
}
