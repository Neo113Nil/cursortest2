package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C0728q;
import com.facebook.S;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;

/* renamed from: com.facebook.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0705a {
    public static final C0089a Companion = new C0089a();

    @JvmField
    public static volatile C0705a f;
    public String a;
    public long b;
    public String c;
    public String d;
    public boolean e;

    /* renamed from: com.facebook.internal.a$a, reason: collision with other inner class name */
    public static final class C0089a {
        /* JADX WARN: Removed duplicated region for block: B:11:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[Catch: all -> 0x00e8, Exception -> 0x00ec, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013e A[Catch: all -> 0x00e8, Exception -> 0x00ec, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x014a A[Catch: all -> 0x00e8, Exception -> 0x00ec, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x014e A[Catch: all -> 0x00e8, Exception -> 0x00ec, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0157 A[Catch: all -> 0x00e8, Exception -> 0x00ec, TRY_LEAVE, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01ba A[Catch: all -> 0x00e8, Exception -> 0x00ec, TRY_ENTER, TryCatch #8 {Exception -> 0x00ec, all -> 0x00e8, blocks: (B:30:0x00c7, B:32:0x00d5, B:34:0x00d9, B:37:0x00f1, B:39:0x010b, B:41:0x0118, B:43:0x0138, B:45:0x013e, B:47:0x014a, B:49:0x014e, B:51:0x0157, B:87:0x0122, B:89:0x0130, B:91:0x01ba, B:92:0x01c1), top: B:29:0x00c7 }] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C0705a a(Context context) {
            C0705a c0705a;
            Exception exc;
            Cursor cursor;
            Throwable th;
            Uri uri;
            Uri parse;
            String installerPackageName;
            Method r;
            Object u;
            Intrinsics.checkNotNullParameter(context, "context");
            Cursor cursor2 = null;
            try {
            } catch (Exception unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
            try {
                if (b(context) && (r = E.r("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) != null && (u = E.u(null, r, context)) != null) {
                    Method q = E.q(u.getClass(), "getId", new Class[0]);
                    Method q2 = E.q(u.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (q != null && q2 != null) {
                        c0705a = new C0705a();
                        c0705a.a = (String) E.u(u, q, new Object[0]);
                        Boolean bool = (Boolean) E.u(u, q2, new Object[0]);
                        c0705a.e = bool != null ? bool.booleanValue() : false;
                        if (c0705a == null) {
                            if (b(context)) {
                                c cVar = new c();
                                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                                intent.setPackage("com.google.android.gms");
                                try {
                                    try {
                                    } catch (Throwable th2) {
                                        context.unbindService(cVar);
                                        throw th2;
                                    }
                                } catch (SecurityException unused2) {
                                }
                                if (context.bindService(intent, cVar, 1)) {
                                    try {
                                        b bVar = new b(cVar.a());
                                        C0705a c0705a2 = new C0705a();
                                        c0705a2.a = bVar.C();
                                        c0705a2.e = bVar.D();
                                        context.unbindService(cVar);
                                        c0705a = c0705a2;
                                    } catch (Exception unused3) {
                                        com.facebook.w wVar2 = com.facebook.w.a;
                                        context.unbindService(cVar);
                                    }
                                    if (c0705a == null) {
                                        c0705a = new C0705a();
                                    }
                                }
                            }
                            c0705a = null;
                            if (c0705a == null) {
                            }
                        }
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            throw new C0728q("getAttributionIdentifiers cannot be called on the main thread.");
                        }
                        C0705a c0705a3 = C0705a.f;
                        if (c0705a3 != null && System.currentTimeMillis() - c0705a3.b < DurationKt.MILLIS_IN_HOUR) {
                            return c0705a3;
                        }
                        String[] strArr = {"aid", "androidid", "limit_tracking"};
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                        ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                        if (resolveContentProvider != null) {
                            String str = resolveContentProvider.packageName;
                            Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                            if (C0713i.a(context, str)) {
                                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                uri = parse;
                                PackageManager packageManager = context.getPackageManager();
                                installerPackageName = packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
                                if (installerPackageName != null) {
                                    c0705a.d = installerPackageName;
                                }
                                if (uri == null) {
                                    c0705a.b = System.currentTimeMillis();
                                    C0705a.f = c0705a;
                                } else {
                                    Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                                    if (query != null) {
                                        try {
                                            if (query.moveToFirst()) {
                                                int columnIndex = query.getColumnIndex("aid");
                                                int columnIndex2 = query.getColumnIndex("androidid");
                                                int columnIndex3 = query.getColumnIndex("limit_tracking");
                                                c0705a.c = query.getString(columnIndex);
                                                if (columnIndex2 > 0 && columnIndex3 > 0 && c0705a.a() == null) {
                                                    c0705a.a = query.getString(columnIndex2);
                                                    c0705a.e = Boolean.parseBoolean(query.getString(columnIndex3));
                                                }
                                                query.close();
                                                c0705a.b = System.currentTimeMillis();
                                                C0705a.f = c0705a;
                                                return c0705a;
                                            }
                                        } catch (Exception e) {
                                            cursor = query;
                                            exc = e;
                                            try {
                                                exc.toString();
                                                com.facebook.w wVar3 = com.facebook.w.a;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    throw th;
                                                }
                                                cursor2.close();
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor2 = query;
                                            th = th;
                                            if (cursor2 != null) {
                                            }
                                        }
                                    }
                                    c0705a.b = System.currentTimeMillis();
                                    C0705a.f = c0705a;
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                                return c0705a;
                            }
                        }
                        if (resolveContentProvider2 != null) {
                            String str2 = resolveContentProvider2.packageName;
                            Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                            if (C0713i.a(context, str2)) {
                                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                uri = parse;
                                PackageManager packageManager2 = context.getPackageManager();
                                if (packageManager2 != null) {
                                }
                                if (installerPackageName != null) {
                                }
                                if (uri == null) {
                                }
                                return c0705a;
                            }
                        }
                        uri = null;
                        PackageManager packageManager22 = context.getPackageManager();
                        if (packageManager22 != null) {
                        }
                        if (installerPackageName != null) {
                        }
                        if (uri == null) {
                        }
                        return c0705a;
                    }
                }
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                }
            } catch (Exception e2) {
                exc = e2;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
            }
            c0705a = null;
            if (c0705a == null) {
            }
        }

        public static boolean b(Context context) {
            Method r = E.r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (r != null) {
                Object u = E.u(null, r, context);
                if ((u instanceof Integer) && Intrinsics.areEqual(u, (Object) 0)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.facebook.internal.a$b */
    public static final class b implements IInterface {
        public static final C0090a Companion = new C0090a();
        public final IBinder a;

        /* renamed from: com.facebook.internal.a$b$a, reason: collision with other inner class name */
        public static final class C0090a {
        }

        public b(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.a = binder;
        }

        public final String C() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean D() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.a;
        }
    }

    @SourceDebugExtension({"SMAP\nAttributionIdentifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributionIdentifiers.kt\ncom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1#2:316\n*E\n"})
    /* renamed from: com.facebook.internal.a$c */
    public static final class c implements ServiceConnection {
        public final AtomicBoolean a = new AtomicBoolean(false);
        public final LinkedBlockingDeque b = new LinkedBlockingDeque();

        public final IBinder a() throws InterruptedException {
            if (!this.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object take = this.b.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return (IBinder) take;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                    E e = E.a;
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String a() {
        if (com.facebook.w.q.get() && S.b()) {
            return this.a;
        }
        return null;
    }
}
