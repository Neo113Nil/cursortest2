package Cf;

import Hf.g;

/* loaded from: classes10.dex */
public final class c extends g {

    /* renamed from: f, reason: collision with root package name */
    private boolean f4833f;

    /* renamed from: g, reason: collision with root package name */
    private a f4834g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CENTER;
        public static final a LEFT;
        public static final a RIGHT;

        static {
            a aVar = new a("LEFT", 0);
            LEFT = aVar;
            a aVar2 = new a("CENTER", 1);
            CENTER = aVar2;
            a aVar3 = new a("RIGHT", 2);
            RIGHT = aVar3;
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

    public final a m() {
        return this.f4834g;
    }

    public final boolean n() {
        return this.f4833f;
    }

    public final void o(a aVar) {
        this.f4834g = aVar;
    }

    public final void p() {
        this.f4833f = true;
    }
}
