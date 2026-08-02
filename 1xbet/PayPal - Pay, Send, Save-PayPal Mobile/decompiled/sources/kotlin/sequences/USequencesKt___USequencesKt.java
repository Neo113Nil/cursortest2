package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0017\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u0000¢\u0006\u0004\b\n\u0010\u0003"}, d2 = {"Lkotlin/sequences/Sequence;", "Lkotlin/UInt;", "sumOfUInt", "(Lkotlin/sequences/Sequence;)I", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UByte;", "sumOfUByte", "Lkotlin/UShort;", "sumOfUShort"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes17.dex */
class USequencesKt___USequencesKt {
    public static final int sumOfUInt(kotlin.sequences.Sequence<kotlin.UInt> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<kotlin.UInt> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + it.next().getCamera2StreamConfigurationMap());
        }
        return i;
    }

    public static final long sumOfULong(kotlin.sequences.Sequence<kotlin.ULong> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<kotlin.ULong> it = sequence.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = kotlin.ULong.m23494constructorimpl(j + it.next().getGetHighSpeedVideoFpsRanges());
        }
        return j;
    }

    public static final int sumOfUByte(kotlin.sequences.Sequence<kotlin.UByte> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<kotlin.UByte> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + kotlin.UInt.m23470constructorimpl(it.next().getGetHighSpeedVideoFpsRangesFor() & 255));
        }
        return i;
    }

    public static final int sumOfUShort(kotlin.sequences.Sequence<kotlin.UShort> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<kotlin.UShort> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m23470constructorimpl(i + kotlin.UInt.m23470constructorimpl(it.next().getGetHighResolutionOutputSizeshNQ4ISI() & kotlin.UShort.MAX_VALUE));
        }
        return i;
    }
}
