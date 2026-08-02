package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements e {
    public final a a;
    public final i b;
    public final HashMap c;

    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final d a(String str) {
            Bundle bundle;
            Map<String, String> map;
            PackageManager packageManager;
            ServiceInfo serviceInfo;
            if (this.b == null) {
                Context context = this.a;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
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
                    this.b = map;
                }
                bundle = null;
                if (bundle != null) {
                }
                this.b = map;
            }
            String str4 = this.b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused2) {
                StringBuilder sb = new StringBuilder("Class ");
                sb.append(str4);
                sb.append(" is not found.");
                return null;
            } catch (IllegalAccessException unused3) {
                StringBuilder sb2 = new StringBuilder("Could not instantiate ");
                sb2.append(str4);
                sb2.append(".");
                return null;
            } catch (InstantiationException unused4) {
                StringBuilder sb3 = new StringBuilder("Could not instantiate ");
                sb3.append(str4);
                sb3.append(".");
                return null;
            } catch (NoSuchMethodException unused5) {
                "Could not instantiate ".concat(str4);
                return null;
            } catch (InvocationTargetException unused6) {
                "Could not instantiate ".concat(str4);
                return null;
            }
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.c = new HashMap();
        this.a = aVar;
        this.b = iVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @Nullable
    public final synchronized m get(String str) {
        if (this.c.containsKey(str)) {
            return (m) this.c.get(str);
        }
        d a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        i iVar = this.b;
        m create = a2.create(new c(iVar.a, iVar.b, iVar.c, str));
        this.c.put(str, create);
        return create;
    }
}
