package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.pm.g;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g<?> f42067a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile ArrayList f42068b;

    private i() {
    }

    public static void a(@NonNull Context context, @NonNull List list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, "");
        c(context).getClass();
        Iterator it = ((ArrayList) b(context)).iterator();
        while (it.hasNext()) {
            ((b) it.next()).getClass();
        }
    }

    private static List<b> b(Context context) {
        Bundle bundle;
        String string;
        if (f42068b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, UserVerificationMethods.USER_VERIFY_PATTERN).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((b) Class.forName(string, false, i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f42068b == null) {
                f42068b = arrayList;
            }
        }
        return f42068b;
    }

    private static g<?> c(Context context) {
        if (f42067a == null) {
            try {
                f42067a = (g) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f42067a == null) {
                f42067a = new g.a();
            }
        }
        return f42067a;
    }

    public static boolean d(@NonNull Context context, @NonNull f fVar) {
        IconCompat iconCompat;
        int i11;
        InputStream l11;
        Bitmap decodeStream;
        context.getClass();
        fVar.getClass();
        int i12 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity != 0) {
            if (i12 <= 29 && (iconCompat = fVar.f42059g) != null && (((i11 = iconCompat.f42132a) == 6 || i11 == 4) && (l11 = iconCompat.l(context)) != null && (decodeStream = BitmapFactory.decodeStream(l11)) != null)) {
                fVar.f42059g = i11 == 6 ? IconCompat.d(decodeStream) : IconCompat.e(decodeStream);
            }
            String str = null;
            char c11 = 65535;
            if (i12 >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(fVar.d());
            } else {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (!shortcutManager.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                        String str2 = null;
                        int i13 = -1;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > i13) {
                                str2 = shortcutInfo.getId();
                                i13 = shortcutInfo.getRank();
                            }
                        }
                        shortcutManager.removeDynamicShortcuts(Arrays.asList(str2));
                    }
                    shortcutManager.addDynamicShortcuts(Arrays.asList(fVar.d()));
                }
            }
            try {
                c(context).getClass();
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() >= maxShortcutCountPerActivity) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f fVar2 = (f) it.next();
                        fVar2.getClass();
                        if (c11 < 0) {
                            str = fVar2.f42054b;
                            c11 = 0;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(fVar);
                Iterator it2 = ((ArrayList) b(context)).iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    Collections.singletonList(fVar);
                    bVar.getClass();
                }
                f(context, fVar.f42054b);
                return true;
            } catch (Exception unused) {
                Iterator it3 = ((ArrayList) b(context)).iterator();
                while (it3.hasNext()) {
                    b bVar2 = (b) it3.next();
                    Collections.singletonList(fVar);
                    bVar2.getClass();
                }
                f(context, fVar.f42054b);
            } catch (Throwable th2) {
                Iterator it4 = ((ArrayList) b(context)).iterator();
                while (it4.hasNext()) {
                    b bVar3 = (b) it4.next();
                    Collections.singletonList(fVar);
                    bVar3.getClass();
                }
                f(context, fVar.f42054b);
                throw th2;
            }
        }
        return false;
    }

    public static void e(@NonNull Context context, @NonNull List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        c(context).getClass();
        Iterator it = ((ArrayList) b(context)).iterator();
        while (it.hasNext()) {
            ((b) it.next()).getClass();
        }
    }

    public static void f(@NonNull Context context, @NonNull String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = ((ArrayList) b(context)).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Collections.singletonList(str);
            bVar.getClass();
        }
    }
}
