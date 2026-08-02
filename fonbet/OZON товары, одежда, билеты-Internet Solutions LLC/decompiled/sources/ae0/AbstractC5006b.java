package ae0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ae0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5006b {

    /* renamed from: a, reason: collision with root package name */
    private String f36622a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36623b;

    /* renamed from: c, reason: collision with root package name */
    private String f36624c;

    /* renamed from: ae0.b$a */
    public static final class a extends AbstractC5006b {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f36625d = new a(0);

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private static final EnumC5007c f36626e = EnumC5007c.LIBRE;

        /* renamed from: f, reason: collision with root package name */
        private static String f36627f = "";

        /* renamed from: g, reason: collision with root package name */
        private static boolean f36628g = true;

        @Override // ae0.AbstractC5006b
        public final String a() {
            return f36627f;
        }

        @Override // ae0.AbstractC5006b
        public final boolean b() {
            return f36628g;
        }

        @Override // ae0.AbstractC5006b
        @NotNull
        public final EnumC5007c d() {
            return f36626e;
        }

        @Override // ae0.AbstractC5006b
        protected final void e(@NotNull Context context, @NotNull String apiKey) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        }

        @Override // ae0.AbstractC5006b
        public final boolean f() {
            return true;
        }

        @Override // ae0.AbstractC5006b
        public final void g(String str) {
            f36627f = str;
        }

        @Override // ae0.AbstractC5006b
        public final void h() {
            f36628g = true;
        }
    }

    public /* synthetic */ AbstractC5006b(int i11) {
        this();
    }

    public String a() {
        return this.f36622a;
    }

    public boolean b() {
        return this.f36623b;
    }

    public final String c() {
        return this.f36624c;
    }

    @NotNull
    public abstract EnumC5007c d();

    protected abstract void e(@NotNull Context context, @NotNull String str);

    public boolean f() {
        String a11 = a();
        return !(a11 == null || kotlin.text.h.K(a11));
    }

    public void g(String str) {
        this.f36622a = str;
    }

    public void h() {
        this.f36623b = true;
    }

    public final void i(String str) {
        this.f36624c = str;
    }

    private AbstractC5006b() {
    }
}
