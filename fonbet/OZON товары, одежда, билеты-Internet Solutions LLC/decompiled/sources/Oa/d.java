package Oa;

import B0.C2454a;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f20177a;

        public a(File path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.f20177a = path;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f20177a.equals(((a) obj).f20177a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + C2454a.a(10485760, this.f20177a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "Config(path=" + this.f20177a + ", maxSize=10485760, isFull=false)";
        }
    }
}
