package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f9572f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0.e f9577e;

    public J(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9573a = linkedHashMap;
        this.f9574b = new LinkedHashMap();
        this.f9575c = new LinkedHashMap();
        this.f9576d = new LinkedHashMap();
        this.f9577e = new androidx.activity.e(this, 1);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(J j) {
        Map mapSingletonMap;
        t6.h.e(j, "this$0");
        LinkedHashMap linkedHashMap = j.f9574b;
        t6.h.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = p050g6.q.f13309a;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap);
        } else {
            t6.h.e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            t6.h.d(mapSingletonMap, "with(...)");
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = j.f9573a;
            int i7 = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                p044f6.d[] dVarArr = {new p044f6.d("keys", arrayList), new p044f6.d("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i7 < 2) {
                    p044f6.d dVar = dVarArr[i7];
                    String str2 = (String) dVar.f13006a;
                    Object obj = dVar.f13007b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        t6.h.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        L.c.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        L.c.b(bundle, str2, (SizeF) obj);
                    }
                    i7++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Object objA = ((G0.e) entry2.getValue()).a();
            t6.h.e(str3, "key");
            if (objA != null) {
                Class[] clsArr = f9572f;
                while (true) {
                    if (i7 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + objA.getClass() + " into saved state");
                    }
                    Class cls = clsArr[i7];
                    t6.h.b(cls);
                    if (cls.isInstance(objA)) {
                        break;
                    }
                    i7++;
                }
            }
            Object obj2 = j.f9575c.get(str3);
            B b7 = obj2 instanceof B ? (B) obj2 : null;
            if (b7 != null) {
                b7.i(objA);
            } else {
                linkedHashMap2.put(str3, objA);
            }
            G6.u uVar = (G6.u) j.f9576d.get(str3);
            if (uVar != null) {
                G6.w wVar = (G6.w) uVar;
                if (objA == null) {
                    objA = H6.l.f3444a;
                }
                wVar.E(null, objA);
            }
        }
    }

    public J() {
        this.f9573a = new LinkedHashMap();
        this.f9574b = new LinkedHashMap();
        this.f9575c = new LinkedHashMap();
        this.f9576d = new LinkedHashMap();
        this.f9577e = new androidx.activity.e(this, 1);
    }
}
