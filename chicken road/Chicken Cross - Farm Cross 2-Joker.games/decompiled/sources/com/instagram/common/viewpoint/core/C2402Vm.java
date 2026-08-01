package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2402Vm {
    public final AdErrorType A00;
    public final String A01;

    public C2402Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C2402Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C2402Vm A00(AdErrorType adErrorType) {
        return new C2402Vm(adErrorType, (String) null);
    }

    public static C2402Vm A01(AdErrorType adErrorType, String str) {
        return new C2402Vm(adErrorType, str);
    }

    public static C2402Vm A02(C2403Vn c2403Vn) {
        return new C2402Vm(c2403Vn.A00(), c2403Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
