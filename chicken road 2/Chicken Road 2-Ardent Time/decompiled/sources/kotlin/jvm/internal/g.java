package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class g extends kotlin.jvm.internal.b implements kotlin.jvm.internal.f, w1.e {
    private final int arity;
    private final int flags;

    public g(int i2, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public w1.InterfaceC1009b computeReflected() {
        kotlin.jvm.internal.q.f7961a.getClass();
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.g) {
            kotlin.jvm.internal.g gVar = (kotlin.jvm.internal.g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && kotlin.jvm.internal.i.a(getBoundReceiver(), gVar.getBoundReceiver()) && kotlin.jvm.internal.i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof w1.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // w1.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // w1.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // w1.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // w1.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // w1.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public java.lang.String toString() {
        w1.InterfaceC1009b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public w1.e getReflected() {
        w1.InterfaceC1009b compute = compute();
        if (compute != this) {
            return (w1.e) compute;
        }
        throw new r1.C0988a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
