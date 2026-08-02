package Y60;

import H30.q;
import Hj.C3143a;
import com.squareup.moshi.Moshi;
import e70.EnumC6315b;
import e70.InterfaceC6317d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f34702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<T> f34703b;

    public a(@NotNull Moshi moshi, @NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        this.f34702a = moshi;
        this.f34703b = modelClass;
    }

    public static String c(a aVar, String url, String str, int i11) {
        boolean z11 = (i11 & 2) == 0;
        boolean z12 = (i11 & 4) == 0;
        if ((i11 & 8) != 0) {
            str = null;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        String m02 = kotlin.text.h.m0(kotlin.text.h.m0(url, "?"), "#");
        String k02 = kotlin.text.h.k0(m02, "/", m02);
        if (kotlin.text.h.K(k02)) {
            k02 = "image";
        }
        String g10 = C3143a.g("[^A-Za-z0-9._-]", kotlin.text.h.o0(k02, ".", k02), "_");
        String str2 = "";
        String g11 = C3143a.g("[^A-Za-z0-9]", kotlin.text.h.k0(k02, ".", ""), "");
        if (z11) {
            str2 = "avatar";
        } else if (z12) {
            str2 = Nk.a.b("bank_logo_", str);
        }
        if (kotlin.text.h.K(g11) || !kotlin.text.h.t(k02, ".", false)) {
            return G.g.c(str2, "_", g10);
        }
        return str2 + "_" + g10 + "." + g11;
    }

    @Override // Y60.b
    public final InterfaceC6317d a(@NotNull String rawJson) {
        Intrinsics.checkNotNullParameter(rawJson, "rawJson");
        Object a11 = q.a(this.f34702a, rawJson, this.f34703b);
        return a11 == null ? new InterfaceC6317d.a(EnumC6315b.SERIALIZATION) : new InterfaceC6317d.b(a11);
    }
}
