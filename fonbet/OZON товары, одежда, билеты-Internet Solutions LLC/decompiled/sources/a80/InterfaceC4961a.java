package a80;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4961a {

    /* renamed from: a80.a$a, reason: collision with other inner class name */
    public static final class C0701a implements InterfaceC4961a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0701a f36435a = new C0701a();
    }

    /* renamed from: a80.a$b */
    public static final class b implements InterfaceC4961a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @NotNull
        public final String toString() {
            return "PageLoaded(loadingPageIndex=0)";
        }
    }

    /* renamed from: a80.a$c */
    public static final class c implements InterfaceC4961a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f36436a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a80.b f36437b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f36438c;

        public c(@NotNull String fileNameTitle, @NotNull a80.b fileType, @NotNull String sizeOfFile) {
            Intrinsics.checkNotNullParameter(fileNameTitle, "fileNameTitle");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(sizeOfFile, "sizeOfFile");
            this.f36436a = fileNameTitle;
            this.f36437b = fileType;
            this.f36438c = sizeOfFile;
        }

        @NotNull
        public final String a() {
            return this.f36436a;
        }

        @NotNull
        public final a80.b b() {
            return this.f36437b;
        }

        @NotNull
        public final String c() {
            return this.f36438c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f36436a, cVar.f36436a) && this.f36437b == cVar.f36437b && Intrinsics.d(this.f36438c, cVar.f36438c);
        }

        public final int hashCode() {
            return this.f36438c.hashCode() + ((this.f36437b.hashCode() + (this.f36436a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuccessDownloaded(fileNameTitle=");
            sb2.append(this.f36436a);
            sb2.append(", fileType=");
            sb2.append(this.f36437b);
            sb2.append(", sizeOfFile=");
            return o0.c(sb2, this.f36438c, ")");
        }
    }
}
