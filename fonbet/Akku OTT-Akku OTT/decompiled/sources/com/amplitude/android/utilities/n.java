package com.amplitude.android.utilities;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {
    /* JADX WARN: Removed duplicated region for block: B:5:0x005f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0061 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String clazz, com.amplitude.common.a aVar) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            cls = Class.forName(clazz);
        } catch (ClassNotFoundException e) {
            if (aVar != null) {
                aVar.c("Class not available:" + clazz + ": " + e);
            }
            cls = null;
            if (cls == null) {
            }
        } catch (UnsatisfiedLinkError e2) {
            if (aVar != null) {
                aVar.b("Failed to load (UnsatisfiedLinkError) " + clazz + ": " + e2);
            }
            cls = null;
            if (cls == null) {
            }
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.b("Failed to initialize " + clazz + ": " + th);
            }
            cls = null;
            if (cls == null) {
            }
        }
        return cls == null;
    }
}
