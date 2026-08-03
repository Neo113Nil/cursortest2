package androidx.room;

/* compiled from: AmbiguousColumnResolver.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\u0004\u0012\u00020\u00040\rH\u0002JO\u0010\u000e\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0004\u0012\u00020\u00040\u0014H\u0002¢\u0006\u0002\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0011H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "()V", com.ironsource.M6.m, "", "T", "content", "", "current", "", "depth", "", "block", "Lkotlin/Function1;", "rabinKarpSearch", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "pattern", "", "", "onHashMatch", "Lkotlin/Function3;", "(Ljava/util/List;[Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "resolve", "", "resultColumns", "mappings", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {
    public static final androidx.room.AmbiguousColumnResolver INSTANCE = new androidx.room.AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @kotlin.jvm.JvmStatic
    public static final int[][] resolve(java.lang.String[] resultColumns, java.lang.String[][] mappings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        for (int i = 0; i < length; i++) {
            java.lang.String str = resultColumns[i];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i] = lowerCase;
        }
        java.lang.String[][] strArr = mappings;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = mappings[i2].length;
            for (int i3 = 0; i3 < length3; i3++) {
                java.lang.String[] strArr2 = mappings[i2];
                java.lang.String str2 = strArr2[i3];
                java.util.Locale US2 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US2, "US");
                java.lang.String lowerCase2 = str2.toLowerCase(US2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
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
            java.lang.String str3 = resultColumns[i4];
            int i6 = i5 + 1;
            if (build.contains(str3)) {
                createListBuilder.add(new androidx.room.AmbiguousColumnResolver.ResultColumn(str3, i5));
            }
            i4++;
            i5 = i6;
        }
        java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn> build2 = kotlin.collections.CollectionsKt.build(createListBuilder);
        int length5 = strArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(length5);
        for (int i7 = 0; i7 < length5; i7++) {
            arrayList.add(new java.util.ArrayList());
        }
        final java.util.ArrayList arrayList2 = arrayList;
        int length6 = strArr.length;
        int i8 = 0;
        final int i9 = 0;
        while (i8 < length6) {
            int i10 = i9 + 1;
            final java.lang.String[] strArr4 = strArr[i8];
            INSTANCE.rabinKarpSearch(build2, strArr4, new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, java.util.List<? extends androidx.room.AmbiguousColumnResolver.ResultColumn>, kotlin.Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Integer num2, java.util.List<? extends androidx.room.AmbiguousColumnResolver.ResultColumn> list) {
                    invoke(num.intValue(), num2.intValue(), (java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn>) list);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(int i11, int i12, java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
                    java.lang.Object obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
                    java.lang.String[] strArr5 = strArr4;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(strArr5.length);
                    for (java.lang.String str4 : strArr5) {
                        java.util.Iterator<T> it = resultColumnsSublist.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(str4, ((androidx.room.AmbiguousColumnResolver.ResultColumn) obj).getName())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn = (androidx.room.AmbiguousColumnResolver.ResultColumn) obj;
                        if (resultColumn == null) {
                            return;
                        }
                        arrayList3.add(java.lang.Integer.valueOf(resultColumn.getIndex()));
                    }
                    arrayList2.get(i9).add(new androidx.room.AmbiguousColumnResolver.Match(new kotlin.ranges.IntRange(i11, i12 - 1), arrayList3));
                }
            });
            if (((java.util.List) arrayList2.get(i9)).isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(strArr4.length);
                for (java.lang.String str4 : strArr4) {
                    java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                    for (androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn : build2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str4, resultColumn.getName())) {
                            createListBuilder2.add(java.lang.Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    java.util.List build3 = kotlin.collections.CollectionsKt.build(createListBuilder2);
                    if (!(!build3.isEmpty())) {
                        throw new java.lang.IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                    arrayList3.add(build3);
                }
                dfs$default(INSTANCE, arrayList3, null, 0, new kotlin.jvm.functions.Function1<java.util.List<? extends java.lang.Integer>, kotlin.Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends java.lang.Integer> list) {
                        invoke2((java.util.List<java.lang.Integer>) list);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.util.List<java.lang.Integer> indices) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indices, "indices");
                        java.util.List<java.lang.Integer> list = indices;
                        java.util.Iterator<T> it = list.iterator();
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
                        java.util.Iterator<T> it2 = list.iterator();
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
                        arrayList2.get(i9).add(new androidx.room.AmbiguousColumnResolver.Match(new kotlin.ranges.IntRange(intValue, intValue3), indices));
                    }
                }, 6, null);
            }
            i8++;
            i9 = i10;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        if (!(arrayList4 instanceof java.util.Collection) || !arrayList4.isEmpty()) {
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (!(!((java.util.List) it.next()).isEmpty())) {
                    throw new java.lang.IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = androidx.room.AmbiguousColumnResolver.Solution.INSTANCE.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList2, null, 0, new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.room.AmbiguousColumnResolver.Match>, kotlin.Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.room.AmbiguousColumnResolver.Match> list) {
                invoke2((java.util.List<androidx.room.AmbiguousColumnResolver.Match>) list);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.util.List<androidx.room.AmbiguousColumnResolver.Match> it2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it2, "it");
                ?? build4 = androidx.room.AmbiguousColumnResolver.Solution.INSTANCE.build(it2);
                if (build4.compareTo(objectRef.element) < 0) {
                    objectRef.element = build4;
                }
            }
        }, 6, null);
        java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches = ((androidx.room.AmbiguousColumnResolver.Solution) objectRef.element).getMatches();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(matches, 10));
        java.util.Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList5.add(kotlin.collections.CollectionsKt.toIntArray(((androidx.room.AmbiguousColumnResolver.Match) it2.next()).getResultIndices()));
        }
        java.lang.Object[] array = arrayList5.toArray(new int[0][]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (int[][]) array;
    }

    private final void rabinKarpSearch(java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn> content, java.lang.String[] pattern, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.List<androidx.room.AmbiguousColumnResolver.ResultColumn>, kotlin.Unit> onHashMatch) {
        int i = 0;
        int i2 = 0;
        for (java.lang.String str : pattern) {
            i2 += str.hashCode();
        }
        int length = pattern.length;
        java.util.Iterator<T> it = content.subList(0, length).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((androidx.room.AmbiguousColumnResolver.ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i2 == i3) {
                onHashMatch.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(length), content.subList(i, length));
            }
            int i4 = i + 1;
            int i5 = length + 1;
            if (i5 > content.size()) {
                return;
            }
            i3 = (i3 - content.get(i).getName().hashCode()) + content.get(length).getName().hashCode();
            i = i4;
            length = i5;
        }
    }

    static /* synthetic */ void dfs$default(androidx.room.AmbiguousColumnResolver ambiguousColumnResolver, java.util.List list, java.util.List list2, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new java.util.ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, function1);
    }

    private final <T> void dfs(java.util.List<? extends java.util.List<? extends T>> content, java.util.List<T> current, int depth, kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, kotlin.Unit> block) {
        if (depth == content.size()) {
            block.invoke(kotlin.collections.CollectionsKt.toList(current));
            return;
        }
        java.util.Iterator<T> it = content.get(depth).iterator();
        while (it.hasNext()) {
            current.add(it.next());
            INSTANCE.dfs(content, current, depth + 1, block);
            kotlin.collections.CollectionsKt.removeLast(current);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "name", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/String;I)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class ResultColumn {
        private final int index;
        private final java.lang.String name;

        public static /* synthetic */ androidx.room.AmbiguousColumnResolver.ResultColumn copy$default(androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i2 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final androidx.room.AmbiguousColumnResolver.ResultColumn copy(java.lang.String name, int index) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            return new androidx.room.AmbiguousColumnResolver.ResultColumn(name, index);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.room.AmbiguousColumnResolver.ResultColumn)) {
                return false;
            }
            androidx.room.AmbiguousColumnResolver.ResultColumn resultColumn = (androidx.room.AmbiguousColumnResolver.ResultColumn) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        public java.lang.String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }

        public ResultColumn(java.lang.String name, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String getName() {
            return this.name;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "resultRange", "Lkotlin/ranges/IntRange;", "resultIndices", "", "", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "getResultIndices", "()Ljava/util/List;", "getResultRange", "()Lkotlin/ranges/IntRange;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Match {
        private final java.util.List<java.lang.Integer> resultIndices;
        private final kotlin.ranges.IntRange resultRange;

        public Match(kotlin.ranges.IntRange resultRange, java.util.List<java.lang.Integer> resultIndices) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final kotlin.ranges.IntRange getResultRange() {
            return this.resultRange;
        }

        public final java.util.List<java.lang.Integer> getResultIndices() {
            return this.resultIndices;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "coverageOffset", "", "overlaps", "(Ljava/util/List;II)V", "getCoverageOffset", "()I", "getMatches", "()Ljava/util/List;", "getOverlaps", "compareTo", "other", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Solution implements java.lang.Comparable<androidx.room.AmbiguousColumnResolver.Solution> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.room.AmbiguousColumnResolver.Solution.Companion INSTANCE = new androidx.room.AmbiguousColumnResolver.Solution.Companion(null);
        private static final androidx.room.AmbiguousColumnResolver.Solution NO_SOLUTION = new androidx.room.AmbiguousColumnResolver.Solution(kotlin.collections.CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches;
        private final int overlaps;

        public Solution(java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        public final java.util.List<androidx.room.AmbiguousColumnResolver.Match> getMatches() {
            return this.matches;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.room.AmbiguousColumnResolver.Solution other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            int compare = kotlin.jvm.internal.Intrinsics.compare(this.overlaps, other.overlaps);
            return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(this.coverageOffset, other.coverageOffset);
        }

        /* compiled from: AmbiguousColumnResolver.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "()V", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.room.AmbiguousColumnResolver.Solution getNO_SOLUTION() {
                return androidx.room.AmbiguousColumnResolver.Solution.NO_SOLUTION;
            }

            public final androidx.room.AmbiguousColumnResolver.Solution build(java.util.List<androidx.room.AmbiguousColumnResolver.Match> matches) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matches, "matches");
                java.util.List<androidx.room.AmbiguousColumnResolver.Match> list = matches;
                int i = 0;
                int i2 = 0;
                for (androidx.room.AmbiguousColumnResolver.Match match : list) {
                    i2 += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                java.util.Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int first = ((androidx.room.AmbiguousColumnResolver.Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((androidx.room.AmbiguousColumnResolver.Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                java.util.Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int last = ((androidx.room.AmbiguousColumnResolver.Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last2 = ((androidx.room.AmbiguousColumnResolver.Match) it2.next()).getResultRange().getLast();
                    if (last < last2) {
                        last = last2;
                    }
                }
                java.lang.Iterable intRange = new kotlin.ranges.IntRange(first, last);
                if (!(intRange instanceof java.util.Collection) || !((java.util.Collection) intRange).isEmpty()) {
                    java.util.Iterator it3 = intRange.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int nextInt = ((kotlin.collections.IntIterator) it3).nextInt();
                        java.util.Iterator<T> it4 = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((androidx.room.AmbiguousColumnResolver.Match) it4.next()).getResultRange().contains(nextInt)) {
                                i4++;
                            }
                            if (i4 > 1) {
                                i3++;
                                if (i3 < 0) {
                                    kotlin.collections.CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                    }
                    i = i3;
                }
                return new androidx.room.AmbiguousColumnResolver.Solution(matches, i2, i);
            }
        }
    }
}
