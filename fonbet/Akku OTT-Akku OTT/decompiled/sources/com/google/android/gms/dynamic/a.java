package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0114a extends zzb implements a {
        @NonNull
        public static a C(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }
}
