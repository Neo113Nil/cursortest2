package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class Jo {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Bn bn, double d, Qf qf, int i, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Do r0;
        int i2;
        double doubleValue;
        if (continuationImpl instanceof Do) {
            r0 = (Do) continuationImpl;
            int i3 = r0.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r0.e = i3 - Integer.MIN_VALUE;
                Object obj = r0.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = r0.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    r0.f6519a = bn;
                    r0.b = qf;
                    r0.c = i;
                    r0.e = 1;
                    obj = a(bn, d, vastVideoConfig, r0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = r0.c;
                    qf = r0.b;
                    bn = r0.f6519a;
                    ResultKt.throwOnFailure(obj);
                }
                doubleValue = ((Number) obj).doubleValue();
                if (doubleValue != Double.MAX_VALUE) {
                    return Boxing.boxDouble(Double.MAX_VALUE);
                }
                double abs = Math.abs((bn.f6482a * bn.b) - i);
                int ordinal = qf.ordinal();
                return Boxing.boxDouble((abs * (ordinal != 2 ? ordinal != 3 ? 0.5d : 1.5d : 1.0d)) / Math.exp(doubleValue / 3.145728E7d));
            }
        }
        r0 = new Do(continuationImpl);
        Object obj2 = r0.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = r0.e;
        if (i2 != 0) {
        }
        doubleValue = ((Number) obj2).doubleValue();
        if (doubleValue != Double.MAX_VALUE) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Bn bn, double d, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Eo eo;
        int i;
        double d2;
        if (continuationImpl instanceof Eo) {
            eo = (Eo) continuationImpl;
            int i2 = eo.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eo.c = i2 - Integer.MIN_VALUE;
                Object obj = eo.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eo.c;
                double d3 = Double.MAX_VALUE;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    d2 = bn.d * d;
                    if (d2 <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                        return Boxing.boxDouble(Double.MAX_VALUE);
                    }
                    if (d2 <= 0.0d) {
                        eo.f6540a = vastVideoConfig;
                        eo.c = 1;
                        obj = a(bn, vastVideoConfig, eo);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (d2 > 0.0d && d2 <= vastVideoConfig.getVastMaxAssetSize()) {
                        d3 = d2;
                    }
                    return Boxing.boxDouble(d3);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AdConfig.VastVideoConfig vastVideoConfig2 = eo.f6540a;
                ResultKt.throwOnFailure(obj);
                vastVideoConfig = vastVideoConfig2;
                d2 = ((Number) obj).doubleValue();
                if (d2 > 0.0d) {
                    d3 = d2;
                }
                return Boxing.boxDouble(d3);
            }
        }
        eo = new Eo(continuationImpl);
        Object obj2 = eo.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eo.c;
        double d32 = Double.MAX_VALUE;
        if (i != 0) {
        }
        d2 = ((Number) obj2).doubleValue();
        if (d2 > 0.0d) {
        }
        return Boxing.boxDouble(d32);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(2:18|19)(2:15|16)))|28|6|7|(0)(0)|11|(1:13)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Bn bn, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Fo fo;
        int i;
        Of of;
        if (continuationImpl instanceof Fo) {
            fo = (Fo) continuationImpl;
            int i2 = fo.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo.b = i2 - Integer.MIN_VALUE;
                Object obj = fo.f6566a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fo.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Lf lf = new Lf(bn.c, new Cm(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                    C3733ga c3733ga = (C3733ga) If.c.getValue();
                    fo.b = 1;
                    obj = c3733ga.f7119a.a(lf, fo);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                of = (Of) obj;
                if (of == null && of.c() == 200) {
                    return Boxing.boxDouble(of.b().c);
                }
                return Boxing.boxDouble(Double.MAX_VALUE);
            }
        }
        fo = new Fo(continuationImpl);
        Object obj2 = fo.f6566a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fo.b;
        if (i != 0) {
        }
        of = (Of) obj2;
        if (of == null) {
        }
        return Boxing.boxDouble(Double.MAX_VALUE);
    }
}
