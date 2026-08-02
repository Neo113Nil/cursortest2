package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BD implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7795a;

    public BD(LinkedHashMap linkedHashMap) {
        this.f7795a = Collections.unmodifiableMap(linkedHashMap);
    }
}
