package com.facebook.devicerequests.internal;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.B;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static final HashMap<String, NsdManager.RegistrationListener> b = new HashMap<>();

    /* renamed from: com.facebook.devicerequests.internal.a$a, reason: collision with other inner class name */
    public static final class C0087a implements NsdManager.RegistrationListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public C0087a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            a.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
            if (Intrinsics.areEqual(this.a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }
    }

    @JvmStatic
    public static final void a(String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            a.b(str);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }

    @JvmStatic
    public static final boolean c() {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return false;
        }
        try {
            n b2 = p.b(w.b());
            if (b2 != null) {
                if (b2.c.contains(B.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
            return false;
        }
    }

    @TargetApi(16)
    public final void b(String str) {
        HashMap<String, NsdManager.RegistrationListener> hashMap = b;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = w.a().getSystemService("servicediscovery");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException unused) {
                    E e = E.a;
                    w wVar = w.a;
                }
                hashMap.remove(str);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    @TargetApi(16)
    public final boolean d(String str) {
        String replace$default;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            w wVar = w.a;
            replace$default = StringsKt__StringsJVMKt.replace$default("18.3.0", '.', '|', false, 4, (Object) null);
            String str2 = "fbsdk_" + ("android-" + replace$default) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = w.a().getSystemService("servicediscovery");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            C0087a c0087a = new C0087a(str2, str);
            hashMap.put(str, c0087a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0087a);
            return true;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return false;
        }
    }
}
