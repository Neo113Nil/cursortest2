package androidx.camera.core.impl;

import Q.b;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public interface T {

    public static abstract class a<T> {
        a() {
        }

        @NonNull
        public static a a(@NonNull Class cls, @NonNull String str) {
            return new C5087d(str, cls, null);
        }

        @NonNull
        public static a b(@NonNull String str, CaptureRequest.Key key) {
            return new C5087d(str, Object.class, key);
        }

        @NonNull
        public abstract String c();

        public abstract Object d();

        @NonNull
        public abstract Class<T> e();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALWAYS_OVERRIDE;
        public static final b HIGH_PRIORITY_REQUIRED;
        public static final b OPTIONAL;
        public static final b REQUIRED;

        static {
            b bVar = new b("ALWAYS_OVERRIDE", 0);
            ALWAYS_OVERRIDE = bVar;
            b bVar2 = new b("HIGH_PRIORITY_REQUIRED", 1);
            HIGH_PRIORITY_REQUIRED = bVar2;
            b bVar3 = new b("REQUIRED", 2);
            REQUIRED = bVar3;
            b bVar4 = new b("OPTIONAL", 3);
            OPTIONAL = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
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
    static A0 O(T t2, T t11) {
        if (t2 == null && t11 == null) {
            return A0.P();
        }
        C5123v0 S11 = t11 != null ? C5123v0.S(t11) : C5123v0.R();
        if (t2 != null) {
            Iterator<a<?>> it = t2.g().iterator();
            while (it.hasNext()) {
                t(S11, t11, t2, it.next());
            }
        }
        return A0.Q(S11);
    }

    static void t(@NonNull C5123v0 c5123v0, @NonNull T t2, @NonNull T t11, @NonNull a<?> aVar) {
        if (!Objects.equals(aVar, InterfaceC5102k0.f38350t)) {
            c5123v0.T(aVar, t11.h(aVar), t11.a(aVar));
            return;
        }
        Q.b bVar = (Q.b) t11.c(aVar, null);
        Q.b bVar2 = (Q.b) t2.c(aVar, null);
        b h11 = t11.h(aVar);
        if (bVar == null) {
            bVar = bVar2;
        } else if (bVar2 != null) {
            b.a b11 = b.a.b(bVar2);
            if (bVar.b() != null) {
                b11.d(bVar.b());
            }
            if (bVar.d() != null) {
                b11.f(bVar.d());
            }
            if (bVar.c() != null) {
                b11.e(bVar.c());
            }
            if (bVar.a() != 0) {
                b11.c(bVar.a());
            }
            bVar = b11.a();
        }
        c5123v0.T(aVar, h11, bVar);
    }

    <ValueT> ValueT a(@NonNull a<ValueT> aVar);

    @NonNull
    Set<b> b(@NonNull a<?> aVar);

    <ValueT> ValueT c(@NonNull a<ValueT> aVar, ValueT valuet);

    boolean d(@NonNull a<?> aVar);

    void e(@NonNull B.i iVar);

    <ValueT> ValueT f(@NonNull a<ValueT> aVar, @NonNull b bVar);

    @NonNull
    Set<a<?>> g();

    @NonNull
    b h(@NonNull a<?> aVar);
}
