package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f6384a;

    public a(Map<String, String> map) {
        this.f6384a = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.f6384a;
    }
}
