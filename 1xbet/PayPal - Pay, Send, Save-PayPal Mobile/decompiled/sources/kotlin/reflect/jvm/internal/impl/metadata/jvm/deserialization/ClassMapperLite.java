package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public final class ClassMapperLite {
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite();
    private static final java.lang.String getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    private ClassMapperLite() {
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Boolean", "Z", "Char", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Byte", "B", "Short", "S", "Int", com.visa.cbp.getEncExpo.warmup, "Float", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Long", "J", "Double", "D"});
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String str = getHighSpeedVideoSizes;
                sb.append(str);
                sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                sb.append((java.lang.String) listOf.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listOf.get(i2));
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                sb2.append((java.lang.String) listOf.get(i));
                sb2.append("Array");
                java.lang.String obj = sb2.toString();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[");
                sb3.append((java.lang.String) listOf.get(i2));
                linkedHashMap.put(obj, sb3.toString());
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(getHighSpeedVideoSizes);
        sb4.append("/Unit");
        linkedHashMap.put(sb4.toString(), "V");
        getHighSpeedVideoSizes(linkedHashMap, "Any", "java/lang/Object");
        getHighSpeedVideoSizes(linkedHashMap, "Nothing", "java/lang/Void");
        getHighSpeedVideoSizes(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (java.lang.String str2 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            getHighSpeedVideoSizes(linkedHashMap, str2, "java/lang/".concat(java.lang.String.valueOf(str2)));
        }
        for (java.lang.String str3 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            getHighSpeedVideoSizes(linkedHashMap, "collections/".concat(java.lang.String.valueOf(str3)), "java/util/".concat(java.lang.String.valueOf(str3)));
            getHighSpeedVideoSizes(linkedHashMap, "collections/Mutable".concat(java.lang.String.valueOf(str3)), "java/util/".concat(java.lang.String.valueOf(str3)));
        }
        getHighSpeedVideoSizes(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        getHighSpeedVideoSizes(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        getHighSpeedVideoSizes(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        getHighSpeedVideoSizes(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            java.lang.String concat = "Function".concat(java.lang.String.valueOf(i3));
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            java.lang.String str4 = getHighSpeedVideoSizes;
            sb5.append(str4);
            sb5.append("/jvm/functions/Function");
            sb5.append(i3);
            getHighSpeedVideoSizes(linkedHashMap, concat, sb5.toString());
            java.lang.String concat2 = "reflect/KFunction".concat(java.lang.String.valueOf(i3));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str4);
            sb6.append("/reflect/KFunction");
            getHighSpeedVideoSizes(linkedHashMap, concat2, sb6.toString());
        }
        for (java.lang.String str5 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str5);
            sb7.append(".Companion");
            java.lang.String obj2 = sb7.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(getHighSpeedVideoSizes);
            sb8.append("/jvm/internal/");
            sb8.append(str5);
            sb8.append("CompanionObject");
            getHighSpeedVideoSizes(linkedHashMap, obj2, sb8.toString());
        }
        getHighSpeedVideoFpsRanges = linkedHashMap;
    }

    private static final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoSizes);
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb.append(str);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("L");
        sb2.append(str2);
        sb2.append(';');
        map.put(obj, sb2.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String mapClass(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = getHighSpeedVideoFpsRanges.get(str);
        if (str2 != null) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("L");
        sb.append(kotlin.text.StringsKt.replace$default(str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null));
        sb.append(';');
        return sb.toString();
    }
}
