package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* loaded from: classes5.dex */
public final class A extends AbstractList<C1193h> implements RandomAccess {
    public static final a Companion = new a();
    public final C1193h[] a;
    public final int[] b;

    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13537#3,3:240\n73#4:243\n73#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class a {
        public static void a(long j, C1190e c1190e, int i, List list, int i2, int i3, ArrayList arrayList) {
            int i4;
            int i5;
            ArrayList arrayList2;
            long j2;
            int i6;
            int i7 = i;
            List list2 = list;
            ArrayList arrayList3 = arrayList;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((C1193h) list2.get(i8)).d() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C1193h c1193h = (C1193h) list.get(i2);
            C1193h c1193h2 = (C1193h) list2.get(i3 - 1);
            if (i7 == c1193h.d()) {
                int intValue = ((Number) arrayList3.get(i2)).intValue();
                int i9 = i2 + 1;
                C1193h c1193h3 = (C1193h) list2.get(i9);
                i4 = i9;
                i5 = intValue;
                c1193h = c1193h3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (c1193h.i(i7) == c1193h2.i(i7)) {
                int min = Math.min(c1193h.d(), c1193h2.d());
                int i10 = 0;
                for (int i11 = i7; i11 < min && c1193h.i(i11) == c1193h2.i(i11); i11++) {
                    i10++;
                }
                long j3 = 4;
                long j4 = (c1190e.b / j3) + j + 2 + i10 + 1;
                c1190e.f0(-i10);
                c1190e.f0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    c1190e.f0(c1193h.i(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != ((C1193h) list2.get(i4)).d()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c1190e.f0(((Number) arrayList3.get(i4)).intValue());
                    return;
                } else {
                    C1190e c1190e2 = new C1190e();
                    c1190e.f0(((int) ((c1190e2.b / j3) + j4)) * (-1));
                    a(j4, c1190e2, i12, list2, i4, i3, arrayList3);
                    c1190e.o(c1190e2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((C1193h) list2.get(i14 - 1)).i(i7) != ((C1193h) list2.get(i14)).i(i7)) {
                    i13++;
                }
            }
            long j5 = 4;
            long j6 = (c1190e.b / j5) + j + 2 + (i13 * 2);
            c1190e.f0(i13);
            c1190e.f0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int i16 = ((C1193h) list2.get(i15)).i(i7);
                if (i15 == i4 || i16 != ((C1193h) list2.get(i15 - 1)).i(i7)) {
                    c1190e.f0(i16 & 255);
                }
            }
            C1190e c1190e3 = new C1190e();
            int i17 = i4;
            while (i17 < i3) {
                byte i18 = ((C1193h) list2.get(i17)).i(i7);
                int i19 = i17 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 >= i3) {
                        i20 = i3;
                        break;
                    } else if (i18 != ((C1193h) list2.get(i20)).i(i7)) {
                        break;
                    } else {
                        i20++;
                    }
                }
                if (i19 == i20 && i7 + 1 == ((C1193h) list2.get(i17)).d()) {
                    c1190e.f0(((Number) arrayList3.get(i17)).intValue());
                    arrayList2 = arrayList3;
                    j2 = j6;
                    i6 = i20;
                } else {
                    c1190e.f0(((int) ((c1190e3.b / j5) + j6)) * (-1));
                    arrayList2 = arrayList3;
                    j2 = j6;
                    i6 = i20;
                    a(j2, c1190e3, i7 + 1, list, i17, i6, arrayList2);
                    list2 = list;
                }
                j6 = j2;
                i17 = i6;
                arrayList3 = arrayList2;
            }
            c1190e.o(c1190e3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            continue;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static A b(C1193h... byteStrings) {
            int binarySearch$default;
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            if (byteStrings.length == 0) {
                return new A(new C1193h[0], new int[]{0, -1});
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            int size = mutableList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null);
                arrayList.set(binarySearch$default, Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C1193h) mutableList.get(0)).d() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                C1193h prefix = (C1193h) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    C1193h c1193h = (C1193h) mutableList.get(i6);
                    c1193h.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (c1193h.l(0, prefix, prefix.d())) {
                        if (c1193h.d() == prefix.d()) {
                            throw new IllegalArgumentException(("duplicate option: " + c1193h).toString());
                        }
                        if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                            mutableList.remove(i6);
                            ((Number) arrayList.remove(i6)).intValue();
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            C1190e c1190e = new C1190e();
            a(0L, c1190e, 0, mutableList, 0, mutableList.size(), arrayList);
            int i7 = (int) (c1190e.b / 4);
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = c1190e.readInt();
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new A((C1193h[]) copyOf, iArr);
        }
    }

    public A(C1193h[] c1193hArr, int[] iArr) {
        this.a = c1193hArr;
        this.b = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1193h) {
            return super.contains((C1193h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.a.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1193h) {
            return super.indexOf((C1193h) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1193h) {
            return super.lastIndexOf((C1193h) obj);
        }
        return -1;
    }
}
