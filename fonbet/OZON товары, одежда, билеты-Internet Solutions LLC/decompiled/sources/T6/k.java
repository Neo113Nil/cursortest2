package T6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final a f26686a;

    /* renamed from: b, reason: collision with root package name */
    private final i f26687b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f26688c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26689a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f26690b = null;

        a(Context context) {
            this.f26689a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final d a(String str) {
            Bundle bundle;
            Map<String, String> map;
            PackageManager packageManager;
            if (this.f26690b == null) {
                Context context = this.f26689a;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), UserVerificationMethods.USER_VERIFY_PATTERN);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                        if (bundle != null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.EMPTY_MAP;
                        } else {
                            HashMap hashMap = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                Object obj = bundle.get(str2);
                                if ((obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String trim = str3.trim();
                                        if (!trim.isEmpty()) {
                                            hashMap.put(trim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            map = hashMap;
                        }
                        this.f26690b = map;
                    }
                }
                bundle = null;
                if (bundle != null) {
                }
                this.f26690b = map;
            }
            String str4 = this.f26690b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e11) {
                Log.w("BackendRegistry", "Class " + str4 + " is not found.", e11);
                return null;
            } catch (IllegalAccessException e12) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
                return null;
            } catch (InstantiationException e13) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e13);
                return null;
            } catch (NoSuchMethodException e14) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
                return null;
            } catch (InvocationTargetException e15) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e15);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        a aVar = new a(context);
        this.f26688c = new HashMap();
        this.f26686a = aVar;
        this.f26687b = iVar;
    }

    @Override // T6.e
    public final synchronized m get(String str) {
        if (this.f26688c.containsKey(str)) {
            return (m) this.f26688c.get(str);
        }
        d a11 = this.f26686a.a(str);
        if (a11 == null) {
            return null;
        }
        m create = a11.create(this.f26687b.a(str));
        this.f26688c.put(str, create);
        return create;
    }
}
