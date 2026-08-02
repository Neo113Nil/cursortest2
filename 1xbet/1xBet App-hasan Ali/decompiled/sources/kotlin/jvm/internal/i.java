package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.Fw;
import m4.InterfaceC2099b;
import m4.InterfaceC2102e;

/* loaded from: classes.dex */
public abstract class i extends c implements h, InterfaceC2102e {
    private final int arity;
    private final int flags;

    public i(int i, int i5, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC2099b computeReflected() {
        x.f17625a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof InterfaceC2102e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // m4.InterfaceC2102e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // m4.InterfaceC2102e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // m4.InterfaceC2102e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // m4.InterfaceC2102e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // m4.InterfaceC2102e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2099b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC2102e getReflected() {
        InterfaceC2099b compute = compute();
        if (compute != this) {
            return (InterfaceC2102e) compute;
        }
        throw new Fw("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
