package util.h.xy.x;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    static {
        int i = Camera2StreamConfigurationMap + 19;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private mb() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> void m27699(final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<T> abstractAsyncHandler, util.h.xy.an.ma<T> maVar, final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> asyncResult) {
        int i = (getHighSpeedVideoFpsRanges + 51) % 128;
        Camera2StreamConfigurationMap = i;
        if (abstractAsyncHandler != null) {
            int i2 = (i & 121) + (i | 121);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                abstractAsyncHandler.post(new java.lang.Runnable() { // from class: util.h.xy.x.mb$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        util.h.xy.x.mb.$r8$lambda$faEsOYSM_XtBcWt66utP7dsQ7qo(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler.this, asyncResult);
                    }
                });
            } else {
                abstractAsyncHandler.post(new java.lang.Runnable() { // from class: util.h.xy.x.mb$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        util.h.xy.x.mb.$r8$lambda$faEsOYSM_XtBcWt66utP7dsQ7qo(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler.this, asyncResult);
                    }
                });
                throw null;
            }
        }
        if (maVar != null) {
            int i3 = Camera2StreamConfigurationMap + 27;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                maVar.m25034(asyncResult);
            } else {
                maVar.m25034(asyncResult);
                throw null;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> void m27698(util.h.xy.an.ma<T> maVar, com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> asyncResult) {
        int i = (getHighSpeedVideoFpsRanges + 31) % 128;
        Camera2StreamConfigurationMap = i;
        if (maVar != null) {
            getHighSpeedVideoFpsRanges = ((i ^ 99) + ((i & 99) << 1)) % 128;
            maVar.m25034(asyncResult);
            int i2 = getHighSpeedVideoFpsRanges + 1;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$faEsOYSM_XtBcWt66utP7dsQ7qo(com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, com.gemalto.mfs.mwsdk.utils.async.AsyncResult asyncResult) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i ^ 51) + ((i & 51) << 1)) % 128;
        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f830);
        abstractAsyncHandler.onComplete(asyncResult);
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
