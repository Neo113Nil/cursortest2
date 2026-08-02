package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.F0;
import java.util.Arrays;
import java.util.HashSet;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
public final class H0 implements InterfaceC8822a<Context, F0> {

    public static class a extends Service {
        private a() {
        }

        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    @NonNull
    private static F0 a(@NonNull Context context, @NonNull Bundle bundle) {
        boolean z11 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] b11 = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] b12 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        C.S.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        C.S.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z11);
        C.S.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(b11));
        C.S.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(b12));
        F0.a aVar = new F0.a();
        aVar.d(z11);
        aVar.c(c(b11));
        aVar.b(c(b12));
        return aVar.a();
    }

    @NonNull
    private static String[] b(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i11 = bundle.getInt(str, -1);
        if (i11 == -1) {
            C.S.k("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i11);
        } catch (Resources.NotFoundException e11) {
            C.S.l("QuirkSettingsLoader", "Quirk class names resource not found: " + i11, e11);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HashSet c(@NonNull String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e11) {
                C.S.l("QuirkSettingsLoader", "Class not found: " + str, e11);
            }
            if (E0.class.isAssignableFrom(cls)) {
                if (cls == null) {
                    hashSet.add(cls);
                }
            } else {
                C.S.k("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                cls = null;
                if (cls == null) {
                }
            }
        }
        return hashSet;
    }

    @Override // p.InterfaceC8822a
    public final F0 apply(@NonNull Context context) {
        Context context2 = context;
        try {
            Bundle bundle = context2.getPackageManager().getServiceInfo(new ComponentName(context2, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return a(context2, bundle);
            }
            C.S.k("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C.S.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
