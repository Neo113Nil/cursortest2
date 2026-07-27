package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yc implements G7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4741y3 f8028a;
    private ConcurrentHashMap<String, Long> b;

    public Yc(InterfaceC4741y3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f8028a = storage;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.G7
    public Long a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.b.get(identifier);
        if (l != null) {
            return l;
        }
        Long b = this.f8028a.b(identifier);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.G7
    public void a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Long.valueOf(j));
        this.f8028a.a(identifier, j);
    }
}
