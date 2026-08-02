package Bc;

import hg.InterfaceC6948a;
import io.reactivex.C;

/* loaded from: classes.dex */
public final class p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a implements qc.o<C, InterfaceC6948a> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
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

        @Override // qc.o
        public final InterfaceC6948a apply(C c11) throws Exception {
            return new y(c11);
        }
    }

    public static <T> qc.o<C<? extends T>, InterfaceC6948a<? extends T>> a() {
        return a.INSTANCE;
    }
}
