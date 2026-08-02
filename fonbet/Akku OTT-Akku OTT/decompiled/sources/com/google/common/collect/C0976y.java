package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0976y extends H<Object, Object> {
    public static final C0976y i = new C0976y(j0.i, 0);
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return i;
    }

    @Override // com.google.common.collect.L, com.google.common.collect.W
    public final Map b() {
        return this.e;
    }

    @Override // com.google.common.collect.L
    /* renamed from: f */
    public final I<Object, Collection<Object>> b() {
        return this.e;
    }
}
