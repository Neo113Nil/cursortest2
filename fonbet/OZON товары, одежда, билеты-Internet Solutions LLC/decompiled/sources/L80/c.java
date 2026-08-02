package L80;

import Ae.C0;
import Ae.E0;
import C.o0;
import Sc.r;
import Sc.s;
import android.app.Application;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final byte[] f16606c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f16607a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f16608b;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {

        /* renamed from: L80.c$a$a, reason: collision with other inner class name */
        public static final class C0316a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0316a f16609a = new C0316a();
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f16610a;

            public b(@NotNull String data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.f16610a = data;
            }

            @NotNull
            public final String a() {
                return this.f16610a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f16610a, ((b) obj).f16610a);
            }

            public final int hashCode() {
                return this.f16610a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("Write(data="), this.f16610a, ")");
            }
        }
    }

    static {
        byte[] bytes = "".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f16606c = bytes;
    }

    public c(Application context, M ioScope) {
        Intrinsics.checkNotNullParameter("log_file.txt", "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        this.f16607a = E0.b(0, 15, null, 5);
        C10727i.c(ioScope, null, null, new b(this, null), 3);
        File file = new File(context.getFilesDir(), "log");
        if (!file.exists()) {
            file.mkdir();
        }
        this.f16608b = new File(file, "log_file.txt");
    }

    public static final void a(c cVar) {
        Object a11;
        Throwable b11;
        cVar.getClass();
        try {
            r.Companion companion = r.INSTANCE;
            FileOutputStream fileOutputStream = new FileOutputStream(cVar.f16608b);
            try {
                fileOutputStream.write(f16606c);
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                a11 = Unit.f71690a;
            } finally {
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!(a11 instanceof r.b) || (b11 = r.b(a11)) == null) {
            return;
        }
        b11.printStackTrace();
    }

    public static final boolean c(c cVar) {
        return cVar.f16608b.length() > 512000;
    }

    public static final void d(c cVar, String str) {
        Object a11;
        Throwable b11;
        cVar.getClass();
        try {
            r.Companion companion = r.INSTANCE;
            FileOutputStream fileOutputStream = new FileOutputStream(cVar.f16608b, true);
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                Unit unit = Unit.f71690a;
                fileOutputStream.close();
                a11 = Unit.f71690a;
            } finally {
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!(a11 instanceof r.b) || (b11 = r.b(a11)) == null) {
            return;
        }
        b11.printStackTrace();
    }

    public final void e() {
        this.f16607a.tryEmit(a.C0316a.f16609a);
    }

    @NotNull
    public final File f() {
        return this.f16608b;
    }

    public final void g(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f16607a.tryEmit(new a.b(log));
    }
}
