package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public class JvmNameResolverBase implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.Companion(null);
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoSizes;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> Camera2StreamConfigurationMap;
    private final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges;
    private final java.lang.String[] getInputFormats;

    public JvmNameResolverBase(java.lang.String[] strArr, java.util.Set<java.lang.Integer> set, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getInputFormats = strArr;
        this.getHighSpeedVideoFpsRanges = set;
        this.Camera2StreamConfigurationMap = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public java.lang.String getString(int i) {
        java.lang.String str;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record record = this.Camera2StreamConfigurationMap.get(i);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                java.util.List<java.lang.String> list = getHighResolutionOutputSizeshNQ4ISI;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    str = list.get(record.getPredefinedIndex());
                }
            }
            str = this.getInputFormats[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            java.util.List<java.lang.Integer> substringIndexList = record.getSubstringIndexList();
            kotlin.jvm.internal.Intrinsics.checkNotNull(substringIndexList);
            java.lang.Integer num = substringIndexList.get(0);
            java.lang.Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                str = str.substring(intValue, num2.intValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
        }
        java.lang.String str2 = str;
        if (record.getReplaceCharCount() >= 2) {
            java.util.List<java.lang.Integer> replaceCharList = record.getReplaceCharList();
            kotlin.jvm.internal.Intrinsics.checkNotNull(replaceCharList);
            java.lang.Integer num3 = replaceCharList.get(0);
            java.lang.Integer num4 = replaceCharList.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            str2 = kotlin.text.StringsKt.replace$default(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, (java.lang.Object) null);
        }
        java.lang.String str3 = str2;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                str3 = kotlin.text.StringsKt.replace$default(str3, kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null);
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (str3.length() >= 2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                    str3 = str3.substring(1, str3.length() - 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                }
                java.lang.String str4 = str3;
                kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                str3 = kotlin.text.StringsKt.replace$default(str4, kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null);
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
        return str3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public java.lang.String getQualifiedClassName(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.getHighSpeedVideoFpsRanges.contains(java.lang.Integer.valueOf(i));
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        getHighSpeedVideoFpsRangesFor = joinToString$default;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(joinToString$default);
        sb.append("/Any");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(joinToString$default);
        sb2.append("/Nothing");
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(joinToString$default);
        sb3.append("/Unit");
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(joinToString$default);
        sb4.append("/Throwable");
        java.lang.String obj4 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(joinToString$default);
        sb5.append("/Number");
        java.lang.String obj5 = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(joinToString$default);
        sb6.append("/Byte");
        java.lang.String obj6 = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(joinToString$default);
        sb7.append("/Double");
        java.lang.String obj7 = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(joinToString$default);
        sb8.append("/Float");
        java.lang.String obj8 = sb8.toString();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(joinToString$default);
        sb9.append("/Int");
        java.lang.String obj9 = sb9.toString();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(joinToString$default);
        sb10.append("/Long");
        java.lang.String obj10 = sb10.toString();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        sb11.append(joinToString$default);
        sb11.append("/Short");
        java.lang.String obj11 = sb11.toString();
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        sb12.append(joinToString$default);
        sb12.append("/Boolean");
        java.lang.String obj12 = sb12.toString();
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        sb13.append(joinToString$default);
        sb13.append("/Char");
        java.lang.String obj13 = sb13.toString();
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
        sb14.append(joinToString$default);
        sb14.append("/CharSequence");
        java.lang.String obj14 = sb14.toString();
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
        sb15.append(joinToString$default);
        sb15.append("/String");
        java.lang.String obj15 = sb15.toString();
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
        sb16.append(joinToString$default);
        sb16.append("/Comparable");
        java.lang.String obj16 = sb16.toString();
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
        sb17.append(joinToString$default);
        sb17.append("/Enum");
        java.lang.String obj17 = sb17.toString();
        java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
        sb18.append(joinToString$default);
        sb18.append("/Array");
        java.lang.String obj18 = sb18.toString();
        java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
        sb19.append(joinToString$default);
        sb19.append("/ByteArray");
        java.lang.String obj19 = sb19.toString();
        java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
        sb20.append(joinToString$default);
        sb20.append("/DoubleArray");
        java.lang.String obj20 = sb20.toString();
        java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
        sb21.append(joinToString$default);
        sb21.append("/FloatArray");
        java.lang.String obj21 = sb21.toString();
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
        sb22.append(joinToString$default);
        sb22.append("/IntArray");
        java.lang.String obj22 = sb22.toString();
        java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
        sb23.append(joinToString$default);
        sb23.append("/LongArray");
        java.lang.String obj23 = sb23.toString();
        java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
        sb24.append(joinToString$default);
        sb24.append("/ShortArray");
        java.lang.String obj24 = sb24.toString();
        java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
        sb25.append(joinToString$default);
        sb25.append("/BooleanArray");
        java.lang.String obj25 = sb25.toString();
        java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
        sb26.append(joinToString$default);
        sb26.append("/CharArray");
        java.lang.String obj26 = sb26.toString();
        java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
        sb27.append(joinToString$default);
        sb27.append("/Cloneable");
        java.lang.String obj27 = sb27.toString();
        java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
        sb28.append(joinToString$default);
        sb28.append("/Annotation");
        java.lang.String obj28 = sb28.toString();
        java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
        sb29.append(joinToString$default);
        sb29.append("/collections/Iterable");
        java.lang.String obj29 = sb29.toString();
        java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
        sb30.append(joinToString$default);
        sb30.append("/collections/MutableIterable");
        java.lang.String obj30 = sb30.toString();
        java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
        sb31.append(joinToString$default);
        sb31.append("/collections/Collection");
        java.lang.String obj31 = sb31.toString();
        java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
        sb32.append(joinToString$default);
        sb32.append("/collections/MutableCollection");
        java.lang.String obj32 = sb32.toString();
        java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
        sb33.append(joinToString$default);
        sb33.append("/collections/List");
        java.lang.String obj33 = sb33.toString();
        java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
        sb34.append(joinToString$default);
        sb34.append("/collections/MutableList");
        java.lang.String obj34 = sb34.toString();
        java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
        sb35.append(joinToString$default);
        sb35.append("/collections/Set");
        java.lang.String obj35 = sb35.toString();
        java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
        sb36.append(joinToString$default);
        sb36.append("/collections/MutableSet");
        java.lang.String obj36 = sb36.toString();
        java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
        sb37.append(joinToString$default);
        sb37.append("/collections/Map");
        java.lang.String obj37 = sb37.toString();
        java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
        sb38.append(joinToString$default);
        sb38.append("/collections/MutableMap");
        java.lang.String obj38 = sb38.toString();
        java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
        sb39.append(joinToString$default);
        sb39.append("/collections/Map.Entry");
        java.lang.String obj39 = sb39.toString();
        java.lang.StringBuilder sb40 = new java.lang.StringBuilder();
        sb40.append(joinToString$default);
        sb40.append("/collections/MutableMap.MutableEntry");
        java.lang.String obj40 = sb40.toString();
        java.lang.StringBuilder sb41 = new java.lang.StringBuilder();
        sb41.append(joinToString$default);
        sb41.append("/collections/Iterator");
        java.lang.String obj41 = sb41.toString();
        java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
        sb42.append(joinToString$default);
        sb42.append("/collections/MutableIterator");
        java.lang.String obj42 = sb42.toString();
        java.lang.StringBuilder sb43 = new java.lang.StringBuilder();
        sb43.append(joinToString$default);
        sb43.append("/collections/ListIterator");
        java.lang.String obj43 = sb43.toString();
        java.lang.StringBuilder sb44 = new java.lang.StringBuilder();
        sb44.append(joinToString$default);
        sb44.append("/collections/MutableListIterator");
        java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, obj39, obj40, obj41, obj42, obj43, sb44.toString()});
        getHighResolutionOutputSizeshNQ4ISI = listOf;
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(listOf);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            linkedHashMap.put((java.lang.String) indexedValue.getValue(), java.lang.Integer.valueOf(indexedValue.getIndex()));
        }
        getHighSpeedVideoSizes = linkedHashMap;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
