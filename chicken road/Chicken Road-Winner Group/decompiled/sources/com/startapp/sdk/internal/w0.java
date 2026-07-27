package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Application f4550a;

    public static Context a(Context context) {
        Context context2 = f4550a;
        if (context2 != null) {
            return context2;
        }
        try {
            if (context instanceof Application) {
                try {
                    f4550a = (Application) context;
                } catch (Throwable unused) {
                }
                context2 = context;
            } else if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    context2 = a(baseContext);
                }
            } else if (context != null) {
                context2 = context.getApplicationContext();
            }
        } catch (Throwable unused2) {
        }
        if (context2 != null) {
            return context2;
        }
        Application application = f4550a;
        if (application == null) {
            synchronized (w0.class) {
                try {
                    application = f4550a;
                    if (application == null) {
                        try {
                            Method declaredMethod = Class.forName(Activity.class.getName().concat("Thread")).getDeclaredMethod("current".concat("Application"), new Class[0]);
                            declaredMethod.setAccessible(true);
                            application = (Application) declaredMethod.invoke(null, new Object[0]);
                        } catch (Throwable unused3) {
                        }
                        f4550a = application;
                    }
                } finally {
                }
            }
        }
        return application == null ? context : application;
    }
}
