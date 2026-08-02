package W;

import C.s0;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    static final Y f32993a = new C4842m(0, a.INACTIVE, null);

    /* renamed from: b, reason: collision with root package name */
    static final Set<Integer> f32994b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c, reason: collision with root package name */
    static final androidx.camera.core.impl.U f32995c = androidx.camera.core.impl.U.f(new C4842m(0, a.ACTIVE, null));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {
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

    Y() {
    }

    public abstract int a();

    public abstract s0.d b();

    @NonNull
    public abstract a c();
}
