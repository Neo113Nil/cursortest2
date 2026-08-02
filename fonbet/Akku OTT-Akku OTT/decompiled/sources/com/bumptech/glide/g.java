package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g {
    public final Map<Class<?>, Object> a;

    public static final class a {
        public final HashMap a = new HashMap();
    }

    public g(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
