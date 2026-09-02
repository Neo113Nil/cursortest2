package a0;

import g0.h;
import g0.l;

/* loaded from: classes.dex */
public abstract class f extends b implements g0.f {

    /* renamed from: e, reason: collision with root package name */
    public final int f423e;

    public f(Y.d dVar) {
        super(dVar);
        this.f423e = 2;
    }

    @Override // g0.f
    public final int d() {
        return this.f423e;
    }

    @Override // a0.b
    public final String toString() {
        if (this.f418b != null) {
            return super.toString();
        }
        l.f547a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
