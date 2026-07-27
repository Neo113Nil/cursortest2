package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class En {

    /* renamed from: a, reason: collision with root package name */
    public static final En f6539a = new En();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r1) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bb -> B:11:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Dn dn;
        int i;
        Kf kf;
        int i2;
        Of of;
        if (continuationImpl instanceof Dn) {
            dn = (Dn) continuationImpl;
            int i3 = dn.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dn.e = i3 - Integer.MIN_VALUE;
                Object obj = dn.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dn.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!An.a(str)) {
                        throw new Fn((short) 1114);
                    }
                    kf = new Kf(str, null, null, null, null, false, 62);
                    i2 = 0;
                } else {
                    if (i == 1) {
                        i2 = dn.f6518a;
                        kf = dn.b;
                        ResultKt.throwOnFailure(obj);
                        of = (Of) obj;
                        if (!AbstractC4086sn.a(of)) {
                            IntRange intRange = Tf.f6872a;
                            Intrinsics.checkNotNullParameter(of, "<this>");
                            return of.d().string(Charsets.UTF_8);
                        }
                        IntRange intRange2 = Tf.f6872a;
                        Intrinsics.checkNotNullParameter(of, "<this>");
                        IntRange intRange3 = Tf.b;
                        int first = intRange3.getFirst();
                        int last = intRange3.getLast();
                        int c = of.c();
                        if (first > c || c > last) {
                            dn.b = kf;
                            dn.f6518a = i2;
                            dn.e = 2;
                        }
                        throw new Fn((short) 1113);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = dn.f6518a;
                    kf = dn.b;
                    ResultKt.throwOnFailure(obj);
                }
                int i4 = i2 + 1;
                if (i2 < 3) {
                    C3733ga c3733ga = (C3733ga) If.c.getValue();
                    dn.b = kf;
                    dn.f6518a = i4;
                    dn.e = 1;
                    Object a2 = c3733ga.f7119a.a(kf, dn);
                    if (a2 != coroutine_suspended) {
                        i2 = i4;
                        obj = a2;
                        of = (Of) obj;
                        if (!AbstractC4086sn.a(of)) {
                        }
                    }
                    return coroutine_suspended;
                }
                throw new Fn((short) 1113);
            }
        }
        dn = new Dn(this, continuationImpl);
        Object obj2 = dn.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dn.e;
        if (i != 0) {
        }
        int i42 = i2 + 1;
        if (i2 < 3) {
        }
        throw new Fn((short) 1113);
    }
}
