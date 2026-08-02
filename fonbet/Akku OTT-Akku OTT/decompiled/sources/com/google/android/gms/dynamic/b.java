package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.a;
import java.lang.reflect.Field;

@RetainForClient
/* loaded from: classes4.dex */
public final class b<T> extends a.AbstractBinderC0114a {
    public final Object a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    @NonNull
    public static <T> T D(@NonNull a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).a;
        }
        IBinder asBinder = aVar.asBinder();
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
            throw new IllegalArgumentException(android.support.v4.media.a.a(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        C0875q.g(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
