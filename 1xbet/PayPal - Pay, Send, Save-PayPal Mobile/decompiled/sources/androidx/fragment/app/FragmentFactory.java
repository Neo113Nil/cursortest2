package androidx.fragment.app;

/* loaded from: classes.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = new androidx.collection.SimpleArrayMap<>();

    private static java.lang.Class<?> loadClass(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.ClassNotFoundException {
        androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> simpleArrayMap = sClassCacheMap;
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>> simpleArrayMap2 = simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new androidx.collection.SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        java.lang.Class<?> cls = simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    static boolean isFragmentClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return androidx.fragment.app.Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return loadClass(classLoader, str);
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb.toString(), e);
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb2.toString(), e2);
        }
    }

    public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb.toString(), e);
        } catch (java.lang.InstantiationException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb2.toString(), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb3.toString(), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new androidx.fragment.app.Fragment.InstantiationException(sb4.toString(), e4);
        }
    }
}
