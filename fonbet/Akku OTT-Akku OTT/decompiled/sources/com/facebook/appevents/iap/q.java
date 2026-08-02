package com.facebook.appevents.iap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import com.facebook.w;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class q {
    public static final q a = new q();
    public static final HashMap<String, Method> b = new HashMap<>();
    public static final HashMap<String, Class<?>> c = new HashMap<>();
    public static final String d = w.a().getPackageName();
    public static final SharedPreferences e = w.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = w.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    @JvmStatic
    public static final ArrayList<String> f(Context context, Object obj) {
        if (com.facebook.internal.instrument.crashshield.a.b(q.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = a;
            return qVar.a(qVar.e(context, obj, "inapp"));
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, q.class);
            return null;
        }
    }

    public final ArrayList<String> a(ArrayList<String> arrayList) {
        SharedPreferences sharedPreferences = f;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.areEqual(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:6:0x000a, B:9:0x0013, B:13:0x0039, B:23:0x0033, B:17:0x001f, B:19:0x0029), top: B:5:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class<?> b(Context context, String className) {
        Class<?> loadClass;
        HashMap<String, Class<?>> hashMap = c;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            Class<?> cls = hashMap.get(className);
            if (cls != null) {
                return cls;
            }
            int i = u.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(u.class)) {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(className, "className");
                    try {
                        loadClass = context.getClassLoader().loadClass(className);
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, u.class);
                }
                if (loadClass != null) {
                    hashMap.put(className, loadClass);
                }
                return loadClass;
            }
            loadClass = null;
            if (loadClass != null) {
            }
            return loadClass;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class<?> cls, String str) {
        Class[] clsArr;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            int hashCode = str.hashCode();
            Class TYPE = Integer.TYPE;
            switch (hashCode) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            Method b2 = clsArr == null ? u.b(cls, str, null) : u.b(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (b2 != null) {
                hashMap.put(str, b2);
            }
            return b2;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, obj2, "inapp")) {
                int i = 0;
                boolean z = false;
                String str = null;
                while (true) {
                    Object h = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, d, "inapp", str, new Bundle()});
                    if (h != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str == null || z) {
                                break;
                                break;
                            }
                            context2 = context;
                            obj2 = obj;
                        }
                    }
                    str = null;
                    if (i < 30) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final ArrayList<String> e(Context context, Object obj, String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && i(context, obj, str)) {
                int i = 0;
                String str2 = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object h = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, d, str, str2});
                        if (h != null) {
                            Bundle bundle = (Bundle) h;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                i += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i < 30 || str2 == null) {
                                    break;
                                    break;
                                }
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i < 30) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object h = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, d, z ? "subs" : "inapp", bundle});
                    if (h != null) {
                        Bundle bundle2 = (Bundle) h;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                    String str = stringArrayList.get(i);
                                    Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c2;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Class<?> b2 = b(context, str);
                if (b2 != null && (c2 = c(b2, str2)) != null) {
                    return u.d(c2, b2, obj, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this) && obj != null) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object h = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
                if (h != null) {
                    if (((Integer) h).intValue() == 0) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return false;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        List split$default;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = e.getString(sku, null);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
