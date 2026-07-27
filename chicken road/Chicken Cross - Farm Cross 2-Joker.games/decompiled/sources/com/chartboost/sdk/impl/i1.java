package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4796a;

    public i1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4796a = context;
    }

    public final boolean a() {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.f4796a, COPPA.COPPA_STANDARD);
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
