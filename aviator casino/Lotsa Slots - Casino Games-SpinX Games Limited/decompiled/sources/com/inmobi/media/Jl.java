package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jl {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Jl f4787a = new com.inmobi.media.Jl();

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
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Il il;
        int i;
        com.inmobi.media.Re re;
        int i2;
        com.inmobi.media.Ve ve;
        if (continuationImpl instanceof com.inmobi.media.Il) {
            il = (com.inmobi.media.Il) continuationImpl;
            int i3 = il.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                il.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = il.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = il.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!com.inmobi.media.Fl.a(str)) {
                        throw new com.inmobi.media.Kl((short) 1114);
                    }
                    re = new com.inmobi.media.Re(str, null, null, null, null, false, 62);
                    i2 = 0;
                } else {
                    if (i == 1) {
                        i2 = il.f4769a;
                        re = il.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ve = (com.inmobi.media.Ve) obj;
                        if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
                            kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
                            return ve.d().string(kotlin.text.Charsets.UTF_8);
                        }
                        kotlin.ranges.IntRange intRange2 = com.inmobi.media.AbstractC2276af.f5103a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
                        kotlin.ranges.IntRange intRange3 = com.inmobi.media.AbstractC2276af.b;
                        int first = intRange3.getFirst();
                        int last = intRange3.getLast();
                        int c = ve.c();
                        if (first > c || c > last) {
                            il.b = re;
                            il.f4769a = i2;
                            il.e = 2;
                        }
                        throw new com.inmobi.media.Kl((short) 1113);
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = il.f4769a;
                    re = il.b;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                int i4 = i2 + 1;
                if (i2 < 3) {
                    com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue();
                    il.b = re;
                    il.f4769a = i4;
                    il.e = 1;
                    java.lang.Object a2 = b9.f4618a.a(re, il);
                    if (a2 != coroutine_suspended) {
                        i2 = i4;
                        obj = a2;
                        ve = (com.inmobi.media.Ve) obj;
                        if (!com.inmobi.media.AbstractC2889xl.a(ve)) {
                        }
                    }
                    return coroutine_suspended;
                }
                throw new com.inmobi.media.Kl((short) 1113);
            }
        }
        il = new com.inmobi.media.Il(this, continuationImpl);
        java.lang.Object obj2 = il.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = il.e;
        if (i != 0) {
        }
        int i42 = i2 + 1;
        if (i2 < 3) {
        }
        throw new com.inmobi.media.Kl((short) 1113);
    }
}
