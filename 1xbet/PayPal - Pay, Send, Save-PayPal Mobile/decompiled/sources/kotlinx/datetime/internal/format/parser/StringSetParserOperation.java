package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001dB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/datetime/internal/format/parser/StringSetParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "", "", "strings", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "setter", "whatThisExpects", "<init>", "(Ljava/util/Collection;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "getHighSpeedVideoSizes", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/internal/format/parser/StringSetParserOperation$TrieNode;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/parser/StringSetParserOperation$TrieNode;", "TrieNode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StringSetParserOperation<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.AssignableField<Output, java.lang.String> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public StringSetParserOperation(java.util.Collection<java.lang.String> collection, kotlinx.datetime.internal.format.parser.AssignableField<? super Output, java.lang.String> assignableField, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = assignableField;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        boolean z = false;
        int i = 3;
        this.getHighSpeedVideoSizes = new kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode(null, z, i, 0 == true ? 1 : 0);
        for (java.lang.String str2 : collection) {
            if (str2.length() <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Found an empty string in ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode trieNode = this.getHighSpeedVideoSizes;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str2.charAt(i2);
                java.util.List<kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode>> list = trieNode.getHighSpeedVideoSizes;
                final java.lang.String valueOf = java.lang.String.valueOf(charAt);
                int binarySearch = kotlin.collections.CollectionsKt.binarySearch(list, 0, list.size(), new kotlin.jvm.functions.Function1<kotlin.Pair<? extends java.lang.String, ? extends kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode>, java.lang.Integer>() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$special$$inlined$binarySearchBy$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Integer invoke(kotlin.Pair<? extends java.lang.String, ? extends kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode> pair) {
                        return java.lang.Integer.valueOf(kotlin.comparisons.ComparisonsKt.compareValues(pair.getFirst(), valueOf));
                    }
                });
                if (binarySearch < 0) {
                    kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode trieNode2 = new kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode(objArr2 == true ? 1 : 0, z, i, objArr == true ? 1 : 0);
                    trieNode.getHighSpeedVideoSizes.add((-binarySearch) - 1, kotlin.TuplesKt.to(java.lang.String.valueOf(charAt), trieNode2));
                    trieNode = trieNode2;
                } else {
                    trieNode = trieNode.getHighSpeedVideoSizes.get(binarySearch).getSecond();
                }
            }
            if (trieNode.Camera2StreamConfigurationMap) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The string '");
                sb2.append(str2);
                sb2.append("' was passed several times");
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
            trieNode.Camera2StreamConfigurationMap = true;
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/datetime/internal/format/parser/StringSetParserOperation$TrieNode;", "", "", "Lkotlin/Pair;", "", "p0", "", "p1", "<init>", "(Ljava/util/List;Z)V", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class TrieNode {
        boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.util.List<kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode>> getHighSpeedVideoSizes;

        private TrieNode(java.util.List<kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode>> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoSizes = list;
            this.Camera2StreamConfigurationMap = z;
        }

        public /* synthetic */ TrieNode(java.util.ArrayList arrayList, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.ArrayList() : arrayList, (i & 2) != 0 ? false : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TrieNode() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        r1.element += r4.length();
        r0 = r3;
     */
    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, final java.lang.CharSequence input, final int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode trieNode = this.getHighSpeedVideoSizes;
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = startIndex;
        java.lang.Integer num = null;
        loop0: while (intRef.element <= input.length()) {
            if (trieNode.Camera2StreamConfigurationMap) {
                num = java.lang.Integer.valueOf(intRef.element);
            }
            for (kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode> pair : trieNode.getHighSpeedVideoSizes) {
                java.lang.String component1 = pair.component1();
                kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode component2 = pair.component2();
                if (kotlin.text.StringsKt.startsWith$default(input, (java.lang.CharSequence) component1, intRef.element, false, 4, (java.lang.Object) null)) {
                    break;
                }
            }
        }
        if (num != null) {
            return kotlinx.datetime.internal.format.parser.ParserOperationKt.access$setWithoutReassigning(this.Camera2StreamConfigurationMap, storage, input.subSequence(startIndex, num.intValue()).toString(), startIndex, num.intValue());
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.datetime.internal.format.parser.StringSetParserOperation.m24195$r8$lambda$7dWUzCqyTxZASHzU_a_CGBOppI(kotlinx.datetime.internal.format.parser.StringSetParserOperation.this, input, startIndex, intRef);
            }
        });
    }

    /* renamed from: $r8$lambda$7dWUzCqy-TxZASHzU_a_CGBOppI, reason: not valid java name */
    public static /* synthetic */ java.lang.String m24195$r8$lambda$7dWUzCqyTxZASHzU_a_CGBOppI(kotlinx.datetime.internal.format.parser.StringSetParserOperation stringSetParserOperation, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.Ref.IntRef intRef) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(stringSetParserOperation.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" but got ");
        sb.append(charSequence.subSequence(i, intRef.element).toString());
        return sb.toString();
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode trieNode) {
        java.util.Iterator<kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode>> it = trieNode.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            getHighResolutionOutputSizeshNQ4ISI(it.next().component2());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.Pair<java.lang.String, kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode> pair : trieNode.getHighSpeedVideoSizes) {
            java.lang.String component1 = pair.component1();
            kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode component2 = pair.component2();
            if (!component2.Camera2StreamConfigurationMap && component2.getHighSpeedVideoSizes.size() == 1) {
                kotlin.Pair pair2 = (kotlin.Pair) kotlin.collections.CollectionsKt.single((java.util.List) component2.getHighSpeedVideoSizes);
                java.lang.String str = (java.lang.String) pair2.component1();
                kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode trieNode2 = (kotlinx.datetime.internal.format.parser.StringSetParserOperation.TrieNode) pair2.component2();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(component1);
                sb.append(str);
                arrayList.add(kotlin.TuplesKt.to(sb.toString(), trieNode2));
            } else {
                arrayList.add(kotlin.TuplesKt.to(component1, component2));
            }
        }
        trieNode.getHighSpeedVideoSizes.clear();
        trieNode.getHighSpeedVideoSizes.addAll(kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$_init_$reduceTrie$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.String) ((kotlin.Pair) t).getFirst(), (java.lang.String) ((kotlin.Pair) t2).getFirst());
            }
        }));
    }
}
