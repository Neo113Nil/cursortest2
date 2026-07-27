package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1192 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f3383;

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f3384;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f3385;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f3386;

    public C1192(Object obj) {
        this.f3386 = obj;
    }

    public final String toString() {
        return this.f3386 instanceof String ? AbstractC1257.m5940("aQ==\n", "S96EyFu6HaQ=\n", new StringBuilder().append(StringFog.decrypt("iQ==\n", "q3pqgs6Ur7s=\n")).append(this.f3386)) : this.f3386 + "";
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Number m5917() {
        Object obj = this.f3386;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m5918() {
        Object obj = this.f3386;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        return true;
    }
}
