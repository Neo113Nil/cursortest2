package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/FooterReader;", "Lcom/goldenboot/saga/zone/JoystickCheckpoint;", "Lcom/goldenboot/saga/zone/SlotChunk;", "textInputService", "<init>", "(Lcom/goldenboot/saga/zone/SlotChunk;)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "show", "()V", "hide", "evictLayout", "Lcom/goldenboot/saga/zone/SlotChunk;", "()Lcom/goldenboot/saga/zone/SlotChunk;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FooterReader implements JoystickCheckpoint {
    public static final int growPayload = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final SlotChunk textInputService;

    public FooterReader(SlotChunk slotChunk) {
        this.textInputService = slotChunk;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final SlotChunk getTextInputService() {
        return this.textInputService;
    }

    @Override // com.goldenboot.saga.zone.JoystickCheckpoint
    public void hide() {
        this.textInputService.growPayload();
    }

    @Override // com.goldenboot.saga.zone.JoystickCheckpoint
    public void show() {
        this.textInputService.injectMetric();
    }
}
