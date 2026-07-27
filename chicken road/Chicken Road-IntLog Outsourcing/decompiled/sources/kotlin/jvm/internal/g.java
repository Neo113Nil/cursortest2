package kotlin.jvm.internal;

import D4.C0023x;
import z4.InterfaceC1585b;
import z4.InterfaceC1588e;

/* loaded from: classes.dex */
public abstract class g extends b implements f, InterfaceC1588e {
    private final int arity;
    private final int flags;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public InterfaceC1585b computeReflected() {
        t.f10742a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof InterfaceC1588e) {
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

    @Override // z4.InterfaceC1588e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // z4.InterfaceC1588e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // z4.InterfaceC1588e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // z4.InterfaceC1588e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.b, z4.InterfaceC1585b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1585b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public InterfaceC1588e getReflected() {
        InterfaceC1585b compute = compute();
        if (compute != this) {
            return (InterfaceC1588e) compute;
        }
        throw new C0023x("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
