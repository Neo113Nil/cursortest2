package C2;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: C2.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2726v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ContextWrapper f4364a;

    public C2726v(@NotNull ContextWrapper context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4364a = context;
    }

    public static InterfaceC2725u a(C2726v c2726v) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            Y y11 = new Y(c2726v.f4364a);
            Y y12 = y11.isAvailableOnDevice() ? y11 : null;
            return y12 == null ? c2726v.b() : y12;
        }
        if (i11 <= 33) {
            return c2726v.b();
        }
        return null;
    }

    private final InterfaceC2725u b() {
        String string;
        ContextWrapper contextWrapper = this.f4364a;
        PackageInfo packageInfo = contextWrapper.getPackageManager().getPackageInfo(contextWrapper.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List U02 = C7714v.U0(arrayList);
        if (U02.isEmpty()) {
            return null;
        }
        Iterator it = U02.iterator();
        InterfaceC2725u interfaceC2725u = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(contextWrapper);
                Intrinsics.g(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC2725u interfaceC2725u2 = (InterfaceC2725u) newInstance;
                if (!interfaceC2725u2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC2725u != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC2725u = interfaceC2725u2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC2725u;
    }
}
