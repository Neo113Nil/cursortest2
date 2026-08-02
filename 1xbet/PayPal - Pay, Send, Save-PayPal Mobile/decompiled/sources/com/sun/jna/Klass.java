package com.sun.jna;

/* loaded from: classes5.dex */
abstract class Klass {
    private Klass() {
    }

    public static <T> T getHighSpeedVideoFpsRangesFor(java.lang.Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't create an instance of ");
            sb.append(cls);
            sb.append(", requires a public no-arg constructor: ");
            sb.append(e);
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            e = e2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't create an instance of ");
            sb2.append(cls);
            sb2.append(", requires a public no-arg constructor: ");
            sb2.append(e);
            throw new java.lang.IllegalArgumentException(sb2.toString(), e);
        } catch (java.lang.InstantiationException e3) {
            e = e3;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Can't create an instance of ");
            sb22.append(cls);
            sb22.append(", requires a public no-arg constructor: ");
            sb22.append(e);
            throw new java.lang.IllegalArgumentException(sb22.toString(), e);
        } catch (java.lang.NoSuchMethodException e4) {
            e = e4;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Can't create an instance of ");
            sb222.append(cls);
            sb222.append(", requires a public no-arg constructor: ");
            sb222.append(e);
            throw new java.lang.IllegalArgumentException(sb222.toString(), e);
        } catch (java.lang.SecurityException e5) {
            e = e5;
            java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Can't create an instance of ");
            sb2222.append(cls);
            sb2222.append(", requires a public no-arg constructor: ");
            sb2222.append(e);
            throw new java.lang.IllegalArgumentException(sb2222.toString(), e);
        } catch (java.lang.reflect.InvocationTargetException e6) {
            if (e6.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e6.getCause());
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Can't create an instance of ");
            sb3.append(cls);
            sb3.append(", requires a public no-arg constructor: ");
            sb3.append(e6);
            throw new java.lang.IllegalArgumentException(sb3.toString(), e6);
        }
    }
}
