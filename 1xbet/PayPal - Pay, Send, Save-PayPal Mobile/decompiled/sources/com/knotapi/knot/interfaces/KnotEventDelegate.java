package com.knotapi.knot.interfaces;

/* loaded from: classes9.dex */
public interface KnotEventDelegate {
    void onError(com.knotapi.knot.models.KnotError knotError);

    void onEvent(com.knotapi.knot.models.KnotEvent knotEvent);

    void onExit();

    void onSuccess(java.lang.String str);
}
