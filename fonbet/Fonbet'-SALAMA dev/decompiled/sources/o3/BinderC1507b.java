package o3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.common.zzb;
import e1.k;
import java.lang.reflect.Field;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1507b extends zzb implements InterfaceC1506a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15601a;

    public BinderC1507b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f15601a = obj;
    }

    public static InterfaceC1506a Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof InterfaceC1506a ? (InterfaceC1506a) queryLocalInterface : new e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object t0(InterfaceC1506a interfaceC1506a) {
        if (interfaceC1506a instanceof BinderC1507b) {
            return ((BinderC1507b) interfaceC1506a).f15601a;
        }
        IBinder asBinder = interfaceC1506a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException(k.d(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        D.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }
}
