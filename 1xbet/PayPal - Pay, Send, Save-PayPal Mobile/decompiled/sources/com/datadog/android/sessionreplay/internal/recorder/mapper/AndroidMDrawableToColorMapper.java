package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/AndroidMDrawableToColorMapper;", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "", "extensionMappers", "<init>", "(Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "mapDrawableToColor", "(Landroid/graphics/drawable/Drawable;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Integer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "alpha", "mergeColorAndAlpha", "(II)I", "Landroid/graphics/drawable/ColorDrawable;", "resolveColorDrawable", "(Landroid/graphics/drawable/ColorDrawable;)Ljava/lang/Integer;", "Landroid/graphics/drawable/GradientDrawable;", "resolveGradientDrawable", "(Landroid/graphics/drawable/GradientDrawable;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Integer;", "Landroid/graphics/drawable/LayerDrawable;", "Lkotlin/Function2;", "", "predicate", "resolveLayerDrawable", "(Landroid/graphics/drawable/LayerDrawable;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function2;)Ljava/lang/Integer;", "Landroid/graphics/drawable/ShapeDrawable;", "resolveShapeDrawable", "(Landroid/graphics/drawable/ShapeDrawable;Lcom/datadog/android/api/InternalLogger;)I", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class AndroidMDrawableToColorMapper implements com.datadog.android.sessionreplay.utils.DrawableToColorMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper.Companion(0 == true ? 1 : 0);
    private static final java.lang.reflect.Field fillPaintField;
    private static final java.lang.reflect.Field mColorField;
    private final java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> getHighSpeedVideoFpsRangesFor;

    protected final int mergeColorAndAlpha(int color, int alpha) {
        return (int) ((alpha << 24) | (color & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidMDrawableToColorMapper(java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    public /* synthetic */ AndroidMDrawableToColorMapper(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    @Override // com.datadog.android.sessionreplay.utils.DrawableToColorMapper
    public java.lang.Integer mapDrawableToColor(android.graphics.drawable.Drawable drawable, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            java.lang.Integer mapDrawableToColor = ((com.datadog.android.sessionreplay.utils.DrawableToColorMapper) it.next()).mapDrawableToColor(drawable, internalLogger);
            if (mapDrawableToColor != null) {
                return mapDrawableToColor;
            }
        }
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return resolveColorDrawable((android.graphics.drawable.ColorDrawable) drawable);
        }
        if (!(drawable instanceof android.graphics.drawable.RippleDrawable)) {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                return resolveLayerDrawable$default(this, (android.graphics.drawable.LayerDrawable) drawable, internalLogger, null, 4, null);
            }
            if (!(drawable instanceof android.graphics.drawable.InsetDrawable)) {
                if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                    return resolveGradientDrawable((android.graphics.drawable.GradientDrawable) drawable, internalLogger);
                }
                if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                    return java.lang.Integer.valueOf(resolveShapeDrawable((android.graphics.drawable.ShapeDrawable) drawable, internalLogger));
                }
                if (!(drawable instanceof android.graphics.drawable.StateListDrawable)) {
                    if ((drawable instanceof android.graphics.drawable.BitmapDrawable) || (drawable instanceof android.graphics.drawable.VectorDrawable)) {
                        return null;
                    }
                    final java.lang.String canonicalName = drawable.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = drawable.getClass().getName();
                    }
                    internalLogger.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.TELEMETRY, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper$mapDrawableToColor$result$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "No mapper found for drawable ".concat(java.lang.String.valueOf(canonicalName));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, true, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("replay.drawable.type", canonicalName)));
                    return null;
                }
                android.graphics.drawable.Drawable current = ((android.graphics.drawable.StateListDrawable) drawable).getCurrent();
                if (current != null) {
                    return mapDrawableToColor(current, internalLogger);
                }
                return null;
            }
            android.graphics.drawable.Drawable drawable2 = ((android.graphics.drawable.InsetDrawable) drawable).getDrawable();
            if (drawable2 != null) {
                return mapDrawableToColor(drawable2, internalLogger);
            }
            return null;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = (android.graphics.drawable.RippleDrawable) drawable;
        final int findIndexByLayerId = rippleDrawable.findIndexByLayerId(android.R.id.mask);
        return resolveLayerDrawable(rippleDrawable, internalLogger, new kotlin.jvm.functions.Function2<java.lang.Integer, android.graphics.drawable.Drawable, java.lang.Boolean>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper$resolveRippleDrawable$1
            public final java.lang.Boolean getHighSpeedVideoSizes(int i, android.graphics.drawable.Drawable drawable3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable3, "");
                return java.lang.Boolean.valueOf(i != findIndexByLayerId);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, android.graphics.drawable.Drawable drawable3) {
                return getHighSpeedVideoSizes(num.intValue(), drawable3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    protected int resolveShapeDrawable(android.graphics.drawable.ShapeDrawable drawable, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return drawable.getPaint().getColor();
    }

    protected java.lang.Integer resolveColorDrawable(android.graphics.drawable.ColorDrawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        return java.lang.Integer.valueOf(mergeColorAndAlpha(drawable.getColor(), drawable.getAlpha()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Integer resolveLayerDrawable$default(com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper androidMDrawableToColorMapper, android.graphics.drawable.LayerDrawable layerDrawable, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveLayerDrawable");
        }
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2<java.lang.Integer, android.graphics.drawable.Drawable, java.lang.Boolean>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper$resolveLayerDrawable$1
                public final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI(int i2, android.graphics.drawable.Drawable drawable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
                    return java.lang.Boolean.TRUE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
                    return getHighResolutionOutputSizeshNQ4ISI(num.intValue(), drawable);
                }
            };
        }
        return androidMDrawableToColorMapper.resolveLayerDrawable(layerDrawable, internalLogger, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.Integer resolveLayerDrawable(android.graphics.drawable.LayerDrawable drawable, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.graphics.drawable.Drawable, java.lang.Boolean> predicate) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, drawable.getNumberOfLayers());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            android.graphics.drawable.Drawable drawable2 = drawable.getDrawable(nextInt);
            if (drawable2 != null && predicate.invoke(java.lang.Integer.valueOf(nextInt), drawable2).booleanValue()) {
                num = mapDrawableToColor(drawable2, internalLogger);
            }
            arrayList.add(num);
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (((java.lang.Integer) next) != null) {
                num = next;
                break;
            }
        }
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.lang.Integer resolveGradientDrawable(android.graphics.drawable.GradientDrawable drawable, com.datadog.android.api.InternalLogger internalLogger) {
        android.graphics.Paint paint;
        int color;
        int alpha;
        android.graphics.ColorFilter colorFilter;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            java.lang.reflect.Field field = fillPaintField;
            obj = field != null ? field.get(drawable) : null;
        } catch (java.lang.ExceptionInInitializerError | java.lang.IllegalAccessException | java.lang.IllegalArgumentException unused) {
        }
        if (obj instanceof android.graphics.Paint) {
            paint = (android.graphics.Paint) obj;
            if (paint != null) {
                return null;
            }
            try {
                colorFilter = paint.getColorFilter();
            } catch (java.lang.IllegalAccessException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper$resolveGradientDrawable$filterColor$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to read ColorFilter.mColorField field through reflection";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                color = paint.getColor();
            } catch (java.lang.IllegalArgumentException e2) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper$resolveGradientDrawable$filterColor$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to read ColorFilter.mColorField field through reflection";
                    }
                }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
                color = paint.getColor();
            }
            if (colorFilter != null) {
                java.lang.reflect.Field field2 = mColorField;
                java.lang.Object obj2 = field2 != null ? field2.get(colorFilter) : null;
                java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
                if (num != null) {
                    color = num.intValue();
                    alpha = (paint.getAlpha() * drawable.getAlpha()) / 255;
                    if (alpha != 0) {
                        return null;
                    }
                    return java.lang.Integer.valueOf(mergeColorAndAlpha(color, alpha));
                }
            }
            color = paint.getColor();
            alpha = (paint.getAlpha() * drawable.getAlpha()) / 255;
            if (alpha != 0) {
            }
        }
        paint = null;
        if (paint != null) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/AndroidMDrawableToColorMapper$Companion;", "", "<init>", "()V", "Ljava/lang/reflect/Field;", "fillPaintField", "Ljava/lang/reflect/Field;", "getFillPaintField$dd_sdk_android_session_replay_release", "()Ljava/lang/reflect/Field;", "getFillPaintField$dd_sdk_android_session_replay_release$annotations", "mColorField", "getMColorField$dd_sdk_android_session_replay_release", "getMColorField$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getFillPaintField$dd_sdk_android_session_replay_release$annotations() {
        }

        public static /* synthetic */ void getMColorField$dd_sdk_android_session_replay_release$annotations() {
        }

        private Companion() {
        }

        public final java.lang.reflect.Field getFillPaintField$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper.fillPaintField;
        }

        public final java.lang.reflect.Field getMColorField$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper.mColorField;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2 = null;
        try {
            field = android.graphics.drawable.GradientDrawable.class.getDeclaredField("mFillPaint");
            field.setAccessible(true);
        } catch (java.lang.NoSuchFieldException | java.lang.NullPointerException | java.lang.SecurityException unused) {
            field = null;
        }
        fillPaintField = field;
        try {
            java.lang.reflect.Field declaredField = android.graphics.PorterDuffColorFilter.class.getDeclaredField("mColor");
            declaredField.setAccessible(true);
            field2 = declaredField;
        } catch (java.lang.NoSuchFieldException | java.lang.NullPointerException | java.lang.SecurityException unused2) {
        }
        mColorField = field2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidMDrawableToColorMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
