package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0865a f11755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11756b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11757c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11758d;

    public b0(AbstractC0865a abstractC0865a, String str, Object[] objArr) {
        this.f11755a = abstractC0865a;
        this.f11756b = str;
        this.f11757c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11758d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f11758d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0865a a() {
        return this.f11755a;
    }

    public final Object[] b() {
        return this.f11757c;
    }

    public final String c() {
        return this.f11756b;
    }

    public final int d() {
        return (this.f11758d & 1) == 1 ? 1 : 2;
    }
}
