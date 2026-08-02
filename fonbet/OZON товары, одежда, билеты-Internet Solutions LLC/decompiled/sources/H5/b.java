package H5;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f10600a;

    /* renamed from: b, reason: collision with root package name */
    public String f10601b;

    /* renamed from: c, reason: collision with root package name */
    public float f10602c;

    /* renamed from: d, reason: collision with root package name */
    public a f10603d;

    /* renamed from: e, reason: collision with root package name */
    public int f10604e;

    /* renamed from: f, reason: collision with root package name */
    public float f10605f;

    /* renamed from: g, reason: collision with root package name */
    public float f10606g;

    /* renamed from: h, reason: collision with root package name */
    public int f10607h;

    /* renamed from: i, reason: collision with root package name */
    public int f10608i;

    /* renamed from: j, reason: collision with root package name */
    public float f10609j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10610k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f10611l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f10612m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CENTER;
        public static final a LEFT_ALIGN;
        public static final a RIGHT_ALIGN;

        static {
            a aVar = new a("LEFT_ALIGN", 0);
            LEFT_ALIGN = aVar;
            a aVar2 = new a("RIGHT_ALIGN", 1);
            RIGHT_ALIGN = aVar2;
            a aVar3 = new a("CENTER", 2);
            CENTER = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final int hashCode() {
        int ordinal = ((this.f10603d.ordinal() + (((int) (G.g.a(this.f10600a.hashCode() * 31, 31, this.f10601b) + this.f10602c)) * 31)) * 31) + this.f10604e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f10605f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f10607h;
    }
}
