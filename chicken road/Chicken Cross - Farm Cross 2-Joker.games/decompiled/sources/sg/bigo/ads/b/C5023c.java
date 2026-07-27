package sg.bigo.ads.b;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5046l;

/* renamed from: sg.bigo.ads.b.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5023c implements g {
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|(14:7|8|(1:10)|11|12|(2:14|(8:16|(2:18|(2:19|(3:21|(3:23|24|(2:35|36))(1:42)|38)(1:43)))(0)|44|(1:46)|47|(1:49)|50|(2:52|53)(1:55)))|57|(0)(0)|44|(0)|47|(0)|50|(0)(0))|60|8|(0)|11|12|(0)|57|(0)(0)|44|(0)|47|(0)|50|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:12:0x004a, B:14:0x005f, B:16:0x0074), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.b.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        String str;
        ArrayList arrayList;
        int myUid;
        Object invoke;
        Object invoke2;
        String str2 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            Method declaredMethod = Class.forName(AbstractC5015a.e0).getDeclaredMethod(AbstractC5015a.f0, String.class);
            declaredMethod.setAccessible(true);
            invoke2 = declaredMethod.invoke(null, "activity");
        } catch (Throwable unused) {
        }
        if (invoke2 != null && Proxy.isProxyClass(invoke2.getClass())) {
            str = invoke2.getClass().getName();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(AbstractC5015a.w, str);
            }
            Method method = Class.forName(AbstractC5015a.h0).getMethod(AbstractC5015a.i0, null);
            method.setAccessible(true);
            invoke = method.invoke(null, null);
            if (invoke != null) {
                Field declaredField = invoke.getClass().getDeclaredField(AbstractC5015a.j0);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (next instanceof Application) {
                                Application application = (Application) next;
                                String packageName = application.getPackageName();
                                if (!TextUtils.equals(context.getPackageName(), packageName) && !TextUtils.equals(packageName, AbstractC5015a.k0) && (application.getApplicationInfo().flags & 1) == 0 && application.getApplicationInfo().publicSourceDir.startsWith(AbstractC5015a.g0)) {
                                    str2 = packageName;
                                    break;
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put(AbstractC5015a.z, str2);
                    }
                    myUid = Process.myUid();
                    if (AbstractC5046l.a(myUid)) {
                        jSONObject.put(AbstractC5015a.v, myUid);
                    }
                    if (jSONObject.length() == 0) {
                        return null;
                    }
                    return jSONObject;
                }
            }
            arrayList = null;
            if (arrayList != null) {
            }
            if (!TextUtils.isEmpty(str2)) {
            }
            myUid = Process.myUid();
            if (AbstractC5046l.a(myUid)) {
            }
            if (jSONObject.length() == 0) {
            }
        }
        str = "";
        if (!TextUtils.isEmpty(str)) {
        }
        Method method2 = Class.forName(AbstractC5015a.h0).getMethod(AbstractC5015a.i0, null);
        method2.setAccessible(true);
        invoke = method2.invoke(null, null);
        if (invoke != null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
        if (!TextUtils.isEmpty(str2)) {
        }
        myUid = Process.myUid();
        if (AbstractC5046l.a(myUid)) {
        }
        if (jSONObject.length() == 0) {
        }
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.q;
    }
}
