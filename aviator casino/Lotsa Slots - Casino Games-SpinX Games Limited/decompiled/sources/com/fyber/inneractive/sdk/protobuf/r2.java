package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.d2 f4215a;
    public final java.lang.String b;
    public final java.lang.Object[] c;
    public final int d;

    public r2(com.fyber.inneractive.sdk.protobuf.d2 d2Var, java.lang.String str, java.lang.Object[] objArr) {
        char charAt;
        this.f4215a = d2Var;
        this.b = str;
        this.c = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (java.lang.StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            java.lang.String str2 = new java.lang.String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (java.lang.StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    java.lang.String str3 = new java.lang.String(cArr);
                    try {
                        charAt = str3.charAt(0);
                        str = str3;
                    } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", str2, java.lang.Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", str2, java.lang.Integer.valueOf(charArray.length)), e);
            } catch (java.lang.StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", str2, java.lang.Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.d = (charAt2 << i3) | i2;
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i = i4;
            }
        }
    }
}
