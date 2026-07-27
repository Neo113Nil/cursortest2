package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class h extends c implements g, t2.e {
    private final int arity;
    private final int flags;

    public h(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.arity = i3;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public t2.b computeReflected() {
        r.f9673a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.a(getBoundReceiver(), hVar.getBoundReceiver()) && j.a(getOwner(), hVar.getOwner());
        }
        if (obj instanceof t2.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // t2.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // t2.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // t2.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // t2.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // t2.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        t2.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public t2.e getReflected() {
        t2.b compute = compute();
        if (compute != this) {
            return (t2.e) compute;
        }
        throw new n2.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
