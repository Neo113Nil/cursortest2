package com.goldenboot.saga.zone;

import android.graphics.BlendModeColorFilter;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/goldenboot/saga/zone/LocalReducer;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/ContainerSource;", "color", "Landroidx/compose/ui/graphics/FeedbackFlow;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "evictLayout", "(JI)Landroid/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "Lcom/goldenboot/saga/zone/IconAdapter;", "growPayload", "(Landroid/graphics/BlendModeColorFilter;)Lcom/goldenboot/saga/zone/IconAdapter;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LocalReducer {
    public static final LocalReducer evictLayout = new LocalReducer();

    private LocalReducer() {
    }

    public final BlendModeColorFilter evictLayout(long color, int blendMode) {
        return new BlendModeColorFilter(BoxSaver.inflateAdapter(color), androidx.compose.ui.graphics.ActivityMutator.growPayload(blendMode));
    }

    public final BlendModeColorFilter growPayload(BlendModeColorFilter androidBlendModeColorFilter) {
        return new BlendModeColorFilter(BoxSaver.growPayload(androidBlendModeColorFilter.getColor()), androidx.compose.ui.graphics.ActivityMutator.injectMetric(androidBlendModeColorFilter.getMode()), androidBlendModeColorFilter, null);
    }
}
