package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface k {
    Init.SDKInitResponse a();

    Object a(String str, MediationInfo mediationInfo, Continuation<? super x<Init.SDKInitResponse, j>> continuation);

    Object a(Continuation<? super Unit> continuation);
}
