package com.google.firebase.database;

import android.support.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ServerValue {

    @NonNull
    public static final Map<String, String> TIMESTAMP;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(".sv", AppMeasurement.Param.TIMESTAMP);
        TIMESTAMP = Collections.unmodifiableMap(hashMap);
    }
}
