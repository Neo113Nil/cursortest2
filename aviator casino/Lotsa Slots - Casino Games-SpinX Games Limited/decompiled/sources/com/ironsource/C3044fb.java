package com.ironsource;

/* renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3044fb {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6259a;
    private final int b;

    public C3044fb(java.lang.String str, int i) {
        this.f6259a = str;
        this.b = i;
    }

    private final java.lang.String b() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        java.lang.String a2 = a(stackTrace, 4);
        java.lang.String b = b(stackTrace, 4);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s %s", java.util.Arrays.copyOf(new java.lang.Object[]{a2, b}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public final int a() {
        return this.b;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f6259a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f6259a;
    }

    private final java.lang.String a(java.lang.StackTraceElement[] stackTraceElementArr, int i) {
        java.util.List emptyList;
        java.util.List emptyList2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        java.lang.String className = stackTraceElementArr[i].getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        java.util.List<java.lang.String> split = new kotlin.text.Regex("\\.").split(className, 0);
        if (!split.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.lang.String str = ((java.lang.String[]) emptyList.toArray(new java.lang.String[0]))[r4.length - 1];
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.util.List<java.lang.String> split2 = new kotlin.text.Regex("\\$").split(str, 0);
        if (!split2.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator2 = split2.listIterator(split2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    emptyList2 = kotlin.collections.CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        return ((java.lang.String[]) emptyList2.toArray(new java.lang.String[0]))[0];
    }

    private final java.lang.String b(java.lang.StackTraceElement[] stackTraceElementArr, int i) {
        java.util.List emptyList;
        int i2;
        java.util.List emptyList2;
        java.util.List emptyList3;
        if (stackTraceElementArr.length > i) {
            java.lang.String className = stackTraceElementArr[i].getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            java.util.List<java.lang.String> split = new kotlin.text.Regex("\\.").split(className, 0);
            if (!split.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.String[] strArr = (java.lang.String[]) emptyList.toArray(new java.lang.String[0]);
            java.lang.String str = strArr[strArr.length - 1];
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null)) {
                java.util.List<java.lang.String> split2 = new kotlin.text.Regex("\\$").split(str, 0);
                if (!split2.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator2 = split2.listIterator(split2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            emptyList3 = kotlin.collections.CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList3 = kotlin.collections.CollectionsKt.emptyList();
                return ((java.lang.String[]) emptyList3.toArray(new java.lang.String[0]))[1] + "." + stackTraceElementArr[i].getMethodName();
            }
            java.lang.String methodName = stackTraceElementArr[i].getMethodName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) methodName, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null) && stackTraceElementArr.length > (i2 = i + 1)) {
                java.lang.String className2 = stackTraceElementArr[i2].getClassName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
                java.util.List<java.lang.String> split3 = new kotlin.text.Regex("\\$").split(className2, 0);
                if (!split3.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator3 = split3.listIterator(split3.size());
                    while (listIterator3.hasPrevious()) {
                        if (listIterator3.previous().length() != 0) {
                            emptyList2 = kotlin.collections.CollectionsKt.take(split3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                java.lang.String[] strArr2 = (java.lang.String[]) emptyList2.toArray(new java.lang.String[0]);
                if (strArr2.length > 1) {
                    return strArr2[1] + "." + stackTraceElementArr[i2].getMethodName();
                }
                java.lang.String methodName2 = stackTraceElementArr[i2].getMethodName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            java.lang.String methodName3 = stackTraceElementArr[i].getMethodName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
