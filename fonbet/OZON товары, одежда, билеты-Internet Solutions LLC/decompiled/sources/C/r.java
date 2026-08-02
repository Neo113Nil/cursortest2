package C;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class r {

    public static abstract class a {
        @NonNull
        public static a a(int i11) {
            return new C2683c(i11, null);
        }

        @NonNull
        public static a b(int i11, Throwable th2) {
            return new C2683c(i11, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CLOSED;
        public static final b CLOSING;
        public static final b OPEN;
        public static final b OPENING;
        public static final b PENDING_OPEN;

        static {
            b bVar = new b("PENDING_OPEN", 0);
            PENDING_OPEN = bVar;
            b bVar2 = new b("OPENING", 1);
            OPENING = bVar2;
            b bVar3 = new b("OPEN", 2);
            OPEN = bVar3;
            b bVar4 = new b("CLOSING", 3);
            CLOSING = bVar4;
            b bVar5 = new b("CLOSED", 4);
            CLOSED = bVar5;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
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

    @NonNull
    public static r a(@NonNull b bVar) {
        return new C2682b(bVar, null);
    }

    @NonNull
    public static r b(@NonNull b bVar, a aVar) {
        return new C2682b(bVar, aVar);
    }

    public abstract a c();

    @NonNull
    public abstract b d();
}
