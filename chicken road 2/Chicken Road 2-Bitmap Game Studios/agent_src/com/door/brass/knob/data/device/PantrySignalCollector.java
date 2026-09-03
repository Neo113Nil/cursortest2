package com.door.brass.knob.data.device;

import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/device/PantrySignalCollector;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PantrySignalCollector {
    public final InstallReferrerSource hRNgd2zGCE5kj;
    public final AndroidIdSource ra306ClFT3HT;
    public final AdvertisingIdSource yzPsTade5rL7D3;

    public PantrySignalCollector(AdvertisingIdSource advertisingIdSource, InstallReferrerSource installReferrerSource, AndroidIdSource androidIdSource) {
        advertisingIdSource.getClass();
        installReferrerSource.getClass();
        androidIdSource.getClass();
        this.yzPsTade5rL7D3 = advertisingIdSource;
        this.hRNgd2zGCE5kj = installReferrerSource;
        this.ra306ClFT3HT = androidIdSource;
    }

    public final Object yzPsTade5rL7D3(Continuation continuation) {
        return CoroutineScopeKt.ra306ClFT3HT(new PantrySignalCollector$collect$2(this, null), continuation);
    }
}
