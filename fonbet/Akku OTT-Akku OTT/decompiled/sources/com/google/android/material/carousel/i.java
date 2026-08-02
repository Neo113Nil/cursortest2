package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class i {
    public final float a;
    public final List<b> b;
    public final int c;
    public final int d;

    public static final class a {
        public final float a;
        public final float b;
        public b d;
        public b e;
        public final ArrayList c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = 0.0f;
        public int i = -1;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @NonNull
        public final void a(float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, float f3, boolean z, boolean z2) {
            float f4;
            float f5 = f3 / 2.0f;
            float f6 = f - f5;
            float f7 = f5 + f;
            float f8 = this.b;
            if (f7 > f8) {
                f4 = Math.abs(f7 - Math.max(f7 - f3, f8));
            } else {
                f4 = 0.0f;
                if (f6 < 0.0f) {
                    f4 = Math.abs(f6 - Math.min(f6 + f3, 0.0f));
                }
            }
            b(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
        }

        @NonNull
        public final void b(float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.c;
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = arrayList.size();
            }
            b bVar = new b(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.d == null) {
                    this.d = bVar;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = bVar;
                this.g = arrayList.size();
            } else {
                if (this.d == null && f3 < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && f3 > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = f3;
            arrayList.add(bVar);
        }

        @NonNull
        public final void c(float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, float f3, int i, boolean z) {
            if (i <= 0 || f3 <= 0.0f) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                a((i2 * f3) + f, f2, f3, z, false);
            }
        }

        @NonNull
        public final i d() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                float f = this.a;
                if (i >= size) {
                    return new i(f, arrayList, this.f, this.g);
                }
                b bVar = (b) arrayList2.get(i);
                arrayList.add(new b((i * f) + (this.d.b - (this.f * f)), bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h));
                i++;
            }
        }
    }

    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public b(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public i(float f, ArrayList arrayList, int i, int i2) {
        this.a = f;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = i;
        this.d = i2;
    }

    public final b a() {
        return this.b.get(this.c);
    }

    public final b b() {
        return this.b.get(0);
    }

    public final b c() {
        return this.b.get(this.d);
    }

    public final b d() {
        return (b) androidx.appcompat.view.menu.a.a(1, this.b);
    }
}
