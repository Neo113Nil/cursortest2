package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.C0692d;
import com.facebook.appevents.internal.g;
import com.facebook.internal.C0713i;
import com.facebook.internal.E;
import com.facebook.ppml.receiver.a;
import com.facebook.w;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();
    public static Boolean b;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        public final String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.a;
        }
    }

    public static final class b implements ServiceConnection {
        public final CountDownLatch a = new CountDownLatch(1);
        public IBinder b;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.b = serviceBinder;
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.facebook.appevents.ondeviceprocessing.c$c, reason: collision with other inner class name */
    public static final class EnumC0084c {
        public static final EnumC0084c a;
        public static final EnumC0084c b;
        public static final EnumC0084c c;
        public static final /* synthetic */ EnumC0084c[] d;

        static {
            EnumC0084c enumC0084c = new EnumC0084c("OPERATION_SUCCESS", 0);
            a = enumC0084c;
            EnumC0084c enumC0084c2 = new EnumC0084c("SERVICE_NOT_AVAILABLE", 1);
            b = enumC0084c2;
            EnumC0084c enumC0084c3 = new EnumC0084c("SERVICE_ERROR", 2);
            c = enumC0084c3;
            d = new EnumC0084c[]{enumC0084c, enumC0084c2, enumC0084c3};
        }

        public EnumC0084c() {
            throw null;
        }

        public static EnumC0084c valueOf(String str) {
            return (EnumC0084c) Enum.valueOf(EnumC0084c.class, str);
        }

        public static EnumC0084c[] values() {
            return (EnumC0084c[]) d.clone();
        }
    }

    public final Intent a(Context context) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C0713i.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C0713i.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final EnumC0084c b(a aVar, String str, List<C0692d> list) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            EnumC0084c enumC0084c = EnumC0084c.b;
            int i = g.a;
            Context a2 = w.a();
            Intent a3 = a(a2);
            if (a3 == null) {
                return enumC0084c;
            }
            b bVar = new b();
            try {
                if (a2.bindService(a3, bVar, 1)) {
                    try {
                        bVar.a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = bVar.b;
                        if (iBinder != null) {
                            com.facebook.ppml.receiver.a C = a.AbstractBinderC0098a.C(iBinder);
                            Bundle a4 = com.facebook.appevents.ondeviceprocessing.b.a(aVar, str, list);
                            if (a4 != null) {
                                C.a(a4);
                                a4.toString();
                                E e = E.a;
                            }
                            enumC0084c = EnumC0084c.a;
                        }
                        a2.unbindService(bVar);
                        E e2 = E.a;
                        return enumC0084c;
                    } catch (RemoteException unused) {
                        E e3 = E.a;
                        w wVar = w.a;
                        a2.unbindService(bVar);
                        return EnumC0084c.c;
                    } catch (InterruptedException unused2) {
                        E e4 = E.a;
                        w wVar2 = w.a;
                        a2.unbindService(bVar);
                        return EnumC0084c.c;
                    }
                }
                return EnumC0084c.c;
            } catch (Throwable th) {
                a2.unbindService(bVar);
                E e5 = E.a;
                w wVar3 = w.a;
                throw th;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }
}
