package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4645sf implements N8 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4741y3 f8666a;
    private ConcurrentHashMap<String, Integer> b;
    private ConcurrentHashMap<String, Long> c;

    public C4645sf(InterfaceC4741y3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f8666a = storage;
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.N8
    public void a(int i, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Integer.valueOf(i));
        this.f8666a.a(identifier, i);
    }

    @Override // com.ironsource.N8
    public Long b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.c.get(identifier);
        if (l != null) {
            return l;
        }
        Long a2 = this.f8666a.a(identifier);
        if (a2 == null) {
            return null;
        }
        long longValue = a2.longValue();
        this.c.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.N8
    public int a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer c = this.f8666a.c(identifier);
        if (c != null) {
            int intValue = c.intValue();
            this.b.put(identifier, Integer.valueOf(intValue));
            return intValue;
        }
        this.b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.N8
    public void a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.put(identifier, Long.valueOf(j));
        this.f8666a.b(identifier, j);
    }
}
