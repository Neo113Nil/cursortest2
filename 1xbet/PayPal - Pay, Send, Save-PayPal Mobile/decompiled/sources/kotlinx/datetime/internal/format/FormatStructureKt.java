package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormatStructureKt {
    private static final <T> void getHighSpeedVideoFpsRanges(java.util.List<kotlinx.datetime.internal.format.FieldFormatDirective<T>> list, kotlinx.datetime.internal.format.FormatStructure<? super T> formatStructure) {
        while (!(formatStructure instanceof kotlinx.datetime.internal.format.BasicFormatStructure)) {
            if (!(formatStructure instanceof kotlinx.datetime.internal.format.ConcatenatedFormatStructure)) {
                if (formatStructure instanceof kotlinx.datetime.internal.format.ConstantFormatStructure) {
                    return;
                }
                if (formatStructure instanceof kotlinx.datetime.internal.format.SignedFormatStructure) {
                    formatStructure = ((kotlinx.datetime.internal.format.SignedFormatStructure) formatStructure).getFormat();
                } else {
                    if (formatStructure instanceof kotlinx.datetime.internal.format.AlternativesParsingFormatStructure) {
                        kotlinx.datetime.internal.format.AlternativesParsingFormatStructure alternativesParsingFormatStructure = (kotlinx.datetime.internal.format.AlternativesParsingFormatStructure) formatStructure;
                        getHighSpeedVideoFpsRanges(list, alternativesParsingFormatStructure.getMainFormat());
                        java.util.Iterator<T> it = alternativesParsingFormatStructure.getFormats().iterator();
                        while (it.hasNext()) {
                            getHighSpeedVideoFpsRanges(list, (kotlinx.datetime.internal.format.FormatStructure) it.next());
                        }
                        return;
                    }
                    if (!(formatStructure instanceof kotlinx.datetime.internal.format.OptionalFormatStructure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    formatStructure = ((kotlinx.datetime.internal.format.OptionalFormatStructure) formatStructure).getFormat();
                }
            } else {
                java.util.Iterator<T> it2 = ((kotlinx.datetime.internal.format.ConcatenatedFormatStructure) formatStructure).getFormats().iterator();
                while (it2.hasNext()) {
                    getHighSpeedVideoFpsRanges(list, (kotlinx.datetime.internal.format.NonConcatenatedFormatStructure) it2.next());
                }
                return;
            }
        }
        list.add(((kotlinx.datetime.internal.format.BasicFormatStructure) formatStructure).getDirective());
    }

    public static final /* synthetic */ java.util.List access$basicFormats(kotlinx.datetime.internal.format.FormatStructure formatStructure) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        getHighSpeedVideoFpsRanges(createListBuilder, formatStructure);
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
