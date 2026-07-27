package V0;

import android.content.Context;
import b1.C0273j;
import b1.C0274k;
import e1.InterfaceC0410a;
import e4.InterfaceC0412a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import l3.C1258d;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C1258d f3220e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0410a f3221a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0410a f3222b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.d f3223c;

    /* renamed from: d, reason: collision with root package name */
    public final C0273j f3224d;

    public o(InterfaceC0410a interfaceC0410a, InterfaceC0410a interfaceC0410a2, a1.d dVar, C0273j c0273j, C0274k c0274k) {
        this.f3221a = interfaceC0410a;
        this.f3222b = interfaceC0410a2;
        this.f3223c = dVar;
        this.f3224d = c0273j;
        c0274k.getClass();
        c0274k.f4796a.execute(new B2.b(6, c0274k));
    }

    public static o a() {
        C1258d c1258d = f3220e;
        if (c1258d != null) {
            return (o) ((InterfaceC0412a) c1258d.f11052g).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f3220e == null) {
            synchronized (o.class) {
                try {
                    if (f3220e == null) {
                        j jVar = new j(0, false);
                        context.getClass();
                        jVar.f3212b = context;
                        f3220e = jVar.A();
                    }
                } finally {
                }
            }
        }
    }

    public final n c(T0.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(T0.a.f2764d) : Collections.singleton(new S0.c("proto"));
        B4.i a6 = i.a();
        aVar.getClass();
        a6.f311b = "cct";
        String str = aVar.f2767a;
        String str2 = aVar.f2768b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a6.f312c = bytes;
        return new n(unmodifiableSet, a6.v(), this);
    }
}
