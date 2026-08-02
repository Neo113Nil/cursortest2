package p000;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: kk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0399kk implements my0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4399b;

    public /* synthetic */ C0399kk(int i, Object obj) {
        this.f4398a = i;
        this.f4399b = obj;
    }

    @Override // p000.my0
    public final Object get() {
        int i = this.f4398a;
        Object obj = this.f4399b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new jf0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new jf0(AbstractC0024an.m284g("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new jf0(AbstractC0024an.m284g("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new jf0(AbstractC0024an.m283f("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new jf0(AbstractC0024an.m283f("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new ac0((w00) obj);
        }
    }
}
