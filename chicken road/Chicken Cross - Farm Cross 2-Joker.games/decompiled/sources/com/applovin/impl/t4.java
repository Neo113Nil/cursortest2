package com.applovin.impl;

import java.util.Map;

/* loaded from: classes5.dex */
public class t4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4513a;
    private Map b;

    private t4(String str, Map map) {
        this.f4513a = str;
        this.b = map;
    }

    public static t4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f4513a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f4513a + "'params='" + this.b + "'}";
    }

    public static t4 a(String str, Map map) {
        return new t4(str, map);
    }

    public Map a() {
        return this.b;
    }
}
