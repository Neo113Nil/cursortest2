package m2;

import a.AbstractC0169a;
import b2.AbstractC0279e;
import f4.EnumC0429f;
import j5.r;

/* renamed from: m2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288k {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f11183g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public j5.f f11184a = new j5.f();

    /* renamed from: b, reason: collision with root package name */
    public j5.f f11185b = new j5.f();

    /* renamed from: c, reason: collision with root package name */
    public final j5.e f11186c = new j5.e();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11187d = f11183g;

    /* renamed from: e, reason: collision with root package name */
    public int f11188e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11189f;

    public C1288k() {
        EnumC0429f enumC0429f = EnumC0429f.f5666b;
        this.f11189f = AbstractC0169a.z(enumC0429f, new M0.a(2));
        AbstractC0169a.z(enumC0429f, new T4.m(5, this));
    }

    public final void a() {
        byte[] bArr = this.f11187d;
        byte[] bArr2 = f11183g;
        if (bArr == bArr2) {
            return;
        }
        this.f11186c.close();
        this.f11185b.D(this.f11188e);
        this.f11185b.I(this.f11184a);
        j5.f fVar = this.f11184a;
        this.f11184a = this.f11185b;
        this.f11185b = fVar;
        this.f11187d = bArr2;
        this.f11188e = 0;
    }

    public final void b(int i2) {
        if (this.f11188e >= i2) {
            return;
        }
        a();
        j5.f fVar = this.f11185b;
        j5.e eVar = this.f11186c;
        byte[] bArr = k5.a.f10723a;
        j5.e eVar2 = eVar == j5.b.f10480a ? new j5.e() : eVar;
        if (eVar2.f10490a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        eVar2.f10490a = fVar;
        eVar2.f10491b = true;
        if (i2 <= 0) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "minByteCount <= 0: ").toString());
        }
        if (i2 > 8192) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "minByteCount > Segment.SIZE: ").toString());
        }
        j5.f fVar2 = eVar.f10490a;
        if (fVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!eVar.f10491b) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j2 = fVar2.f10495b;
        r F2 = fVar2.F(i2);
        int i3 = 8192 - F2.f10523c;
        F2.f10523c = 8192;
        fVar2.f10495b = i3 + j2;
        byte[] bArr2 = F2.f10521a;
        eVar.f10492c = bArr2;
        eVar.f10493d = 8192;
        if (j2 == 0) {
            kotlin.jvm.internal.i.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = eVar.f10492c;
                kotlin.jvm.internal.i.b(bArr3);
                this.f11187d = bArr3;
                this.f11188e = eVar.f10493d;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
