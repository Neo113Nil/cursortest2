package sg.bigo.ads.r0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* renamed from: sg.bigo.ads.r0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5453d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13266a;
    public final long b;

    public C5453d(Context context, long j) {
        this.f13266a = context;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000d, B:9:0x0018, B:11:0x0025, B:13:0x0029, B:15:0x0035, B:18:0x0054, B:23:0x0078, B:29:0x0084, B:30:0x008a, B:33:0x008c, B:34:0x0092, B:35:0x0093, B:36:0x009b, B:37:0x002c, B:41:0x009c, B:42:0x00a1, B:20:0x0062, B:17:0x0041), top: B:2:0x0001, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000d, B:9:0x0018, B:11:0x0025, B:13:0x0029, B:15:0x0035, B:18:0x0054, B:23:0x0078, B:29:0x0084, B:30:0x008a, B:33:0x008c, B:34:0x0092, B:35:0x0093, B:36:0x009b, B:37:0x002c, B:41:0x009c, B:42:0x00a1, B:20:0x0062, B:17:0x0041), top: B:2:0x0001, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized sg.bigo.ads.U.a a() {
        IInterface iInterface;
        String readString;
        boolean z;
        IBinder iBinder;
        ServiceConnectionC5454e a2 = a(this.f13266a);
        if (a2 == null) {
            throw new C5452c();
        }
        try {
            iBinder = (IBinder) a2.f13267a.poll(this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        if (iBinder != null) {
            a2.a(iBinder);
            int i = AbstractBinderC5456g.f13269a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            iInterface = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5457h)) ? new C5455f(iBinder) : (InterfaceC5457h) queryLocalInterface;
            if (iInterface != null) {
                a2.b();
                throw new C5452c();
            }
            C5455f c5455f = (C5455f) iInterface;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                c5455f.f13268a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    c5455f.f13268a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    z = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                } finally {
                }
            } finally {
            }
        }
        iInterface = null;
        if (iInterface != null) {
        }
        return new sg.bigo.ads.U.a(readString, z);
    }

    public static ServiceConnectionC5454e a(Context context) {
        boolean bindService;
        if (ServiceConnectionC5454e.d == null) {
            synchronized (ServiceConnectionC5454e.class) {
                if (ServiceConnectionC5454e.d == null) {
                    ServiceConnectionC5454e.d = new ServiceConnectionC5454e(context);
                }
            }
        }
        ServiceConnectionC5454e serviceConnectionC5454e = ServiceConnectionC5454e.d;
        if (!serviceConnectionC5454e.f13267a.isEmpty()) {
            return serviceConnectionC5454e;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            serviceConnectionC5454e.c = true;
            bindService = context.bindService(intent, serviceConnectionC5454e, 1);
        } catch (Exception unused) {
        } catch (Throwable th) {
            serviceConnectionC5454e.b();
            throw th;
        }
        if (bindService) {
            if (!bindService) {
                serviceConnectionC5454e.b();
            }
            return serviceConnectionC5454e;
        }
        if (bindService) {
            return null;
        }
        serviceConnectionC5454e.b();
        return null;
    }
}
