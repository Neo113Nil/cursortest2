package com.ironsource;

/* loaded from: classes5.dex */
public final class Lb {

    /* renamed from: a, reason: collision with root package name */
    private final int f5815a;
    private final int b;
    private final int c;

    public interface a {

        /* renamed from: com.ironsource.Lb$a$a, reason: collision with other inner class name */
        public static final class C0120a implements com.ironsource.Lb.a {
            @Override // com.ironsource.Lb.a
            public com.ironsource.Lb get() {
                android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
                android.os.Debug.getMemoryInfo(memoryInfo);
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                return new com.ironsource.Lb(i, i2, java.lang.Math.max(0, (memoryInfo.getTotalPss() - i2) - i));
            }
        }

        com.ironsource.Lb get();
    }

    public Lb(int i, int i2, int i3) {
        this.f5815a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.f5815a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.f5815a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Lb)) {
            return false;
        }
        com.ironsource.Lb lb = (com.ironsource.Lb) obj;
        return this.f5815a == lb.f5815a && this.b == lb.b && this.c == lb.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.f5815a * 31) + this.b) * 31) + this.c;
    }

    public java.lang.String toString() {
        return "MemoryInfo(javaHeapKb=" + this.f5815a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
    }

    public final com.ironsource.Lb a(int i, int i2, int i3) {
        return new com.ironsource.Lb(i, i2, i3);
    }

    public static /* synthetic */ com.ironsource.Lb a(com.ironsource.Lb lb, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = lb.f5815a;
        }
        if ((i4 & 2) != 0) {
            i2 = lb.b;
        }
        if ((i4 & 4) != 0) {
            i3 = lb.c;
        }
        return lb.a(i, i2, i3);
    }
}
