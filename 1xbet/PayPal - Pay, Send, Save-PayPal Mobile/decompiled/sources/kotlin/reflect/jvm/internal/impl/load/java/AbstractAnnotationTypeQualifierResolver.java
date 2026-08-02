package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.Companion getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.Companion(0 == true ? 1 : 0);
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState Camera2StreamConfigurationMap;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> getHighSpeedVideoFpsRanges;

    protected abstract java.lang.Iterable<java.lang.String> enumArguments(TAnnotation tannotation, boolean z);

    protected abstract kotlin.reflect.jvm.internal.impl.name.FqName getFqName(TAnnotation tannotation);

    protected abstract java.lang.Object getKey(TAnnotation tannotation);

    protected abstract java.lang.Iterable<TAnnotation> getMetaAnnotations(TAnnotation tannotation);

    public abstract boolean isK2();

    public AbstractAnnotationTypeQualifierResolver(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "");
        this.Camera2StreamConfigurationMap = javaTypeEnhancementState;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap<>();
    }

    private final TAnnotation getHighSpeedVideoSizes(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        for (TAnnotation tannotation2 : getMetaAnnotations(tannotation)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(getFqName(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean Camera2StreamConfigurationMap(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(tannotation);
        if ((metaAnnotations instanceof java.util.Collection) && ((java.util.Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        java.util.Iterator<TAnnotation> it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(getFqName(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation resolveTypeQualifierAnnotation(TAnnotation tannotation) {
        TAnnotation tannotation2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tannotation, "");
        if (this.Camera2StreamConfigurationMap.getJsr305().isDisabled()) {
            return null;
        }
        if (kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(tannotation)) || Camera2StreamConfigurationMap(tannotation, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return tannotation;
        }
        if (!Camera2StreamConfigurationMap(tannotation, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> concurrentHashMap = this.getHighSpeedVideoFpsRanges;
        java.lang.Object key = getKey(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(key);
        if (tannotation3 != null) {
            return tannotation3;
        }
        java.util.Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = resolveTypeQualifierAnnotation(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(key, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }

    public final boolean isTypeUseAnnotation(TAnnotation tannotation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tannotation, "");
        TAnnotation highSpeedVideoSizes = getHighSpeedVideoSizes(tannotation, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target);
        if (highSpeedVideoSizes == null) {
            return false;
        }
        java.lang.Iterable<java.lang.String> enumArguments = enumArguments(highSpeedVideoSizes, false);
        if ((enumArguments instanceof java.util.Collection) && ((java.util.Collection) enumArguments).isEmpty()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = enumArguments.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getHighResolutionOutputSizeshNQ4ISI(TAnnotation tannotation) {
        java.lang.Iterable<java.lang.String> enumArguments;
        java.lang.String str;
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = this.Camera2StreamConfigurationMap.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation highSpeedVideoSizes = getHighSpeedVideoSizes(tannotation, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (highSpeedVideoSizes == null || (enumArguments = enumArguments(highSpeedVideoSizes, false)) == null || (str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(enumArguments)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel migrationLevel = this.Camera2StreamConfigurationMap.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN;
                }
            } else if (str.equals(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT)) {
                return kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE;
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getHighResolutionOutputSizeshNQ4ISI(TAnnotation tannotation, kotlin.jvm.functions.Function1<? super TAnnotation, java.lang.Boolean> function1) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus highResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>) tannotation, function1.invoke(tannotation).booleanValue());
        if (highResolutionOutputSizeshNQ4ISI2 != null) {
            return highResolutionOutputSizeshNQ4ISI2;
        }
        TAnnotation resolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(tannotation);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(tannotation);
        if (highResolutionOutputSizeshNQ4ISI3 == null) {
            highResolutionOutputSizeshNQ4ISI3 = this.Camera2StreamConfigurationMap.getJsr305().getGlobalLevel();
        }
        if (highResolutionOutputSizeshNQ4ISI3.isIgnore() || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>) resolveTypeQualifierAnnotation, function1.invoke(resolveTypeQualifierAnnotation).booleanValue())) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(highResolutionOutputSizeshNQ4ISI, null, highResolutionOutputSizeshNQ4ISI3.isWarning(), 1, null);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers$default(kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver abstractAnnotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, java.lang.Iterable iterable, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extractAndMergeDefaultQualifiers");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return abstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, iterable, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, java.lang.Iterable<? extends TAnnotation> iterable, boolean z) {
        boolean z2;
        java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers> defaultQualifiers;
        kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers;
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object obj;
        kotlin.Pair pair;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus highResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers2;
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel highResolutionOutputSizeshNQ4ISI2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        if (!this.Camera2StreamConfigurationMap.getDisabledDefaultAnnotations()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
            while (true) {
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers3 = null;
                if (!it.hasNext()) {
                    break;
                }
                TAnnotation next = it.next();
                if (!this.Camera2StreamConfigurationMap.getDisabledDefaultAnnotations() && (javaDefaultQualifiers2 = kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiersKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(next))) != null) {
                    kotlin.reflect.jvm.internal.impl.name.FqName fqName = getFqName(next);
                    if (fqName != null && kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiersKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
                        highResolutionOutputSizeshNQ4ISI2 = this.Camera2StreamConfigurationMap.getGetReportLevelForAnnotation().invoke(fqName);
                    } else {
                        highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(next);
                        if (highResolutionOutputSizeshNQ4ISI2 == null) {
                            highResolutionOutputSizeshNQ4ISI2 = this.Camera2StreamConfigurationMap.getJsr305().getGlobalLevel();
                        }
                    }
                    if (highResolutionOutputSizeshNQ4ISI2 == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE) {
                        highResolutionOutputSizeshNQ4ISI2 = null;
                    }
                    if (highResolutionOutputSizeshNQ4ISI2 != null) {
                        javaDefaultQualifiers = kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers.copy$default(javaDefaultQualifiers2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers2.getNullabilityQualifier(), null, z || highResolutionOutputSizeshNQ4ISI2.isWarning(), 1, null), null, false, false, false, 30, null);
                        if (javaDefaultQualifiers == null) {
                            javaDefaultQualifiers3 = javaDefaultQualifiers;
                        } else {
                            if (!this.Camera2StreamConfigurationMap.getJsr305().isDisabled() && (highSpeedVideoSizes = getHighSpeedVideoSizes(next, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME())) != null) {
                                java.util.Iterator it2 = getMetaAnnotations(next).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (resolveTypeQualifierAnnotation(obj) != null) {
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    java.lang.Iterable<java.lang.String> enumArguments = enumArguments(highSpeedVideoSizes, true);
                                    java.util.Set linkedHashSet = new java.util.LinkedHashSet();
                                    java.util.Iterator<java.lang.String> it3 = enumArguments.iterator();
                                    while (it3.hasNext()) {
                                        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = getHighSpeedVideoFpsRangesFor.get(it3.next());
                                        if (annotationQualifierApplicabilityType != null) {
                                            linkedHashSet.add(annotationQualifierApplicabilityType);
                                        }
                                    }
                                    java.util.Set set = linkedHashSet;
                                    if (set.contains(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE)) {
                                        set = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.minus((java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType>) kotlin.collections.ArraysKt.toSet(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.values()), kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (java.lang.Iterable) set);
                                    }
                                    pair = new kotlin.Pair(obj, set);
                                    if (pair != null) {
                                        java.lang.Object component1 = pair.component1();
                                        java.util.Set set2 = (java.util.Set) pair.component2();
                                        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(next);
                                        if (highResolutionOutputSizeshNQ4ISI3 == null && (highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(component1)) == null) {
                                            highResolutionOutputSizeshNQ4ISI3 = this.Camera2StreamConfigurationMap.getJsr305().getGlobalLevel();
                                        }
                                        if (!highResolutionOutputSizeshNQ4ISI3.isIgnore() && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>) component1, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>, java.lang.Boolean>) new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$$Lambda$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public java.lang.Object invoke(java.lang.Object obj2) {
                                                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.getHighSpeedVideoFpsRanges(obj2));
                                            }
                                        })) != null) {
                                            javaDefaultQualifiers3 = new kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(highResolutionOutputSizeshNQ4ISI, null, z || highResolutionOutputSizeshNQ4ISI3.isWarning(), 1, null), set2, false, false, false, 28, null);
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair != null) {
                            }
                        }
                        if (javaDefaultQualifiers3 == null) {
                            arrayList.add(javaDefaultQualifiers3);
                        }
                    }
                }
                javaDefaultQualifiers = null;
                if (javaDefaultQualifiers == null) {
                }
                if (javaDefaultQualifiers3 == null) {
                }
            }
            java.util.ArrayList<kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers> arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                java.util.EnumMap enumMap = new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class);
                for (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers4 : arrayList2) {
                    for (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 : javaDefaultQualifiers4.getQualifierApplicabilityTypes()) {
                        java.util.EnumMap enumMap2 = enumMap;
                        if (!enumMap2.containsKey(annotationQualifierApplicabilityType2) || !isK2()) {
                            enumMap2.put((java.util.EnumMap) annotationQualifierApplicabilityType2, (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) javaDefaultQualifiers4);
                        } else {
                            kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers5 = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType2);
                            if (javaDefaultQualifiers5 != null) {
                                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifier = javaDefaultQualifiers5.getNullabilityQualifier();
                                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifier2 = javaDefaultQualifiers4.getNullabilityQualifier();
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(nullabilityQualifier2, nullabilityQualifier) && (!nullabilityQualifier2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly())) {
                                    javaDefaultQualifiers5 = (nullabilityQualifier2.isForWarningOnly() || !nullabilityQualifier.isForWarningOnly()) ? null : javaDefaultQualifiers4;
                                }
                                enumMap2.put((java.util.EnumMap) annotationQualifierApplicabilityType2, (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) javaDefaultQualifiers5);
                            }
                        }
                    }
                }
                java.util.EnumMap enumMap3 = (javaTypeQualifiersByElementType == null || (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) == null) ? new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class) : new java.util.EnumMap((java.util.EnumMap) defaultQualifiers);
                for (java.util.Map.Entry entry : enumMap.entrySet()) {
                    kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) entry.getKey();
                    kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers6 = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) entry.getValue();
                    if (javaDefaultQualifiers6 != null) {
                        enumMap3.put((java.util.EnumMap) annotationQualifierApplicabilityType3, (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) javaDefaultQualifiers6);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType(enumMap3);
                }
            }
        }
        return javaTypeQualifiersByElementType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r6.equals("NEVER") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r6.equals("MAYBE") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getHighResolutionOutputSizeshNQ4ISI(TAnnotation tannotation, boolean z) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = getFqName(tannotation);
        if (fqName == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel invoke = this.Camera2StreamConfigurationMap.getGetReportLevelForAnnotation().invoke(fqName);
        if (invoke.isIgnore()) {
            return null;
        }
        if (!kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            if (kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
                nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
            } else {
                if (!kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getFORCE_FLEXIBILITY_ANNOTATIONS().contains(fqName)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION_FQ_NAME())) {
                        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(enumArguments(tannotation, false));
                        if (str != null) {
                            switch (str.hashCode()) {
                                case 73135176:
                                    break;
                                case 74175084:
                                    break;
                                case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                                    if (str.equals("UNKNOWN")) {
                                        nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
                                        break;
                                    }
                                    break;
                                case 1933739535:
                                    break;
                            }
                            return null;
                        }
                    }
                    return null;
                }
                nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(nullabilityQualifier, !invoke.isWarning() || z);
        }
        nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(nullabilityQualifier, !invoke.isWarning() || z);
    }

    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.values()) {
            java.lang.String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        getHighSpeedVideoFpsRangesFor = linkedHashMap;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability(java.lang.Iterable<? extends TAnnotation> iterable, kotlin.jvm.functions.Function1<? super TAnnotation, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>) it.next(), (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation>, java.lang.Boolean>) function1);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (highResolutionOutputSizeshNQ4ISI != null && !kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, nullabilityQualifierWithMigrationStatus) && (!highResolutionOutputSizeshNQ4ISI.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                    if (highResolutionOutputSizeshNQ4ISI.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = highResolutionOutputSizeshNQ4ISI;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier extractMutability(java.lang.Iterable<? extends TAnnotation> iterable) {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = getFqName(it.next());
            if (kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
            } else if (kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return false;
    }
}
