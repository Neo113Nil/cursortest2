package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class Intrinsics {
    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private Intrinsics() {
    }

    public static java.lang.String stringPlus(java.lang.String str, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void checkNotNull(java.lang.Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static void throwNpe() {
        throw ((kotlin.KotlinNullPointerException) getHighSpeedVideoFpsRangesFor(new kotlin.KotlinNullPointerException()));
    }

    public static void throwNpe(java.lang.String str) {
        throw ((kotlin.KotlinNullPointerException) getHighSpeedVideoSizes(new kotlin.KotlinNullPointerException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwJavaNpe() {
        throw ((java.lang.NullPointerException) getHighSpeedVideoSizes(new java.lang.NullPointerException(), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwJavaNpe(java.lang.String str) {
        throw ((java.lang.NullPointerException) getHighSpeedVideoSizes(new java.lang.NullPointerException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwUninitializedProperty(java.lang.String str) {
        throw ((kotlin.UninitializedPropertyAccessException) getHighSpeedVideoSizes(new kotlin.UninitializedPropertyAccessException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwUninitializedPropertyAccessException(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        throwUninitializedProperty(sb.toString());
    }

    public static void throwAssert() {
        throw ((java.lang.AssertionError) getHighSpeedVideoSizes(new java.lang.AssertionError(), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwAssert(java.lang.String str) {
        throw ((java.lang.AssertionError) getHighSpeedVideoSizes(new java.lang.AssertionError(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwIllegalArgument() {
        throw ((java.lang.IllegalArgumentException) getHighSpeedVideoSizes(new java.lang.IllegalArgumentException(), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwIllegalArgument(java.lang.String str) {
        throw ((java.lang.IllegalArgumentException) getHighSpeedVideoSizes(new java.lang.IllegalArgumentException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwIllegalState() {
        throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void throwIllegalState(java.lang.String str) {
        throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void checkExpressionValueIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(sb.toString()), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void checkNotNullExpressionValue(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((java.lang.NullPointerException) getHighSpeedVideoSizes(new java.lang.NullPointerException(sb.toString()), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Method specified as non-null returned null: ");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(sb.toString()), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }

    public static void checkFieldIsNotNull(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field specified as non-null is null: ");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(sb.toString()), kotlin.jvm.internal.Intrinsics.class.getName()));
    }

    public static void checkFieldIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) getHighSpeedVideoSizes(new java.lang.IllegalStateException(str), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name2 = kotlin.jvm.internal.Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name2)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name2)) {
            i++;
        }
        java.lang.StackTraceElement stackTraceElement = stackTrace[i];
        java.lang.String className = stackTraceElement.getClassName();
        java.lang.String methodName = stackTraceElement.getMethodName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean areEqual(java.lang.Double d, java.lang.Double d2) {
        return d == null ? d2 == null : d2 != null && d.doubleValue() == d2.doubleValue();
    }

    public static boolean areEqual(java.lang.Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean areEqual(double d, java.lang.Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean areEqual(java.lang.Float f, java.lang.Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    public static boolean areEqual(java.lang.Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean areEqual(float f, java.lang.Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }

    public static void reifiedOperationMarker(int i, java.lang.String str) {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i, java.lang.String str, java.lang.String str2) {
        throwUndefinedForReified(str2);
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void needClassReification(java.lang.String str) {
        throwUndefinedForReified(str);
    }

    public static void checkHasClass(java.lang.String str) throws java.lang.ClassNotFoundException {
        java.lang.String replace = str.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        try {
            java.lang.Class.forName(replace);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
            sb.append(replace);
            sb.append(" is not found. Please update the Kotlin runtime to the latest version");
            throw ((java.lang.ClassNotFoundException) getHighSpeedVideoSizes(new java.lang.ClassNotFoundException(sb.toString(), e), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }

    public static void checkHasClass(java.lang.String str, java.lang.String str2) throws java.lang.ClassNotFoundException {
        java.lang.String replace = str.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        try {
            java.lang.Class.forName(replace);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
            sb.append(replace);
            sb.append(" is not found: this code requires the Kotlin runtime of version at least ");
            sb.append(str2);
            throw ((java.lang.ClassNotFoundException) getHighSpeedVideoSizes(new java.lang.ClassNotFoundException(sb.toString(), e), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }

    private static <T extends java.lang.Throwable> T getHighSpeedVideoFpsRangesFor(T t) {
        return (T) getHighSpeedVideoSizes(t, kotlin.jvm.internal.Intrinsics.class.getName());
    }

    static <T extends java.lang.Throwable> T getHighSpeedVideoSizes(T t, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static class Kotlin {
        private Kotlin() {
        }
    }

    public static void checkNotNullParameter(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.NullPointerException) getHighSpeedVideoSizes(new java.lang.NullPointerException(getHighSpeedVideoFpsRanges(str)), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }

    public static void checkParameterIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalArgumentException) getHighSpeedVideoSizes(new java.lang.IllegalArgumentException(getHighSpeedVideoFpsRanges(str)), kotlin.jvm.internal.Intrinsics.class.getName()));
        }
    }
}
