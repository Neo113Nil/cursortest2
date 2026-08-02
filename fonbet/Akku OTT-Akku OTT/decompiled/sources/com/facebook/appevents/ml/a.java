package com.facebook.appevents.ml;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class a {
    public static final C0082a Companion = new C0082a();
    public int[] a;
    public int b;
    public float[] c;

    @SourceDebugExtension({"SMAP\nMTensor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MTensor.kt\ncom/facebook/appevents/ml/MTensor$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n19339#2,7:41\n*S KotlinDebug\n*F\n+ 1 MTensor.kt\ncom/facebook/appevents/ml/MTensor$Companion\n*L\n37#1:41,7\n*E\n"})
    /* renamed from: com.facebook.appevents.ml.a$a, reason: collision with other inner class name */
    public static final class C0082a {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
        public static final int a(C0082a c0082a, int[] iArr) {
            c0082a.getClass();
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i = iArr[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                i *= iArr[it.nextInt()];
            }
            return i;
        }
    }

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.a = shape;
        int a = C0082a.a(Companion, shape);
        this.b = a;
        this.c = new float[a];
    }
}
