package coil3.content.cachecontrol.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\u0004\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"", "", "defaultValue", "toNonNegativeInt", "(Ljava/lang/String;I)I", "characters", "startIndex", "indexOfElement", "(Ljava/lang/String;Ljava/lang/String;I)I", "indexOfNonWhitespace", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "BROWSER_DATE_TIME_FORMAT", "Lkotlinx/datetime/format/DateTimeFormat;", "getBROWSER_DATE_TIME_FORMAT", "()Lkotlinx/datetime/format/DateTimeFormat;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    private static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> BROWSER_DATE_TIME_FORMAT = kotlinx.datetime.format.DateTimeComponents.INSTANCE.Format(new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$qNCkgm_jn1mLQqcOM5huWRyiNXg((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
        }
    });

    public static final int toNonNegativeInt(java.lang.String str, int i) {
        if (str != null) {
            try {
                long parseLong = java.lang.Long.parseLong(str);
                if (parseLong > androidx.collection.SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfElement$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOfElement(str, str2, i);
    }

    public static final int indexOfElement(java.lang.String str, java.lang.String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, str.charAt(i), false, 2, (java.lang.Object) null)) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final int indexOfNonWhitespace(java.lang.String str, int i) {
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> getBROWSER_DATE_TIME_FORMAT() {
        return BROWSER_DATE_TIME_FORMAT;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4T8WwiloQYTQrc1ltnJQd2MEYZU(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BW_u5g9DLsqCVcKvAzbAyECgz34(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.dayOfWeek(kotlinx.datetime.format.DayOfWeekNames.INSTANCE.getENGLISH_ABBREVIATED());
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$4T8WwiloQYTQrc1ltnJQd2MEYZU((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.m9779$r8$lambda$i9Nk1WmJlQioW9f2n6WOpGCA6o((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EKDLGWc_BxY4VKyqiqE6VvV-YhY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9776$r8$lambda$EKDLGWc_BxY4VKyqiqE6VvVYhY(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, '-');
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ItyONYrFWANM83L3G7lhJcVm_bY(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.monthName(kotlinx.datetime.format.MonthNames.INSTANCE.getENGLISH_ABBREVIATED());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N7oVBSAQZb7CHXyBboevXYG4sOs(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.chars("Z");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NqxX3ZJFpOvajgqlEZ8KPkl8dHE(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.chars("UT");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W0PFtqKMYVjZrs3TS24p7EGkO-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9777$r8$lambda$W0PFtqKMYVjZrs3TS24p7EGkOc(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.year$default(withDateTimeComponents, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$afvSqMXJjzmsTAUb-BLNG1mIAt0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9778$r8$lambda$afvSqMXJjzmsTAUbBLNG1mIAt0(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, ' ');
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h8GYiB_7P35L87k8FIH_gAj2b1U(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, '-');
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h__hwakx3UWUEfA6OujzzP9VAm0(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional(withDateTimeComponents, "GMT", new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$wARNqCX79JShCwkBaMnRuF4_cZk((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i9Nk1WmJlQioW9f2n6WOpG-CA6o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9779$r8$lambda$i9Nk1WmJlQioW9f2n6WOpGCA6o(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.chars(", ");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k6ENW4G0Hongm1F75dWECZQUCdI(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.yearTwoDigits(1970);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mAtRxd6V3P24cKtfmTgV6oDJHBY(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.second$default(withDateTimeComponents, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oPKrnPiL3N_xaw4tpBgCif18LwA(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.day$default(withDateTimeComponents, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qNCkgm_jn1mLQqcOM5huWRyiNXg(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents2 = withDateTimeComponents;
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$BW_u5g9DLsqCVcKvAzbAyECgz34((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        withDateTimeComponents.day(kotlinx.datetime.format.Padding.NONE);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$h8GYiB_7P35L87k8FIH_gAj2b1U((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$rjtFJa1h4QO9enbIiunZxJutrQ4((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$oPKrnPiL3N_xaw4tpBgCif18LwA((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$ItyONYrFWANM83L3G7lhJcVm_bY((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.m9776$r8$lambda$EKDLGWc_BxY4VKyqiqE6VvVYhY((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.m9778$r8$lambda$afvSqMXJjzmsTAUbBLNG1mIAt0((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$k6ENW4G0Hongm1F75dWECZQUCdI((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.m9777$r8$lambda$W0PFtqKMYVjZrs3TS24p7EGkOc((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents2, ' ');
        kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents3 = withDateTimeComponents;
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.hour$default(withDateTimeComponents3, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.minute$default(withDateTimeComponents3, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional(withDateTimeComponents2, ":0", new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$mAtRxd6V3P24cKtfmTgV6oDJHBY((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        withDateTimeComponents.chars(" ");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTimeComponents2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$NqxX3ZJFpOvajgqlEZ8KPkl8dHE((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$N7oVBSAQZb7CHXyBboevXYG4sOs((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: coil3.network.cachecontrol.internal.UtilsKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.content.cachecontrol.internal.UtilsKt.$r8$lambda$h__hwakx3UWUEfA6OujzzP9VAm0((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rjtFJa1h4QO9enbIiunZxJutrQ4(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTimeComponents, ' ');
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wARNqCX79JShCwkBaMnRuF4_cZk(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents) {
        withDateTimeComponents.offset(kotlinx.datetime.UtcOffset.Formats.INSTANCE.getFOUR_DIGITS());
        return kotlin.Unit.INSTANCE;
    }
}
