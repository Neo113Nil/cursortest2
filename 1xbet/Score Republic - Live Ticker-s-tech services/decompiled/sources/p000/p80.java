package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p80 implements f82 {

    /* JADX INFO: renamed from: j */
    public static final Object[] f6018j = new Object[0];

    /* JADX INFO: renamed from: k */
    public static final g72 f6019k = new g72("NULL", 3);

    /* JADX INFO: renamed from: a */
    public static void m3857a(String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m3858b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3859d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3860e(String str) {
        if (TextUtils.isEmpty(str)) {
            C0270h1.m2190f("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3861f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C0270h1.m2190f(str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3862g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        C0270h1.m2191g(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m3863h(Object obj) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h("null reference");
    }

    /* JADX INFO: renamed from: i */
    public static void m3864i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m3865j(String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2191g(str);
    }

    /* JADX INFO: renamed from: k */
    public static h40 m3866k(Context context) {
        ProviderInfo providerInfo;
        f40 f40Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        hn0.m2313g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            f40Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                f40Var = new f40(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                f40Var = null;
            }
        }
        if (f40Var == null) {
            return null;
        }
        return new h40(new g40(context, f40Var));
    }

    /* JADX INFO: renamed from: l */
    public static jk0 m3867l() {
        return n01.f5231n == null ? new n01() : new b90(11);
    }

    /* JADX INFO: renamed from: m */
    public static aj1 m3868m(C0143dm c0143dm, int i, ArrayList arrayList, aj1 aj1Var) {
        int i2;
        int i3 = i == 0 ? c0143dm.f1732m0 : c0143dm.f1734n0;
        if (i3 != -1 && (aj1Var == null || i3 != aj1Var.f217b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                aj1 aj1Var2 = (aj1) arrayList.get(i4);
                if (aj1Var2.f217b == i3) {
                    if (aj1Var != null) {
                        aj1Var.m263c(i, aj1Var2);
                        arrayList.remove(aj1Var);
                    }
                    aj1Var = aj1Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return aj1Var;
        }
        if (aj1Var == null) {
            if (c0143dm instanceof C0205fb) {
                C0205fb c0205fb = (C0205fb) c0143dm;
                int i5 = 0;
                while (true) {
                    if (i5 >= c0205fb.f2367q0) {
                        i2 = -1;
                        break;
                    }
                    C0143dm c0143dm2 = c0205fb.f2366p0[i5];
                    if ((i == 0 && (i2 = c0143dm2.f1732m0) != -1) || (i == 1 && (i2 = c0143dm2.f1734n0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        aj1 aj1Var3 = (aj1) arrayList.get(i6);
                        if (aj1Var3.f217b == i2) {
                            aj1Var = aj1Var3;
                            break;
                        }
                    }
                }
            }
            if (aj1Var == null) {
                aj1Var = new aj1();
                aj1Var.f216a = new ArrayList();
                aj1Var.f219d = null;
                aj1Var.f220e = -1;
                int i7 = aj1.f215f;
                aj1.f215f = i7 + 1;
                aj1Var.f217b = i7;
                aj1Var.f218c = i;
            }
            arrayList.add(aj1Var);
        }
        ArrayList arrayList2 = aj1Var.f216a;
        if (arrayList2.contains(c0143dm)) {
            return aj1Var;
        }
        arrayList2.add(c0143dm);
        if (c0143dm instanceof ea0) {
            ea0 ea0Var = (ea0) c0143dm;
            ea0Var.f2040s0.m3955b(ea0Var.f2041t0 == 0 ? 1 : 0, aj1Var, arrayList);
        }
        int i8 = aj1Var.f217b;
        if (i == 0) {
            c0143dm.f1732m0 = i8;
            c0143dm.f1688H.m3955b(i, aj1Var, arrayList);
            c0143dm.f1690J.m3955b(i, aj1Var, arrayList);
        } else {
            c0143dm.f1734n0 = i8;
            c0143dm.f1689I.m3955b(i, aj1Var, arrayList);
            c0143dm.f1692L.m3955b(i, aj1Var, arrayList);
            c0143dm.f1691K.m3955b(i, aj1Var, arrayList);
        }
        c0143dm.f1695O.m3955b(i, aj1Var, arrayList);
        return aj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX INFO: renamed from: n */
    public static final int m3869n(i61 i61Var, int i) {
        int i2;
        int[] iArr = i61Var.f3450o;
        int i3 = i + 1;
        int length = i61Var.f3449n.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: o */
    public static void m3870o(C0312i6 c0312i6, float f) {
        float f2;
        float f3;
        q31 q31Var = (q31) c0312i6.f3447k;
        AbstractC0284hf abstractC0284hf = (AbstractC0284hf) c0312i6.f3448l;
        boolean useCompatPadding = abstractC0284hf.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC0284hf.getPreventCornerOverlap();
        if (f != q31Var.f6357e || q31Var.f6358f != useCompatPadding || q31Var.f6359g != preventCornerOverlap) {
            q31Var.f6357e = f;
            q31Var.f6358f = useCompatPadding;
            q31Var.f6359g = preventCornerOverlap;
            q31Var.m4032b(null);
            q31Var.invalidateSelf();
        }
        if (!abstractC0284hf.getUseCompatPadding()) {
            c0312i6.m2536A(0, 0, 0, 0);
            return;
        }
        q31 q31Var2 = (q31) c0312i6.f3447k;
        float f4 = q31Var2.f6357e;
        float f5 = q31Var2.f6353a;
        if (abstractC0284hf.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - r31.f6702a) * ((double) f5)) + ((double) f4));
        } else {
            int i = r31.f6703b;
            f2 = f4;
        }
        int iCeil = (int) Math.ceil(f2);
        if (abstractC0284hf.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - r31.f6702a) * ((double) f5)) + ((double) (f4 * 1.5f)));
        } else {
            f3 = f4 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f3);
        c0312i6.m2536A(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: p */
    public static final Object[] m3871p(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f6018j;
    }

    /* JADX INFO: renamed from: q */
    public static final Object[] m3872q(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m3873r(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX INFO: renamed from: s */
    public static void m3874s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str.concat(" must not be null"));
    }

    /* JADX INFO: renamed from: t */
    public static final InputStream m3875t(e82 e82Var) {
        p82 p82VarMo2565a = e82Var.f2013a.mo2565a(e82Var.f2016d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(p82VarMo2565a);
        ArrayList arrayList2 = e82Var.f2015c;
        if (!arrayList2.isEmpty()) {
            int i = c82.f1163k;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
            c82 c82Var = !arrayList3.isEmpty() ? new c82(p82VarMo2565a, arrayList3) : null;
            if (c82Var != null) {
                arrayList.add(c82Var);
            }
        }
        Iterator it2 = e82Var.f2014b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            dd0.m1158c();
            return null;
        }
        throw null;
    }
}
