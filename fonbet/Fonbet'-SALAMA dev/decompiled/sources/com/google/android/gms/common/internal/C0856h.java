package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y3.C1800a;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856h {

    /* renamed from: a, reason: collision with root package name */
    public final Set f11305a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11306b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11307c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11308d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11309e;

    /* renamed from: f, reason: collision with root package name */
    public final C1800a f11310f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f11311g;

    public C0856h(Set set, String str, String str2) {
        C1800a c1800a = C1800a.f18194a;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f11305a = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f11307c = emptyMap;
        this.f11308d = str;
        this.f11309e = str2;
        this.f11310f = c1800a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f11306b = Collections.unmodifiableSet(hashSet);
    }
}
