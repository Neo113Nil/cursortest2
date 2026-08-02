package p000;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n80 {

    /* JADX INFO: renamed from: b */
    public static final qd0 f5329b;

    /* JADX INFO: renamed from: c */
    public static qd0 f5330c;

    /* JADX INFO: renamed from: e */
    public static Thread f5332e;

    /* JADX INFO: renamed from: f */
    public static volatile Handler f5333f;

    /* JADX INFO: renamed from: a */
    public static final C0017ag f5328a = new C0017ag();

    /* JADX INFO: renamed from: d */
    public static final Object f5331d = new Object();

    static {
        Object obj = null;
        f5329b = new qd0(obj, obj, obj, 29);
    }

    /* JADX INFO: renamed from: a */
    public static int m3492a(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m3493b(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C0805vj c0805vj = (C0805vj) obj;
            C0920yn c0920yn = new C0920yn(c0805vj);
            for (cz0 cz0Var : c0805vj.f8199b) {
                boolean z = c0805vj.f8202e == 0;
                C0957zn c0957zn = new C0957zn(cz0Var, !z);
                if (!map.containsKey(c0957zn)) {
                    map.put(c0957zn, new HashSet());
                }
                Set set = (Set) map.get(c0957zn);
                if (!set.isEmpty() && z) {
                    C0042ay.m529f(cz0Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(c0920yn);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (C0920yn c0920yn2 : (Set) it.next()) {
                for (C0481ms c0481ms : c0920yn2.f9393a.f8200c) {
                    if (c0481ms.f5154c == 0) {
                        Set<C0920yn> set2 = (Set) map.get(new C0957zn(c0481ms.f5152a, c0481ms.f5153b == 2));
                        if (set2 != null) {
                            for (C0920yn c0920yn3 : set2) {
                                c0920yn2.f9394b.add(c0920yn3);
                                c0920yn3.f9395c.add(c0920yn2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<C0920yn> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (C0920yn c0920yn4 : hashSet) {
            if (c0920yn4.f9395c.isEmpty()) {
                hashSet2.add(c0920yn4);
            }
        }
        while (!hashSet2.isEmpty()) {
            C0920yn c0920yn5 = (C0920yn) hashSet2.iterator().next();
            hashSet2.remove(c0920yn5);
            i++;
            for (C0920yn c0920yn6 : c0920yn5.f9394b) {
                c0920yn6.f9395c.remove(c0920yn5);
                if (c0920yn6.f9395c.isEmpty()) {
                    hashSet2.add(c0920yn6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0920yn c0920yn7 : hashSet) {
            if (!c0920yn7.f9395c.isEmpty() && !c0920yn7.f9394b.isEmpty()) {
                arrayList2.add(c0920yn7.f9393a);
            }
        }
        throw new C0555os("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 2);
    }

    /* JADX INFO: renamed from: c */
    public static C0836wd m3494c(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC0321ig.f3562a);
        bytes.getClass();
        C0836wd c0836wd = new C0836wd(bytes);
        c0836wd.f8513l = str;
        return c0836wd;
    }

    /* JADX INFO: renamed from: d */
    public static int m3495d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C0270h1.m2190f(j11.m2773h("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static void m3496e(String str) {
        if (Log.isLoggable("FIAM.Headless", 3)) {
            Log.d("FIAM.Headless", str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3497f(String str) {
        if (Log.isLoggable("FIAM.Headless", 4)) {
            Log.i("FIAM.Headless", str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3498g(String str) {
        Log.w("FIAM.Headless", str);
    }

    /* JADX INFO: renamed from: h */
    public static String m3499h(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C0270h1.m2190f("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m3500i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: j */
    public static final File m3501j(Uri uri) throws C0287hi {
        if (!uri.getScheme().equals("file")) {
            throw new C0287hi("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C0287hi("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new C0287hi("Did not expect uri to have authority");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3502k(Thread thread) {
        if (f5332e == null) {
            f5332e = Looper.getMainLooper().getThread();
        }
        return thread == f5332e;
    }

    /* JADX INFO: renamed from: l */
    public static Handler m3503l() {
        if (f5333f == null) {
            synchronized (f5331d) {
                try {
                    if (f5333f == null) {
                        f5333f = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5333f;
    }
}
