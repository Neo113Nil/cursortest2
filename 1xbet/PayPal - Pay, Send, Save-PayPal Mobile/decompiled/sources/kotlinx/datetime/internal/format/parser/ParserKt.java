package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "concat", "(Ljava/util/List;)Lkotlinx/datetime/internal/format/parser/ParserStructure;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParserKt {
    private static final <T> kotlinx.datetime.internal.format.parser.ParserStructure<T> getHighSpeedVideoSizes(kotlinx.datetime.internal.format.parser.ParserStructure<? super T> parserStructure, kotlinx.datetime.internal.format.parser.ParserStructure<? super T> parserStructure2) {
        if (parserStructure.getFollowedBy().isEmpty()) {
            return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.plus((java.util.Collection) parserStructure.getOperations(), (java.lang.Iterable) parserStructure2.getOperations()), parserStructure2.getFollowedBy());
        }
        java.util.List<kotlinx.datetime.internal.format.parser.ParserOperation<? super T>> operations = parserStructure.getOperations();
        java.util.List<kotlinx.datetime.internal.format.parser.ParserStructure<? super T>> followedBy = parserStructure.getFollowedBy();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(followedBy, 10));
        java.util.Iterator<T> it = followedBy.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoSizes((kotlinx.datetime.internal.format.parser.ParserStructure) it.next(), parserStructure2));
        }
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(operations, arrayList);
    }

    private static final <T> kotlinx.datetime.internal.format.parser.ParserStructure<T> getHighSpeedVideoFpsRanges(kotlinx.datetime.internal.format.parser.ParserStructure<? super T> parserStructure, java.util.List<kotlinx.datetime.internal.format.parser.UnconditionalModification<T>> list) {
        kotlinx.datetime.internal.format.parser.ParserStructure parserStructure2;
        java.util.List listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
        java.util.List list2 = null;
        for (kotlinx.datetime.internal.format.parser.ParserOperation<? super T> parserOperation : parserStructure.getOperations()) {
            if (parserOperation instanceof kotlinx.datetime.internal.format.parser.NumberSpanParserOperation) {
                if (list2 != null) {
                    list2.addAll(((kotlinx.datetime.internal.format.parser.NumberSpanParserOperation) parserOperation).getConsumers());
                } else {
                    list2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) ((kotlinx.datetime.internal.format.parser.NumberSpanParserOperation) parserOperation).getConsumers());
                }
            } else if (parserOperation instanceof kotlinx.datetime.internal.format.parser.UnconditionalModification) {
                mutableList.add(parserOperation);
            } else {
                if (list2 != null) {
                    arrayList.add(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(list2));
                    list2 = null;
                }
                arrayList.add(parserOperation);
            }
        }
        java.util.List<kotlinx.datetime.internal.format.parser.ParserStructure<? super T>> followedBy = parserStructure.getFollowedBy();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = followedBy.iterator();
        while (it.hasNext()) {
            kotlinx.datetime.internal.format.parser.ParserStructure highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((kotlinx.datetime.internal.format.parser.ParserStructure) it.next(), mutableList);
            if (highSpeedVideoFpsRanges.getOperations().isEmpty()) {
                java.util.List followedBy2 = highSpeedVideoFpsRanges.getFollowedBy();
                if (followedBy2.isEmpty()) {
                    followedBy2 = kotlin.collections.CollectionsKt.listOf(highSpeedVideoFpsRanges);
                }
                listOf = followedBy2;
            } else {
                listOf = kotlin.collections.CollectionsKt.listOf(highSpeedVideoFpsRanges);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, listOf);
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            arrayList3 = kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.ParserStructure(mutableList, kotlin.collections.CollectionsKt.emptyList()));
        }
        java.util.List list3 = arrayList3;
        if (list2 == null) {
            return new kotlinx.datetime.internal.format.parser.ParserStructure<>(arrayList, list3);
        }
        java.util.List<kotlinx.datetime.internal.format.parser.ParserStructure> list4 = list3;
        if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
            java.util.Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                kotlinx.datetime.internal.format.parser.ParserOperation parserOperation2 = (kotlinx.datetime.internal.format.parser.ParserOperation) kotlin.collections.CollectionsKt.firstOrNull(((kotlinx.datetime.internal.format.parser.ParserStructure) it2.next()).getOperations());
                if (parserOperation2 != null && (parserOperation2 instanceof kotlinx.datetime.internal.format.parser.NumberSpanParserOperation)) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    for (kotlinx.datetime.internal.format.parser.ParserStructure parserStructure3 : list4) {
                        kotlinx.datetime.internal.format.parser.ParserOperation parserOperation3 = (kotlinx.datetime.internal.format.parser.ParserOperation) kotlin.collections.CollectionsKt.firstOrNull(parserStructure3.getOperations());
                        if (parserOperation3 instanceof kotlinx.datetime.internal.format.parser.NumberSpanParserOperation) {
                            parserStructure2 = new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.plus((java.util.Collection) list2, (java.lang.Iterable) ((kotlinx.datetime.internal.format.parser.NumberSpanParserOperation) parserOperation3).getConsumers()))), (java.lang.Iterable) kotlin.collections.CollectionsKt.drop(parserStructure3.getOperations(), 1)), parserStructure3.getFollowedBy());
                        } else if (parserOperation3 == null) {
                            parserStructure2 = new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(list2)), parserStructure3.getFollowedBy());
                        } else {
                            parserStructure2 = new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(list2)), (java.lang.Iterable) parserStructure3.getOperations()), parserStructure3.getFollowedBy());
                        }
                        arrayList4.add(parserStructure2);
                    }
                    return new kotlinx.datetime.internal.format.parser.ParserStructure<>(arrayList, arrayList4);
                }
            }
        }
        arrayList.add(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(list2));
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(arrayList, list3);
    }

    public static final <T> kotlinx.datetime.internal.format.parser.ParserStructure<T> concat(java.util.List<? extends kotlinx.datetime.internal.format.parser.ParserStructure<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlinx.datetime.internal.format.parser.ParserStructure parserStructure = new kotlinx.datetime.internal.format.parser.ParserStructure(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());
        if (!list.isEmpty()) {
            java.util.ListIterator<? extends kotlinx.datetime.internal.format.parser.ParserStructure<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                parserStructure = getHighSpeedVideoSizes(listIterator.previous(), parserStructure);
            }
        }
        return getHighSpeedVideoFpsRanges(parserStructure, kotlin.collections.CollectionsKt.emptyList());
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$rQIJaB_aDx58yDJdtjy6e7aYCgg(kotlinx.datetime.internal.format.parser.ParseError parseError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parseError, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("position ");
        sb.append(parseError.getPosition());
        sb.append(": '");
        sb.append(parseError.getMessage().invoke());
        sb.append('\'');
        return sb.toString();
    }

    public static final /* synthetic */ java.lang.String access$formatError(java.util.List list) {
        java.lang.Appendable joinTo;
        if (list.size() == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Position ");
            sb.append(((kotlinx.datetime.internal.format.parser.ParseError) list.get(0)).getPosition());
            sb.append(": ");
            sb.append(((kotlinx.datetime.internal.format.parser.ParseError) list.get(0)).getMessage().invoke());
            return sb.toString();
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(list, new java.lang.StringBuilder(list.size() * 33), (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "Errors: ", (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.internal.format.parser.ParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.internal.format.parser.ParserKt.$r8$lambda$rQIJaB_aDx58yDJdtjy6e7aYCgg((kotlinx.datetime.internal.format.parser.ParseError) obj);
            }
        });
        java.lang.String obj = ((java.lang.StringBuilder) joinTo).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
