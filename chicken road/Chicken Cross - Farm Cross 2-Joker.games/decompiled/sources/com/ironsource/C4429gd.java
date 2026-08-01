package com.ironsource;

/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4429gd {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8210a;
    private boolean b;
    private boolean c;
    private EnumC4500kd d;
    private int e;
    private int f;

    /* renamed from: com.ironsource.gd$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8211a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC4500kd d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.f8211a = z;
            return this;
        }

        public a a(boolean z, EnumC4500kd enumC4500kd, int i) {
            this.b = z;
            if (enumC4500kd == null) {
                enumC4500kd = EnumC4500kd.PER_DAY;
            }
            this.d = enumC4500kd;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public C4429gd a() {
            return new C4429gd(this.f8211a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private C4429gd(boolean z, boolean z2, boolean z3, EnumC4500kd enumC4500kd, int i, int i2) {
        this.f8210a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC4500kd;
        this.e = i;
        this.f = i2;
    }

    public EnumC4500kd a() {
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
        return this.f8210a;
    }

    public boolean f() {
        return this.c;
    }
}
