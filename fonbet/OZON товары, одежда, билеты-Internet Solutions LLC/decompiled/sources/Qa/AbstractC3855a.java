package Qa;

import P4.f;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Qa.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3855a {

    /* renamed from: Qa.a$a, reason: collision with other inner class name */
    public static final class C0457a extends AbstractC3855a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f23181a;

        /* renamed from: b, reason: collision with root package name */
        private final long f23182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0457a(@NotNull File path) {
            super(0);
            Intrinsics.checkNotNullParameter(path, "path");
            this.f23181a = path;
            this.f23182b = 10485760L;
        }

        @NotNull
        public final File a() {
            return this.f23181a;
        }

        public final long b() {
            return this.f23182b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0457a)) {
                return false;
            }
            C0457a c0457a = (C0457a) obj;
            return Intrinsics.d(this.f23181a, c0457a.f23181a) && this.f23182b == c0457a.f23182b;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + Pk0.c.a(this.f23181a.hashCode() * 31, 31, this.f23182b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Disk(path=");
            sb2.append(this.f23181a);
            sb2.append(", size=");
            return f.a(this.f23182b, ", cacheHttp=false)", sb2);
        }
    }

    /* renamed from: Qa.a$b */
    public static final class b extends AbstractC3855a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f23183a = new b(0);
    }

    /* renamed from: Qa.a$c */
    public static final class c extends AbstractC3855a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        @NotNull
        public final String toString() {
            return "InMemory(size=0)";
        }
    }

    public AbstractC3855a(int i11) {
    }
}
