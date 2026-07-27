package sg.bigo.ads.k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public class I {
    public static final D b;
    public static final I c;
    public static final /* synthetic */ I[] d;

    /* renamed from: a, reason: collision with root package name */
    public final String f13015a;

    /* JADX INFO: Fake field, exist only in values array */
    I EF0;

    /* JADX INFO: Fake field, exist only in values array */
    I EF1;

    /* JADX INFO: Fake field, exist only in values array */
    I EF2;

    static {
        I i = new I("CLOSE", 0, "close");
        I i2 = new I("UNLOAD", 1, "unload");
        I i3 = new I() { // from class: sg.bigo.ads.k1.C
            @Override // sg.bigo.ads.k1.I
            public final boolean a(int i4) {
                return i4 == 1;
            }
        };
        I i4 = new I("USE_CUSTOM_CLOSE", 3, "usecustomclose");
        D d2 = new D();
        b = d2;
        I i5 = new I() { // from class: sg.bigo.ads.k1.E
            @Override // sg.bigo.ads.k1.I
            public final boolean a(int i6) {
                return true;
            }
        };
        I i6 = new I("SET_ORIENTATION_PROPERTIES", 6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h);
        I i7 = new I() { // from class: sg.bigo.ads.k1.F
            @Override // sg.bigo.ads.k1.I
            public final boolean a(int i8) {
                return i8 == 1;
            }
        };
        I i8 = new I() { // from class: sg.bigo.ads.k1.G
            @Override // sg.bigo.ads.k1.I
            public final boolean a(int i9) {
                return true;
            }
        };
        I i9 = new I() { // from class: sg.bigo.ads.k1.H
            @Override // sg.bigo.ads.k1.I
            public final boolean a(int i10) {
                return true;
            }
        };
        I i10 = new I("UNSPECIFIED", 10, "");
        c = i10;
        d = new I[]{i, i2, i3, i4, d2, i5, i6, i7, i8, i9, i10};
    }

    public I(int i, int i2, String str, String str2) {
        this.f13015a = str2;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) d.clone();
    }

    public boolean a(int i) {
        return this instanceof D;
    }

    public I(String str, int i, String str2) {
        this.f13015a = str2;
    }
}
