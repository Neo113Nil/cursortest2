package util.h.xy.d;

/* loaded from: classes5.dex */
public class re {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 59) << 1) - (i ^ 59)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String[]> m26251(final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.String[]> abstractAsyncHandler) {
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.re$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.re.$r8$lambda$sKKwW_2C93yT5XC9Tu0Fptv9BCQ(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler.this, maVar);
            }
        }).start();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 115) + (i | 115)) % 128;
        return maVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> m26247() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 101) << 1) - (i ^ 101);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            if (!util.h.xy.ag.a.m24556().m24560()) {
                return util.h.xy.x.a.m27693(new java.lang.String[0]);
            }
            try {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> mo26166 = util.h.xy.k.ma.m26925().mo26166();
                int i3 = getHighSpeedVideoFpsRangesFor + 81;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    return mo26166;
                }
                throw null;
            } catch (java.lang.Exception e) {
                return util.h.xy.x.a.m27692(e);
            }
        }
        util.h.xy.ag.a.m24556().m24560();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> m26255(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler) {
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.re$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.re.$r8$lambda$BNBak3PNL1oV9UB61OHAoGoirXw(com.gemalto.mfs.mwsdk.dcm.PaymentType.this, abstractAsyncHandler, maVar);
            }
        }).start();
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26249(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        int i = getHighSpeedVideoSizes + 19;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.k.ma.m26925();
            util.h.xy.v.c.m27646().m27647();
            throw null;
        }
        util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
        if (!util.h.xy.v.c.m27646().m27647()) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27683 = util.h.xy.x.a.m27683((java.lang.Object) null);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 49) % 128;
            return m27683;
        }
        try {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26154 = m26925.mo26154(paymentType);
            if (mo26154.isSuccessful()) {
                int i2 = getHighSpeedVideoFpsRangesFor + 47;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.g.c.m26868();
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.g.c.m26868();
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i3 & 5) + (i3 | 5)) % 128;
            }
            int i4 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i4 ^ 55) + ((i4 & 55) << 1)) % 128;
            return mo26154;
        } catch (java.lang.Exception e) {
            return util.h.xy.x.a.m27692(e);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.dcm.DigitalizedCard m26254(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 89;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.k.ra raVar = util.h.xy.k.ra.f2243;
        if (i % 2 != 0) {
            return raVar.m26963(str);
        }
        raVar.m26963(str);
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.String> m26250(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.String> abstractAsyncHandler) {
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.re$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.re.$r8$lambda$Qoolj206Iocgo89Fw9cO4jOKNrs(com.gemalto.mfs.mwsdk.dcm.PaymentType.this, abstractAsyncHandler, maVar);
            }
        }).start();
        return maVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26253(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 43) + (i | 43);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            if (util.h.xy.ag.a.m24556().m24560()) {
                try {
                    return util.h.xy.k.ma.m26925().mo26161(paymentType);
                } catch (java.lang.Exception e) {
                    return util.h.xy.x.a.m27692(e);
                }
            }
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i3 & 35) + (i3 | 35)) % 128;
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m27693 = util.h.xy.x.a.m27693("");
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 ^ 3) + ((i4 & 3) << 1);
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                return m27693;
            }
            throw null;
        }
        util.h.xy.ag.a.m24556().m24560();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m26256(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 121;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ag.a.m24556().m24560();
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str2 = null;
        if (util.h.xy.ag.a.m24556().m24560()) {
            int i2 = getHighSpeedVideoSizes;
            int i3 = (i2 & 73) + (i2 | 73);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    util.h.xy.k.ma.m26925().mo26146(str).isSuccessful();
                    throw null;
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> mo26146 = util.h.xy.k.ma.m26925().mo26146(str);
                if (mo26146.isSuccessful()) {
                    java.lang.String result = mo26146.getResult();
                    int i4 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor = ((i4 & 35) + (i4 | 35)) % 128;
                    str2 = result;
                } else {
                    mo26146.getErrorCode();
                    mo26146.getErrorMessage();
                    int i5 = getHighSpeedVideoSizes;
                    int i6 = (i5 ^ 37) + ((i5 & 37) << 1);
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    int i7 = i6 % 2;
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                return str2;
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m26252(java.lang.String str) {
        java.lang.Exception e;
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 21) + (i | 21)) % 128;
        java.lang.String str2 = null;
        if (util.h.xy.ag.a.m24556().m24560()) {
            int i2 = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    m26248(str).isSuccessful();
                    throw new java.lang.ArithmeticException();
                }
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26248 = m26248(str);
                if (!m26248.isSuccessful()) {
                    m26248.getErrorCode();
                    m26248.getErrorMessage();
                    return null;
                }
                int i3 = getHighSpeedVideoFpsRangesFor + 45;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    java.lang.String result = m26248.getResult();
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                    return result;
                }
                java.lang.String result2 = m26248.getResult();
                try {
                    throw new java.lang.NullPointerException();
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str2 = result2;
                    e.getMessage();
                    return str2;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
            }
        }
        return str2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> m26248(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 115;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26175 = util.h.xy.k.ma.m26925().mo26175(str);
            if (mo26175.isSuccessful()) {
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(mo26175.getResult().m26180(), true, null);
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
                return raVar;
            }
            return new util.h.xy.an.ra(null, false, mo26175.getErrorMessage(), mo26175.getErrorCode());
        }
        util.h.xy.k.ma.m26925().mo26175(str).isSuccessful();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$BNBak3PNL1oV9UB61OHAoGoirXw(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 81) + (i | 81)) % 128;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, m26249(paymentType));
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static /* synthetic */ void $r8$lambda$Qoolj206Iocgo89Fw9cO4jOKNrs(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 17) % 128;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, m26253(paymentType));
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 61) % 128;
    }

    public static /* synthetic */ void $r8$lambda$sKKwW_2C93yT5XC9Tu0Fptv9BCQ(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i ^ 117) + ((i & 117) << 1)) % 128;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, m26247());
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
