package com.ironsource;

import com.ironsource.InterfaceC4530m7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4681uf implements InterfaceC4530m7, InterfaceC4530m7.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4527m4 f8710a;
    private final N8 b;
    private final Map<String, C4627rf> c;

    /* renamed from: com.ironsource.uf$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8711a;
        private long b;
        private Long c;

        public a(int i, long j, Long l) {
            this.f8711a = i;
            this.b = j;
            this.c = l;
        }

        public final int a() {
            return this.f8711a;
        }

        public final long b() {
            return this.b;
        }

        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.f8711a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8711a == aVar.f8711a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f8711a) * 31) + Long.hashCode(this.b)) * 31;
            Long l = this.c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f8711a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
        }

        public final a a(int i, long j, Long l) {
            return new a(i, j, l);
        }

        public static /* synthetic */ a a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f8711a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.c;
            }
            return aVar.a(i, j, l);
        }

        public final void a(int i) {
            this.f8711a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(Long l) {
            this.c = l;
        }
    }

    public C4681uf(InterfaceC4527m4 currentTimeProvider, N8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f8710a = currentTimeProvider;
        this.b = serviceDataRepository;
        this.c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.f8710a.a(), this.b.b(str));
    }

    public final Map<String, C4627rf> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC4530m7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C4627rf c4627rf = this.c.get(identifier);
        if (c4627rf == null) {
            return;
        }
        a c = c(identifier);
        if (c.d() != 0) {
            long e = c.e();
            Long f = c.f();
        }
        this.b.a(c.e() + E3.a(c4627rf.b(), null, 1, null), identifier);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC4530m7
    public D3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C4627rf c4627rf = this.c.get(identifier);
        return c4627rf == null ? new D3(false, null, 2, null) : a(c4627rf, identifier) ? new D3(true, F3.ShowCount) : new D3(false, null, 2, null);
    }

    private final boolean a(C4627rf c4627rf, String str) {
        a c = c(str);
        Long f = c.f();
        if (f != null) {
            return c.d() >= c4627rf.a() && this.f8710a.a() < f.longValue();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public Object a(String identifier, F3 cappingType, InterfaceC4494k7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object c = cappingConfig.c();
        if (Result.m8086isSuccessimpl(c)) {
            C4627rf c4627rf = (C4627rf) c;
            if (c4627rf != null) {
                this.c.put(identifier, c4627rf);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(Unit.INSTANCE);
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(c);
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m8079constructorimpl(Unit.INSTANCE);
    }
}
