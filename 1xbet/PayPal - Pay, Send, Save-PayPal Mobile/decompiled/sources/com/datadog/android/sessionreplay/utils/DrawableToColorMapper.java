package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "mapDrawableToColor", "(Landroid/graphics/drawable/Drawable;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Integer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DrawableToColorMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.utils.DrawableToColorMapper.Companion INSTANCE = com.datadog.android.sessionreplay.utils.DrawableToColorMapper.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Integer mapDrawableToColor(android.graphics.drawable.Drawable drawable, com.datadog.android.api.InternalLogger internalLogger);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper$Companion;", "", "<init>", "()V", "", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "customDrawableMappers", "getDefault", "(Ljava/util/List;)Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.sessionreplay.utils.DrawableToColorMapper.Companion getHighSpeedVideoFpsRanges = new com.datadog.android.sessionreplay.utils.DrawableToColorMapper.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.sessionreplay.utils.DrawableToColorMapper getDefault$default(com.datadog.android.sessionreplay.utils.DrawableToColorMapper.Companion companion, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            return companion.getDefault(list);
        }

        public final com.datadog.android.sessionreplay.utils.DrawableToColorMapper getDefault(java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> customDrawableMappers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customDrawableMappers, "");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper(customDrawableMappers);
            }
            return new com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper(customDrawableMappers);
        }
    }
}
