package androidx.room;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007H\u0007¢\u0006\u0004\b\n\u0010\fJY\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "", "", "resultColumns", "", "mappings", "", "resolve", "(Ljava/util/List;[[Ljava/lang/String;)[[I", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "T", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "ResultColumn", "Match", "Solution"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AmbiguousColumnResolver {
    public static final androidx.room.AmbiguousColumnResolver INSTANCE = new androidx.room.AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    @kotlin.jvm.JvmStatic
    public static final int[][] resolve(java.util.List<java.lang.String> resultColumns, java.lang.String[][] mappings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultColumns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappings, "");
        return resolve((java.lang.String[]) resultColumns.toArray(new java.lang.String[0]), mappings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @kotlin.jvm.JvmStatic
    public static final int[][] resolve(java.lang.String[] resultColumns, java.lang.String[][] mappings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultColumns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappings, "");
        int length = resultColumns.length;
        for (int i = 0; i < length; i++) {
            java.lang.String str = resultColumns[i];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            resultColumns[i] = lowerCase;
        }
        java.lang.String[][] strArr = mappings;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = mappings[i2].length;
            for (int i3 = 0; i3 < length3; i3++) {
                java.lang.String[] strArr2 = mappings[i2];
                java.lang.String lowerCase2 = strArr2[i3].toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                strArr2[i3] = lowerCase2;
            }
        }
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        for (java.lang.String[] strArr3 : strArr) {
            kotlin.collections.CollectionsKt.addAll(createSetBuilder, strArr3);
        }
        java.util.Set build = kotlin.collections.SetsKt.build(createSetBuilder);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        int length4 = resultColumns.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length4) {
            java.lang.String str2 = resultColumns[i4];
            if (build.contains(str2)) {
                createListBuilder.add(new androidx.room.AmbiguousColumnResolver.ResultColumn(str2, i5));
            }
            i4++;
            i5++;
        }
        java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn> build2 = kotlin.collections.CollectionsKt.build(createListBuilder);
        int length5 = strArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(length5);
        for (int i6 = 0; i6 < length5; i6++) {
            arrayList.add(new java.util.ArrayList());
        }
        final java.util.ArrayList arrayList2 = arrayList;
        int length6 = strArr.length;
        int i7 = 0;
        final int i8 = 0;
        while (i7 < length6) {
            final java.lang.String[] strArr4 = strArr[i7];
            kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.room.AmbiguousColumnResolver.$r8$lambda$Tdn3Tmk5sPdgd16yraP0xCKmdNU(strArr4, arrayList2, i8, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), (java.util.List) obj3);
                }
            };
            int i9 = 0;
            for (java.lang.String str3 : strArr4) {
                i9 += str3.hashCode();
            }
            int length7 = strArr4.length;
            java.util.Iterator it = build2.subList(0, length7).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((androidx.room.AmbiguousColumnResolver.ResultColumn) it.next()).getGetHighResolutionOutputSizeshNQ4ISI().hashCode();
            }
            int i11 = 0;
            while (true) {
                if (i9 == i10) {
                    function3.invoke(java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(length7), build2.subList(i11, length7));
                }
                int i12 = length7 + 1;
                if (i12 > build2.size()) {
                    break;
                }
                i10 = (i10 - ((androidx.room.AmbiguousColumnResolver.ResultColumn) build2.get(i11)).getGetHighResolutionOutputSizeshNQ4ISI().hashCode()) + ((androidx.room.AmbiguousColumnResolver.ResultColumn) build2.get(length7)).getGetHighResolutionOutputSizeshNQ4ISI().hashCode();
                i11++;
                length7 = i12;
            }
            if (((java.util.List) arrayList2.get(i8)).isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(strArr4.length);
                for (java.lang.String str4 : strArr4) {
                    java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                    for (androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn : build2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str4, resultColumn.getGetHighResolutionOutputSizeshNQ4ISI())) {
                            createListBuilder2.add(java.lang.Integer.valueOf(resultColumn.getCamera2StreamConfigurationMap()));
                        }
                    }
                    java.util.List build3 = kotlin.collections.CollectionsKt.build(createListBuilder2);
                    if (build3.isEmpty()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Column ");
                        sb.append(str4);
                        sb.append(" not found in result");
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    arrayList3.add(build3);
                }
                getHighSpeedVideoFpsRangesFor(arrayList3, new java.util.ArrayList(), 0, new kotlin.jvm.functions.Function1() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.room.AmbiguousColumnResolver.m9268$r8$lambda$8YioKpGJqNh4U_6HRVG6vSFNXU(arrayList2, i8, (java.util.List) obj);
                    }
                });
            }
            i7++;
            i8++;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                if (((java.util.List) it2.next()).isEmpty()) {
                    throw new java.lang.IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = androidx.room.AmbiguousColumnResolver.Solution.INSTANCE.getNO_SOLUTION();
        getHighSpeedVideoFpsRangesFor(arrayList2, new java.util.ArrayList(), 0, new kotlin.jvm.functions.Function1() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.room.AmbiguousColumnResolver.m9269$r8$lambda$zemcPFlXhLyQT1fqT5mE8rjNjU(kotlin.jvm.internal.Ref.ObjectRef.this, (java.util.List) obj);
            }
        });
        java.util.List<androidx.room.AmbiguousColumnResolver.Match> highSpeedVideoFpsRanges = ((androidx.room.AmbiguousColumnResolver.Solution) objectRef.element).getHighSpeedVideoFpsRanges();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highSpeedVideoFpsRanges, 10));
        java.util.Iterator<T> it3 = highSpeedVideoFpsRanges.iterator();
        while (it3.hasNext()) {
            arrayList5.add(kotlin.collections.CollectionsKt.toIntArray(((androidx.room.AmbiguousColumnResolver.Match) it3.next()).getHighSpeedVideoSizes()));
        }
        return (int[][]) arrayList5.toArray(new int[0][]);
    }

    private static <T> void getHighSpeedVideoFpsRangesFor(java.util.List<? extends java.util.List<? extends T>> p0, java.util.List<T> p1, int p2, kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, kotlin.Unit> p3) {
        if (p2 == p0.size()) {
            p3.invoke(kotlin.collections.CollectionsKt.toList(p1));
            return;
        }
        java.util.Iterator<T> it = p0.get(p2).iterator();
        while (it.hasNext()) {
            p1.add(it.next());
            getHighSpeedVideoFpsRangesFor(p0, p1, p2 + 1, p3);
            p1.remove(kotlin.collections.CollectionsKt.getLastIndex(p1));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ResultColumn {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public ResultColumn(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = i;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResultColumn(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.room.AmbiguousColumnResolver.ResultColumn)) {
                return false;
            }
            androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn = (androidx.room.AmbiguousColumnResolver.ResultColumn) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, resultColumn.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == resultColumn.Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "Lkotlin/ranges/IntRange;", "p0", "", "", "p1", "<init>", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "getHighSpeedVideoSizes", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRangesFor", "()Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Match {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.ranges.IntRange Camera2StreamConfigurationMap;

        public Match(kotlin.ranges.IntRange intRange, java.util.List<java.lang.Integer> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.Camera2StreamConfigurationMap = intRange;
            this.getHighSpeedVideoFpsRangesFor = list;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final kotlin.ranges.IntRange getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.util.List<java.lang.Integer> getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "getHighSpeedVideoFpsRangesFor", "(Landroidx/room/AmbiguousColumnResolver$Solution;)I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Solution implements java.lang.Comparable<androidx.room.AmbiguousColumnResolver.Solution> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.room.AmbiguousColumnResolver.Solution.Companion INSTANCE = new androidx.room.AmbiguousColumnResolver.Solution.Companion(null);
        private static final androidx.room.AmbiguousColumnResolver.Solution NO_SOLUTION = new androidx.room.AmbiguousColumnResolver.Solution(kotlin.collections.CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<androidx.room.AmbiguousColumnResolver.Match> Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        public Solution(java.util.List<androidx.room.AmbiguousColumnResolver.Match> list, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.Camera2StreamConfigurationMap = list;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = i2;
        }

        public final java.util.List<androidx.room.AmbiguousColumnResolver.Match> getHighSpeedVideoFpsRanges() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // java.lang.Comparable
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final int compareTo(androidx.room.AmbiguousColumnResolver.Solution p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            int compare = kotlin.jvm.internal.Intrinsics.compare(this.getHighSpeedVideoSizes, p0.getHighSpeedVideoSizes);
            return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(this.getHighSpeedVideoFpsRanges, p0.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "<init>", "()V", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "matches", "Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "(Ljava/util/List;)Landroidx/room/AmbiguousColumnResolver$Solution;", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.room.AmbiguousColumnResolver.Solution getNO_SOLUTION() {
                return androidx.room.AmbiguousColumnResolver.Solution.NO_SOLUTION;
            }

            public final androidx.room.AmbiguousColumnResolver.Solution build(java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matches, "");
                java.util.List<androidx.room.AmbiguousColumnResolver.Match> list = matches;
                int i = 0;
                for (androidx.room.AmbiguousColumnResolver.Match match : list) {
                    i += ((match.getCamera2StreamConfigurationMap().getLast() - match.getCamera2StreamConfigurationMap().getFirst()) + 1) - match.getHighSpeedVideoSizes().size();
                }
                java.util.Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int first = ((androidx.room.AmbiguousColumnResolver.Match) it.next()).getCamera2StreamConfigurationMap().getFirst();
                while (it.hasNext()) {
                    int first2 = ((androidx.room.AmbiguousColumnResolver.Match) it.next()).getCamera2StreamConfigurationMap().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                java.util.Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int last = ((androidx.room.AmbiguousColumnResolver.Match) it2.next()).getCamera2StreamConfigurationMap().getLast();
                while (it2.hasNext()) {
                    int last2 = ((androidx.room.AmbiguousColumnResolver.Match) it2.next()).getCamera2StreamConfigurationMap().getLast();
                    if (last < last2) {
                        last = last2;
                    }
                }
                java.util.Iterator<java.lang.Integer> it3 = new kotlin.ranges.IntRange(first, last).iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    int nextInt = ((kotlin.collections.IntIterator) it3).nextInt();
                    java.util.Iterator<T> it4 = list.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (((androidx.room.AmbiguousColumnResolver.Match) it4.next()).getCamera2StreamConfigurationMap().contains(nextInt)) {
                            i3++;
                        }
                        if (i3 > 1) {
                            i2++;
                            if (i2 < 0) {
                                kotlin.collections.CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                }
                return new androidx.room.AmbiguousColumnResolver.Solution(matches, i, i2);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* renamed from: $r8$lambda$8YioKpGJqN-h4U_6HRVG6vSFNXU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9268$r8$lambda$8YioKpGJqNh4U_6HRVG6vSFNXU(java.util.List list, int i, java.util.List list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        java.util.List list3 = list2;
        java.util.Iterator it = list3.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int intValue = ((java.lang.Number) it.next()).intValue();
        while (it.hasNext()) {
            int intValue2 = ((java.lang.Number) it.next()).intValue();
            if (intValue > intValue2) {
                intValue = intValue2;
            }
        }
        java.util.Iterator it2 = list3.iterator();
        if (!it2.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int intValue3 = ((java.lang.Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int intValue4 = ((java.lang.Number) it2.next()).intValue();
            if (intValue3 < intValue4) {
                intValue3 = intValue4;
            }
        }
        ((java.util.List) list.get(i)).add(new androidx.room.AmbiguousColumnResolver.Match(new kotlin.ranges.IntRange(intValue, intValue3), list2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Tdn3Tmk5sPdgd16yraP0xCKmdNU(java.lang.String[] strArr, java.util.List list, int i, int i2, int i3, java.util.List list2) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.room.AmbiguousColumnResolver.ResultColumn) obj).getHighResolutionOutputSizeshNQ4ISI)) {
                    break;
                }
            }
            androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn = (androidx.room.AmbiguousColumnResolver.ResultColumn) obj;
            if (resultColumn == null) {
                return kotlin.Unit.INSTANCE;
            }
            arrayList.add(java.lang.Integer.valueOf(resultColumn.getCamera2StreamConfigurationMap()));
        }
        ((java.util.List) list.get(i)).add(new androidx.room.AmbiguousColumnResolver.Match(new kotlin.ranges.IntRange(i2, i3 - 1), arrayList));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    /* renamed from: $r8$lambda$zemcPFlXhLyQT1fqT5-mE8rjNjU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9269$r8$lambda$zemcPFlXhLyQT1fqT5mE8rjNjU(kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        ?? build = androidx.room.AmbiguousColumnResolver.Solution.INSTANCE.build(list);
        if (build.compareTo((androidx.room.AmbiguousColumnResolver.Solution) objectRef.element) < 0) {
            objectRef.element = build;
        }
        return kotlin.Unit.INSTANCE;
    }
}
