package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/http/CookieDateParser;", "", "<init>", "()V", "", "source", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CookieDateParser {
    public final io.ktor.util.date.GMTDate parse(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
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
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
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
        if (cookieDateBuilder.getDayOfMonth() != null) {
            if (cookieDateBuilder.getMonth() != null) {
                if (cookieDateBuilder.getYear() != null) {
                    if (cookieDateBuilder.getHours() != null) {
                        if (cookieDateBuilder.getMinutes() != null) {
                            if (cookieDateBuilder.getSeconds() != null) {
                                kotlin.ranges.IntRange intRange3 = new kotlin.ranges.IntRange(1, 31);
                                java.lang.Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
                                boolean z = dayOfMonth != null && intRange3.contains(dayOfMonth.intValue());
                                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return io.ktor.http.CookieDateParser.$r8$lambda$RnTQApamMZNyg5GqSpruRKgNw6Y();
                                    }
                                };
                                if (z) {
                                    java.lang.Integer year4 = cookieDateBuilder.getYear();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(year4);
                                    boolean z2 = year4.intValue() >= 1601;
                                    kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return io.ktor.http.CookieDateParser.m23349$r8$lambda$WCAYkXFGSyW9kNMuADzblLzvQ4();
                                        }
                                    };
                                    if (z2) {
                                        java.lang.Integer hours = cookieDateBuilder.getHours();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(hours);
                                        boolean z3 = hours.intValue() <= 23;
                                        kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return io.ktor.http.CookieDateParser.m23351$r8$lambda$WRejhNBXPtkje2JaX21k8VTuRo();
                                            }
                                        };
                                        if (z3) {
                                            java.lang.Integer minutes = cookieDateBuilder.getMinutes();
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(minutes);
                                            boolean z4 = minutes.intValue() <= 59;
                                            kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return io.ktor.http.CookieDateParser.$r8$lambda$Pl9DHfCCplEM5J8nCCRi011nfRE();
                                                }
                                            };
                                            if (z4) {
                                                java.lang.Integer seconds = cookieDateBuilder.getSeconds();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(seconds);
                                                boolean z5 = seconds.intValue() <= 59;
                                                kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.CookieDateParser$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Object invoke() {
                                                        return io.ktor.http.CookieDateParser.$r8$lambda$KvJ4m8T68j_qQ3vBGYbucgiGFpQ();
                                                    }
                                                };
                                                if (z5) {
                                                    return cookieDateBuilder.build();
                                                }
                                                throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) function05.invoke());
                                            }
                                            throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) function04.invoke());
                                        }
                                        throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) function03.invoke());
                                    }
                                    throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) function02.invoke());
                                }
                                throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) function0.invoke());
                            }
                            throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat("time"));
                        }
                        throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat("time"));
                    }
                    throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat("time"));
                }
                throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR));
            }
            throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat("month"));
        }
        throw new io.ktor.http.InvalidCookieDateException(source, "Could not find ".concat("day-of-month"));
    }

    /* renamed from: $r8$lambda$-WCAYkXFGSyW9kNMuADzblLzvQ4, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23349$r8$lambda$WCAYkXFGSyW9kNMuADzblLzvQ4() {
        return "year >= 1601";
    }

    public static /* synthetic */ java.lang.String $r8$lambda$KvJ4m8T68j_qQ3vBGYbucgiGFpQ() {
        return "seconds > 59";
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Pl9DHfCCplEM5J8nCCRi011nfRE() {
        return "minutes > 59";
    }

    public static /* synthetic */ java.lang.String $r8$lambda$RnTQApamMZNyg5GqSpruRKgNw6Y() {
        return "day-of-month not in [1,31]";
    }

    /* renamed from: $r8$lambda$WRejhNBXPtk-je2JaX21k8VTuRo, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23351$r8$lambda$WRejhNBXPtkje2JaX21k8VTuRo() {
        return "hours > 23";
    }
}
