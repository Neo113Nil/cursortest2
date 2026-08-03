package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class EventBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.event.Event> {
    public EventBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.event.Event get(int i) {
        return new com.google.android.gms.games.event.EventRef(this.mDataHolder, i);
    }
}
