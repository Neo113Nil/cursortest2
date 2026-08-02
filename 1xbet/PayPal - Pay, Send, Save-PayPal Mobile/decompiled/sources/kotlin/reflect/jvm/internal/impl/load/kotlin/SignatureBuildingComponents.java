package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class SignatureBuildingComponents {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    public final java.lang.String javaLang(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "java/lang/".concat(java.lang.String.valueOf(str));
    }

    public final java.lang.String javaUtil(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "java/util/".concat(java.lang.String.valueOf(str));
    }

    public final java.lang.String javaFunction(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "java/util/function/".concat(java.lang.String.valueOf(str));
    }

    public final java.lang.String javaUtilConcurrentAtomic(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "java/util/concurrent/atomic/".concat(java.lang.String.valueOf(str));
    }

    public final java.util.Set<java.lang.String> inJavaLang(java.lang.String str, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return inClass(javaLang(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set<java.lang.String> inJavaUtil(java.lang.String str, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return inClass(javaUtil(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set<java.lang.String> inClass(java.lang.String str, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str2 : strArr) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(str2);
            linkedHashSet.add(sb.toString());
        }
        return linkedHashSet;
    }

    public final java.lang.String signature(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    public final java.lang.String jvmDescriptor(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(list, "", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.Camera2StreamConfigurationMap((java.lang.String) obj);
            }
        }, 30, null));
        sb.append(')');
        sb.append(getHighResolutionOutputSizeshNQ4ISI(str2));
        return sb.toString();
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str.length() <= 1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("L");
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    public final java.lang.String[] constructors(java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<init>(");
            sb.append(str);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighResolutionOutputSizeshNQ4ISI(str);
    }
}
