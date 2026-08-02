package com.facebook.appevents.integrity;

import com.facebook.appevents.ml.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();
    public static boolean b;
    public static boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r3 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i = 0; i < 30; i++) {
                        fArr[i] = 0.0f;
                    }
                    String[] f = com.facebook.appevents.ml.d.f(d.a.a, new float[][]{fArr}, new String[]{str});
                    if (f != null) {
                        str2 = f[0];
                    }
                    str2 = "none";
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
            return !Intrinsics.areEqual("none", str2);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return false;
        }
    }
}
