package com.goldenboot.saga.zone;

import android.graphics.PathEffect;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/goldenboot/saga/zone/SpanBlock;", "Lcom/goldenboot/saga/zone/ListenerStage;", "Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "growPayload", "Landroid/graphics/PathEffect;", "evictLayout", "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanBlock implements ListenerStage {

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final PathEffect nativePathEffect;

    public SpanBlock(PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    /* renamed from: evictLayout, reason: from getter */
    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
