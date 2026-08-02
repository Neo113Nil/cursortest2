package b80;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;

/* renamed from: b80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5585a {

    /* renamed from: b80.a$a, reason: collision with other inner class name */
    public static final class C0832a implements InterfaceC5585a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0832a f55718a = new C0832a();
    }

    /* renamed from: b80.a$b */
    public static final class b implements InterfaceC5585a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FinLargeButtonState f55719a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55720b;

        public b(@NotNull FinLargeButtonState buttonState, int i11) {
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.f55719a = buttonState;
            this.f55720b = i11;
        }

        @NotNull
        public final FinLargeButtonState a() {
            return this.f55719a;
        }

        public final int b() {
            return this.f55720b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f55719a, bVar.f55719a) && this.f55720b == bVar.f55720b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f55720b) + (this.f55719a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "PdfPreviewPageChanges(buttonState=" + this.f55719a + ", countItems=" + this.f55720b + ")";
        }
    }

    /* renamed from: b80.a$c */
    public static final class c implements InterfaceC5585a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f55721a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a80.b f55722b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f55723c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final FinLargeButtonState f55724d;

        public c(@NotNull String fileNameTitle, @NotNull a80.b fileType, @NotNull String sizeOfFile, @NotNull FinLargeButtonState buttonState) {
            Intrinsics.checkNotNullParameter(fileNameTitle, "fileNameTitle");
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            Intrinsics.checkNotNullParameter(sizeOfFile, "sizeOfFile");
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.f55721a = fileNameTitle;
            this.f55722b = fileType;
            this.f55723c = sizeOfFile;
            this.f55724d = buttonState;
        }

        @NotNull
        public final FinLargeButtonState a() {
            return this.f55724d;
        }

        @NotNull
        public final String b() {
            return this.f55721a;
        }

        @NotNull
        public final a80.b c() {
            return this.f55722b;
        }

        @NotNull
        public final String d() {
            return this.f55723c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f55721a, cVar.f55721a) && this.f55722b == cVar.f55722b && Intrinsics.d(this.f55723c, cVar.f55723c) && Intrinsics.d(this.f55724d, cVar.f55724d);
        }

        public final int hashCode() {
            return this.f55724d.hashCode() + g.a((this.f55722b.hashCode() + (this.f55721a.hashCode() * 31)) * 31, 31, this.f55723c);
        }

        @NotNull
        public final String toString() {
            return "SuccessFileLoaded(fileNameTitle=" + this.f55721a + ", fileType=" + this.f55722b + ", sizeOfFile=" + this.f55723c + ", buttonState=" + this.f55724d + ")";
        }
    }
}
