package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class b implements w1.InterfaceC1009b, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = kotlin.jvm.internal.a.f7952a;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient w1.InterfaceC1009b reflected;
    private final java.lang.String signature;

    public b(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // w1.InterfaceC1009b
    public java.lang.Object call(java.lang.Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // w1.InterfaceC1009b
    public java.lang.Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    public w1.InterfaceC1009b compute() {
        w1.InterfaceC1009b interfaceC1009b = this.reflected;
        if (interfaceC1009b != null) {
            return interfaceC1009b;
        }
        w1.InterfaceC1009b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract w1.InterfaceC1009b computeReflected();

    @Override // w1.InterfaceC1008a
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public java.lang.Object getBoundReceiver() {
        return this.receiver;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public w1.d getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return kotlin.jvm.internal.q.a(cls);
        }
        kotlin.jvm.internal.q.f7961a.getClass();
        return new kotlin.jvm.internal.k(cls);
    }

    @Override // w1.InterfaceC1009b
    public java.util.List<java.lang.Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract w1.InterfaceC1009b getReflected();

    @Override // w1.InterfaceC1009b
    public w1.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // w1.InterfaceC1009b
    public java.util.List<java.lang.Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // w1.InterfaceC1009b
    public w1.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // w1.InterfaceC1009b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // w1.InterfaceC1009b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // w1.InterfaceC1009b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
