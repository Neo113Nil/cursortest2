package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
final class SignatureEnhancementBuilder {
    final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    public final class ClassEnhancementBuilder {
        private final java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder getHighSpeedVideoFpsRangesFor;

        public ClassEnhancementBuilder(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder signatureEnhancementBuilder, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = signatureEnhancementBuilder;
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final java.lang.String getClassName() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public static /* synthetic */ void function$default(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.function(str, str2, function1);
        }

        public final void function(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            java.util.Map map = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder(this, str, str2);
            function1.invoke(functionEnhancementBuilder);
            kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> build = functionEnhancementBuilder.build();
            map.put(build.getFirst(), build.getSecond());
        }

        public final class FunctionEnhancementBuilder {
            private kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> Camera2StreamConfigurationMap;
            private final java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> getHighResolutionOutputSizeshNQ4ISI;
            private final java.lang.String getHighSpeedVideoFpsRanges;
            private final java.lang.String getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder getHighSpeedVideoSizes;
            private kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus getOutputMinFrameDuration;

            public FunctionEnhancementBuilder(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder, java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.getHighSpeedVideoSizes = classEnhancementBuilder;
                this.getHighSpeedVideoFpsRanges = str;
                this.getHighSpeedVideoFpsRangesFor = str2;
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                this.Camera2StreamConfigurationMap = kotlin.TuplesKt.to("V", null);
            }

            public final void parameter(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... javaTypeQualifiersArr) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeQualifiersArr, "");
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list = this.getHighResolutionOutputSizeshNQ4ISI;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.ArraysKt.withIndex(javaTypeQualifiersArr);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
                    for (kotlin.collections.IndexedValue indexedValue : withIndex) {
                        int index = indexedValue.getIndex();
                        linkedHashMap.put(java.lang.Integer.valueOf(index), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo(linkedHashMap);
                }
                list.add(kotlin.TuplesKt.to(str, typeEnhancementInfo));
            }

            public final void returns(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... javaTypeQualifiersArr) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeQualifiersArr, "");
                java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.ArraysKt.withIndex(javaTypeQualifiersArr);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
                for (kotlin.collections.IndexedValue indexedValue : withIndex) {
                    int index = indexedValue.getIndex();
                    linkedHashMap.put(java.lang.Integer.valueOf(index), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) indexedValue.getValue());
                }
                this.Camera2StreamConfigurationMap = kotlin.TuplesKt.to(str, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmPrimitiveType, "");
                java.lang.String desc = jvmPrimitiveType.getDesc();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(desc, "");
                this.Camera2StreamConfigurationMap = kotlin.TuplesKt.to(desc, null);
            }

            public final void mustUseReturnValue() {
                this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.MustUse;
            }

            public final kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> build() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
                java.lang.String className = this.getHighSpeedVideoSizes.getClassName();
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
                }
                java.lang.String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, this.Camera2StreamConfigurationMap.getFirst()));
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo second = this.Camera2StreamConfigurationMap.getSecond();
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list2 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) ((kotlin.Pair) it2.next()).getSecond());
                }
                return kotlin.TuplesKt.to(signature, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo(second, arrayList2, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration));
            }
        }
    }
}
