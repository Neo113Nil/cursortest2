package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0779 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final /* synthetic */ int f2275 = 0;

    static {
        StringFog.decrypt("8+n7lB3j5O/e4vuUAtXb4dHn/5AD4vrhzPXZkRDR4uXN\n", "v4aY9XGhloA=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5665(Context context) {
        Class<?> cls;
        try {
            String decrypt = StringFog.decrypt("aNUYB9yhyzAn1xMW0qTNOmbaGBbSu9slaNUdEta6gStm1QgQ3byBBGbYHRnxusApbdgdBseFziZo\n3BkH\n", "Cbt8dbPIr0g=\n");
            String str = AbstractC0940.f2644;
            try {
                cls = Class.forName(decrypt);
            } catch (Throwable unused) {
                cls = null;
            }
            return AbstractC0940.m5780(cls, StringFog.decrypt("au/8/PzERNNj6e0=\n", "DYqItZK3MLI=\n"), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            return null;
        }
    }
}
