package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0005\u001a\u00020\u00008AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/datetime/format/LocalTimeFormat;", "ISO_TIME$delegate", "Lkotlin/Lazy;", "getISO_TIME", "()Lkotlinx/datetime/format/LocalTimeFormat;", "ISO_TIME", "Lkotlinx/datetime/format/IncompleteLocalTime;", "getHighSpeedVideoSizes", "Lkotlinx/datetime/format/IncompleteLocalTime;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalTimeFormatKt {
    private static final kotlin.Lazy ISO_TIME$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.LocalTimeFormat build;
            build = kotlinx.datetime.format.LocalTimeFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.LocalTimeFormatKt.m24153$r8$lambda$aTDShX0KU7hH4pF8JFyVle3UK0((kotlinx.datetime.format.DateTimeFormatBuilder.WithTime) obj);
                }
            });
            return build;
        }
    });
    private static final kotlinx.datetime.format.IncompleteLocalTime getHighSpeedVideoSizes = new kotlinx.datetime.format.IncompleteLocalTime(null, null, null, null, null, null, 63, null);

    public static final kotlinx.datetime.format.LocalTimeFormat getISO_TIME() {
        return (kotlinx.datetime.format.LocalTimeFormat) ISO_TIME$delegate.getValue();
    }

    /* renamed from: $r8$lambda$-gpeAiP8zv0P0glnW6_cn-4lm_w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24152$r8$lambda$gpeAiP8zv0P0glnW6_cn4lm_w(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withTime, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3RQMTeSfF6uVpGIEYXLixvy_iRw(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withTime, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime2 = withTime;
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withTime2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.second$default(withTime, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.optional$default(withTime2, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.LocalTimeFormatKt.$r8$lambda$MeGymFBae3uzCHuTxdfsXEEBQeQ((kotlinx.datetime.format.DateTimeFormatBuilder.WithTime) obj);
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MeGymFBae3uzCHuTxdfsXEEBQeQ(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withTime, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withTime, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        withTime.secondFraction(1, 9);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aTDS-hX0KU7hH4pF8JFyVle3UK0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24153$r8$lambda$aTDShX0KU7hH4pF8JFyVle3UK0(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withTime, "");
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.hour$default(withTime, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime2 = withTime;
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withTime2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.minute$default(withTime, null, 1, null);
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withTime2, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.LocalTimeFormatKt.m24152$r8$lambda$gpeAiP8zv0P0glnW6_cn4lm_w((kotlinx.datetime.format.DateTimeFormatBuilder.WithTime) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.LocalTimeFormatKt.$r8$lambda$3RQMTeSfF6uVpGIEYXLixvy_iRw((kotlinx.datetime.format.DateTimeFormatBuilder.WithTime) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
