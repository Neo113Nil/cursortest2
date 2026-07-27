package com.inmobi.media;

/* renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3838k3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7193a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public String e;

    public final String a() {
        int i = this.f7193a;
        if (i == -1 && this.b == -1) {
            return null;
        }
        return i + "_" + this.b;
    }

    public final String b() {
        int i = this.c;
        if (i == -1 && this.d == -1) {
            return null;
        }
        return i + "_" + this.d;
    }
}
