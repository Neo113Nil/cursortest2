package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.Continuation;

/* renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4195wl {
    SignalsConfig.SynapseCollectorConfig a(SignalsConfig signalsConfig);

    Object a(Context context, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig, Continuation continuation);

    String a();

    String a(SignalsConfig.SynapseCollectorConfig synapseCollectorConfig);

    void a(Context context);

    void b(Context context);
}
