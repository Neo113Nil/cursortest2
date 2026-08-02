package com.datadog.android.sessionreplay.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/resources/DefaultDrawableCopier;", "Lcom/datadog/android/sessionreplay/recorder/resources/DrawableCopier;", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "originalDrawable", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "copy", "(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultDrawableCopier implements com.datadog.android.sessionreplay.recorder.resources.DrawableCopier {
    @Override // com.datadog.android.sessionreplay.recorder.resources.DrawableCopier
    public final android.graphics.drawable.Drawable copy(android.graphics.drawable.Drawable originalDrawable, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalDrawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        android.graphics.drawable.Drawable.ConstantState constantState = originalDrawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable(resources);
        }
        return null;
    }
}
