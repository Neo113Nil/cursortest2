package Ai;

import Kk.C3532b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ai.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC2433c {

    /* renamed from: Ai.c$a */
    public static final class a implements InterfaceC2433c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f1231a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1291515487;
        }

        @NotNull
        public final String toString() {
            return "Checking";
        }
    }

    /* renamed from: Ai.c$b */
    public static final class b implements InterfaceC2433c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f1232a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1233b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1234c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1235d;

        public b(@NotNull ArrayList missing, boolean z11, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(missing, "missing");
            this.f1232a = missing;
            this.f1233b = z11;
            this.f1234c = z12;
            this.f1235d = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1232a.equals(bVar.f1232a) && this.f1233b == bVar.f1233b && this.f1234c == bVar.f1234c && this.f1235d == bVar.f1235d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1235d) + C3532b.a(C3532b.a(this.f1232a.hashCode() * 31, 31, this.f1233b), 31, this.f1234c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Denied(missing=");
            sb2.append(this.f1232a);
            sb2.append(", canRequestAgain=");
            sb2.append(this.f1233b);
            sb2.append(", shouldOpenSettings=");
            sb2.append(this.f1234c);
            sb2.append(", isStorageRelated=");
            return Pk0.a.a(")", sb2, this.f1235d);
        }
    }

    /* renamed from: Ai.c$c, reason: collision with other inner class name */
    public static final class C0039c implements InterfaceC2433c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0039c f1236a = new C0039c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0039c);
        }

        public final int hashCode() {
            return 1103663510;
        }

        @NotNull
        public final String toString() {
            return "Granted";
        }
    }
}
