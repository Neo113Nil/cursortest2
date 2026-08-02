package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class X<V> implements com.google.common.base.s<List<V>>, Serializable {
    public final int a;

    public X() {
        C0965m.b(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // com.google.common.base.s
    public final Object get() {
        return new ArrayList(this.a);
    }
}
