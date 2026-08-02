package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public class SpecialGenericSignatures {
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature> getHighSpeedVideoFpsRangesFor;
    private static final java.util.List<java.lang.String> getHighSpeedVideoSizes;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoSizesFor;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.name.Name> getInputFormats;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> getInputSizeshNQ4ISI;
    private static final java.util.Set<java.lang.String> getOutputFormats;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getOutputMinFrameDuration;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> getOutputMinFrameDurationlomOqCM;
    private static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature getOutputSizes;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> getOutputStallDurationlomOqCM;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription FALSE;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription INDEX;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription NULL;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] getHighSpeedVideoSizes;
        private final java.lang.Object getHighSpeedVideoFpsRangesFor;

        private TypeSafeBarrierDescription(java.lang.String str, int i, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = obj;
        }

        static {
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription typeSafeBarrierDescription = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription typeSafeBarrierDescription2 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription typeSafeBarrierDescription3 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription("FALSE", 2, java.lang.Boolean.FALSE);
            FALSE = typeSafeBarrierDescription3;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT map_get_or_default = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT");
            MAP_GET_OR_DEFAULT = map_get_or_default;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
            getHighSpeedVideoSizes = typeSafeBarrierDescriptionArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(typeSafeBarrierDescriptionArr);
        }

        static final class MAP_GET_OR_DEFAULT extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            MAP_GET_OR_DEFAULT(java.lang.String str) {
                super(str, 3, r1, r1);
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[] values() {
            return (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.class, str);
        }

        public /* synthetic */ TypeSafeBarrierDescription(java.lang.String str, int i, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo OBJECT_PARAMETER_GENERIC;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC;
        public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo ONE_COLLECTION_PARAMETER;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoSizes;

        private SpecialSignatureInfo(java.lang.String str, int i, java.lang.String str2, boolean z) {
            this.getHighSpeedVideoSizes = str2;
            this.getHighSpeedVideoFpsRanges = z;
        }

        static {
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
            ONE_COLLECTION_PARAMETER = specialSignatureInfo;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo2 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
            OBJECT_PARAMETER_NON_GENERIC = specialSignatureInfo2;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo specialSignatureInfo3 = new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
            OBJECT_PARAMETER_GENERIC = specialSignatureInfo3;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] specialSignatureInfoArr = {specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
            Camera2StreamConfigurationMap = specialSignatureInfoArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(specialSignatureInfoArr);
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[] values() {
            return (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.class, str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo getSpecialSignatureInfo(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(str)) {
                return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            if (((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) kotlin.collections.MapsKt.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), str)) == kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL) {
                return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
            }
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        public static final class NameAndSignature {
            private final java.lang.String Camera2StreamConfigurationMap;
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;
            private final java.lang.String getHighSpeedVideoFpsRangesFor;
            private final java.lang.String getHighSpeedVideoSizes;

            public NameAndSignature(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                this.getHighSpeedVideoFpsRanges = name2;
                this.getHighSpeedVideoFpsRangesFor = str2;
                this.Camera2StreamConfigurationMap = str3;
                kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append('(');
                sb.append(str2);
                sb.append(')');
                sb.append(str3);
                this.getHighSpeedVideoSizes = signatureBuildingComponents.signature(str, sb.toString());
            }

            public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public final java.lang.String getSignature() {
                return this.getHighSpeedVideoSizes;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(", name=");
                sb.append(this.getHighSpeedVideoFpsRanges);
                sb.append(", parameters=");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                sb.append(", returnType=");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return (((((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode();
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature)) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature nameAndSignature = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, nameAndSignature.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, nameAndSignature.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, nameAndSignature.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, nameAndSignature.Camera2StreamConfigurationMap);
            }

            public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature copy(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                return new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature(str, name2, str2, str3);
            }

            public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature copy$default(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature nameAndSignature, java.lang.String str, kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.getHighResolutionOutputSizeshNQ4ISI;
                }
                if ((i & 2) != 0) {
                    name2 = nameAndSignature.getHighSpeedVideoFpsRanges;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.getHighSpeedVideoFpsRangesFor;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.Camera2StreamConfigurationMap;
                }
                return nameAndSignature.copy(str, name2, str2, str3);
            }
        }

        public final java.util.List<java.lang.String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getHighSpeedVideoSizes;
        }

        public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getOutputMinFrameDurationlomOqCM;
        }

        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.util.Set<java.lang.String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Camera2StreamConfigurationMap;
        }

        public final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getOutputSizes;
        }

        public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getOutputStallDurationlomOqCM;
        }

        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getORIGINAL_SHORT_NAMES() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getOutputMinFrameDuration;
        }

        public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.name.Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.getInputFormats;
        }

        public final kotlin.reflect.jvm.internal.impl.name.Name getBuiltinFunctionNamesByJvmName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name2);
        }

        public final boolean getSameAsRenamedInJvmBuiltin(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return getORIGINAL_SHORT_NAMES().contains(name2);
        }

        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature access$method(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
            return new kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature(str, identifier, str3, str4);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.Set<java.lang.String> of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"containsAll", "removeAll", "retainAll"});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(of, 10));
        for (java.lang.String str : of) {
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion = Companion;
            java.lang.String desc = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc, "");
            arrayList.add(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        java.util.ArrayList arrayList2 = arrayList;
        getHighSpeedVideoFpsRangesFor = arrayList2;
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) it.next()).getSignature());
        }
        getHighSpeedVideoSizes = arrayList4;
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature> list = getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) it2.next()).getName().asString());
        }
        getHighSpeedVideoFpsRanges = arrayList5;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion2 = Companion;
        java.lang.String javaUtil = signatureBuildingComponents.javaUtil("Collection");
        java.lang.String desc2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc2, "");
        kotlin.Pair pair = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil, "contains", "Ljava/lang/Object;", desc2), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE);
        java.lang.String javaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        java.lang.String desc3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc3, "");
        kotlin.Pair pair2 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil2, "remove", "Ljava/lang/Object;", desc3), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE);
        java.lang.String javaUtil3 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc4, "");
        kotlin.Pair pair3 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil3, "containsKey", "Ljava/lang/Object;", desc4), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE);
        java.lang.String javaUtil4 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc5, "");
        kotlin.Pair pair4 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil4, "containsValue", "Ljava/lang/Object;", desc5), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE);
        java.lang.String javaUtil5 = signatureBuildingComponents.javaUtil("Map");
        java.lang.String desc6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc6, "");
        kotlin.Pair pair5 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.FALSE);
        kotlin.Pair pair6 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        kotlin.Pair pair7 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL);
        kotlin.Pair pair8 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.NULL);
        java.lang.String javaUtil6 = signatureBuildingComponents.javaUtil("List");
        java.lang.String desc7 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc7, "");
        kotlin.Pair pair9 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil6, "indexOf", "Ljava/lang/Object;", desc7), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.INDEX);
        java.lang.String javaUtil7 = signatureBuildingComponents.javaUtil("List");
        java.lang.String desc8 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc8, "");
        java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription> mapOf = kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion2, javaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.INDEX));
        getInputSizeshNQ4ISI = mapOf;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(mapOf.size()));
        java.util.Iterator<T> it3 = mapOf.entrySet().iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
            linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        getOutputMinFrameDurationlomOqCM = linkedHashMap;
        java.util.Set plus = kotlin.collections.SetsKt.plus((java.util.Set) getInputSizeshNQ4ISI.keySet(), (java.lang.Iterable) getHighSpeedVideoFpsRangesFor);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it4 = plus.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) it4.next()).getName());
        }
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toSet(arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it5 = plus.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) it5.next()).getSignature());
        }
        Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toSet(arrayList7);
        kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion3 = Companion;
        java.lang.String desc9 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc9, "");
        kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature access$method = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        getOutputSizes = access$method;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents2 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.lang.String javaLang = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc10 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc10, "");
        kotlin.Pair pair10 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang, "toByte", "", desc10), kotlin.reflect.jvm.internal.impl.name.Name.identifier("byteValue"));
        java.lang.String javaLang2 = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc11 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc11, "");
        kotlin.Pair pair11 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang2, "toShort", "", desc11), kotlin.reflect.jvm.internal.impl.name.Name.identifier("shortValue"));
        java.lang.String javaLang3 = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc12 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc12, "");
        kotlin.Pair pair12 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang3, "toInt", "", desc12), kotlin.reflect.jvm.internal.impl.name.Name.identifier("intValue"));
        java.lang.String javaLang4 = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc13 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc13, "");
        kotlin.Pair pair13 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang4, "toLong", "", desc13), kotlin.reflect.jvm.internal.impl.name.Name.identifier("longValue"));
        java.lang.String javaLang5 = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc14 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc14, "");
        kotlin.Pair pair14 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang5, "toFloat", "", desc14), kotlin.reflect.jvm.internal.impl.name.Name.identifier("floatValue"));
        java.lang.String javaLang6 = signatureBuildingComponents2.javaLang("Number");
        java.lang.String desc15 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc15, "");
        kotlin.Pair pair15 = kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang6, "toDouble", "", desc15), kotlin.reflect.jvm.internal.impl.name.Name.identifier("doubleValue"));
        kotlin.Pair pair16 = kotlin.TuplesKt.to(access$method, kotlin.reflect.jvm.internal.impl.name.Name.identifier("remove"));
        java.lang.String javaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        java.lang.String desc16 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc16, "");
        java.lang.String desc17 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR.getDesc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc17, "");
        java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> mapOf2 = kotlin.collections.MapsKt.mapOf(pair10, pair11, pair12, pair13, pair14, pair15, pair16, kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, javaLang7, "get", desc16, desc17), kotlin.reflect.jvm.internal.impl.name.Name.identifier("charAt")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "load", "", com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), com.google.android.libraries.places.api.model.PlaceTypes.STORE, com.visa.cbp.getEncExpo.warmup, "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "exchange", com.visa.cbp.getEncExpo.warmup, com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "fetchAndAdd", com.visa.cbp.getEncExpo.warmup, com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndAdd")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "addAndFetch", com.visa.cbp.getEncExpo.warmup, com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("addAndGet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "load", "", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), com.google.android.libraries.places.api.model.PlaceTypes.STORE, "J", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "exchange", "J", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "fetchAndAdd", "J", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndAdd")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "addAndFetch", "J", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("addAndGet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "load", "", "Z"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Z", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "exchange", "Z", "Z"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "load", "", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Ljava/lang/Object;", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "loadAt", com.visa.cbp.getEncExpo.warmup, com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "storeAt", "II", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "exchangeAt", "II", com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("compareAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "fetchAndAddAt", "II", com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndAdd")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "addAndFetchAt", "II", com.visa.cbp.getEncExpo.warmup), kotlin.reflect.jvm.internal.impl.name.Name.identifier("addAndGet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "loadAt", com.visa.cbp.getEncExpo.warmup, "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "storeAt", "IJ", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "exchangeAt", "IJ", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("compareAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndAdd")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("addAndGet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "loadAt", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("get")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("set")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("getAndSet")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), kotlin.reflect.jvm.internal.impl.name.Name.identifier("compareAndSet")));
        getHighSpeedVideoSizesFor = mapOf2;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(mapOf2.size()));
        java.util.Iterator<T> it6 = mapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
            linkedHashMap2.put(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        getOutputStallDurationlomOqCM = linkedHashMap2;
        java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> map = getHighSpeedVideoSizesFor;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name> entry3 : map.entrySet()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        getOutputFormats = linkedHashSet;
        java.util.Set<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature> keySet = getHighSpeedVideoSizesFor.keySet();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it7 = keySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) it7.next()).getName());
        }
        getOutputMinFrameDuration = hashSet;
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature, kotlin.reflect.jvm.internal.impl.name.Name>> entrySet = getHighSpeedVideoSizesFor.entrySet();
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        java.util.Iterator<T> it8 = entrySet.iterator();
        while (it8.hasNext()) {
            java.util.Map.Entry entry4 = (java.util.Map.Entry) it8.next();
            arrayList8.add(new kotlin.Pair(((kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        java.util.ArrayList<kotlin.Pair> arrayList9 = arrayList8;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10)), 16));
        for (kotlin.Pair pair17 : arrayList9) {
            linkedHashMap3.put((kotlin.reflect.jvm.internal.impl.name.Name) pair17.getSecond(), (kotlin.reflect.jvm.internal.impl.name.Name) pair17.getFirst());
        }
        getInputFormats = linkedHashMap3;
    }
}
