package p105o3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzb implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15607a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f15607a = obj;
    }

    public static a Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object t0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f15607a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
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
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }
}
