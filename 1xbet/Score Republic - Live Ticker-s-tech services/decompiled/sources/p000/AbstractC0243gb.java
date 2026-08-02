package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0243gb implements InterfaceC0808vm, InterfaceC0550on, Serializable {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0808vm f2682j;

    public AbstractC0243gb(InterfaceC0808vm interfaceC0808vm) {
        this.f2682j = interfaceC0808vm;
    }

    @Override // p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public InterfaceC0550on mo1182c() {
        InterfaceC0808vm interfaceC0808vm = this.f2682j;
        if (interfaceC0808vm instanceof InterfaceC0550on) {
            return (InterfaceC0550on) interfaceC0808vm;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC0243gb abstractC0243gb = (AbstractC0243gb) r2;
            InterfaceC0808vm interfaceC0808vm = abstractC0243gb.f2682j;
            interfaceC0808vm.getClass();
            try {
                obj = abstractC0243gb.mo17m(obj);
                if (obj == EnumC0513nn.f5459j) {
                    return;
                }
            } catch (Throwable th) {
                obj = new o21(th);
            }
            abstractC0243gb.mo2013o();
            if (!(interfaceC0808vm instanceof AbstractC0243gb)) {
                interfaceC0808vm.mo476f(obj);
                return;
            }
            r2 = interfaceC0808vm;
        }
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: l */
    public StackTraceElement mo2012l() {
        int iIntValue;
        String strM5822c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC0922yp interfaceC0922yp = (InterfaceC0922yp) getClass().getAnnotation(InterfaceC0922yp.class);
        String str = null;
        if (interfaceC0922yp == null || interfaceC0922yp.m5826v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC0922yp.m5824l()[iIntValue] : -1;
        qd0 qd0Var = n80.f5329b;
        qd0 qd0Var2 = n80.f5330c;
        if (qd0Var2 == null) {
            try {
                qd0 qd0Var3 = new qd0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 29);
                n80.f5330c = qd0Var3;
                qd0Var2 = qd0Var3;
            } catch (Exception unused2) {
                n80.f5330c = qd0Var;
                qd0Var2 = qd0Var;
            }
        }
        if (qd0Var2 != qd0Var && (method = (Method) qd0Var2.f6471k) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) qd0Var2.f6472l) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) qd0Var2.f6473m;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM5822c = interfaceC0922yp.m5822c();
        } else {
            strM5822c = str + '/' + interfaceC0922yp.m5822c();
        }
        return new StackTraceElement(strM5822c, interfaceC0922yp.m5825m(), interfaceC0922yp.m5823f(), i);
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo17m(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo2012l = mo2012l();
        if (objMo2012l == null) {
            objMo2012l = getClass().getName();
        }
        sb.append(objMo2012l);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public void mo2013o() {
    }
}
