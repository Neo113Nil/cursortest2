package com.google.android.gms.cloudmessaging;

/* loaded from: classes3.dex */
public final class zzc extends java.lang.ClassLoader {
    @Override // java.lang.ClassLoader
    protected final java.lang.Class loadClass(java.lang.String str, boolean z) throws java.lang.ClassNotFoundException {
        if (!java.util.Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        if (!android.util.Log.isLoggable("CloudMessengerCompat", 3)) {
            return com.google.android.gms.cloudmessaging.zzd.class;
        }
        android.util.Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return com.google.android.gms.cloudmessaging.zzd.class;
    }
}
