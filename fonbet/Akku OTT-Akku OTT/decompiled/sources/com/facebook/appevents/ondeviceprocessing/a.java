package com.facebook.appevents.ondeviceprocessing;

import androidx.annotation.RestrictTo;
import com.facebook.internal.E;
import com.facebook.w;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static final Set<String> b = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class<com.facebook.appevents.ondeviceprocessing.a>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a() {
        Boolean bool;
        boolean z;
        Object obj = a.class;
        if (com.facebook.internal.instrument.crashshield.a.b(obj)) {
            return false;
        }
        try {
            if (w.f(w.a()) || E.x()) {
                return false;
            }
            c cVar = c.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                try {
                    if (c.b == null) {
                        c.b = Boolean.valueOf(c.a.a(w.a()) != null);
                    }
                    bool = c.b;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, c.class);
                }
                if (bool != null) {
                    obj = bool.booleanValue();
                    z = obj;
                    return !z;
                }
            }
            z = false;
            if (!z) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, obj);
            return false;
        }
    }
}
