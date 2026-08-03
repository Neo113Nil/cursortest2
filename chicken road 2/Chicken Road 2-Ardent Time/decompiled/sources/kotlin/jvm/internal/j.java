package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class j implements kotlin.jvm.internal.f, java.io.Serializable {
    private final int arity;

    public j(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public java.lang.String toString() {
        kotlin.jvm.internal.q.f7961a.getClass();
        java.lang.String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        kotlin.jvm.internal.i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
