package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953x7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0830se f8609a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0953x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0927w7 fromModel(C1003z7 c1003z7) {
        C0927w7 c0927w7 = new C0927w7();
        Long l3 = c1003z7.f8660a;
        if (l3 != null) {
            c0927w7.f8549a = l3.longValue();
        }
        Long l4 = c1003z7.f8661b;
        if (l4 != null) {
            c0927w7.f8550b = l4.longValue();
        }
        Boolean bool = c1003z7.f8662c;
        if (bool != null) {
            c0927w7.f8551c = this.f8609a.fromModel(bool).intValue();
        }
        return c0927w7;
    }

    public C0953x7(C0830se c0830se) {
        this.f8609a = c0830se;
    }

    public /* synthetic */ C0953x7(C0830se c0830se, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0830se() : c0830se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1003z7 toModel(C0927w7 c0927w7) {
        C0927w7 c0927w72 = new C0927w7();
        long j3 = c0927w7.f8549a;
        Long valueOf = Long.valueOf(j3);
        if (j3 == c0927w72.f8549a) {
            valueOf = null;
        }
        long j4 = c0927w7.f8550b;
        return new C1003z7(valueOf, j4 != c0927w72.f8550b ? Long.valueOf(j4) : null, this.f8609a.a(c0927w7.f8551c));
    }
}
