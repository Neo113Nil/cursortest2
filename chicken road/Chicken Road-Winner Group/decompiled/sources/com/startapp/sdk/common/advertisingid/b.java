package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.l0;
import com.startapp.sdk.internal.l3;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.u5;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3325a;

    /* renamed from: b, reason: collision with root package name */
    public final u5 f3326b;

    /* renamed from: c, reason: collision with root package name */
    public final l3 f3327c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f3328d;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f3329e;
    public final AtomicReference f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3330g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f3331h;

    /* renamed from: i, reason: collision with root package name */
    public final double f3332i;

    /* renamed from: j, reason: collision with root package name */
    public int f3333j;

    public b(Context context, u5 u5Var, l3 l3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f3328d = reentrantLock;
        this.f3329e = reentrantLock.newCondition();
        this.f = new AtomicReference();
        this.f3330g = true;
        this.f3331h = 0;
        this.f3332i = ((Random) si.f4346d.a()).nextDouble();
        this.f3325a = context;
        this.f3326b = u5Var;
        this.f3327c = l3Var;
    }

    public final boolean a(int i3) {
        this.f3327c.getClass();
        AdvertisingIdResolverMetadata g3 = MetaData.E().g();
        if (g3 == null || !g3.c()) {
            g3 = null;
        }
        return g3 != null && this.f3332i < g3.b() && (g3.a() & i3) == i3;
    }

    public final void b(int i3) {
        if (a(i3)) {
            int i4 = this.f3333j;
            if ((i4 & i3) == i3) {
                return;
            }
            this.f3333j = i4 | i3;
            d9 d9Var = new d9(e9.f3618e);
            d9Var.f3574d = "AIR";
            d9Var.f3575e = String.valueOf(i3);
            d9Var.a();
        }
    }

    public final void a(boolean z3) {
        boolean z4 = false;
        try {
            if (this.f3328d.tryLock()) {
                z4 = true;
                this.f3330g = z3;
                if (z3 && this.f3331h == 0) {
                    this.f3326b.newThread(new a(this)).start();
                    this.f3331h = 1;
                }
                this.f3328d.unlock();
            }
        } catch (Throwable th) {
            try {
                if (a(16)) {
                    d9.a(th);
                }
            } finally {
                if (z4) {
                    this.f3328d.unlock();
                }
            }
        }
    }

    public static k0 b(Context context) {
        l0 l0Var;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            l0Var = new l0();
            try {
                if (context.bindService(intent, l0Var, 1)) {
                    if (!l0Var.f3973b) {
                        IBinder iBinder = (IBinder) l0Var.f3972a.take();
                        if (iBinder != null) {
                            l0Var.f3973b = true;
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                iBinder.transact(1, obtain, obtain2, 0);
                                obtain2.readException();
                                String readString = obtain2.readString();
                                if (readString != null) {
                                    obtain = Parcel.obtain();
                                    obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                        obtain.writeInt(1);
                                        iBinder.transact(2, obtain, obtain2, 0);
                                        obtain2.readException();
                                        boolean z3 = obtain2.readInt() != 0;
                                        obtain2.recycle();
                                        obtain.recycle();
                                        k0 k0Var = new k0(readString, "DEVICE", z3);
                                        int i3 = p0.f4197a;
                                        try {
                                            context.unbindService(l0Var);
                                        } catch (Throwable unused) {
                                        }
                                        return k0Var;
                                    } finally {
                                    }
                                }
                                throw new RemoteException();
                            } finally {
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                throw new AdvertisingIdResolver$InternalException(2048);
            } catch (Throwable th) {
                th = th;
                int i4 = p0.f4197a;
                if (l0Var != null) {
                    try {
                        context.unbindService(l0Var);
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l0Var = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (r9.f3325a.checkSelfPermission("com.google.android.gms.permission.AD_ID") == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        b(4096);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 a() {
        k0 k0Var;
        ReentrantLock reentrantLock;
        k0 k0Var2 = (k0) this.f.get();
        if (k0Var2 != null) {
            return k0Var2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(1);
            return k0.f3939d;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f3328d.tryLock(1000L, TimeUnit.MILLISECONDS)) {
                try {
                    if (!this.f3330g) {
                        k0Var = k0.f3939d;
                        reentrantLock = this.f3328d;
                    } else {
                        if (this.f3331h == 0) {
                            this.f3326b.newThread(new a(this)).start();
                            this.f3331h = 1;
                        }
                        while (this.f3331h != 2) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (elapsedRealtime2 > 1000) {
                                b(2);
                                k0Var = k0.f3939d;
                                reentrantLock = this.f3328d;
                            } else {
                                this.f3329e.await(1000 - elapsedRealtime2, TimeUnit.MILLISECONDS);
                            }
                        }
                        k0 k0Var3 = (k0) this.f.get();
                        if (k0Var3 == null) {
                            b(4);
                            k0Var3 = k0.f3939d;
                        } else if ("00000000-0000-0000-0000-000000000000".equals(k0Var3.f3940a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                            } catch (Throwable th) {
                                if (a(8192)) {
                                    d9.a(th);
                                }
                            }
                        }
                        this.f3328d.unlock();
                        return k0Var3;
                    }
                    reentrantLock.unlock();
                    return k0Var;
                } catch (Throwable th2) {
                    this.f3328d.unlock();
                    throw th2;
                }
            }
            b(8);
            return k0.f3939d;
        } catch (Throwable th3) {
            if (a(32)) {
                d9.a(th3);
            }
            return k0.f3939d;
        }
    }

    public static k0 a(Context context) {
        Object obj;
        Class<?> cls = Boolean.TYPE;
        String str = null;
        try {
            obj = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
        } catch (NoSuchMethodException unused) {
            Class<?>[] declaredClasses = AdvertisingIdClient.class.getDeclaredClasses();
            if (declaredClasses.length == 1) {
                Field[] declaredFields = declaredClasses[0].getDeclaredFields();
                if (declaredFields.length == 2 && ((declaredFields[0].getType() == String.class && declaredFields[1].getType() == cls) || (declaredFields[0].getType() == cls && declaredFields[1].getType() == String.class))) {
                    for (Method method : AdvertisingIdClient.class.getDeclaredMethods()) {
                        if (method.getReturnType() == declaredClasses[0] && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Context.class) {
                            obj = method.invoke(null, context);
                            break;
                        }
                    }
                }
            }
            obj = null;
        }
        if (obj != null) {
            Field[] declaredFields2 = obj.getClass().getDeclaredFields();
            if (declaredFields2.length == 2) {
                Boolean bool = null;
                for (Field field : declaredFields2) {
                    field.setAccessible(true);
                    if (field.getType() == String.class) {
                        str = (String) field.get(obj);
                    } else if (field.getType() == cls) {
                        bool = (Boolean) field.get(obj);
                    }
                }
                if (str != null && !str.isEmpty()) {
                    return new k0(str, "APP", Boolean.TRUE.equals(bool));
                }
                throw new AdvertisingIdResolver$InternalException(1024);
            }
            throw new AdvertisingIdResolver$InternalException(512);
        }
        throw new AdvertisingIdResolver$InternalException(512);
    }
}
