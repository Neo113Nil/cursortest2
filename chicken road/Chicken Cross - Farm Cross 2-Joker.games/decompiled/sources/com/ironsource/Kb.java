package com.ironsource;

import android.os.Debug;

/* loaded from: classes6.dex */
public final class Kb {

    /* renamed from: a, reason: collision with root package name */
    private final int f7723a;
    private final int b;
    private final int c;

    public interface a {

        /* renamed from: com.ironsource.Kb$a$a, reason: collision with other inner class name */
        public static final class C0309a implements a {
            @Override // com.ironsource.Kb.a
            public Kb get() {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                return new Kb(i, i2, Math.max(0, (memoryInfo.getTotalPss() - i2) - i));
            }
        }

        Kb get();
    }

    public Kb(int i, int i2, int i3) {
        this.f7723a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.f7723a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.f7723a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kb)) {
            return false;
        }
        Kb kb = (Kb) obj;
        return this.f7723a == kb.f7723a && this.b == kb.b && this.c == kb.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f7723a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "MemoryInfo(javaHeapKb=" + this.f7723a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
    }

    public final Kb a(int i, int i2, int i3) {
        return new Kb(i, i2, i3);
    }

    public static /* synthetic */ Kb a(Kb kb, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kb.f7723a;
        }
        if ((i4 & 2) != 0) {
            i2 = kb.b;
        }
        if ((i4 & 4) != 0) {
            i3 = kb.c;
        }
        return kb.a(i, i2, i3);
    }
}
