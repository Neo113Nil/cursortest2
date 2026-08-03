package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7V, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C7V {
    public static java.lang.String[] A04 = {"IlrXm3tezuWbVMaXPLi828ioISQJgCfS", "NAwIzBHR00ZPv9WHAooSWGmMQnQsAYk8", "eu5lMmt7ol9PqHL84pZymZquGRu6o", "m2SAqTjU3gSqVMchVgPXeZMw5JHzzeRQ", "AbCmeSj5KlQ54JssPMwwYJBwucQ6C", "RqAiTasO9D9HsUdBZKTQCzdghtQ9E0yV", "WIBemWRSgRuyaEIJ1sL2dCgMu2IibJ9f", "z026p7uIfXqhY1JlsQjMBKUP7isQ63Up"};
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7W A03;

    public C7V(com.facebook.ads.redexgen.core.C7W c7w, int i, int i2, int i3) {
        this.A03 = c7w;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final int A00() {
        java.util.Random random = new java.util.Random();
        if (random.nextInt(this.A02) == 0) {
            if (this.A01 <= 0) {
                return this.A00;
            }
            int nextInt = random.nextInt() % this.A01;
            int i = this.A00;
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[2];
            int variation = str.length();
            if (variation != str2.length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "t99WXaELTOA6CPYhlrJz9JZjCbRHN";
            strArr2[2] = "SwFbG7SpSQOHKIZQBIcFbwrWU2Enz";
            return i + nextInt;
        }
        return 0;
    }
}
