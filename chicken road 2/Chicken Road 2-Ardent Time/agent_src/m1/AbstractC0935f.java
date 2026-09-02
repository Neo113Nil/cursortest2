package m1;

/* renamed from: m1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0935f extends m1.AbstractC0931b implements kotlin.jvm.internal.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f8080d;

    public AbstractC0935f(int i2, k1.d dVar) {
        super(dVar);
        this.f8080d = i2;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f8080d;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.String toString() {
        if (this.f8075a != null) {
            return super.toString();
        }
        kotlin.jvm.internal.q.f7961a.getClass();
        java.lang.String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        kotlin.jvm.internal.i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
