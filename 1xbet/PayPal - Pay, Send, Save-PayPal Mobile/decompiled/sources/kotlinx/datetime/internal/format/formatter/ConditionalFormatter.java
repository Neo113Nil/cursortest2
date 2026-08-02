package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012/\u0010\b\u001a+\u0012'\u0012%\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R=\u0010\u0015\u001a+\u0012'\u0012%\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/ConditionalFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "formatters", "<init>", "(Ljava/util/List;)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConditionalFormatter<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlin.Pair<kotlin.jvm.functions.Function1<T, java.lang.Boolean>, kotlinx.datetime.internal.format.formatter.FormatterStructure<T>>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ConditionalFormatter(java.util.List<? extends kotlin.Pair<? extends kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>, ? extends kotlinx.datetime.internal.format.formatter.FormatterStructure<? super T>>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        for (kotlin.Pair<kotlin.jvm.functions.Function1<T, java.lang.Boolean>, kotlinx.datetime.internal.format.formatter.FormatterStructure<T>> pair : this.getHighSpeedVideoSizes) {
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> component1 = pair.component1();
            kotlinx.datetime.internal.format.formatter.FormatterStructure<T> component2 = pair.component2();
            if (component1.invoke(obj).booleanValue()) {
                component2.format(obj, builder, minusNotRequired);
                return;
            }
        }
    }
}
