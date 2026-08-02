package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "", "Landroid/view/View;", "view", "", "screenDensity", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveViewGlobalBounds", "(Landroid/view/View;F)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveViewPaddedBounds"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ViewBoundsResolver {
    com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds(android.view.View view, float screenDensity);

    com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewPaddedBounds(android.view.View view, float screenDensity);
}
