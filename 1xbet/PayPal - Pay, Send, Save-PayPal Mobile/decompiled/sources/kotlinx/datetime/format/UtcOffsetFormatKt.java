package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0010\u001a\u00020\u0005*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001b\u0010\u0017\u001a\u00020\u00128AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001a\u001a\u00020\u00128AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u001b\u0010\u001d\u001a\u00020\u00128AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder;", "T", "Lkotlinx/datetime/format/WhenToOutput;", "whenToOutput", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "format", "outputIfNeeded", "(Lkotlinx/datetime/format/DateTimeFormatBuilder;Lkotlinx/datetime/format/WhenToOutput;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "", "zOnZero", "useSeparator", "outputMinute", "outputSecond", "isoOffset", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;ZZLkotlinx/datetime/format/WhenToOutput;Lkotlinx/datetime/format/WhenToOutput;)V", "Lkotlinx/datetime/format/UtcOffsetFormat;", "ISO_OFFSET$delegate", "Lkotlin/Lazy;", "getISO_OFFSET", "()Lkotlinx/datetime/format/UtcOffsetFormat;", "ISO_OFFSET", "ISO_OFFSET_BASIC$delegate", "getISO_OFFSET_BASIC", "ISO_OFFSET_BASIC", "FOUR_DIGIT_OFFSET$delegate", "getFOUR_DIGIT_OFFSET", "FOUR_DIGIT_OFFSET", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtcOffsetFormatKt {
    private static final kotlin.Lazy ISO_OFFSET$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.UtcOffsetFormat build;
            build = kotlinx.datetime.format.UtcOffsetFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$pJ0_o1_nS5TLhHle0fsvoiMjyEc((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
                }
            });
            return build;
        }
    });
    private static final kotlin.Lazy ISO_OFFSET_BASIC$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.UtcOffsetFormat build;
            build = kotlinx.datetime.format.UtcOffsetFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.UtcOffsetFormatKt.m24159$r8$lambda$2fcZNnPMMGjhAkkUniwbyk5_M((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
                }
            });
            return build;
        }
    });
    private static final kotlin.Lazy FOUR_DIGIT_OFFSET$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.UtcOffsetFormat build;
            build = kotlinx.datetime.format.UtcOffsetFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$0y7RrRClz1Zb0H_iWqHTk8hYpVg((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
                }
            });
            return build;
        }
    });
    private static final kotlinx.datetime.format.IncompleteUtcOffset getHighSpeedVideoFpsRangesFor = new kotlinx.datetime.format.IncompleteUtcOffset(null, null, null, null, 15, null);

    public static final <T extends kotlinx.datetime.format.DateTimeFormatBuilder> void outputIfNeeded(T t, kotlinx.datetime.format.WhenToOutput whenToOutput, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whenToOutput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i = kotlinx.datetime.format.UtcOffsetFormatKt.WhenMappings.$EnumSwitchMapping$0[whenToOutput.ordinal()];
        if (i != 1) {
            if (i == 2) {
                kotlinx.datetime.format.DateTimeFormatBuilderKt.optional$default(t, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$X0HGHMPoz2oc84tszABpffS9NGM(kotlin.jvm.functions.Function1.this, (kotlinx.datetime.format.DateTimeFormatBuilder) obj);
                    }
                }, 1, null);
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                function1.invoke(t);
            }
        }
    }

    public static final void isoOffset(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset, boolean z, final boolean z2, final kotlinx.datetime.format.WhenToOutput whenToOutput, final kotlinx.datetime.format.WhenToOutput whenToOutput2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whenToOutput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whenToOutput2, "");
        if (whenToOutput.compareTo(whenToOutput2) < 0) {
            throw new java.lang.IllegalArgumentException("Seconds cannot be included without minutes".toString());
        }
        if (z) {
            kotlinx.datetime.format.DateTimeFormatBuilderKt.optional(withUtcOffset, "Z", new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$BRpGWlowLe_hNB5rbo5YjgBbbWI(kotlinx.datetime.format.WhenToOutput.this, z2, whenToOutput2, (kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
                }
            });
        } else {
            kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetHours$default(withUtcOffset, null, 1, null);
            outputIfNeeded(withUtcOffset, whenToOutput, new kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda10(z2, whenToOutput2));
        }
    }

    public static final kotlinx.datetime.format.UtcOffsetFormat getISO_OFFSET() {
        return (kotlinx.datetime.format.UtcOffsetFormat) ISO_OFFSET$delegate.getValue();
    }

    public static final kotlinx.datetime.format.UtcOffsetFormat getISO_OFFSET_BASIC() {
        return (kotlinx.datetime.format.UtcOffsetFormat) ISO_OFFSET_BASIC$delegate.getValue();
    }

    public static final kotlinx.datetime.format.UtcOffsetFormat getFOUR_DIGIT_OFFSET() {
        return (kotlinx.datetime.format.UtcOffsetFormat) FOUR_DIGIT_OFFSET$delegate.getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0y7RrRClz1Zb0H_iWqHTk8hYpVg(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetHours$default(withUtcOffset, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetMinutesOfHour$default(withUtcOffset, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2fcZNnPMMGjhAkkU-n-iwbyk5_M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24159$r8$lambda$2fcZNnPMMGjhAkkUniwbyk5_M(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withUtcOffset, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24163$r8$lambda$Jx0fd8mG6HI1wryCxsMNuHAH30((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24160$r8$lambda$9Cvrkgu_3c22Uw1qfN_dEv1aSY((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5HE_1OECEQg0Xu0zMhb1H9aw4zY(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetHours$default(withUtcOffset, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset2 = withUtcOffset;
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withUtcOffset2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetMinutesOfHour$default(withUtcOffset, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional$default(withUtcOffset2, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24167$r8$lambda$epHegWu_trWxVixwvaUNrYQPXo((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9Cvrkgu_3c22Uw1qfN_dE-v1aSY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24160$r8$lambda$9Cvrkgu_3c22Uw1qfN_dEv1aSY(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional(withUtcOffset, "Z", new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$Du7ESmuAa0hRRWUqmblAKVaHR74((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AVZZSrCrx_nLkgCAwmb1D-rrG_M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24161$r8$lambda$AVZZSrCrx_nLkgCAwmb1DrrG_M(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetSecondsOfMinute$default(withUtcOffset, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BRpGWlowLe_hNB5rbo5YjgBbbWI(final kotlinx.datetime.format.WhenToOutput whenToOutput, final boolean z, final kotlinx.datetime.format.WhenToOutput whenToOutput2, kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withUtcOffset, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$biD7MmyaHvSIwPGm5CNbWpCMtTs((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24164$r8$lambda$POdrd8ZgdfxC1wtRMP6aj49GMU(kotlinx.datetime.format.WhenToOutput.this, z, whenToOutput2, (kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Du7ESmuAa0hRRWUqmblAKVaHR74(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetHours$default(withUtcOffset, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional$default(withUtcOffset, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24165$r8$lambda$aFKvA5gqHMDkcZ8VJDZhEMvYHs((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J-x0fd8mG6HI1wryCxsMNuHAH30, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24163$r8$lambda$Jx0fd8mG6HI1wryCxsMNuHAH30(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        withUtcOffset.chars("z");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$POdrd8-ZgdfxC1wtRMP6aj49GMU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24164$r8$lambda$POdrd8ZgdfxC1wtRMP6aj49GMU(kotlinx.datetime.format.WhenToOutput whenToOutput, boolean z, kotlinx.datetime.format.WhenToOutput whenToOutput2, kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetHours$default(withUtcOffset, null, 1, null);
        outputIfNeeded(withUtcOffset, whenToOutput, new kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda10(z, whenToOutput2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X0HGHMPoz2oc84tszABpffS9NGM(kotlin.jvm.functions.Function1 function1, kotlinx.datetime.format.DateTimeFormatBuilder dateTimeFormatBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatBuilder, "");
        function1.invoke(dateTimeFormatBuilder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aFKvA5gqHMDk-cZ8VJDZhEMvYHs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24165$r8$lambda$aFKvA5gqHMDkcZ8VJDZhEMvYHs(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetMinutesOfHour$default(withUtcOffset, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional$default(withUtcOffset, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.m24161$r8$lambda$AVZZSrCrx_nLkgCAwmb1DrrG_M((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$biD7MmyaHvSIwPGm5CNbWpCMtTs(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withUtcOffset, io.ktor.util.date.GMTDateParser.ZONE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bv5YYVSAqfMdZ0z4s2dcnm0GoNU(final boolean z, kotlinx.datetime.format.WhenToOutput whenToOutput, kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        if (z) {
            kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withUtcOffset, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        }
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetMinutesOfHour$default(withUtcOffset, null, 1, null);
        outputIfNeeded(withUtcOffset, whenToOutput, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$p6PE2uknVCKieMP_2xvFYrB1N8M(z, (kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bw0FIlR_doM_h8oMfVqo6fYNRq4(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional(withUtcOffset, "Z", new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$5HE_1OECEQg0Xu0zMhb1H9aw4zY((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$djBMAG77Bvy6RQJN9RQaS7gL05U(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        withUtcOffset.chars("z");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$epHegWu_trWxVixwvaUNr-YQPXo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24167$r8$lambda$epHegWu_trWxVixwvaUNrYQPXo(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withUtcOffset, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetSecondsOfMinute$default(withUtcOffset, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p6PE2uknVCKieMP_2xvFYrB1N8M(boolean z, kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        if (z) {
            kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withUtcOffset, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        }
        kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset.offsetSecondsOfMinute$default(withUtcOffset, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pJ0_o1_nS5TLhHle0fsvoiMjyEc(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withUtcOffset, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withUtcOffset, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$djBMAG77Bvy6RQJN9RQaS7gL05U((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.UtcOffsetFormatKt.$r8$lambda$bw0FIlR_doM_h8oMfVqo6fYNRq4((kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.datetime.format.WhenToOutput.values().length];
            try {
                iArr[kotlinx.datetime.format.WhenToOutput.NEVER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.datetime.format.WhenToOutput.IF_NONZERO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.datetime.format.WhenToOutput.ALWAYS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
