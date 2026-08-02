package com.google.android.gms.dynamic;

/* loaded from: classes4.dex */
public interface IObjectWrapper extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static com.google.android.gms.dynamic.IObjectWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof com.google.android.gms.dynamic.IObjectWrapper ? (com.google.android.gms.dynamic.IObjectWrapper) queryLocalInterface : new com.google.android.gms.dynamic.zzb(iBinder);
        }
    }
}
