package N1;

import a2.C0181b;
import android.util.Log;
import b2.AbstractC0279e;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Y1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2004b;

    public /* synthetic */ c(int i2, Object obj) {
        this.f2003a = i2;
        this.f2004b = obj;
    }

    @Override // Y1.a
    public final Object get() {
        switch (this.f2003a) {
            case 0:
                String str = (String) this.f2004b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e3) {
                    throw new l(AbstractC0279e.f("Could not instantiate ", str, "."), e3);
                } catch (InstantiationException e6) {
                    throw new l(AbstractC0279e.f("Could not instantiate ", str, "."), e6);
                } catch (NoSuchMethodException e7) {
                    throw new l(B0.o.i("Could not instantiate ", str), e7);
                } catch (InvocationTargetException e8) {
                    throw new l(B0.o.i("Could not instantiate ", str), e8);
                }
            case 1:
                return (ComponentRegistrar) this.f2004b;
            default:
                return new C0181b((K1.g) this.f2004b);
        }
    }
}
