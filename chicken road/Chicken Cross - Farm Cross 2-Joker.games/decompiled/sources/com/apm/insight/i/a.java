package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* compiled from: DeviceUuidFactory.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f3997a = null;
    private static String b = "";

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            if (TextUtils.isEmpty(b)) {
                new a(context);
                UUID uuid = f3997a;
                if (uuid != null) {
                    b = uuid.toString();
                }
            }
            str = b;
        }
        return str;
    }

    private a(Context context) {
        String str;
        if (f3997a == null) {
            synchronized (a.class) {
                if (f3997a == null) {
                    String c = o.a().c();
                    if (c != null) {
                        f3997a = UUID.fromString(c);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        try {
                            if (str != null) {
                                f3997a = UUID.nameUUIDFromBytes(str.getBytes("utf8"));
                            } else {
                                f3997a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f3997a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
