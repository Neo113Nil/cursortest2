package com.google.protobuf;

/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0920o0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0891a f12249a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12250b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12251c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12252d;

    public C0920o0(AbstractC0891a abstractC0891a, String str, Object[] objArr) {
        this.f12249a = abstractC0891a;
        this.f12250b = str;
        this.f12251c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12252d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f12252d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0891a a() {
        return this.f12249a;
    }

    public final Object[] b() {
        return this.f12251c;
    }

    public final String c() {
        return this.f12250b;
    }

    public final int d() {
        int i7 = this.f12252d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
