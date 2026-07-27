package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426cn implements InterfaceC0918vo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        return !TextUtils.isEmpty(s8.f6568b) ? StringUtils.getUTF8Bytes(s8.f6568b) : new byte[0];
    }
}
