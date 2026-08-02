package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbx extends java.lang.RuntimeException {
    private zzbx(java.lang.Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static java.lang.Object zzc(java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new com.google.android.play.core.splitinstall.internal.zzbx(e2);
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.Exception getCause() {
        java.lang.Exception exc;
        synchronized (this) {
            exc = (java.lang.Exception) super.getCause();
        }
        return exc;
    }

    public final java.lang.Exception zzb(java.lang.Class cls) {
        int indexOf;
        java.lang.String obj;
        java.lang.Class[] clsArr = {cls};
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            java.lang.Class cls2 = clsArr[0];
            if (java.lang.RuntimeException.class.isAssignableFrom(cls2)) {
                java.lang.Object[] objArr = {"getCause", cls2};
                for (int i3 = 0; i3 < 2; i3++) {
                    java.lang.Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        obj = "null";
                    } else {
                        try {
                            obj = obj2.toString();
                        } catch (java.lang.Exception e) {
                            java.lang.String name2 = obj2.getClass().getName();
                            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj2));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(name2);
                            sb.append("@");
                            sb.append(hexString);
                            java.lang.String obj3 = sb.toString();
                            java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(obj3), (java.lang.Throwable) e);
                            java.lang.String name3 = e.getClass().getName();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<");
                            sb2.append(obj3);
                            sb2.append(" threw ");
                            sb2.append(name3);
                            sb2.append(">");
                            obj = sb2.toString();
                        }
                    }
                    objArr[i3] = obj;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(118);
                int i4 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i4)) != -1) {
                    sb3.append((java.lang.CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, indexOf);
                    sb3.append(objArr[i]);
                    i4 = indexOf + 2;
                    i++;
                }
                sb3.append((java.lang.CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, 86);
                if (i < 2) {
                    sb3.append(" [");
                    sb3.append(objArr[i]);
                    for (int i5 = i + 1; i5 < 2; i5++) {
                        sb3.append(", ");
                        sb3.append(objArr[i5]);
                    }
                    sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                }
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (java.lang.Exception) cls.cast(getCause());
        }
        java.lang.Exception cause = getCause();
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException(java.lang.String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
