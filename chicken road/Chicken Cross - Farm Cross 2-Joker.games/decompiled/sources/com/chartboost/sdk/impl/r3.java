package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.caching.ExpirationReason;
import java.net.URL;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface r3 {
    Object a(URL url, ExpirationReason expirationReason, Continuation continuation);

    Flow a(URL url);
}
