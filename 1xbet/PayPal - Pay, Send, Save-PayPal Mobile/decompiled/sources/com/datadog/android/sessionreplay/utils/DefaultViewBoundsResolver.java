package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/DefaultViewBoundsResolver;", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "<init>", "()V", "Landroid/view/View;", "view", "", "screenDensity", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveViewGlobalBounds", "(Landroid/view/View;F)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveViewPaddedBounds"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultViewBoundsResolver implements com.datadog.android.sessionreplay.utils.ViewBoundsResolver {
    public static final com.datadog.android.sessionreplay.utils.DefaultViewBoundsResolver INSTANCE = new com.datadog.android.sessionreplay.utils.DefaultViewBoundsResolver();

    private DefaultViewBoundsResolver() {
    }

    @Override // com.datadog.android.sessionreplay.utils.ViewBoundsResolver
    public final com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds(android.view.View view, float screenDensity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        float f = screenDensity != 0.0f ? 1.0f / screenDensity : 1.0f;
        view.getLocationOnScreen(new int[2]);
        return new com.datadog.android.sessionreplay.utils.GlobalBounds((long) (r13[0] * f), (long) (r13[1] * f), (long) (view.getWidth() * f), (long) (view.getHeight() * f));
    }

    @Override // com.datadog.android.sessionreplay.utils.ViewBoundsResolver
    public final com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewPaddedBounds(android.view.View view, float screenDensity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        float f = screenDensity != 0.0f ? 1.0f / screenDensity : 1.0f;
        view.getLocationOnScreen(new int[2]);
        return new com.datadog.android.sessionreplay.utils.GlobalBounds((long) ((r13[0] + view.getPaddingLeft()) * f), (long) ((r13[1] + view.getPaddingTop()) * f), (long) (((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) * f), (long) (((view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom()) * f));
    }
}
