package io.ktor.http.cio.internals;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0018\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree;", "", "T", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "root", "<init>", "(Lio/ktor/http/cio/internals/AsciiCharTree$Node;)V", "", "sequence", "", "fromIdx", "end", "", "lowerCase", "Lkotlin/Function2;", "", "stopPredicate", "", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "(Ljava/lang/CharSequence;IIZLkotlin/jvm/functions/Function2;)Ljava/util/List;", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "getRoot", "()Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "Companion", "Node"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AsciiCharTree<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.cio.internals.AsciiCharTree.Companion INSTANCE = new io.ktor.http.cio.internals.AsciiCharTree.Companion(null);
    private final io.ktor.http.cio.internals.AsciiCharTree.Node<T> root;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00000\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "T", "", "", "ch", "", "exact", "children", "<init>", "(CLjava/util/List;Ljava/util/List;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getCh", "()C", "Ljava/util/List;", "getExact", "()Ljava/util/List;", "getChildren", "", "array", "[Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "getArray", "()[Lio/ktor/http/cio/internals/AsciiCharTree$Node;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Node<T> {
        private final io.ktor.http.cio.internals.AsciiCharTree.Node<T>[] array;
        private final char ch;
        private final java.util.List<io.ktor.http.cio.internals.AsciiCharTree.Node<T>> children;
        private final java.util.List<T> exact;

        /* JADX WARN: Multi-variable type inference failed */
        public Node(char c, java.util.List<? extends T> list, java.util.List<io.ktor.http.cio.internals.AsciiCharTree.Node<T>> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.ch = c;
            this.exact = list;
            this.children = list2;
            io.ktor.http.cio.internals.AsciiCharTree.Node<T>[] nodeArr = new io.ktor.http.cio.internals.AsciiCharTree.Node[256];
            for (int i = 0; i < 256; i++) {
                java.util.Iterator<T> it = this.children.iterator();
                io.ktor.http.cio.internals.AsciiCharTree.Node<T> node = null;
                boolean z = false;
                io.ktor.http.cio.internals.AsciiCharTree.Node<T> node2 = null;
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((io.ktor.http.cio.internals.AsciiCharTree.Node) next).ch == i) {
                            if (z) {
                                break;
                            }
                            z = true;
                            node2 = next;
                        }
                    } else if (z) {
                        node = node2;
                    }
                }
                nodeArr[i] = node;
            }
            this.array = nodeArr;
        }

        public final char getCh() {
            return this.ch;
        }

        public final java.util.List<io.ktor.http.cio.internals.AsciiCharTree.Node<T>> getChildren() {
            return this.children;
        }

        public final java.util.List<T> getExact() {
            return this.exact;
        }

        public final io.ktor.http.cio.internals.AsciiCharTree.Node<T>[] getArray() {
            return this.array;
        }
    }

    public AsciiCharTree(io.ktor.http.cio.internals.AsciiCharTree.Node<T> node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        this.root = node;
    }

    public final io.ktor.http.cio.internals.AsciiCharTree.Node<T> getRoot() {
        return this.root;
    }

    public static /* synthetic */ java.util.List search$default(io.ktor.http.cio.internals.AsciiCharTree asciiCharTree, java.lang.CharSequence charSequence, int i, int i2, boolean z, kotlin.jvm.functions.Function2 function2, int i3, java.lang.Object obj) {
        int i4 = (i3 & 2) != 0 ? 0 : i;
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return asciiCharTree.search(charSequence, i4, i2, (i3 & 8) != 0 ? false : z, function2);
    }

    public final java.util.List<T> search(java.lang.CharSequence sequence, int fromIdx, int end, boolean lowerCase, kotlin.jvm.functions.Function2<? super java.lang.Character, ? super java.lang.Integer, java.lang.Boolean> stopPredicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stopPredicate, "");
        if (sequence.length() == 0) {
            throw new java.lang.IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        io.ktor.http.cio.internals.AsciiCharTree.Node<T> node = this.root;
        while (fromIdx < end) {
            char charAt = sequence.charAt(fromIdx);
            if (stopPredicate.invoke(java.lang.Character.valueOf(charAt), java.lang.Integer.valueOf(charAt)).booleanValue()) {
                break;
            }
            io.ktor.http.cio.internals.AsciiCharTree.Node<T> node2 = node.getArray()[charAt];
            if (node2 == null) {
                node = lowerCase ? node.getArray()[java.lang.Character.toLowerCase(charAt)] : null;
                if (node == null) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            } else {
                node = node2;
            }
            fromIdx++;
        }
        return node.getExact();
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\t\u0010\nJY\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\t\u0010\u0011Jy\u0010\u001b\u001a\u00020\u001a\"\b\b\u0001\u0010\u0005*\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Companion;", "", "<init>", "()V", "", "T", "", "from", "Lio/ktor/http/cio/internals/AsciiCharTree;", "build", "(Ljava/util/List;)Lio/ktor/http/cio/internals/AsciiCharTree;", "Lkotlin/Function1;", "", "length", "Lkotlin/Function2;", "", "charAt", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lio/ktor/http/cio/internals/AsciiCharTree;", "", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "p0", "p1", "p2", "p3", "p4", "p5", "", "Camera2StreamConfigurationMap", "(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T extends java.lang.CharSequence> io.ktor.http.cio.internals.AsciiCharTree<T> build(java.util.List<? extends T> from) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
            return build(from, new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.internals.AsciiCharTree$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(io.ktor.http.cio.internals.AsciiCharTree.Companion.$r8$lambda$eGcjufKiwWA2rClBlHWRzUE7iV4((java.lang.CharSequence) obj));
                }
            }, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.internals.AsciiCharTree$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Character.valueOf(io.ktor.http.cio.internals.AsciiCharTree.Companion.m23364$r8$lambda$xVFxMIUpk80j2Z4vmz1vlxv3M((java.lang.CharSequence) obj, ((java.lang.Integer) obj2).intValue()));
                }
            });
        }

        public final <T> io.ktor.http.cio.internals.AsciiCharTree<T> build(java.util.List<? extends T> from, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> length, kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, java.lang.Character> charAt) {
            amex.AMEXKernel aMEXKernel;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(length, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charAt, "");
            java.util.List<? extends T> list = from;
            java.util.Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    java.lang.Integer invoke = length.invoke(next);
                    do {
                        T next2 = it.next();
                        java.lang.Integer invoke2 = length.invoke(next2);
                        if (invoke.compareTo(invoke2) < 0) {
                            next = next2;
                            invoke = invoke2;
                        }
                    } while (it.hasNext());
                }
                aMEXKernel = next;
            } else {
                aMEXKernel = null;
            }
            if (aMEXKernel != null) {
                int intValue = length.invoke(aMEXKernel).intValue();
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (length.invoke(it2.next()).intValue() == 0) {
                            throw new java.lang.IllegalArgumentException("There should be no empty entries");
                        }
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = arrayList;
                Camera2StreamConfigurationMap(arrayList2, from, intValue, 0, length, charAt);
                arrayList.trimToSize();
                return new io.ktor.http.cio.internals.AsciiCharTree<>(new io.ktor.http.cio.internals.AsciiCharTree.Node((char) 0, kotlin.collections.CollectionsKt.emptyList(), arrayList2));
            }
            throw new java.util.NoSuchElementException("Unable to build char tree from an empty list");
        }

        private static <T> void Camera2StreamConfigurationMap(java.util.List<io.ktor.http.cio.internals.AsciiCharTree.Node<T>> p0, java.util.List<? extends T> p1, int p2, int p3, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> p4, kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, java.lang.Character> p5) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (T t : p1) {
                java.lang.Character valueOf = java.lang.Character.valueOf(p5.invoke(t, java.lang.Integer.valueOf(p3)).charValue());
                java.lang.Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((java.util.List) obj).add(t);
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                char charValue = ((java.lang.Character) entry.getKey()).charValue();
                java.util.List list = (java.util.List) entry.getValue();
                int i = p3 + 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                io.ktor.http.cio.internals.AsciiCharTree.Companion companion = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE;
                java.util.ArrayList arrayList2 = arrayList;
                java.util.List list2 = list;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (T t2 : list2) {
                    if (p4.invoke(t2).intValue() > i) {
                        arrayList3.add(t2);
                    }
                }
                Camera2StreamConfigurationMap(arrayList2, arrayList3, p2, i, p4, p5);
                arrayList.trimToSize();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (T t3 : list2) {
                    if (p4.invoke(t3).intValue() == i) {
                        arrayList4.add(t3);
                    }
                }
                p0.add(new io.ktor.http.cio.internals.AsciiCharTree.Node<>(charValue, arrayList4, arrayList2));
            }
        }

        public static /* synthetic */ int $r8$lambda$eGcjufKiwWA2rClBlHWRzUE7iV4(java.lang.CharSequence charSequence) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            return charSequence.length();
        }

        /* renamed from: $r8$lambda$x-VFxMIUpk80j2Z4v-mz1vlxv3M, reason: not valid java name */
        public static /* synthetic */ char m23364$r8$lambda$xVFxMIUpk80j2Z4vmz1vlxv3M(java.lang.CharSequence charSequence, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            return charSequence.charAt(i);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
