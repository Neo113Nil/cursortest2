package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class DescriptorKindFilter {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter ALL;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter CALLABLES;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter CLASSIFIERS;
    private static final int Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter FUNCTIONS;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter PACKAGES;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter SINGLETON_CLASSIFIERS;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter TYPE_ALIASES;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter VALUES;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter VARIABLES;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> getHighSpeedVideoFpsRanges;
    private static final int getHighSpeedVideoFpsRangesFor;
    private static final int getHighSpeedVideoSizes;
    private static final int getHighSpeedVideoSizesFor;
    private static final int getInputFormats;
    private static final int getInputSizeshNQ4ISI;
    private static final int getOutputFormats;
    private static final int getOutputMinFrameDuration;
    private static final int getOutputSizes;
    private static int getOutputStallDuration;
    private static final int getOutputStallDurationlomOqCM;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i, java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getOutputMinFrameDurationlomOqCM = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.getOutputSizeshNQ4ISI = i;
    }

    public /* synthetic */ DescriptorKindFilter(int i, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude> getExcludes() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final int getKindMask() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final boolean acceptsKinds(int i) {
        return (i & this.getOutputSizeshNQ4ISI) != 0;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter restrictedToKindsOrNull(int i) {
        int i2 = i & this.getOutputSizeshNQ4ISI;
        if (i2 == 0) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i2, this.getOutputMinFrameDurationlomOqCM);
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.util.Iterator<T> it = getHighSpeedVideoFpsRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName) obj).getHighResolutionOutputSizeshNQ4ISI == this.getOutputSizeshNQ4ISI) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName = (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName) obj;
        java.lang.String str = maskToName != null ? maskToName.Camera2StreamConfigurationMap : null;
        if (str == null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName> list = getHighResolutionOutputSizeshNQ4ISI;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName2 : list) {
                java.lang.String str2 = acceptsKinds(maskToName2.getHighResolutionOutputSizeshNQ4ISI) ? maskToName2.Camera2StreamConfigurationMap : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR, null, null, 0, null, null, 62, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DescriptorKindFilter(");
        sb.append(str);
        sb.append(", ");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter = (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDurationlomOqCM, descriptorKindFilter.getOutputMinFrameDurationlomOqCM) && this.getOutputSizeshNQ4ISI == descriptorKindFilter.getOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return (this.getOutputMinFrameDurationlomOqCM.hashCode() * 31) + this.getOutputSizeshNQ4ISI;
    }

    public static final class Companion {
        private Companion() {
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getInputFormats;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getHighSpeedVideoSizesFor;
        }

        public final int getTYPE_ALIASES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getOutputFormats;
        }

        public final int getPACKAGES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getInputSizeshNQ4ISI;
        }

        public final int getFUNCTIONS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getOutputMinFrameDuration;
        }

        public final int getVARIABLES_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getOutputSizes;
        }

        public final int getALL_KINDS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getHighSpeedVideoSizes;
        }

        public final int getCLASSIFIERS_MASK() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Camera2StreamConfigurationMap;
        }

        static final class MaskToName {
            final java.lang.String Camera2StreamConfigurationMap;
            final int getHighResolutionOutputSizeshNQ4ISI;

            public MaskToName(int i, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.Camera2StreamConfigurationMap = str;
            }
        }

        public static final /* synthetic */ int access$nextMask(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion companion) {
            int i = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getOutputStallDuration;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion companion2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.getOutputStallDuration <<= 1;
            return i;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName maskToName2;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion(null);
        Companion = companion;
        getOutputStallDuration = 1;
        int access$nextMask = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getInputFormats = access$nextMask;
        int access$nextMask2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getHighSpeedVideoSizesFor = access$nextMask2;
        int access$nextMask3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getOutputFormats = access$nextMask3;
        int access$nextMask4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getInputSizeshNQ4ISI = access$nextMask4;
        int access$nextMask5 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getOutputMinFrameDuration = access$nextMask5;
        int access$nextMask6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion);
        getOutputSizes = access$nextMask6;
        int access$nextMask7 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.access$nextMask(companion) - 1;
        getHighSpeedVideoSizes = access$nextMask7;
        int i = access$nextMask | access$nextMask2 | access$nextMask3;
        Camera2StreamConfigurationMap = i;
        int i2 = access$nextMask2 | access$nextMask5 | access$nextMask6;
        getOutputStallDurationlomOqCM = i2;
        int i3 = access$nextMask5 | access$nextMask6;
        getHighSpeedVideoFpsRangesFor = i3;
        int i4 = 2;
        ALL = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CALLABLES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        TYPE_ALIASES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CLASSIFIERS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        PACKAGES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        FUNCTIONS = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VARIABLES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(access$nextMask6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VALUES = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        java.lang.reflect.Field[] fields = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.class.getFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fields, "");
        java.util.ArrayList<java.lang.reflect.Field> arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.reflect.Field field2 : arrayList) {
            java.lang.Object obj = field2.get(null);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter = obj instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter ? (kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i5 = descriptorKindFilter.getOutputSizeshNQ4ISI;
                java.lang.String name2 = field2.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                maskToName2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName(i5, name2);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        getHighSpeedVideoFpsRanges = arrayList2;
        java.lang.reflect.Field[] fields2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.class.getFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fields2, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field3 : fields2) {
            if (java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.reflect.Field) obj2).getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.reflect.Field field4 : arrayList4) {
            java.lang.Object obj3 = field4.get(null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            int intValue = ((java.lang.Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                java.lang.String name3 = field4.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                maskToName = new kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.MaskToName(intValue, name3);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = arrayList5;
    }
}
