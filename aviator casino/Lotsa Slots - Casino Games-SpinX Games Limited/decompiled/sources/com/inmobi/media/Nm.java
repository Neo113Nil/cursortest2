package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Nm {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Gl gl, double d, com.inmobi.media.Xe xe, int i, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Hm hm;
        int i2;
        double doubleValue;
        if (continuationImpl instanceof com.inmobi.media.Hm) {
            hm = (com.inmobi.media.Hm) continuationImpl;
            int i3 = hm.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hm.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = hm.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hm.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    hm.f4750a = gl;
                    hm.b = xe;
                    hm.c = i;
                    hm.e = 1;
                    obj = a(gl, d, vastVideoConfig, hm);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = hm.c;
                    xe = hm.b;
                    gl = hm.f4750a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                doubleValue = ((java.lang.Number) obj).doubleValue();
                if (doubleValue != Double.MAX_VALUE) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxDouble(Double.MAX_VALUE);
                }
                double abs = java.lang.Math.abs((gl.f4730a * gl.b) - i);
                int ordinal = xe.ordinal();
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble((abs * (ordinal != 2 ? ordinal != 3 ? 0.5d : 1.5d : 1.0d)) / java.lang.Math.exp(doubleValue / 3.145728E7d));
            }
        }
        hm = new com.inmobi.media.Hm(continuationImpl);
        java.lang.Object obj2 = hm.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hm.e;
        if (i2 != 0) {
        }
        doubleValue = ((java.lang.Number) obj2).doubleValue();
        if (doubleValue != Double.MAX_VALUE) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Gl gl, double d, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Im im;
        int i;
        double d2;
        if (continuationImpl instanceof com.inmobi.media.Im) {
            im = (com.inmobi.media.Im) continuationImpl;
            int i2 = im.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                im.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = im.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = im.c;
                double d3 = Double.MAX_VALUE;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    d2 = gl.d * d;
                    if (d2 <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxDouble(Double.MAX_VALUE);
                    }
                    if (d2 <= 0.0d) {
                        im.f4770a = vastVideoConfig;
                        im.c = 1;
                        obj = a(gl, vastVideoConfig, im);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (d2 > 0.0d && d2 <= vastVideoConfig.getVastMaxAssetSize()) {
                        d3 = d2;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxDouble(d3);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig2 = im.f4770a;
                kotlin.ResultKt.throwOnFailure(obj);
                vastVideoConfig = vastVideoConfig2;
                d2 = ((java.lang.Number) obj).doubleValue();
                if (d2 > 0.0d) {
                    d3 = d2;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(d3);
            }
        }
        im = new com.inmobi.media.Im(continuationImpl);
        java.lang.Object obj2 = im.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = im.c;
        double d32 = Double.MAX_VALUE;
        if (i != 0) {
        }
        d2 = ((java.lang.Number) obj2).doubleValue();
        if (d2 > 0.0d) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxDouble(d32);
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
    public static final java.lang.Object a(com.inmobi.media.Gl gl, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Jm jm;
        int i;
        com.inmobi.media.Ve ve;
        if (continuationImpl instanceof com.inmobi.media.Jm) {
            jm = (com.inmobi.media.Jm) continuationImpl;
            int i2 = jm.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jm.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jm.f4788a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jm.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.Se se = new com.inmobi.media.Se(gl.c, new com.inmobi.media.Gk(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                    com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue();
                    jm.b = 1;
                    obj = b9.f4618a.a(se, jm);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ve = (com.inmobi.media.Ve) obj;
                if (ve == null && ve.c() == 200) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxDouble(ve.b().c);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(Double.MAX_VALUE);
            }
        }
        jm = new com.inmobi.media.Jm(continuationImpl);
        java.lang.Object obj2 = jm.f4788a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jm.b;
        if (i != 0) {
        }
        ve = (com.inmobi.media.Ve) obj2;
        if (ve == null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxDouble(Double.MAX_VALUE);
    }
}
