package Ve;

import N4.b;
import Sc.InterfaceC4008j;
import Sc.r;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4371k0 implements H6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31405a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31406b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f31407c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4008j f31408d;

    public C4371k0(Context context) {
        Object a11;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31405a = context;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            b.a aVar = new b.a(context);
            aVar.b(b.EnumC0359b.AES256_GCM);
            a11 = aVar.a();
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        this.f31406b = a11;
        this.f31407c = He.g.a(this, this.f31405a, 0, new C(this));
        this.f31408d = Sc.k.b(Qr.f29811b);
    }

    @Override // Ve.H6
    public final SharedPreferences a(int i11, Function0 function0, Context context) {
        return He.g.a(this, context, i11, function0);
    }

    @Override // Ve.H6
    public final String a() {
        return "session_store";
    }
}
