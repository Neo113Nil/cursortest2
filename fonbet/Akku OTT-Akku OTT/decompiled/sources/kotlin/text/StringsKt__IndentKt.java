package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\u0080\u0004\u001a\"\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\u0080\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\u0080\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0086\u0080\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0086\u0080\u0004\u001a\u0013\u0010\t\u001a\u00020\n*\u00020\u0001H\u0082\u0080\u0004¢\u0006\u0002\b\u000b\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0001H\u0082\u0080\u0004¢\u0006\u0002\b\u000e\u001aK\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082\u0088\u0004¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"trimMargin", "", "marginPrefix", "replaceIndentByMargin", "newIndent", "trimIndent", "replaceIndent", "prependIndent", "indent", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "getIndentFunction", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:137\n126#1,2:150\n119#1,2:159\n121#1,4:165\n126#1,2:172\n1#2:130\n1#2:147\n1#2:169\n1#2:184\n1606#3:133\n1617#3:134\n1924#3,2:135\n1926#3:148\n1618#3:149\n777#3:152\n873#3,2:153\n1586#3:155\n1661#3,3:156\n1606#3:161\n1617#3:162\n1924#3,2:163\n1926#3:170\n1618#3:171\n1606#3:180\n1617#3:181\n1924#3,2:182\n1926#3:185\n1618#3:186\n161#4,6:141\n161#4,6:174\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:137,4\n42#1:150,2\n83#1:159,2\n83#1:165,4\n83#1:172,2\n42#1:147\n83#1:169\n120#1:184\n42#1:133\n42#1:134\n42#1:135,2\n42#1:148\n42#1:149\n79#1:152\n79#1:153,2\n80#1:155\n80#1:156,3\n83#1:161\n83#1:162\n83#1:163,2\n83#1:170\n83#1:171\n120#1:180\n120#1:181\n120#1:182,2\n120#1:185\n120#1:186\n43#1:141,6\n107#1:174,6\n*E\n"})
/* loaded from: classes5.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new d() : new Function1() { // from class: kotlin.text.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String indentFunction$lambda$1$StringsKt__IndentKt;
                indentFunction$lambda$1$StringsKt__IndentKt = StringsKt__IndentKt.getIndentFunction$lambda$1$StringsKt__IndentKt(str, (String) obj);
                return indentFunction$lambda$1$StringsKt__IndentKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$0$StringsKt__IndentKt(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$1$StringsKt__IndentKt(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    public static String prependIndent(String str, final String indent) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new Function1() { // from class: kotlin.text.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String prependIndent$lambda$0$StringsKt__IndentKt;
                prependIndent$lambda$0$StringsKt__IndentKt = StringsKt__IndentKt.prependIndent$lambda$0$StringsKt__IndentKt(indent, (String) obj);
                return prependIndent$lambda$0$StringsKt__IndentKt;
            }
        }), "\n", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prependIndent$lambda$0$StringsKt__IndentKt(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.isBlank(it) ? it.length() < str.length() ? str : it : androidx.compose.runtime.changelist.d.b(str, it);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        String invoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt__StringsKt.isBlank(str)) {
                str = null;
            } else {
                String invoke2 = function12.invoke(str);
                if (invoke2 != null && (invoke = function1.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        return ((StringBuilder) CollectionsKt.n(arrayList, new StringBuilder(i), "\n", null, null, null, 124)).toString();
    }

    public static final String replaceIndent(String str, String newIndent) {
        int collectionSizeOrDefault;
        Comparable minOrNull;
        String invoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!StringsKt__StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        minOrNull = CollectionsKt___CollectionsKt.minOrNull((Iterable<? extends Comparable>) ((Iterable) arrayList2));
        Integer num = (Integer) minOrNull;
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int a = androidx.datastore.preferences.protobuf.a.a(lines, newIndent.length(), str.length());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                String drop = StringsKt___StringsKt.drop(str2, intValue);
                if (drop != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i2;
        }
        return ((StringBuilder) CollectionsKt.n(arrayList3, new StringBuilder(a), "\n", null, null, null, 124)).toString();
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        String str2;
        String invoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.isBlank(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> lines = StringsKt__StringsKt.lines(str);
        int a = androidx.datastore.preferences.protobuf.a.a(lines, newIndent.length(), str.length());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.isBlank(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.isWhitespace(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i4 = i3;
                    str2 = marginPrefix;
                    if (StringsKt__StringsJVMKt.startsWith$default(str3, str2, i4, false, 4, null)) {
                        int length2 = str2.length() + i4;
                        Intrinsics.checkNotNull(str3, "null cannot be cast to non-null type java.lang.String");
                        str4 = str3.substring(length2);
                        Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                    }
                }
                if (str4 != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(str4)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt.n(arrayList, new StringBuilder(a), "\n", null, null, null, 124)).toString();
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @IntrinsicConstEvaluation
    public static String trimIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    @IntrinsicConstEvaluation
    public static final String trimMargin(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
