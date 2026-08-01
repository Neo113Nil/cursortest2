package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class n implements f {
    public static final n f = new n();

    /* renamed from: a, reason: collision with root package name */
    public Context f5530a;
    public g b;
    public boolean c = false;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final m e = new m(this);

    public static File a(Context context, String str) {
        String str2;
        File externalCacheDir;
        String str3 = "";
        if (context != null && !TextUtils.isEmpty(str)) {
            if (o.f5960a != null && o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    str2 = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    str2 = "";
                }
                if ("mounted".equals(str2)) {
                    try {
                        str3 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(str3) || "mounted_ro".equals(str3)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 52428800) {
                        return new File(context.getExternalCacheDir(), str);
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 52428800) {
                return new File(context.getCacheDir(), str);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.cache.f
    public final boolean a(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
