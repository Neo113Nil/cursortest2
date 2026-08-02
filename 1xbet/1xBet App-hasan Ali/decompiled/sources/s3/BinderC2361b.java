package s3;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import m3.v;
import n.AbstractC2107A;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2361b extends C3.c implements InterfaceC2360a {

    /* renamed from: l, reason: collision with root package name */
    public final Object f19206l;

    public BinderC2361b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f19206l = obj;
    }

    public static InterfaceC2360a h1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof InterfaceC2360a ? (InterfaceC2360a) queryLocalInterface : new C2363d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object t1(InterfaceC2360a interfaceC2360a) {
        if (interfaceC2360a instanceof BinderC2361b) {
            return ((BinderC2361b) interfaceC2360a).f19206l;
        }
        IBinder asBinder = interfaceC2360a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC2107A.q("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        v.e(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException("Binder object is null.", e5);
        }
    }
}
