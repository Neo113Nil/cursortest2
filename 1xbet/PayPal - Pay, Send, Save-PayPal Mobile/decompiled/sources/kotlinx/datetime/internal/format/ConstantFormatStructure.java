package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lkotlinx/datetime/internal/format/ConstantFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "", "string", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Ljava/lang/String;", "getString"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConstantFormatStructure<T> implements kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T> {
    private final java.lang.String string;

    public ConstantFormatStructure(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.string = str;
    }

    public final java.lang.String getString() {
        return this.string;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstantFormatStructure(");
        sb.append(this.string);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.internal.format.ConstantFormatStructure) && kotlin.jvm.internal.Intrinsics.areEqual(this.string, ((kotlinx.datetime.internal.format.ConstantFormatStructure) other).string);
    }

    public final int hashCode() {
        return this.string.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        java.lang.String str;
        java.util.List build;
        java.lang.String str2;
        if (this.string.length() == 0) {
            build = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            if (kotlinx.datetime.internal.UtilKt.isAsciiDigit(this.string.charAt(0))) {
                java.lang.String str3 = this.string;
                int length = str3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!kotlinx.datetime.internal.UtilKt.isAsciiDigit(str3.charAt(i))) {
                        str3 = str3.substring(0, i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                        break;
                    }
                    i++;
                }
                createListBuilder.add(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.ConstantNumberConsumer(str3))));
                java.lang.String str4 = this.string;
                int length2 = str4.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        str = "";
                        break;
                    }
                    if (!kotlinx.datetime.internal.UtilKt.isAsciiDigit(str4.charAt(i2))) {
                        str = str4.substring(i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        break;
                    }
                    i2++;
                }
            } else {
                str = this.string;
            }
            java.lang.String str5 = str;
            if (str5.length() > 0) {
                if (!kotlinx.datetime.internal.UtilKt.isAsciiDigit(str.charAt(str.length() - 1))) {
                    createListBuilder.add(new kotlinx.datetime.internal.format.parser.PlainStringParserOperation(str));
                } else {
                    int lastIndex = kotlin.text.StringsKt.getLastIndex(str5);
                    while (true) {
                        if (lastIndex < 0) {
                            str2 = "";
                            break;
                        }
                        if (!kotlinx.datetime.internal.UtilKt.isAsciiDigit(str.charAt(lastIndex))) {
                            str2 = str.substring(0, lastIndex + 1);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                            break;
                        }
                        lastIndex--;
                    }
                    createListBuilder.add(new kotlinx.datetime.internal.format.parser.PlainStringParserOperation(str2));
                    int lastIndex2 = kotlin.text.StringsKt.getLastIndex(str5);
                    while (true) {
                        if (lastIndex2 < 0) {
                            break;
                        }
                        if (!kotlinx.datetime.internal.UtilKt.isAsciiDigit(str.charAt(lastIndex2))) {
                            str = str.substring(lastIndex2 + 1);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                            break;
                        }
                        lastIndex2--;
                    }
                    createListBuilder.add(new kotlinx.datetime.internal.format.parser.NumberSpanParserOperation(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.ConstantNumberConsumer(str))));
                }
            }
            build = kotlin.collections.CollectionsKt.build(createListBuilder);
        }
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(build, kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        return new kotlinx.datetime.internal.format.formatter.ConstantStringFormatterStructure(this.string);
    }
}
