package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0812h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p168y3.a f11310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f11311g;

    public C0812h(Set set, String str, String str2) {
        p168y3.a aVar = p168y3.a.f18200a;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f11305a = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f11307c = mapEmptyMap;
        this.f11308d = str;
        this.f11309e = str2;
        this.f11310f = aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f11306b = Collections.unmodifiableSet(hashSet);
    }
}
