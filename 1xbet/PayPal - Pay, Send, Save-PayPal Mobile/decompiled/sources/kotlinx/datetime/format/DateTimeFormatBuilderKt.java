package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aj\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t*\u00028\u000024\u0010\u000e\u001a\u001b\u0012\u0017\b\u0001\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r0\u000b\"\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a>\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t*\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a=\u0010\u001f\u001a\u00020\u0012\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001c0\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "", "minLength", "maxLength", "", "grouping", "", "secondFractionInternal", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;IILjava/util/List;)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "T", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "alternativeFormats", "primaryFormat", "alternativeParsing", "(Lkotlinx/datetime/format/DateTimeFormatBuilder;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "ifZero", "format", "optional", "(Lkotlinx/datetime/format/DateTimeFormatBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "char", "(Lkotlinx/datetime/format/DateTimeFormatBuilder;C)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlin/Pair;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "constants", "builderString", "(Lkotlinx/datetime/internal/format/FormatStructure;Ljava/util/List;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimeFormatBuilderKt {
    public static final void secondFractionInternal(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, int i, int i2, java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (withTime instanceof kotlinx.datetime.format.AbstractWithTimeBuilder) {
            ((kotlinx.datetime.format.AbstractWithTimeBuilder) withTime).addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.FractionalSecondDirective(i, i2, list)));
        }
    }

    public static final <T extends kotlinx.datetime.format.DateTimeFormatBuilder> void alternativeParsing(T t, kotlin.jvm.functions.Function1<? super T, kotlin.Unit>[] function1Arr, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1Arr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (t instanceof kotlinx.datetime.format.AbstractDateTimeFormatBuilder) {
            ((kotlinx.datetime.format.AbstractDateTimeFormatBuilder) t).appendAlternativeParsingImpl((kotlin.jvm.functions.Function1[]) java.util.Arrays.copyOf(function1Arr, function1Arr.length), (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            return;
        }
        throw new java.lang.IllegalStateException("impossible");
    }

    public static /* synthetic */ void optional$default(kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        optional(dateTimeFormatBuilder, str, function1);
    }

    public static final <T extends kotlinx.datetime.format.DateTimeFormatBuilder> void optional(T t, java.lang.String str, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (t instanceof kotlinx.datetime.format.AbstractDateTimeFormatBuilder) {
            ((kotlinx.datetime.format.AbstractDateTimeFormatBuilder) t).appendOptionalImpl(str, (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            return;
        }
        throw new java.lang.IllegalStateException("impossible");
    }

    /* renamed from: char, reason: not valid java name */
    public static final void m24149char(kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatBuilder, "");
        dateTimeFormatBuilder.chars(java.lang.String.valueOf(c));
    }

    public static final <T> java.lang.String builderString(kotlinx.datetime.internal.format.FormatStructure<? super T> formatStructure, java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlinx.datetime.internal.format.CachedFormatStructure<?>>> list) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (formatStructure instanceof kotlinx.datetime.internal.format.BasicFormatStructure) {
            return ((kotlinx.datetime.internal.format.BasicFormatStructure) formatStructure).getDirective().getBuilderRepresentation();
        }
        if (formatStructure instanceof kotlinx.datetime.internal.format.ConstantFormatStructure) {
            kotlinx.datetime.internal.format.ConstantFormatStructure constantFormatStructure = (kotlinx.datetime.internal.format.ConstantFormatStructure) formatStructure;
            if (constantFormatStructure.getString().length() == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("char(");
                sb.append(kotlinx.datetime.internal.ToKotlinCodeKt.toKotlinCode(constantFormatStructure.getString().charAt(0)));
                sb.append(')');
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("chars(");
            sb2.append(kotlinx.datetime.internal.ToKotlinCodeKt.toKotlinCode(constantFormatStructure.getString()));
            sb2.append(')');
            return sb2.toString();
        }
        if (formatStructure instanceof kotlinx.datetime.internal.format.SignedFormatStructure) {
            kotlinx.datetime.internal.format.SignedFormatStructure signedFormatStructure = (kotlinx.datetime.internal.format.SignedFormatStructure) formatStructure;
            if ((signedFormatStructure.getFormat() instanceof kotlinx.datetime.internal.format.BasicFormatStructure) && (((kotlinx.datetime.internal.format.BasicFormatStructure) signedFormatStructure.getFormat()).getDirective() instanceof kotlinx.datetime.format.UtcOffsetWholeHoursDirective)) {
                return ((kotlinx.datetime.format.UtcOffsetWholeHoursDirective) ((kotlinx.datetime.internal.format.BasicFormatStructure) signedFormatStructure.getFormat()).getDirective()).getBuilderRepresentation();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            if (signedFormatStructure.getWithPlusSign()) {
                sb3.append("withSharedSign(outputPlus = true) {\n");
            } else {
                sb3.append("withSharedSign {\n");
            }
            sb3.append(kotlin.text.StringsKt.prependIndent(builderString(signedFormatStructure.getFormat(), list), "    "));
            sb3.append("\n}");
            return sb3.toString();
        }
        if (formatStructure instanceof kotlinx.datetime.internal.format.OptionalFormatStructure) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            kotlinx.datetime.internal.format.OptionalFormatStructure optionalFormatStructure = (kotlinx.datetime.internal.format.OptionalFormatStructure) formatStructure;
            if (kotlin.jvm.internal.Intrinsics.areEqual(optionalFormatStructure.getOnZero(), "")) {
                sb4.append("optional {\n");
            } else {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("optional(");
                sb5.append(kotlinx.datetime.internal.ToKotlinCodeKt.toKotlinCode(optionalFormatStructure.getOnZero()));
                sb5.append(") {");
                sb4.append(sb5.toString());
                sb4.append('\n');
            }
            java.lang.String builderString = builderString(optionalFormatStructure.getFormat(), list);
            if (builderString.length() > 0) {
                sb4.append(kotlin.text.StringsKt.prependIndent(builderString, "    "));
                sb4.append('\n');
            }
            sb4.append("}");
            return sb4.toString();
        }
        if (formatStructure instanceof kotlinx.datetime.internal.format.AlternativesParsingFormatStructure) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("alternativeParsing(");
            kotlinx.datetime.internal.format.AlternativesParsingFormatStructure alternativesParsingFormatStructure = (kotlinx.datetime.internal.format.AlternativesParsingFormatStructure) formatStructure;
            for (kotlinx.datetime.internal.format.FormatStructure<T> formatStructure2 : alternativesParsingFormatStructure.getFormats()) {
                sb6.append("{\n");
                java.lang.String builderString2 = builderString(formatStructure2, list);
                if (builderString2.length() > 0) {
                    sb6.append(kotlin.text.StringsKt.prependIndent(builderString2, "    "));
                    sb6.append('\n');
                }
                sb6.append("}, ");
            }
            if (sb6.charAt(sb6.length() - 2) == ',') {
                for (int i2 = 0; i2 < 2; i2++) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb6.deleteCharAt(sb6.length() - 1), "");
                }
            }
            sb6.append(") {\n");
            sb6.append(kotlin.text.StringsKt.prependIndent(builderString(alternativesParsingFormatStructure.getMainFormat(), list), "    "));
            sb6.append('\n');
            sb6.append("}");
            return sb6.toString();
        }
        if (!(formatStructure instanceof kotlinx.datetime.internal.format.ConcatenatedFormatStructure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        kotlinx.datetime.internal.format.ConcatenatedFormatStructure concatenatedFormatStructure = (kotlinx.datetime.internal.format.ConcatenatedFormatStructure) formatStructure;
        if (!concatenatedFormatStructure.getFormats().isEmpty()) {
            int i3 = 0;
            while (i3 < concatenatedFormatStructure.getFormats().size()) {
                java.util.Iterator<? extends kotlin.Pair<java.lang.String, ? extends kotlinx.datetime.internal.format.CachedFormatStructure<?>>> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        kotlin.Pair<java.lang.String, ? extends kotlinx.datetime.internal.format.CachedFormatStructure<?>> next = it.next();
                        java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<?>> formats = next.getSecond().getFormats();
                        if (concatenatedFormatStructure.getFormats().size() - i3 >= formats.size()) {
                            int size = formats.size();
                            for (0; i < size; i + 1) {
                                i = kotlin.jvm.internal.Intrinsics.areEqual(concatenatedFormatStructure.getFormats().get(i3 + i), formats.get(i)) ? i + 1 : 0;
                            }
                            sb7.append(next.getFirst());
                            i3 += formats.size();
                            if (i3 < concatenatedFormatStructure.getFormats().size()) {
                                sb7.append('\n');
                            }
                        }
                    } else {
                        if (i3 == concatenatedFormatStructure.getFormats().size() - 1) {
                            sb7.append(builderString((kotlinx.datetime.internal.format.FormatStructure) kotlin.collections.CollectionsKt.last((java.util.List) concatenatedFormatStructure.getFormats()), list));
                        } else {
                            sb7.append(builderString(concatenatedFormatStructure.getFormats().get(i3), list));
                            sb7.append('\n');
                        }
                        i3++;
                    }
                }
            }
        }
        return sb7.toString();
    }
}
