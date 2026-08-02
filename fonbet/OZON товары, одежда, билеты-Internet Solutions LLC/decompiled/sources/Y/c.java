package Y;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import com.google.common.util.concurrent.m;

/* loaded from: classes8.dex */
public interface c<T> extends InterfaceC5129y0<a> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE;
        public static final a INACTIVE;

        static {
            a aVar = new a("ACTIVE", 0);
            ACTIVE = aVar;
            a aVar2 = new a("INACTIVE", 1);
            INACTIVE = aVar2;
            $VALUES = new a[]{aVar, aVar2};
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

    @NonNull
    m<T> e();
}
