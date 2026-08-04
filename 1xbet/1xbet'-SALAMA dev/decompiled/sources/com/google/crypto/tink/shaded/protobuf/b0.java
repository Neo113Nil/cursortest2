package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0821a f11755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f11757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11758d;

    public b0(AbstractC0821a abstractC0821a, String str, Object[] objArr) {
        this.f11755a = abstractC0821a;
        this.f11756b = str;
        this.f11757c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11758d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f11758d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0821a a() {
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
