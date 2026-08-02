package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public final class FunctionTypeKindExtractor {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind[]{kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction.INSTANCE, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE}));
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind>> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind> getHighSpeedVideoFpsRangesFor;

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor getDefault() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(java.util.List<? extends kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = list;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = ((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind) obj).getPackageFqName();
            java.lang.Object obj2 = linkedHashMap.get(packageFqName);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(packageFqName, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        this.Camera2StreamConfigurationMap = linkedHashMap;
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getFunctionalClassKind(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(fqName, str);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0018 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity getFunctionalClassKindWithArity(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind> list = this.Camera2StreamConfigurationMap.get(fqName);
        if (list == null) {
            return null;
        }
        for (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind : list) {
            if (kotlin.text.StringsKt.startsWith$default(str, functionTypeKind.getClassNamePrefix(), false, 2, (java.lang.Object) null)) {
                java.lang.String substring = str.substring(functionTypeKind.getClassNamePrefix().length());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                if (substring.length() != 0) {
                    int length = substring.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        int charAt = substring.charAt(i2) - '0';
                        if (charAt >= 0 && charAt < 10) {
                            i = (i * 10) + charAt;
                        }
                    }
                    valueOf = java.lang.Integer.valueOf(i);
                    if (valueOf == null) {
                        return new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity(functionTypeKind, valueOf.intValue());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        }
        return null;
    }

    public static final class KindWithArity {
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getHighSpeedVideoSizes;

        public KindWithArity(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionTypeKind, "");
            this.getHighSpeedVideoSizes = functionTypeKind;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getKind() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KindWithArity(kind=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", arity=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoSizes.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity kindWithArity = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, kindWithArity.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == kindWithArity.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int component2() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind component1() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
