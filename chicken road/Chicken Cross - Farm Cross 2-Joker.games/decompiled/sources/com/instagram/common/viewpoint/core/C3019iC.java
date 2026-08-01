package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3019iC implements InterfaceC2225Ol {
    public final SharedPreferences.Editor A00;

    public C3019iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C3019iC A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C3019iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
