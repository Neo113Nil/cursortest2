package J30;

import android.graphics.Matrix;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private d f13835a;

    /* renamed from: b, reason: collision with root package name */
    private d f13836b;

    /* renamed from: J30.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0262a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13837a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13838b;

        static {
            int[] iArr = new int[b.values().length];
            f13838b = iArr;
            try {
                iArr[b.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13838b[b.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13838b[b.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13838b[b.CENTER_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13838b[b.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13838b[b.CENTER_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13838b[b.RIGHT_TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13838b[b.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13838b[b.RIGHT_BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[c.values().length];
            f13837a = iArr2;
            try {
                iArr2[c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13837a[c.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13837a[c.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13837a[c.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13837a[c.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13837a[c.LEFT_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13837a[c.LEFT_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13837a[c.LEFT_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13837a[c.CENTER_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13837a[c.CENTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13837a[c.CENTER_BOTTOM.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13837a[c.RIGHT_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13837a[c.RIGHT_CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13837a[c.RIGHT_BOTTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13837a[c.LEFT_TOP_CROP.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13837a[c.LEFT_CENTER_CROP.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13837a[c.LEFT_BOTTOM_CROP.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13837a[c.CENTER_TOP_CROP.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13837a[c.CENTER_CROP.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13837a[c.CENTER_BOTTOM_CROP.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f13837a[c.RIGHT_TOP_CROP.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f13837a[c.RIGHT_CENTER_CROP.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f13837a[c.RIGHT_BOTTOM_CROP.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f13837a[c.START_INSIDE.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f13837a[c.CENTER_INSIDE.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f13837a[c.END_INSIDE.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CENTER;
        public static final b CENTER_BOTTOM;
        public static final b CENTER_TOP;
        public static final b LEFT_BOTTOM;
        public static final b LEFT_CENTER;
        public static final b LEFT_TOP;
        public static final b RIGHT_BOTTOM;
        public static final b RIGHT_CENTER;
        public static final b RIGHT_TOP;

        static {
            b bVar = new b("LEFT_TOP", 0);
            LEFT_TOP = bVar;
            b bVar2 = new b("LEFT_CENTER", 1);
            LEFT_CENTER = bVar2;
            b bVar3 = new b("LEFT_BOTTOM", 2);
            LEFT_BOTTOM = bVar3;
            b bVar4 = new b("CENTER_TOP", 3);
            CENTER_TOP = bVar4;
            b bVar5 = new b("CENTER", 4);
            CENTER = bVar5;
            b bVar6 = new b("CENTER_BOTTOM", 5);
            CENTER_BOTTOM = bVar6;
            b bVar7 = new b("RIGHT_TOP", 6);
            RIGHT_TOP = bVar7;
            b bVar8 = new b("RIGHT_CENTER", 7);
            RIGHT_CENTER = bVar8;
            b bVar9 = new b("RIGHT_BOTTOM", 8);
            RIGHT_BOTTOM = bVar9;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c CENTER;
        public static final c CENTER_BOTTOM;
        public static final c CENTER_BOTTOM_CROP;
        public static final c CENTER_CROP;
        public static final c CENTER_INSIDE;
        public static final c CENTER_TOP;
        public static final c CENTER_TOP_CROP;
        public static final c END_INSIDE;
        public static final c FIT_CENTER;
        public static final c FIT_END;
        public static final c FIT_START;
        public static final c FIT_XY;
        public static final c LEFT_BOTTOM;
        public static final c LEFT_BOTTOM_CROP;
        public static final c LEFT_CENTER;
        public static final c LEFT_CENTER_CROP;
        public static final c LEFT_TOP;
        public static final c LEFT_TOP_CROP;
        public static final c NONE;
        public static final c RIGHT_BOTTOM;
        public static final c RIGHT_BOTTOM_CROP;
        public static final c RIGHT_CENTER;
        public static final c RIGHT_CENTER_CROP;
        public static final c RIGHT_TOP;
        public static final c RIGHT_TOP_CROP;
        public static final c START_INSIDE;

        static {
            c cVar = new c("NONE", 0);
            NONE = cVar;
            c cVar2 = new c("FIT_XY", 1);
            FIT_XY = cVar2;
            c cVar3 = new c("FIT_START", 2);
            FIT_START = cVar3;
            c cVar4 = new c("FIT_CENTER", 3);
            FIT_CENTER = cVar4;
            c cVar5 = new c("FIT_END", 4);
            FIT_END = cVar5;
            c cVar6 = new c("LEFT_TOP", 5);
            LEFT_TOP = cVar6;
            c cVar7 = new c("LEFT_CENTER", 6);
            LEFT_CENTER = cVar7;
            c cVar8 = new c("LEFT_BOTTOM", 7);
            LEFT_BOTTOM = cVar8;
            c cVar9 = new c("CENTER_TOP", 8);
            CENTER_TOP = cVar9;
            c cVar10 = new c("CENTER", 9);
            CENTER = cVar10;
            c cVar11 = new c("CENTER_BOTTOM", 10);
            CENTER_BOTTOM = cVar11;
            c cVar12 = new c("RIGHT_TOP", 11);
            RIGHT_TOP = cVar12;
            c cVar13 = new c("RIGHT_CENTER", 12);
            RIGHT_CENTER = cVar13;
            c cVar14 = new c("RIGHT_BOTTOM", 13);
            RIGHT_BOTTOM = cVar14;
            c cVar15 = new c("LEFT_TOP_CROP", 14);
            LEFT_TOP_CROP = cVar15;
            c cVar16 = new c("LEFT_CENTER_CROP", 15);
            LEFT_CENTER_CROP = cVar16;
            c cVar17 = new c("LEFT_BOTTOM_CROP", 16);
            LEFT_BOTTOM_CROP = cVar17;
            c cVar18 = new c("CENTER_TOP_CROP", 17);
            CENTER_TOP_CROP = cVar18;
            c cVar19 = new c("CENTER_CROP", 18);
            CENTER_CROP = cVar19;
            c cVar20 = new c("CENTER_BOTTOM_CROP", 19);
            CENTER_BOTTOM_CROP = cVar20;
            c cVar21 = new c("RIGHT_TOP_CROP", 20);
            RIGHT_TOP_CROP = cVar21;
            c cVar22 = new c("RIGHT_CENTER_CROP", 21);
            RIGHT_CENTER_CROP = cVar22;
            c cVar23 = new c("RIGHT_BOTTOM_CROP", 22);
            RIGHT_BOTTOM_CROP = cVar23;
            c cVar24 = new c("START_INSIDE", 23);
            START_INSIDE = cVar24;
            c cVar25 = new c("CENTER_INSIDE", 24);
            CENTER_INSIDE = cVar25;
            c cVar26 = new c("END_INSIDE", 25);
            END_INSIDE = cVar26;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f13839a;

        /* renamed from: b, reason: collision with root package name */
        private int f13840b;

        public d(int i11, int i12) {
            this.f13839a = i11;
            this.f13840b = i12;
        }

        public final int a() {
            return this.f13840b;
        }

        public final int b() {
            return this.f13839a;
        }
    }

    public a(d dVar, d dVar2) {
        this.f13835a = dVar;
        this.f13836b = dVar2;
    }

    private Matrix a(b bVar) {
        float b11 = this.f13835a.b();
        d dVar = this.f13836b;
        float b12 = b11 / dVar.b();
        float a11 = r0.a() / dVar.a();
        float max = Math.max(b12, a11);
        return d(max / b12, max / a11, bVar);
    }

    private Matrix b(b bVar) {
        float b11 = this.f13835a.b();
        d dVar = this.f13836b;
        float b12 = b11 / dVar.b();
        float a11 = r0.a() / dVar.a();
        float min = Math.min(b12, a11);
        return d(min / b12, min / a11, bVar);
    }

    private static Matrix c(float f7, float f11, float f12, float f13) {
        Matrix matrix = new Matrix();
        matrix.setScale(f7, f11, f12, f13);
        return matrix;
    }

    private Matrix d(float f7, float f11, b bVar) {
        int i11 = C0262a.f13838b[bVar.ordinal()];
        d dVar = this.f13835a;
        switch (i11) {
            case 1:
                return c(f7, f11, 0.0f, 0.0f);
            case 2:
                return c(f7, f11, 0.0f, dVar.a() / 2.0f);
            case 3:
                return c(f7, f11, 0.0f, dVar.a());
            case 4:
                return c(f7, f11, dVar.b() / 2.0f, 0.0f);
            case 5:
                return c(f7, f11, dVar.b() / 2.0f, dVar.a() / 2.0f);
            case 6:
                return c(f7, f11, dVar.b() / 2.0f, dVar.a());
            case 7:
                return c(f7, f11, dVar.b(), 0.0f);
            case 8:
                return c(f7, f11, dVar.b(), dVar.a() / 2.0f);
            case 9:
                return c(f7, f11, dVar.b(), dVar.a());
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    private Matrix e(b bVar) {
        float b11 = this.f13836b.b();
        d dVar = this.f13835a;
        return d(b11 / dVar.b(), r0.a() / dVar.a(), bVar);
    }

    public final Matrix f(c cVar) {
        int i11 = C0262a.f13837a[cVar.ordinal()];
        d dVar = this.f13835a;
        d dVar2 = this.f13836b;
        switch (i11) {
            case 1:
                return d(dVar2.b() / dVar.b(), dVar2.a() / dVar.a(), b.LEFT_TOP);
            case 2:
                return d(1.0f, 1.0f, b.LEFT_TOP);
            case 3:
                return b(b.CENTER);
            case 4:
                return b(b.LEFT_TOP);
            case 5:
                return b(b.RIGHT_BOTTOM);
            case 6:
                return e(b.LEFT_TOP);
            case 7:
                return e(b.LEFT_CENTER);
            case 8:
                return e(b.LEFT_BOTTOM);
            case 9:
                return e(b.CENTER_TOP);
            case 10:
                return e(b.CENTER);
            case 11:
                return e(b.CENTER_BOTTOM);
            case 12:
                return e(b.RIGHT_TOP);
            case 13:
                return e(b.RIGHT_CENTER);
            case 14:
                return e(b.RIGHT_BOTTOM);
            case 15:
                return a(b.LEFT_TOP);
            case 16:
                return a(b.LEFT_CENTER);
            case 17:
                return a(b.LEFT_BOTTOM);
            case 18:
                return a(b.CENTER_TOP);
            case 19:
                return a(b.CENTER);
            case 20:
                return a(b.CENTER_BOTTOM);
            case 21:
                return a(b.RIGHT_TOP);
            case 22:
                return a(b.RIGHT_CENTER);
            case 23:
                return a(b.RIGHT_BOTTOM);
            case 24:
                return (dVar2.a() > dVar.b() || dVar2.a() > dVar.a()) ? b(b.LEFT_TOP) : e(b.LEFT_TOP);
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                return (dVar2.a() > dVar.b() || dVar2.a() > dVar.a()) ? b(b.CENTER) : e(b.CENTER);
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                return (dVar2.a() > dVar.b() || dVar2.a() > dVar.a()) ? b(b.RIGHT_BOTTOM) : e(b.RIGHT_BOTTOM);
            default:
                return null;
        }
    }
}
