package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* loaded from: classes.dex */
public final class g5 implements h7 {
    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new b9(context, list, trackingParams, new f5());
    }
}
