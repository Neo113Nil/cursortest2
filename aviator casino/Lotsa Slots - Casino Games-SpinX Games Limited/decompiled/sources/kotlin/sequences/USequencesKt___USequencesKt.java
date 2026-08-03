package kotlin.sequences;

/* compiled from: _USequences.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "sumOfUInt", "(Lkotlin/sequences/Sequence;)I", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UByte;", "sumOfUByte", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes6.dex */
class USequencesKt___USequencesKt {
    public static final int sumOfUInt(kotlin.sequences.Sequence<kotlin.UInt> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.Iterator<kotlin.UInt> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m10896constructorimpl(i + it.next().getData());
        }
        return i;
    }

    public static final long sumOfULong(kotlin.sequences.Sequence<kotlin.ULong> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.Iterator<kotlin.ULong> it = sequence.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = kotlin.ULong.m10975constructorimpl(j + it.next().getData());
        }
        return j;
    }

    public static final int sumOfUByte(kotlin.sequences.Sequence<kotlin.UByte> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.Iterator<kotlin.UByte> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m10896constructorimpl(i + kotlin.UInt.m10896constructorimpl(it.next().getData() & 255));
        }
        return i;
    }

    public static final int sumOfUShort(kotlin.sequences.Sequence<kotlin.UShort> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.Iterator<kotlin.UShort> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.m10896constructorimpl(i + kotlin.UInt.m10896constructorimpl(it.next().getData() & kotlin.UShort.MAX_VALUE));
        }
        return i;
    }
}
