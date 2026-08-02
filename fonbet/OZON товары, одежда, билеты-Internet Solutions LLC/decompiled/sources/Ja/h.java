package Ja;

import Sc.o;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final h HTTP_1_0;
    public static final h HTTP_1_1;
    public static final h HTTP_2;
    public static final h QUIC;
    public static final h SPDY;

    public static final class a {
    }

    /* loaded from: classes9.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14302a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.SPDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14302a = iArr;
        }
    }

    static {
        h hVar = new h("HTTP_1_0", 0);
        HTTP_1_0 = hVar;
        h hVar2 = new h("HTTP_1_1", 1);
        HTTP_1_1 = hVar2;
        h hVar3 = new h("HTTP_2", 2);
        HTTP_2 = hVar3;
        h hVar4 = new h("SPDY", 3);
        SPDY = hVar4;
        h hVar5 = new h("QUIC", 4);
        QUIC = hVar5;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5};
        Companion = new a();
    }

    private h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i11 = b.f14302a[ordinal()];
        if (i11 == 1) {
            return "http/1.0";
        }
        if (i11 == 2) {
            return "http/1.1";
        }
        if (i11 == 3) {
            return "h2";
        }
        if (i11 == 4) {
            return "spdy";
        }
        if (i11 == 5) {
            return "quic";
        }
        throw new o();
    }
}
