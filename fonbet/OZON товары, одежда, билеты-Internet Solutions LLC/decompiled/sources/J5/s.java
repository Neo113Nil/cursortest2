package J5;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes8.dex */
public final class s implements J5.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14071a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.b f14072b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f14073c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f14074d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.d f14075e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.b f14076f;

    /* renamed from: g, reason: collision with root package name */
    private final b f14077g;

    /* renamed from: h, reason: collision with root package name */
    private final c f14078h;

    /* renamed from: i, reason: collision with root package name */
    private final float f14079i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14080j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14081a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f14082b;

        static {
            int[] iArr = new int[c.values().length];
            f14082b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14082b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14082b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f14081a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14081a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14081a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BUTT;
        public static final b ROUND;
        public static final b UNKNOWN;

        static {
            b bVar = new b("BUTT", 0);
            BUTT = bVar;
            b bVar2 = new b("ROUND", 1);
            ROUND = bVar2;
            b bVar3 = new b(FraudMonInfo.UNKNOWN, 2);
            UNKNOWN = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
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

        public final Paint.Cap a() {
            int i11 = a.f14081a[ordinal()];
            return i11 != 1 ? i11 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c BEVEL;
        public static final c MITER;
        public static final c ROUND;

        static {
            c cVar = new c("MITER", 0);
            MITER = cVar;
            c cVar2 = new c("ROUND", 1);
            ROUND = cVar2;
            c cVar3 = new c("BEVEL", 2);
            BEVEL = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
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

        public final Paint.Join a() {
            int i11 = a.f14082b[ordinal()];
            if (i11 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i11 == 2) {
                return Paint.Join.MITER;
            }
            if (i11 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, I5.b bVar, ArrayList arrayList, I5.a aVar, I5.d dVar, I5.b bVar2, b bVar3, c cVar, float f7, boolean z11) {
        this.f14071a = str;
        this.f14072b = bVar;
        this.f14073c = arrayList;
        this.f14074d = aVar;
        this.f14075e = dVar;
        this.f14076f = bVar2;
        this.f14077g = bVar3;
        this.f14078h = cVar;
        this.f14079i = f7;
        this.f14080j = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.t(gVar, bVar, this);
    }

    public final b b() {
        return this.f14077g;
    }

    public final I5.a c() {
        return this.f14074d;
    }

    public final I5.b d() {
        return this.f14072b;
    }

    public final c e() {
        return this.f14078h;
    }

    public final List<I5.b> f() {
        return this.f14073c;
    }

    public final float g() {
        return this.f14079i;
    }

    public final String h() {
        return this.f14071a;
    }

    public final I5.d i() {
        return this.f14075e;
    }

    public final I5.b j() {
        return this.f14076f;
    }

    public final boolean k() {
        return this.f14080j;
    }
}
