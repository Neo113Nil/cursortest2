package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\u00020\u0000*\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010 \u001a\u00020\u001f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"", "", "clampToInt", "(J)I", "a", util.h.xy.cb.b.f1091, "safeMultiplyOrClamp", "(JJ)J", "c", "Lkotlinx/datetime/internal/DivRemResult;", "multiplyAndDivide", "(JJJ)Lkotlinx/datetime/internal/DivRemResult;", "d", "n", "r", "m", "multiplyAddAndDivide", "(JJJJ)J", "multiplyAndAdd", "(JJJ)J", "Lkotlin/ranges/LongProgression;", "Lkotlin/random/Random;", "random", "randomUnsafe", "(Lkotlin/ranges/LongProgression;Lkotlin/random/Random;)J", "randomUnsafeOrNull", "(Lkotlin/ranges/LongProgression;Lkotlin/random/Random;)Ljava/lang/Long;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "containsUnsafe", "(Lkotlin/ranges/LongProgression;J)Z", "", "POWERS_OF_TEN", "[I", "getPOWERS_OF_TEN", "()[I", "getSizeUnsafe", "(Lkotlin/ranges/LongProgression;)I", "sizeUnsafe"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MathKt {
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};

    public static final int clampToInt(long j) {
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final long safeMultiplyOrClamp(long j, long j2) {
        if (j2 == -1) {
            if (j == Long.MIN_VALUE) {
                return Long.MAX_VALUE;
            }
            return -j;
        }
        if (j2 == 1) {
            return j;
        }
        long j3 = j * j2;
        if (j3 / j2 != j) {
            return ((j > 0L ? 1 : (j == 0L ? 0 : -1)) > 0) == (j2 > 0) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
        return j3;
    }

    public static final long multiplyAddAndDivide(long j, long j2, long j3, long j4) {
        if (j > 0 && j3 < 0) {
            j--;
            j3 += j2;
        } else if (j < 0 && j3 > 0) {
            j++;
            j3 -= j2;
        }
        long j5 = j;
        if (j5 == 0) {
            return j3 / j4;
        }
        kotlinx.datetime.internal.DivRemResult multiplyAndDivide = multiplyAndDivide(j5, j2, j4);
        return kotlinx.datetime.internal.MathJvmKt.safeAdd(multiplyAndDivide.getQ(), kotlinx.datetime.internal.MathJvmKt.safeAdd(j3 / j4, kotlinx.datetime.internal.MathJvmKt.safeAdd(j3 % j4, multiplyAndDivide.getR()) / j4));
    }

    public static final long multiplyAndAdd(long j, long j2, long j3) {
        if (j > 0 && j3 < 0) {
            j--;
            j3 += j2;
        } else if (j < 0 && j3 > 0) {
            j++;
            j3 -= j2;
        }
        return kotlinx.datetime.internal.MathJvmKt.safeAdd(kotlinx.datetime.internal.MathJvmKt.safeMultiply(j, j2), j3);
    }

    public static final int[] getPOWERS_OF_TEN() {
        return POWERS_OF_TEN;
    }

    public static /* synthetic */ long randomUnsafe$default(kotlin.ranges.LongProgression longProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return randomUnsafe(longProgression, random);
    }

    public static final long randomUnsafe(kotlin.ranges.LongProgression longProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        return (kotlin.random.RandomKt.nextLong(random, new kotlin.ranges.LongRange(0L, (longProgression.getLast() - longProgression.getFirst()) / longProgression.getStep())) * longProgression.getStep()) + longProgression.getFirst();
    }

    public static /* synthetic */ java.lang.Long randomUnsafeOrNull$default(kotlin.ranges.LongProgression longProgression, kotlin.random.Random random, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            random = kotlin.random.Random.INSTANCE;
        }
        return randomUnsafeOrNull(longProgression, random);
    }

    public static final java.lang.Long randomUnsafeOrNull(kotlin.ranges.LongProgression longProgression, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (longProgression.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(randomUnsafe(longProgression, random));
    }

    public static final boolean containsUnsafe(kotlin.ranges.LongProgression longProgression, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        kotlin.ranges.LongRange longRange = longProgression.getStep() > 0 ? new kotlin.ranges.LongRange(longProgression.getFirst(), longProgression.getLast()) : new kotlin.ranges.LongRange(longProgression.getLast(), longProgression.getFirst());
        return j <= longRange.getLast() && longRange.getFirst() <= j && (j - longProgression.getFirst()) % longProgression.getStep() == 0;
    }

    public static final int getSizeUnsafe(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        if (longProgression.isEmpty()) {
            return 0;
        }
        try {
            return clampToInt((kotlinx.datetime.internal.MathJvmKt.safeAdd(longProgression.getLast(), -longProgression.getFirst()) / longProgression.getStep()) + 1);
        } catch (java.lang.ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 long, still in use, count: 2, list:
          (r13v0 long) from 0x0028: ARITH (r13v0 long) / (r31v0 long) A[WRAPPED] (LINE:1035)
          (r13v0 long) from 0x002f: PHI (r13v2 long) = (r13v0 long), (r13v1 long), (r13v15 long), (r13v17 long) binds: [B:63:0x002c, B:61:0x0024, B:9:0x001c, B:58:0x001e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlinx.datetime.internal.DivRemResult multiplyAndDivide(long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.internal.MathKt.multiplyAndDivide(long, long, long):kotlinx.datetime.internal.DivRemResult");
    }
}
