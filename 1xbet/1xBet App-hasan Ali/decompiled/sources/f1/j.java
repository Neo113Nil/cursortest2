package f1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16961a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f16962b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16963c = new Object();

    public static void a(i iVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f16963c) {
            try {
                WeakHashMap weakHashMap = f16962b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i, new h(colorStateList, iVar.f16959a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
