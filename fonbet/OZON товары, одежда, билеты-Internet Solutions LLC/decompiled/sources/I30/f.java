package I30;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SCALE;

        static {
            a aVar = new a("SCALE", 0);
            SCALE = aVar;
            a[] aVarArr = {aVar};
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

    void k(boolean z11, @NotNull String str, String str2, @NotNull String str3, String str4, String str5, a aVar);
}
