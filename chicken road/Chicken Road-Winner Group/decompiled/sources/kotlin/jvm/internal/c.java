package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements t2.b, Serializable {
    public static final Object NO_RECEIVER = b.f9662a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient t2.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z3;
    }

    @Override // t2.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // t2.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public t2.b compute() {
        t2.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        t2.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract t2.b computeReflected();

    @Override // t2.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public t2.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return r.a(cls);
        }
        r.f9673a.getClass();
        return new l(cls);
    }

    @Override // t2.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract t2.b getReflected();

    @Override // t2.b
    public t2.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // t2.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // t2.b
    public t2.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // t2.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // t2.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // t2.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
