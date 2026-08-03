package io.ktor.http;

/* compiled from: CookieUtils.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/http/CookieDateParser;", "", "<init>", "()V", "T", "", "source", "name", "field", "", "checkFieldNotNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "requirement", "Lkotlin/Function0;", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "checkRequirement", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookieDateParser {
    private final <T> void checkFieldNotNull(java.lang.String source, java.lang.String name, T field) {
        if (field != null) {
            return;
        }
        throw new io.ktor.http.InvalidCookieDateException(source, "Could not find " + name);
    }

    private final void checkRequirement(java.lang.String source, boolean requirement, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        if (!requirement) {
            throw new io.ktor.http.InvalidCookieDateException(source, msg.invoke());
        }
    }

    public final io.ktor.util.date.GMTDate parse(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(source);
        io.ktor.http.CookieDateBuilder cookieDateBuilder = new io.ktor.http.CookieDateBuilder();
        stringLexer.acceptWhile(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean isDelimiter;
                isDelimiter = io.ktor.http.CookieUtilsKt.isDelimiter(((java.lang.Character) obj).charValue());
                return java.lang.Boolean.valueOf(isDelimiter);
            }
        });
        while (stringLexer.getHasRemaining()) {
            if (stringLexer.test(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean isNonDelimiter;
                    isNonDelimiter = io.ktor.http.CookieUtilsKt.isNonDelimiter(((java.lang.Character) obj).charValue());
                    return java.lang.Boolean.valueOf(isNonDelimiter);
                }
            })) {
                int index = stringLexer.getIndex();
                stringLexer.acceptWhile(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        boolean isNonDelimiter;
                        isNonDelimiter = io.ktor.http.CookieUtilsKt.isNonDelimiter(((java.lang.Character) obj).charValue());
                        return java.lang.Boolean.valueOf(isNonDelimiter);
                    }
                });
                java.lang.String substring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                io.ktor.http.CookieUtilsKt.handleToken(cookieDateBuilder, substring);
                stringLexer.acceptWhile(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        boolean isDelimiter;
                        isDelimiter = io.ktor.http.CookieUtilsKt.isDelimiter(((java.lang.Character) obj).charValue());
                        return java.lang.Boolean.valueOf(isDelimiter);
                    }
                });
            }
        }
        java.lang.Integer year = cookieDateBuilder.getYear();
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(70, 99);
        if (year == null || !intRange.contains(year.intValue())) {
            kotlin.ranges.IntRange intRange2 = new kotlin.ranges.IntRange(0, 69);
            if (year != null && intRange2.contains(year.intValue())) {
                java.lang.Integer year2 = cookieDateBuilder.getYear();
                kotlin.jvm.internal.Intrinsics.checkNotNull(year2);
                cookieDateBuilder.setYear(java.lang.Integer.valueOf(year2.intValue() + 2000));
            }
        } else {
            java.lang.Integer year3 = cookieDateBuilder.getYear();
            kotlin.jvm.internal.Intrinsics.checkNotNull(year3);
            cookieDateBuilder.setYear(java.lang.Integer.valueOf(year3.intValue() + 1900));
        }
        checkFieldNotNull(source, "day-of-month", cookieDateBuilder.getDayOfMonth());
        checkFieldNotNull(source, "month", cookieDateBuilder.getMonth());
        checkFieldNotNull(source, "year", cookieDateBuilder.getYear());
        checkFieldNotNull(source, "time", cookieDateBuilder.getHours());
        checkFieldNotNull(source, "time", cookieDateBuilder.getMinutes());
        checkFieldNotNull(source, "time", cookieDateBuilder.getSeconds());
        kotlin.ranges.IntRange intRange3 = new kotlin.ranges.IntRange(1, 31);
        java.lang.Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
        checkRequirement(source, dayOfMonth != null && intRange3.contains(dayOfMonth.intValue()), new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String parse$lambda$5;
                parse$lambda$5 = io.ktor.http.CookieDateParser.parse$lambda$5();
                return parse$lambda$5;
            }
        });
        java.lang.Integer year4 = cookieDateBuilder.getYear();
        kotlin.jvm.internal.Intrinsics.checkNotNull(year4);
        checkRequirement(source, year4.intValue() >= 1601, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String parse$lambda$6;
                parse$lambda$6 = io.ktor.http.CookieDateParser.parse$lambda$6();
                return parse$lambda$6;
            }
        });
        java.lang.Integer hours = cookieDateBuilder.getHours();
        kotlin.jvm.internal.Intrinsics.checkNotNull(hours);
        checkRequirement(source, hours.intValue() <= 23, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String parse$lambda$7;
                parse$lambda$7 = io.ktor.http.CookieDateParser.parse$lambda$7();
                return parse$lambda$7;
            }
        });
        java.lang.Integer minutes = cookieDateBuilder.getMinutes();
        kotlin.jvm.internal.Intrinsics.checkNotNull(minutes);
        checkRequirement(source, minutes.intValue() <= 59, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String parse$lambda$8;
                parse$lambda$8 = io.ktor.http.CookieDateParser.parse$lambda$8();
                return parse$lambda$8;
            }
        });
        java.lang.Integer seconds = cookieDateBuilder.getSeconds();
        kotlin.jvm.internal.Intrinsics.checkNotNull(seconds);
        checkRequirement(source, seconds.intValue() <= 59, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String parse$lambda$9;
                parse$lambda$9 = io.ktor.http.CookieDateParser.parse$lambda$9();
                return parse$lambda$9;
            }
        });
        return cookieDateBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$5() {
        return "day-of-month not in [1,31]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$6() {
        return "year >= 1601";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$7() {
        return "hours > 23";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$8() {
        return "minutes > 59";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$9() {
        return "seconds > 59";
    }
}
