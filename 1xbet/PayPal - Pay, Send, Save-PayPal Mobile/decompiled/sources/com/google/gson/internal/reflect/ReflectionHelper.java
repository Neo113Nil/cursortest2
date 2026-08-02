package com.google.gson.internal.reflect;

/* loaded from: classes4.dex */
public class ReflectionHelper {
    private static final com.google.gson.internal.reflect.ReflectionHelper.RecordHelper RECORD_HELPER;

    static {
        com.google.gson.internal.reflect.ReflectionHelper.RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new com.google.gson.internal.reflect.ReflectionHelper.RecordSupportedHelper();
        } catch (java.lang.ReflectiveOperationException unused) {
            recordNotSupportedHelper = new com.google.gson.internal.reflect.ReflectionHelper.RecordNotSupportedHelper();
        }
        RECORD_HELPER = recordNotSupportedHelper;
    }

    private ReflectionHelper() {
    }

    private static java.lang.String getInaccessibleTroubleshootingSuffix(java.lang.Exception exc) {
        java.lang.String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            java.lang.String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\nSee ");
            sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl(str));
            return sb.toString();
        }
        return "";
    }

    public static void makeAccessible(java.lang.reflect.AccessibleObject accessibleObject) throws com.google.gson.JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (java.lang.Exception e) {
            java.lang.String accessibleObjectDescription = getAccessibleObjectDescription(accessibleObject, false);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed making ");
            sb.append(accessibleObjectDescription);
            sb.append(" accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sb.append(getInaccessibleTroubleshootingSuffix(e));
            throw new com.google.gson.JsonIOException(sb.toString(), e);
        }
    }

    public static java.lang.String getAccessibleObjectDescription(java.lang.reflect.AccessibleObject accessibleObject, boolean z) {
        java.lang.String obj;
        if (accessibleObject instanceof java.lang.reflect.Field) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("field '");
            sb.append(fieldToString((java.lang.reflect.Field) accessibleObject));
            sb.append("'");
            obj = sb.toString();
        } else if (accessibleObject instanceof java.lang.reflect.Method) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) accessibleObject;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(method.getName());
            appendExecutableParameters(method, sb2);
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("method '");
            sb3.append(method.getDeclaringClass().getName());
            sb3.append("#");
            sb3.append(obj2);
            sb3.append("'");
            obj = sb3.toString();
        } else if (accessibleObject instanceof java.lang.reflect.Constructor) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("constructor '");
            sb4.append(constructorToString((java.lang.reflect.Constructor) accessibleObject));
            sb4.append("'");
            obj = sb4.toString();
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("<unknown AccessibleObject> ");
            sb5.append(accessibleObject.toString());
            obj = sb5.toString();
        }
        if (!z || !java.lang.Character.isLowerCase(obj.charAt(0))) {
            return obj;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Character.toUpperCase(obj.charAt(0)));
        sb6.append(obj.substring(1));
        return sb6.toString();
    }

    public static java.lang.String fieldToString(java.lang.reflect.Field field) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(field.getDeclaringClass().getName());
        sb.append("#");
        sb.append(field.getName());
        return sb.toString();
    }

    public static java.lang.String constructorToString(java.lang.reflect.Constructor<?> constructor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(constructor.getDeclaringClass().getName());
        appendExecutableParameters(constructor, sb);
        return sb.toString();
    }

    private static void appendExecutableParameters(java.lang.reflect.AccessibleObject accessibleObject, java.lang.StringBuilder sb) {
        java.lang.Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof java.lang.reflect.Method) {
            parameterTypes = ((java.lang.reflect.Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((java.lang.reflect.Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static boolean isStatic(java.lang.Class<?> cls) {
        return java.lang.reflect.Modifier.isStatic(cls.getModifiers());
    }

    public static boolean isAnonymousOrNonStaticLocal(java.lang.Class<?> cls) {
        if (isStatic(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static java.lang.String tryMakeAccessible(java.lang.reflect.Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed making constructor '");
            sb.append(constructorToString(constructor));
            sb.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            sb.append(e.getMessage());
            sb.append(getInaccessibleTroubleshootingSuffix(e));
            return sb.toString();
        }
    }

    public static boolean isRecord(java.lang.Class<?> cls) {
        return RECORD_HELPER.isRecord(cls);
    }

    public static java.lang.String[] getRecordComponentNames(java.lang.Class<?> cls) {
        return RECORD_HELPER.getRecordComponentNames(cls);
    }

    public static java.lang.reflect.Method getAccessor(java.lang.Class<?> cls, java.lang.reflect.Field field) {
        return RECORD_HELPER.getAccessor(cls, field);
    }

    public static <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> cls) {
        return RECORD_HELPER.getCanonicalRecordConstructor(cls);
    }

    public static java.lang.RuntimeException createExceptionForUnexpectedIllegalAccess(java.lang.IllegalAccessException illegalAccessException) {
        throw new java.lang.RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.RuntimeException createExceptionForRecordReflectionException(java.lang.ReflectiveOperationException reflectiveOperationException) {
        throw new java.lang.RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    static abstract class RecordHelper {
        abstract java.lang.reflect.Method getAccessor(java.lang.Class<?> cls, java.lang.reflect.Field field);

        abstract <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> cls);

        abstract java.lang.String[] getRecordComponentNames(java.lang.Class<?> cls);

        abstract boolean isRecord(java.lang.Class<?> cls);

        private RecordHelper() {
        }
    }

    static class RecordSupportedHelper extends com.google.gson.internal.reflect.ReflectionHelper.RecordHelper {
        private final java.lang.reflect.Method getName;
        private final java.lang.reflect.Method getRecordComponents;
        private final java.lang.reflect.Method getType;
        private final java.lang.reflect.Method isRecord;

        private RecordSupportedHelper() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            super();
            this.isRecord = java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]);
            this.getRecordComponents = java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]);
            java.lang.Class<?> cls = java.lang.Class.forName("java.lang.reflect.RecordComponent");
            this.getName = cls.getMethod("getName", new java.lang.Class[0]);
            this.getType = cls.getMethod("getType", new java.lang.Class[0]);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(java.lang.Class<?> cls) {
            try {
                return ((java.lang.Boolean) this.isRecord.invoke(cls, new java.lang.Object[0])).booleanValue();
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        java.lang.String[] getRecordComponentNames(java.lang.Class<?> cls) {
            try {
                java.lang.Object[] objArr = (java.lang.Object[]) this.getRecordComponents.invoke(cls, new java.lang.Object[0]);
                java.lang.String[] strArr = new java.lang.String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (java.lang.String) this.getName.invoke(objArr[i], new java.lang.Object[0]);
                }
                return strArr;
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> cls) {
            try {
                java.lang.Object[] objArr = (java.lang.Object[]) this.getRecordComponents.invoke(cls, new java.lang.Object[0]);
                java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (java.lang.Class) this.getType.invoke(objArr[i], new java.lang.Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public java.lang.reflect.Method getAccessor(java.lang.Class<?> cls, java.lang.reflect.Field field) {
            try {
                return cls.getMethod(field.getName(), new java.lang.Class[0]);
            } catch (java.lang.ReflectiveOperationException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }
    }

    static class RecordNotSupportedHelper extends com.google.gson.internal.reflect.ReflectionHelper.RecordHelper {
        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(java.lang.Class<?> cls) {
            return false;
        }

        private RecordNotSupportedHelper() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        java.lang.String[] getRecordComponentNames(java.lang.Class<?> cls) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> cls) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public java.lang.reflect.Method getAccessor(java.lang.Class<?> cls, java.lang.reflect.Field field) {
            throw new java.lang.UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }
}
