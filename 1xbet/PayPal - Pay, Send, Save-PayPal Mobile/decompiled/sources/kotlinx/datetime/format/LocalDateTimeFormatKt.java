package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001b\u0010\u0005\u001a\u00020\u00008AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat;", "ISO_DATETIME$delegate", "Lkotlin/Lazy;", "getISO_DATETIME", "()Lkotlinx/datetime/format/LocalDateTimeFormat;", "ISO_DATETIME", "Lkotlinx/datetime/format/IncompleteLocalDateTime;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/format/IncompleteLocalDateTime;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalDateTimeFormatKt {
    private static final kotlin.Lazy ISO_DATETIME$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.datetime.format.LocalDateTimeFormat build;
            build = kotlinx.datetime.format.LocalDateTimeFormat.INSTANCE.build(new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.datetime.format.LocalDateTimeFormatKt.$r8$lambda$uc3CZX546STxEk7mN08ap8GkfXQ((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime) obj);
                }
            });
            return build;
        }
    });
    private static final kotlinx.datetime.format.IncompleteLocalDateTime getHighResolutionOutputSizeshNQ4ISI = new kotlinx.datetime.format.IncompleteLocalDateTime(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public static final kotlinx.datetime.format.LocalDateTimeFormat getISO_DATETIME() {
        return (kotlinx.datetime.format.LocalDateTimeFormat) ISO_DATETIME$delegate.getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RJVL9Fi1Ln9eHZRjsriW_gAjNGc(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime withDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withDateTime, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTime, 't');
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uc3CZX546STxEk7mN08ap8GkfXQ(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime withDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withDateTime, "");
        withDateTime.date(kotlinx.datetime.format.LocalDateFormatKt.getISO_DATE());
        kotlinx.datetime.format.DateTimeFormatBuilderKt.alternativeParsing(withDateTime, new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.LocalDateTimeFormatKt.$r8$lambda$RJVL9Fi1Ln9eHZRjsriW_gAjNGc((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime) obj);
            }
        }}, new kotlin.jvm.functions.Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.datetime.format.LocalDateTimeFormatKt.$r8$lambda$xcRcdiP9wEtvusHxgiJm4UZ9zuI((kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime) obj);
            }
        });
        withDateTime.time(kotlinx.datetime.format.LocalTimeFormatKt.getISO_TIME());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xcRcdiP9wEtvusHxgiJm4UZ9zuI(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime withDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withDateTime, "");
        kotlinx.datetime.format.DateTimeFormatBuilderKt.m24149char(withDateTime, 'T');
        return kotlin.Unit.INSTANCE;
    }
}
