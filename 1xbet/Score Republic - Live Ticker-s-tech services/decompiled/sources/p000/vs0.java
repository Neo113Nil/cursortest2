package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 extends cl1 implements xb0 {

    /* JADX INFO: renamed from: c */
    public final Object f8258c;

    public vs0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f8258c = obj;
    }

    /* JADX INFO: renamed from: G */
    public static xb0 m5187G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof xb0 ? (xb0) iInterfaceQueryLocalInterface : new ut1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    /* JADX INFO: renamed from: H */
    public static Object m5188H(xb0 xb0Var) {
        if (xb0Var instanceof vs0) {
            return ((vs0) xb0Var).f8258c;
        }
        IBinder iBinderAsBinder = xb0Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        p80.m3863h(field);
        if (field.isAccessible()) {
            C0270h1.m2190f("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
