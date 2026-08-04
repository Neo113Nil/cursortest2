package U0;

import kotlin.jvm.functions.Function1;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6390c;

    public h(Object obj, int i7, a aVar) {
        t6.h.e(obj, "value");
        k.o(i7, "verificationMode");
        this.f6388a = obj;
        this.f6389b = i7;
        this.f6390c = aVar;
    }

    @Override // U0.g
    public final Object a() {
        return this.f6388a;
    }

    @Override // U0.g
    public final g d(String str, Function1 function1) {
        Object obj = this.f6388a;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f6390c, this.f6389b);
    }
}
