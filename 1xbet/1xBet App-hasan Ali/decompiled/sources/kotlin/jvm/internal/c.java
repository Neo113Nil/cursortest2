package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import m4.InterfaceC2099b;
import m4.InterfaceC2101d;
import m4.InterfaceC2106i;

/* loaded from: classes.dex */
public abstract class c implements InterfaceC2099b, Serializable {
    public static final Object NO_RECEIVER = b.f17611k;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2099b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z3;
    }

    @Override // m4.InterfaceC2099b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // m4.InterfaceC2099b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2099b compute() {
        InterfaceC2099b interfaceC2099b = this.reflected;
        if (interfaceC2099b != null) {
            return interfaceC2099b;
        }
        InterfaceC2099b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC2099b computeReflected();

    @Override // m4.InterfaceC2098a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC2101d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return x.a(cls);
        }
        x.f17625a.getClass();
        return new p(cls);
    }

    @Override // m4.InterfaceC2099b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC2099b getReflected();

    @Override // m4.InterfaceC2099b
    public InterfaceC2106i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // m4.InterfaceC2099b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // m4.InterfaceC2099b
    public m4.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // m4.InterfaceC2099b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // m4.InterfaceC2099b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // m4.InterfaceC2099b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
