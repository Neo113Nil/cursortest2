package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIlIIlIII {
    public static boolean llIIlIlIIl(java.lang.reflect.Type type) {
        while (type != null) {
            if (type instanceof java.lang.reflect.TypeVariable) {
                return true;
            }
            if (!(type instanceof java.lang.Class)) {
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    for (java.lang.reflect.Type type2 : ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()) {
                        if (llIIlIlIIl(type2)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (type instanceof java.lang.reflect.WildcardType) {
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                    java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
                    if (lowerBounds != null) {
                        for (java.lang.reflect.Type type3 : lowerBounds) {
                            if (llIIlIlIIl(type3)) {
                                break;
                            }
                        }
                    }
                    java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                    if (upperBounds != null) {
                        for (java.lang.reflect.Type type4 : upperBounds) {
                            if (llIIlIlIIl(type4)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.getTypeParameters().length != 0) {
                return true;
            }
            type = cls.getDeclaringClass();
        }
        return false;
    }
}
