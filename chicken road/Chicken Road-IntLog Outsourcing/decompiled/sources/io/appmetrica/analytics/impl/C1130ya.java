package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130ya extends C1105xa {
    public C1130ya(int i2, int i3) {
        this(i2, new C1155za(i3));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C1105xa
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C1130ya(int i2, C1155za c1155za) {
        super(i2, c1155za);
    }
}
