package com.google.android.gms.net;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.C0856f;
import com.google.android.gms.common.C0857g;
import com.google.android.gms.common.C0858h;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.j;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ApiVersion;

/* loaded from: classes4.dex */
public final class a {
    public static final C0856f a = C0856f.b;
    public static final Object b = new Object();

    @Nullable
    public static DynamiteModule c = null;
    public static String d = SessionDescription.SUPPORTED_SDP_VERSION;

    @Deprecated
    public static void a(@NonNull Context context) throws C0857g, C0858h {
        DynamiteModule dynamiteModule;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dynamiteModule = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dynamiteModule != null) {
            return;
        }
        C0875q.h(context, "Context must not be null");
        ClassLoader classLoader = a.class.getClassLoader();
        C0875q.g(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            C0856f c0856f = a;
            c0856f.getClass();
            AtomicBoolean atomicBoolean = j.a;
            C0856f c0856f2 = C0856f.b;
            int c2 = c0856f2.c(context, 11925000);
            if (c2 != 0) {
                if (c0856f2.a(context, c2, "e") != null) {
                    throw new C0858h("Google Play Services not available");
                }
                throw new C0857g();
            }
            try {
                DynamiteModule c3 = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> loadClass = c3.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() == a.class.getClassLoader()) {
                        throw new C0857g();
                    }
                    Method method = loadClass.getMethod("getApiLevel", null);
                    Method method2 = loadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    C0875q.g(num);
                    int intValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    C0875q.g(str);
                    d = str;
                    if (apiLevel <= intValue) {
                        c = c3;
                        return;
                    }
                    if (c0856f.a(context, 2, "cr") == null) {
                        throw new C0857g();
                    }
                    String str2 = d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(intValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new C0858h(sb.toString());
                } catch (Exception e) {
                    throw ((C0857g) new C0857g().initCause(e));
                }
            } catch (DynamiteModule.a e2) {
                throw ((C0857g) new C0857g().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            throw ((C0857g) new C0857g().initCause(e3));
        }
    }
}
