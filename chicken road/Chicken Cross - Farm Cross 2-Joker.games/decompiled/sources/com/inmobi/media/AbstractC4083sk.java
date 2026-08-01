package com.inmobi.media;

import com.inmobi.sdk.SdkInitializationListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4083sk {
    public static byte a(Pa initRequest, byte b) {
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        byte b2 = 0;
        if (initRequest.c != 2) {
            return (byte) 0;
        }
        if (b == 1) {
            return (byte) 1;
        }
        if (b != 2 && b != 3) {
            return (byte) 0;
        }
        AtomicBoolean atomicBoolean = AbstractC4027qk.f7332a;
        if (b == 2) {
            b2 = 1;
        } else if (b == 3) {
            b2 = 2;
        }
        AbstractC4027qk.f = b2;
        SdkInitializationListener sdkInitializationListener = initRequest.e;
        if (sdkInitializationListener != null) {
            AbstractC4027qk.e.add(sdkInitializationListener);
        }
        byte b3 = AbstractC4027qk.f;
        String str = "Publisher SDK init joined active SDK init; activeSource=" + (b3 == 1 ? "PROVIDER" : b3 == 2 ? "PUBLISHER" : "NONE") + " pendingListeners=" + AbstractC4027qk.e.size() + ".";
        return (byte) 2;
    }
}
