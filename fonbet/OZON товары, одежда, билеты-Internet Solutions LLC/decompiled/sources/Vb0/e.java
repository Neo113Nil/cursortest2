package Vb0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static a f28526a = a.Ozon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Android;
        public static final a Cookie;
        public static final a Ozon;
        public static final a Timber;

        static {
            a aVar = new a("Ozon", 0);
            Ozon = aVar;
            a aVar2 = new a("Timber", 1);
            Timber = aVar2;
            a aVar3 = new a("Android", 2);
            Android = aVar3;
            a aVar4 = new a("Cookie", 3);
            Cookie = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
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

    @NotNull
    public static a a() {
        return f28526a;
    }
}
