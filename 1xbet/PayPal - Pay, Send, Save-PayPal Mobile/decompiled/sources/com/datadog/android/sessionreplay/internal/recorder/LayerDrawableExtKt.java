package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/graphics/drawable/LayerDrawable;", "", "index", "Lcom/datadog/android/api/InternalLogger;", "logger", "Landroid/graphics/drawable/Drawable;", "safeGetDrawable", "(Landroid/graphics/drawable/LayerDrawable;ILcom/datadog/android/api/InternalLogger;)Landroid/graphics/drawable/Drawable;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LayerDrawableExtKt {
    public static /* synthetic */ android.graphics.drawable.Drawable safeGetDrawable$default(android.graphics.drawable.LayerDrawable layerDrawable, int i, com.datadog.android.api.InternalLogger internalLogger, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            internalLogger = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        }
        return safeGetDrawable(layerDrawable, i, internalLogger);
    }

    public static final android.graphics.drawable.Drawable safeGetDrawable(android.graphics.drawable.LayerDrawable layerDrawable, final int i, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layerDrawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (i < 0 || i >= layerDrawable.getNumberOfLayers()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.LayerDrawableExtKt$safeGetDrawable$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to get drawable from layer - invalid index passed: ".concat(java.lang.String.valueOf(i));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return null;
        }
        return layerDrawable.getDrawable(i);
    }
}
