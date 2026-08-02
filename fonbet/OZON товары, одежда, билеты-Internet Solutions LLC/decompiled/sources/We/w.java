package We;

import We.A;
import We.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9682h;

/* loaded from: classes10.dex */
public final class w extends K {

    /* renamed from: c, reason: collision with root package name */
    private static final C f33808c;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f33809a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f33810b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f33811a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f33812b;

        public a() {
            this(0);
        }

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f33811a;
            A.b bVar = A.f33515l;
            arrayList.add(A.b.a(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, 91));
            this.f33812b.add(A.b.a(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, 91));
        }

        @NotNull
        public final void b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f33811a;
            A.b bVar = A.f33515l;
            arrayList.add(A.b.a(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, 83));
            this.f33812b.add(A.b.a(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, 83));
        }

        @NotNull
        public final w c() {
            return new w(this.f33811a, this.f33812b);
        }

        public a(int i11) {
            this.f33811a = new ArrayList();
            this.f33812b = new ArrayList();
        }
    }

    static {
        C.f33536g.getClass();
        f33808c = C.a.a("application/x-www-form-urlencoded");
    }

    public w(@NotNull ArrayList encodedNames, @NotNull ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f33809a = Ye.b.B(encodedNames);
        this.f33810b = Ye.b.B(encodedValues);
    }

    private final long a(InterfaceC9682h interfaceC9682h, boolean z11) {
        C9681g f7;
        if (z11) {
            f7 = new C9681g();
        } else {
            Intrinsics.f(interfaceC9682h);
            f7 = interfaceC9682h.f();
        }
        List<String> list = this.f33809a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                f7.d0(38);
            }
            f7.H0(list.get(i11));
            f7.d0(61);
            f7.H0(this.f33810b.get(i11));
        }
        if (!z11) {
            return 0L;
        }
        long size2 = f7.size();
        f7.c();
        return size2;
    }

    @Override // We.K
    public final long contentLength() {
        return a(null, true);
    }

    @Override // We.K
    @NotNull
    /* renamed from: contentType */
    public final C getContentType() {
        return f33808c;
    }

    @Override // We.K
    public final void writeTo(@NotNull InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
