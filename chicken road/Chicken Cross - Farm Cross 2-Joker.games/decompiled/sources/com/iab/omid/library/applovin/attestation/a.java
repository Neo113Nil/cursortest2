package com.iab.omid.library.applovin.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f6040a;

    public a(Map<String, String> map) {
        this.f6040a = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.f6040a;
    }
}
