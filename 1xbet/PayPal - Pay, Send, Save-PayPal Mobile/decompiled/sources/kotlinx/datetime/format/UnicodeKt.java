package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\f\u0010\u0011\u001a\u00020\u000e*\u00020\u0012H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\u000e*\u00020\u00122\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0002\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"byUnicodePattern", "", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "pattern", "", "unicodeDirective", "Lkotlinx/datetime/format/UnicodeFormat;", "char", "", "formatLength", "", "nonPlainCharacters", "", "unsupportedDirective", "", "fieldName", androidx.core.app.NotificationCompat.CATEGORY_RECOMMENDATION, "unknownLength", "Lkotlinx/datetime/format/UnicodeFormat$Directive;", "localizedDirective", "unsupportedPadding", "digits", "kotlinx-datetime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnicodeKt {
    private static final java.util.List<java.lang.Character> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO)), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST), '\''}));

    public static final void byUnicodePattern(kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        getHighSpeedVideoFpsRanges(dateTimeFormatBuilder, kotlinx.datetime.format.UnicodeFormat.INSTANCE.parse(str));
    }

    private static final void getHighSpeedVideoFpsRanges(kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder, final kotlinx.datetime.format.UnicodeFormat unicodeFormat) {
        if (unicodeFormat instanceof kotlinx.datetime.format.UnicodeFormat.StringLiteral) {
            dateTimeFormatBuilder.chars(((kotlinx.datetime.format.UnicodeFormat.StringLiteral) unicodeFormat).getLiteral());
            return;
        }
        if (!(unicodeFormat instanceof kotlinx.datetime.format.UnicodeFormat.Sequence)) {
            if (unicodeFormat instanceof kotlinx.datetime.format.UnicodeFormat.OptionalGroup) {
                kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(dateTimeFormatBuilder, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UnicodeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kotlinx.datetime.format.UnicodeKt.$r8$lambda$0YTDd2f0Rw91O6LE47aDzreLxE4((kotlinx.datetime.format.DateTimeFormatBuilder) obj);
                    }
                }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UnicodeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kotlinx.datetime.format.UnicodeKt.$r8$lambda$bArcvf1gt0Q96jf8RaAjRkTSA6s(kotlinx.datetime.format.UnicodeFormat.this, (kotlinx.datetime.format.DateTimeFormatBuilder) obj);
                    }
                });
                return;
            }
            if (!(unicodeFormat instanceof kotlinx.datetime.format.UnicodeFormat.Directive)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.datetime.format.UnicodeFormat.Directive directive = (kotlinx.datetime.format.UnicodeFormat.Directive) unicodeFormat;
            if (directive instanceof kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased) {
                if (!(dateTimeFormatBuilder instanceof kotlinx.datetime.format.DateTimeFormatBuilder.WithTime)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("A time-based directive ");
                    sb.append(unicodeFormat);
                    sb.append(" was used in a format builder that doesn't support time components");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                ((kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased) unicodeFormat).mo24156addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithTime) dateTimeFormatBuilder);
                return;
            }
            if (directive instanceof kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased) {
                if (!(dateTimeFormatBuilder instanceof kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("A year-month-based directive ");
                    sb2.append(unicodeFormat);
                    sb2.append(" was used in a format builder that doesn't support year-month components");
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
                ((kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased) unicodeFormat).mo24157addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth) dateTimeFormatBuilder);
                return;
            }
            if (directive instanceof kotlinx.datetime.format.UnicodeFormat.Directive.DateBased) {
                if (!(dateTimeFormatBuilder instanceof kotlinx.datetime.format.DateTimeFormatBuilder.WithDate)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("A date-based directive ");
                    sb3.append(unicodeFormat);
                    sb3.append(" was used in a format builder that doesn't support date components");
                    throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                }
                ((kotlinx.datetime.format.UnicodeFormat.Directive.DateBased) unicodeFormat).mo24154addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithDate) dateTimeFormatBuilder);
                return;
            }
            if (directive instanceof kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased) {
                if (!(dateTimeFormatBuilder instanceof kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents)) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("A time-zone-based directive ");
                    sb4.append(unicodeFormat);
                    sb4.append(" was used in a format builder that doesn't support time-zone components");
                    throw new java.lang.IllegalArgumentException(sb4.toString().toString());
                }
                ((kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased) unicodeFormat).mo24158addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) dateTimeFormatBuilder);
                return;
            }
            if (directive instanceof kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased) {
                if (!(dateTimeFormatBuilder instanceof kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset)) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("A UTC-offset-based directive ");
                    sb5.append(unicodeFormat);
                    sb5.append(" was used in a format builder that doesn't support UTC offset components");
                    throw new java.lang.IllegalArgumentException(sb5.toString().toString());
                }
                ((kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased) unicodeFormat).mo24155addToFormat((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) dateTimeFormatBuilder);
                return;
            }
            if (!(directive instanceof kotlinx.datetime.format.UnknownUnicodeDirective)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("The meaning of the directive '");
            sb6.append(unicodeFormat);
            sb6.append("' is unknown");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        java.util.Iterator<T> it = ((kotlinx.datetime.format.UnicodeFormat.Sequence) unicodeFormat).getFormats().iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(dateTimeFormatBuilder, (kotlinx.datetime.format.UnicodeFormat) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("kotlinx.datetime formatting does not support the ");
        sb.append(str);
        sb.append(" field. ");
        if (str2 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(' ');
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void getHighResolutionOutputSizeshNQ4ISI(kotlinx.datetime.format.UnicodeFormat.Directive directive, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The directive '");
        sb.append(directive);
        sb.append("' is locale-dependent, but locales are not supported in Kotlin");
        sb.append(str != null ? ". ".concat(java.lang.String.valueOf(str)) : "");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0YTDd2f0Rw91O6LE47aDzreLxE4(kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bArcvf1gt0Q96jf8RaAjRkTSA6s(kotlinx.datetime.format.UnicodeFormat unicodeFormat, kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatBuilder, "");
        getHighSpeedVideoFpsRanges(dateTimeFormatBuilder, ((kotlinx.datetime.format.UnicodeFormat.OptionalGroup) unicodeFormat).getFormat());
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlinx.datetime.format.UnicodeFormat access$unicodeDirective(char c, int i) {
        switch (c) {
            case 'A':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision.MilliOfDay(i);
            case 'B':
            case 'C':
            case 'I':
            case 'J':
            case 'K':
            case 'P':
            case 'R':
            case 'T':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case 'f':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'o':
            case 'p':
            case 't':
            default:
                return new kotlinx.datetime.format.UnknownUnicodeDirective(c, i);
            case 'D':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.DayOfYear(i);
            case 'E':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.DayOfWeek(i);
            case 'F':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.DayOfWeekInMonth(i);
            case 'G':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.Era(i);
            case 'H':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.HourOfDay(i);
            case 'L':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.StandaloneMonthOfYear(i);
            case 'M':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.MonthOfYear(i);
            case 'N':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision.NanoOfDay(i);
            case 'O':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased.LocalizedZoneOffset(i);
            case 'Q':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.QuarterOfYear(i);
            case 'S':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision.FractionOfSecond(i);
            case 'U':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.CyclicYearName(i);
            case 'V':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased.TimeZoneId(i);
            case 'W':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.WeekOfMonth(i);
            case 'X':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased.ZoneOffset1(i);
            case 'Y':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.WeekBasedYear(i);
            case 'Z':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased.ZoneOffset3(i);
            case 'a':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.AmPmMarker(i);
            case 'c':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.StandaloneLocalizedDayOfWeek(i);
            case 'd':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.DayOfMonth(i);
            case 'e':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.LocalizedDayOfWeek(i);
            case 'g':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.ModifiedJulianDay(i);
            case 'h':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.AmPmHourOfDay(i);
            case 'm':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.MinuteOfHour(i);
            case 'n':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSubsecondPrecision.NanoOfSecond(i);
            case 'q':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.StandaloneQuarterOfYear(i);
            case 'r':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.RelatedGregorianYear(i);
            case 's':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.TimeBased.WithSecondPrecision.SecondOfMinute(i);
            case 'u':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.Year(i);
            case 'v':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased.GenericTimeZoneName(i);
            case 'w':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.DateBased.WeekOfWeekBasedYear(i);
            case 'x':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.OffsetBased.ZoneOffset2(i);
            case 'y':
                return new kotlinx.datetime.format.UnicodeFormat.Directive.YearMonthBased.YearOfEra(i);
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                return new kotlinx.datetime.format.UnicodeFormat.Directive.ZoneBased.TimeZoneName(i);
        }
    }

    public static final /* synthetic */ java.lang.Void access$unknownLength(kotlinx.datetime.format.UnicodeFormat.Directive directive) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown length ");
        sb.append(directive.getGetHighResolutionOutputSizeshNQ4ISI());
        sb.append(" for the ");
        sb.append(directive.getGetHighSpeedVideoFpsRangesFor());
        sb.append(" directive");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final /* synthetic */ java.lang.Void access$unsupportedPadding(kotlinx.datetime.format.UnicodeFormat.Directive directive, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding do ");
        sb.append(i);
        sb.append(" digits is not supported for the ");
        sb.append(directive.getGetHighSpeedVideoFpsRangesFor());
        sb.append(" directive");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }
}
