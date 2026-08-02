package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003"}, d2 = {"", "marginPrefix", "trimMargin", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "replaceIndentByMargin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "trimIndent", "(Ljava/lang/String;)Ljava/lang/String;", "replaceIndent", "indent", "prependIndent"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes5.dex */
public class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {
    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER;
        }
        return kotlin.text.StringsKt.trimMargin(str, str2);
    }

    public static final java.lang.String trimMargin(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.text.StringsKt.replaceIndentByMargin(str, "", str2);
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER;
        }
        return kotlin.text.StringsKt.replaceIndentByMargin(str, str2, str3);
    }

    public static final java.lang.String replaceIndentByMargin(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<T> it;
        java.lang.Appendable joinTo;
        int i;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        if (kotlin.text.StringsKt.isBlank(str3)) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List<java.lang.String> lines = kotlin.text.StringsKt.lines(str);
        int length = str.length();
        int length2 = str2.length();
        int size = lines.size();
        kotlin.jvm.functions.Function1 stringsKt__IndentKt$$ExternalSyntheticLambda1 = str2.length() == 0 ? new kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda1() : new kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda2(str2);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(lines);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : lines) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str7 = (java.lang.String) obj;
            if ((i2 == 0 || i2 == lastIndex) && kotlin.text.StringsKt.isBlank(str7)) {
                i = i2;
                str4 = null;
            } else {
                java.lang.String str8 = str7;
                int length3 = str8.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        i3 = -1;
                        break;
                    }
                    if (!kotlin.text.CharsKt.isWhitespace(str8.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    int i4 = i3;
                    str5 = str7;
                    i = i2;
                    if (kotlin.text.StringsKt.startsWith$default(str7, str3, i3, false, 4, (java.lang.Object) null)) {
                        int length4 = str3.length();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str5, "");
                        str6 = str5.substring(i4 + length4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                        if (str6 != null || (str4 = (java.lang.String) stringsKt__IndentKt$$ExternalSyntheticLambda1.invoke(str6)) == null) {
                            str4 = str5;
                        }
                    }
                } else {
                    str5 = str7;
                    i = i2;
                }
                str6 = null;
                if (str6 != null) {
                }
                str4 = str5;
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i2 = i + 1;
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(arrayList, new java.lang.StringBuilder(length + (length2 * size)), (r14 & 2) != 0 ? ", " : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((java.lang.StringBuilder) joinTo).toString();
    }

    public static final java.lang.String trimIndent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.replaceIndent(str, "");
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return kotlin.text.StringsKt.replaceIndent(str, str2);
    }

    public static final java.lang.String replaceIndent(java.lang.String str, java.lang.String str2) {
        int i;
        java.lang.Appendable joinTo;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
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
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            java.lang.String str5 = str4;
            int length = str5.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!kotlin.text.CharsKt.isWhitespace(str5.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str4.length();
            }
            arrayList3.add(java.lang.Integer.valueOf(i));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList3);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        int length3 = str2.length();
        int size = lines.size();
        kotlin.jvm.functions.Function1 stringsKt__IndentKt$$ExternalSyntheticLambda1 = str2.length() == 0 ? new kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda1() : new kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda2(str2);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(lines);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str6 = (java.lang.String) obj2;
            if ((i == 0 || i == lastIndex) && kotlin.text.StringsKt.isBlank(str6)) {
                str6 = null;
            } else {
                java.lang.String drop = kotlin.text.StringsKt.drop(str6, intValue);
                if (drop != null && (str3 = (java.lang.String) stringsKt__IndentKt$$ExternalSyntheticLambda1.invoke(drop)) != null) {
                    str6 = str3;
                }
            }
            if (str6 != null) {
                arrayList4.add(str6);
            }
            i++;
        }
        joinTo = kotlin.collections.CollectionsKt.joinTo(arrayList4, new java.lang.StringBuilder(length2 + (length3 * size)), (r14 & 2) != 0 ? ", " : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((java.lang.StringBuilder) joinTo).toString();
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return kotlin.text.StringsKt.prependIndent(str, str2);
    }

    public static final java.lang.String prependIndent(java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.map(kotlin.text.StringsKt.lineSequence(str), new kotlin.jvm.functions.Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.text.StringsKt__IndentKt.m23926$r8$lambda$42ieJlZRMv6wQjCqSPAMJL39OY(str2, (java.lang.String) obj);
            }
        }), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$3BvvMery65JEhzYBhCrX5rYm0VE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* renamed from: $r8$lambda$42ieJlZRMv6w-QjCqSPAMJL39OY, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23926$r8$lambda$42ieJlZRMv6wQjCqSPAMJL39OY(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.text.StringsKt.isBlank(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$fNhk8osE5fmKswSs2oW3GpnF78I(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
