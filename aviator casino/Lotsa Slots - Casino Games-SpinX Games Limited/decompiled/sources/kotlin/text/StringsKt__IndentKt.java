package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0002\b\u000b\u001a!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001aJ\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082\b¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"trimMargin", "", "marginPrefix", "replaceIndentByMargin", "newIndent", "trimIndent", "replaceIndent", "prependIndent", "indent", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "getIndentFunction", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getIndentFunction$lambda$8$StringsKt__IndentKt(java.lang.String line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return kotlin.text.StringsKt.trimMargin(str, str2);
    }

    public static final java.lang.String trimMargin(java.lang.String str, java.lang.String marginPrefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return kotlin.text.StringsKt.replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return kotlin.text.StringsKt.replaceIndentByMargin(str, str2, str3);
    }

    public static final java.lang.String replaceIndentByMargin(java.lang.String str, java.lang.String newIndent, java.lang.String marginPrefix) {
        java.lang.Appendable joinTo;
        int i;
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!kotlin.text.StringsKt.isBlank(marginPrefix))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List<java.lang.String> lines = kotlin.text.StringsKt.lines(str);
        int length = str.length() + (newIndent.length() * lines.size());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(lines);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : lines) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str2 = (java.lang.String) obj;
            java.lang.String str3 = null;
            if ((i2 == 0 || i2 == lastIndex) && kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!kotlin.text.CharsKt.isWhitespace(r0.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (kotlin.text.StringsKt.startsWith$default(str2, marginPrefix, i, false, 4, (java.lang.Object) null)) {
                        int length3 = i5 + marginPrefix.length();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                        str3 = str2.substring(length3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "substring(...)");
                    }
                }
                if (str3 != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(str3)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i3;
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(arrayList, new java.lang.StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((java.lang.StringBuilder) joinTo).toString();
    }

    public static final java.lang.String trimIndent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.replaceIndent(str, "");
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return kotlin.text.StringsKt.replaceIndent(str, str2);
    }

    public static final java.lang.String replaceIndent(java.lang.String str, java.lang.String newIndent) {
        java.lang.Appendable joinTo;
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        java.util.List<java.lang.String> lines = kotlin.text.StringsKt.lines(str);
        java.util.List<java.lang.String> list = lines;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(indentWidth$StringsKt__IndentKt((java.lang.String) it.next())));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList3);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * lines.size());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(lines);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str2 = (java.lang.String) obj2;
            if ((i == 0 || i == lastIndex) && kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                java.lang.String drop = kotlin.text.StringsKt.drop(str2, intValue);
                if (drop != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList4.add(str2);
            }
            i = i2;
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(arrayList4, new java.lang.StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((java.lang.StringBuilder) joinTo).toString();
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return kotlin.text.StringsKt.prependIndent(str, str2);
    }

    public static final java.lang.String prependIndent(java.lang.String str, final java.lang.String indent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indent, "indent");
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.map(kotlin.text.StringsKt.lineSequence(str), new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String prependIndent$lambda$5$StringsKt__IndentKt;
                prependIndent$lambda$5$StringsKt__IndentKt = kotlin.text.StringsKt__IndentKt.prependIndent$lambda$5$StringsKt__IndentKt(indent, (java.lang.String) obj);
                return prependIndent$lambda$5$StringsKt__IndentKt;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String prependIndent$lambda$5$StringsKt__IndentKt(java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (kotlin.text.StringsKt.isBlank(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    private static final int indentWidth$StringsKt__IndentKt(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!kotlin.text.CharsKt.isWhitespace(r0.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(final java.lang.String str) {
        return str.length() == 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String indentFunction$lambda$8$StringsKt__IndentKt;
                indentFunction$lambda$8$StringsKt__IndentKt = kotlin.text.StringsKt__IndentKt.getIndentFunction$lambda$8$StringsKt__IndentKt((java.lang.String) obj);
                return indentFunction$lambda$8$StringsKt__IndentKt;
            }
        } : new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.String indentFunction$lambda$9$StringsKt__IndentKt;
                indentFunction$lambda$9$StringsKt__IndentKt = kotlin.text.StringsKt__IndentKt.getIndentFunction$lambda$9$StringsKt__IndentKt(str, (java.lang.String) obj);
                return indentFunction$lambda$9$StringsKt__IndentKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getIndentFunction$lambda$9$StringsKt__IndentKt(java.lang.String str, java.lang.String line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> list, int i, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function12) {
        java.lang.Appendable joinTo;
        java.lang.String invoke;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str = (java.lang.String) obj;
            if ((i2 == 0 || i2 == lastIndex) && kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            } else {
                java.lang.String invoke2 = function12.invoke(str);
                if (invoke2 != null && (invoke = function1.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(arrayList, new java.lang.StringBuilder(i), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((java.lang.StringBuilder) joinTo).toString();
    }
}
