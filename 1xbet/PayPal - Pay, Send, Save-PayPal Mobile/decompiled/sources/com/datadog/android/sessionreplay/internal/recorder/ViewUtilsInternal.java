package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/ViewUtilsInternal;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "isNotVisible$dd_sdk_android_session_replay_release", "(Landroid/view/View;)Z", "isOnSecondaryDisplay$dd_sdk_android_session_replay_release", "isSystemNoise$dd_sdk_android_session_replay_release", "isToolbar$dd_sdk_android_session_replay_release", "Landroid/graphics/drawable/Drawable;", "drawable", "", "pixelsDensity", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/DefaultImageWireframeHelper$CompoundDrawablePositions;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveCompoundDrawableBounds$dd_sdk_android_session_replay_release", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;FLcom/datadog/android/sessionreplay/internal/recorder/resources/DefaultImageWireframeHelper$CompoundDrawablePositions;)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "resolveDrawableBounds$dd_sdk_android_session_replay_release", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;F)Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewUtilsInternal {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Set<? extends java.lang.Integer>>() { // from class: com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal$systemViewIds$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.util.Set<java.lang.Integer> invoke() {
            return kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(android.R.id.navigationBarBackground), java.lang.Integer.valueOf(android.R.id.statusBarBackground)});
        }
    });

    public final boolean isNotVisible$dd_sdk_android_session_replay_release(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return !view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0;
    }

    public final boolean isOnSecondaryDisplay$dd_sdk_android_session_replay_release(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.Display display = view.getDisplay();
        return (display == null || display.getDisplayId() == 0 || display.getDisplayId() == -1) ? false : true;
    }

    public final boolean isToolbar$dd_sdk_android_session_replay_release(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return androidx.appcompat.widget.Toolbar.class.isAssignableFrom(view.getClass()) || android.widget.Toolbar.class.isAssignableFrom(view.getClass());
    }

    public final com.datadog.android.sessionreplay.utils.GlobalBounds resolveDrawableBounds$dd_sdk_android_session_replay_release(android.view.View view, android.graphics.drawable.Drawable drawable, float pixelsDensity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        view.getLocationOnScreen(new int[2]);
        return new com.datadog.android.sessionreplay.utils.GlobalBounds(com.datadog.android.internal.utils.IntExtKt.densityNormalized(r0[0], pixelsDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(r0[1], pixelsDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicWidth(), pixelsDensity), com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicHeight(), pixelsDensity));
    }

    public final com.datadog.android.sessionreplay.utils.GlobalBounds resolveCompoundDrawableBounds$dd_sdk_android_session_replay_release(android.view.View view, android.graphics.drawable.Drawable drawable, float pixelsDensity, com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions position) {
        long j;
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        long densityNormalized = com.datadog.android.internal.utils.IntExtKt.densityNormalized(iArr[0], pixelsDensity);
        long densityNormalized2 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(iArr[1], pixelsDensity);
        long densityNormalized3 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicWidth(), pixelsDensity);
        long densityNormalized4 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicHeight(), pixelsDensity);
        long densityNormalized5 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getWidth(), pixelsDensity);
        long densityNormalized6 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getHeight(), pixelsDensity);
        long densityNormalized7 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getPaddingStart(), pixelsDensity);
        long densityNormalized8 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getPaddingTop(), pixelsDensity);
        long densityNormalized9 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getPaddingBottom(), pixelsDensity);
        long densityNormalized10 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getPaddingEnd(), pixelsDensity);
        int i = com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal.WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i != 1) {
            if (i == 2) {
                j2 = (densityNormalized5 / 2) - (densityNormalized3 / 2);
                j = densityNormalized8;
            } else if (i == 3) {
                densityNormalized7 = densityNormalized5 - (densityNormalized10 + densityNormalized3);
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                j2 = (densityNormalized5 / 2) - (densityNormalized3 / 2);
                j = densityNormalized6 - (densityNormalized9 + densityNormalized4);
            }
            return new com.datadog.android.sessionreplay.utils.GlobalBounds(j2 + densityNormalized, j + densityNormalized2, densityNormalized3, densityNormalized4);
        }
        j = (densityNormalized6 / 2) - (densityNormalized4 / 2);
        j2 = densityNormalized7;
        return new com.datadog.android.sessionreplay.utils.GlobalBounds(j2 + densityNormalized, j + densityNormalized2, densityNormalized3, densityNormalized4);
    }

    public final boolean isSystemNoise$dd_sdk_android_session_replay_release(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return ((java.util.Set) this.Camera2StreamConfigurationMap.getValue()).contains(java.lang.Integer.valueOf(view.getId())) || (view instanceof android.view.ViewStub) || (view instanceof androidx.appcompat.widget.ActionBarContextView);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions.values().length];
            try {
                iArr[com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.CompoundDrawablePositions.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
