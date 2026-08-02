package R6;

import R6.e;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public abstract class k {

    public static abstract class a {
        @NonNull
        public abstract k a();

        @NonNull
        public abstract a b(R6.a aVar);

        @NonNull
        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i11) {
            this.value = i11;
        }
    }

    @NonNull
    public static a a() {
        return new e.a();
    }

    public abstract R6.a b();

    public abstract b c();
}
