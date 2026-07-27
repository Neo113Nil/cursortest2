package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147z2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f9616a;

    public C1147z2(Context context) {
        this((LocationManager) context.getSystemService(InAppMessagePromptTypes.LOCATION_PROMPT_KEY));
    }

    public C1147z2(LocationManager locationManager) {
        this.f9616a = locationManager;
    }
}
