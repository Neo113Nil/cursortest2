package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0847a f12249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f12251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12252d;

    public C0876o0(AbstractC0847a abstractC0847a, String str, Object[] objArr) {
        this.f12249a = abstractC0847a;
        this.f12250b = str;
        this.f12251c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f12252d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f12252d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0847a a() {
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
