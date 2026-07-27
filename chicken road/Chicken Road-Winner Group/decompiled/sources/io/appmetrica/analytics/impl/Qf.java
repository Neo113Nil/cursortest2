package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public final class Qf implements InterfaceC0918vo, D8 {
    @Override // io.appmetrica.analytics.impl.D8
    public final int a(N8 n8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        return TextUtils.isEmpty(s8.f6568b) ? new byte[0] : Base64.decode(s8.f6568b, 0);
    }
}
