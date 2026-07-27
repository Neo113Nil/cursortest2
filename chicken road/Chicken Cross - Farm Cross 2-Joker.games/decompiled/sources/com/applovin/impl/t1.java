package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class t1 {
    private final String b;
    private final Map c;

    /* renamed from: a, reason: collision with root package name */
    private final String f4508a = UUID.randomUUID().toString();
    private final long d = System.currentTimeMillis();

    public t1(String str, Map map) {
        this.b = str;
        this.c = map;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.f4508a;
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.d == t1Var.d && Objects.equals(this.b, t1Var.b) && Objects.equals(this.c, t1Var.c)) {
            return Objects.equals(this.f4508a, t1Var.f4508a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.c;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f4508a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.f4508a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
