package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 ,2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001,B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000J\u0013\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001bH\u0096\u0002J>\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002+\u0010\u001e\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u001fH\u0082\bJ!\u0010#\u001a\u00020$2\u0016\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020$0&H\u0086\bJ\u001b\u0010'\u001a\u00060\u0002j\u0002`\u00032\n\u0010(\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0018\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "belowBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "<init>", "(JJJ[J)V", "J", "[J", "get", "", "id", "(J)Z", "set", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "andNot", "ids", "and", "or", "bits", "iterator", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "lowest", "default", "(J)J", "toString", "", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:355\n281#1,4:366\n288#1,8:371\n276#1:379\n274#1,7:380\n281#1,4:391\n288#1,8:396\n276#1:404\n274#1,7:405\n281#1,4:416\n288#1,8:421\n276#1:429\n274#1,7:430\n281#1,4:441\n288#1,8:446\n276#1:454\n274#1,7:455\n281#1,4:466\n288#1,8:471\n276#1:479\n280#1:480\n281#1,4:485\n288#1,8:490\n38#2:316\n34#2:317\n46#2:318\n34#2:319\n46#2:320\n34#2:321\n38#2:323\n34#2:324\n46#2:325\n34#2:326\n46#2:327\n34#2:328\n36#2,9:329\n34#2,7:338\n31#2:345\n36#2:346\n36#2:347\n143#2:348\n38#2:349\n34#2:350\n46#2:351\n34#2:352\n46#2:353\n34#2:354\n83#2,4:362\n36#2:370\n83#2,4:387\n36#2:395\n83#2,4:412\n36#2:420\n83#2,4:437\n36#2:445\n83#2,4:462\n36#2:470\n83#2,4:481\n36#2:489\n83#2,4:498\n36#2:502\n36#2:503\n68#2:504\n36#2:505\n36#2:506\n1#3:322\n1557#4:507\n1628#4,3:508\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:355,7\n198#1:366,4\n198#1:371,8\n198#1:379\n218#1:380,7\n218#1:391,4\n218#1:396,8\n218#1:404\n222#1:405,7\n222#1:416,4\n222#1:421,8\n222#1:429\n242#1:430,7\n242#1:441,4\n242#1:446,8\n242#1:454\n245#1:455,7\n245#1:466,4\n245#1:471,8\n245#1:479\n275#1:480\n275#1:485,4\n275#1:490,8\n55#1:316\n56#1:317\n57#1:318\n58#1:319\n59#1:320\n60#1:321\n67#1:323\n68#1:324\n69#1:325\n78#1:326\n79#1:327\n88#1:328\n96#1:329,9\n97#1:338,7\n99#1:345\n106#1:346\n117#1:347\n131#1:348\n147#1:349\n148#1:350\n149#1:351\n158#1:352\n159#1:353\n168#1:354\n198#1:362,4\n198#1:370\n218#1:387,4\n218#1:395\n222#1:412,4\n222#1:420\n242#1:437,4\n242#1:445\n245#1:462,4\n245#1:470\n275#1:481,4\n275#1:489\n280#1:498,4\n284#1:502\n291#1:503\n299#1:504\n300#1:505\n301#1:506\n306#1:507\n306#1:508,3\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    private SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> operation) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j : jArr) {
                initial = operation.invoke(initial, Long.valueOf(j));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    initial = operation.invoke(initial, Long.valueOf(this.lowerBound + i2 + 64));
                }
            }
        }
        return initial;
    }

    public final SnapshotIdSet and(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(ids, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        long j = ids.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j3 = this.upperSet;
                long j4 = ids.upperSet;
                long j5 = j3 & j4;
                long j6 = this.lowerSet;
                long j7 = ids.lowerSet;
                return (j5 == 0 && (j6 & j7) == 0 && jArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j3 & j4, j6 & j7, j2, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j8 : jArr3) {
                    if (ids.get(j8)) {
                        snapshotIdSet2 = snapshotIdSet2.set(j8);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        long j9 = this.lowerBound + i2;
                        if (ids.get(j9)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j9);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        long j10 = this.lowerBound + i + 64;
                        if (ids.get(j10)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j10);
                        }
                    }
                    i++;
                }
            }
            return snapshotIdSet3;
        }
        long[] jArr4 = ids.belowBound;
        if (jArr4 != null) {
            for (long j11 : jArr4) {
                if (get(j11)) {
                    snapshotIdSet2 = snapshotIdSet2.set(j11);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (ids.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((ids.lowerSet & (1 << i3)) != 0) {
                    long j12 = ids.lowerBound + i3;
                    if (get(j12)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j12);
                    }
                }
            }
        }
        if (ids.upperSet != 0) {
            while (i < 64) {
                if ((ids.upperSet & (1 << i)) != 0) {
                    long j13 = ids.lowerBound + i + 64;
                    if (get(j13)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j13);
                    }
                }
                i++;
            }
        }
        return snapshotIdSet4;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (ids == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j = ids.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j2, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSet = this;
            for (long j3 : jArr3) {
                snapshotIdSet = snapshotIdSet.clear(j3);
            }
        } else {
            snapshotIdSet = this;
        }
        if (ids.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((ids.lowerSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(ids.lowerBound + i);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((ids.upperSet & (1 << i2)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(ids.lowerBound + i2 + 64);
                }
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet clear(long id2) {
        long[] jArr;
        int binarySearch;
        long j = id2 - this.lowerBound;
        long j2 = 0;
        if (Intrinsics.compare(j, j2) >= 0 && Intrinsics.compare(j, 64) < 0) {
            long j3 = 1 << ((int) j);
            long j4 = this.lowerSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(this.upperSet, j4 & (~j3), this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j, 64) >= 0 && Intrinsics.compare(j, 128) < 0) {
            long j5 = 1 << (((int) j) - 64);
            long j6 = this.upperSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(j6 & (~j5), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j, j2) < 0 && (jArr = this.belowBound) != null && (binarySearch = SnapshotId_jvmKt.binarySearch(jArr, id2)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, binarySearch));
        }
        return this;
    }

    public final void fastForEach(Function1<? super Long, Unit> block) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j : jArr) {
                block.invoke(Long.valueOf(j));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + i2 + 64));
                }
            }
        }
    }

    public final boolean get(long id2) {
        long[] jArr;
        long j = id2 - this.lowerBound;
        long j2 = 0;
        return (Intrinsics.compare(j, j2) < 0 || Intrinsics.compare(j, (long) 64) >= 0) ? (Intrinsics.compare(j, (long) 64) < 0 || Intrinsics.compare(j, (long) 128) >= 0) ? Intrinsics.compare(j, j2) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id2) >= 0 : ((1 << (((int) j) - 64)) & this.upperSet) != 0 : ((1 << ((int) j)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final long lowest(long r6) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : r6;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j = bits.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j2, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    bits = bits.set(j3);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        bits = bits.set(this.lowerBound + i2);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        bits = bits.set(this.lowerBound + i + 64);
                    }
                    i++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j4 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j4);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((bits.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i3);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i < 64) {
                if ((bits.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i + 64);
                }
                i++;
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet set(long id2) {
        long j;
        long j2;
        long[] jArr;
        long j3 = id2 - this.lowerBound;
        long j4 = 0;
        if (Intrinsics.compare(j3, j4) < 0 || Intrinsics.compare(j3, 64) >= 0) {
            long j5 = 64;
            if (Intrinsics.compare(j3, j5) < 0 || Intrinsics.compare(j3, 128) >= 0) {
                long j6 = 128;
                if (Intrinsics.compare(j3, j6) < 0) {
                    long[] jArr2 = this.belowBound;
                    if (jArr2 == null) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id2});
                    }
                    int binarySearch = SnapshotId_jvmKt.binarySearch(jArr2, id2);
                    if (binarySearch < 0) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr2, -(binarySearch + 1), id2));
                    }
                } else if (!get(id2)) {
                    long j7 = this.upperSet;
                    long j8 = this.lowerSet;
                    long j9 = this.lowerBound;
                    long j10 = 1;
                    long j11 = ((id2 + j10) / j5) * j5;
                    if (Intrinsics.compare(j11, j4) < 0) {
                        j11 = (Long.MAX_VALUE - j6) + j10;
                    }
                    SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                    long j12 = j7;
                    while (true) {
                        if (Intrinsics.compare(j9, j11) >= 0) {
                            j = j8;
                            j2 = j9;
                            break;
                        }
                        if (j8 != 0) {
                            if (snapshotIdArrayBuilder == null) {
                                snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                            }
                            int i = 0;
                            while (i < 64) {
                                long j13 = j8;
                                if ((j8 & (1 << i)) != 0) {
                                    snapshotIdArrayBuilder.add(i + j9);
                                }
                                i++;
                                j8 = j13;
                            }
                        }
                        if (j12 == 0) {
                            j2 = j11;
                            j = 0;
                            break;
                        }
                        j9 += j5;
                        j8 = j12;
                        j12 = 0;
                    }
                    if (snapshotIdArrayBuilder == null || (jArr = snapshotIdArrayBuilder.toArray()) == null) {
                        jArr = this.belowBound;
                    }
                    return new SnapshotIdSet(j12, j, j2, jArr).set(id2);
                }
            } else {
                long j14 = 1 << (((int) j3) - 64);
                long j15 = this.upperSet;
                if ((j15 & j14) == 0) {
                    return new SnapshotIdSet(j15 | j14, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j16 = 1 << ((int) j3);
            long j17 = this.lowerSet;
            if ((j17 & j16) == 0) {
                return new SnapshotIdSet(this.upperSet, j17 | j16, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public String toString() {
        int collectionSizeOrDefault;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return t.b(']', ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), sb);
    }
}
