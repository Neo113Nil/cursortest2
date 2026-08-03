package com.ironsource;

/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3082hd {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6291a;
    private boolean b;
    private boolean c;
    private com.ironsource.EnumC3153ld d;
    private int e;
    private int f;

    /* renamed from: com.ironsource.hd$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6292a = true;
        private boolean b = false;
        private boolean c = false;
        private com.ironsource.EnumC3153ld d = null;
        private int e = 0;
        private int f = 0;

        public com.ironsource.C3082hd.a a(boolean z) {
            this.f6292a = z;
            return this;
        }

        public com.ironsource.C3082hd.a a(boolean z, com.ironsource.EnumC3153ld enumC3153ld, int i) {
            this.b = z;
            if (enumC3153ld == null) {
                enumC3153ld = com.ironsource.EnumC3153ld.PER_DAY;
            }
            this.d = enumC3153ld;
            this.e = i;
            return this;
        }

        public com.ironsource.C3082hd.a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public com.ironsource.C3082hd a() {
            return new com.ironsource.C3082hd(this.f6292a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private C3082hd(boolean z, boolean z2, boolean z3, com.ironsource.EnumC3153ld enumC3153ld, int i, int i2) {
        this.f6291a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC3153ld;
        this.e = i;
        this.f = i2;
    }

    public com.ironsource.EnumC3153ld a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.f6291a;
    }

    public boolean f() {
        return this.c;
    }
}
