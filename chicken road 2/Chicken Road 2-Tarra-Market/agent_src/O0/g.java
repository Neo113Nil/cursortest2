package O0;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class g extends b implements kotlin.jvm.internal.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f284d;

    public g(M0.d dVar) {
        super(dVar);
        this.f284d = 2;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f284d;
    }

    @Override // O0.b
    public final String toString() {
        if (this.f276a != null) {
            return super.toString();
        }
        n.f6081a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        j.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
