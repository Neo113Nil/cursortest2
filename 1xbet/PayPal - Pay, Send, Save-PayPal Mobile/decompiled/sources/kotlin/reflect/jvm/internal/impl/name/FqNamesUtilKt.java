package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes5.dex */
public final class FqNamesUtilKt {
    public static final boolean isSubpackageOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, fqName2) || fqName2.isRoot()) {
            return true;
        }
        java.lang.String asString = fqName.asString();
        java.lang.String asString2 = fqName2.asString();
        return kotlin.text.StringsKt.startsWith$default(asString, asString2, false, 2, (java.lang.Object) null) && asString.charAt(asString2.length()) == '.';
    }

    public static final boolean isChildOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(parentOrNull(fqName), fqName2);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName tail(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName2, "");
        if (!isSubpackageOf(fqName, fqName2) || fqName2.isRoot()) {
            return fqName;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, fqName2)) {
            return kotlin.reflect.jvm.internal.impl.name.FqName.ROOT;
        }
        java.lang.String substring = fqName.asString().substring(fqName2.asString().length() + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return new kotlin.reflect.jvm.internal.impl.name.FqName(substring);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName parentOrNull(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    public static final boolean isValidJavaFqName(java.lang.String str) {
        if (str == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.State state = kotlin.reflect.jvm.internal.impl.name.State.getHighResolutionOutputSizeshNQ4ISI;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!java.lang.Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                state = kotlin.reflect.jvm.internal.impl.name.State.getHighSpeedVideoSizes;
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (charAt == '.') {
                    state = kotlin.reflect.jvm.internal.impl.name.State.getHighSpeedVideoFpsRangesFor;
                } else if (!java.lang.Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
            }
        }
        return state != kotlin.reflect.jvm.internal.impl.name.State.getHighSpeedVideoFpsRangesFor;
    }

    public static final <V> V findValueForMostSpecificFqname(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, ? extends V> map) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.FqName, ? extends V> entry : map.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.FqName key = entry.getKey();
            if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((kotlin.reflect.jvm.internal.impl.name.FqName) ((java.util.Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    java.lang.Object next2 = it.next();
                    int length2 = tail((kotlin.reflect.jvm.internal.impl.name.FqName) ((java.util.Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.name.State.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.getHighSpeedVideoFpsRangesFor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.getHighSpeedVideoSizes.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
