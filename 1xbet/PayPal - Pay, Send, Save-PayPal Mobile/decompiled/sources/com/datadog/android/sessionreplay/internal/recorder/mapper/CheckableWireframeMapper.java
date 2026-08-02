package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\f\b\u0000\u0010\u0003*\u00020\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b!\u0010\u0019J'\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/CheckableWireframeMapper;", "Landroid/view/View;", "Landroid/widget/Checkable;", "T", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseWireframeMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "inputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "mapInputPrivacyToImagePrivacy", "(Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;)Lcom/datadog/android/sessionreplay/ImagePrivacy;", "resolveCheckable", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;)Ljava/util/List;", "resolveMainWireframes", "resolveMaskedCheckable", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CheckableWireframeMapper<T extends android.view.View & android.widget.Checkable> extends com.datadog.android.sessionreplay.recorder.mapper.BaseWireframeMapper<T> {
    public abstract java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveCheckable(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback);

    public abstract java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveMainWireframes(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger);

    public abstract java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveMaskedCheckable(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveCheckable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> resolveMainWireframes = resolveMainWireframes(view, mappingContext, asyncJobStatusCallback, internalLogger);
        if (mappingContext.getTextAndInputPrivacy() != com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS) {
            resolveCheckable = resolveMaskedCheckable(view, mappingContext);
        } else {
            resolveCheckable = resolveCheckable(view, mappingContext, asyncJobStatusCallback);
        }
        return resolveCheckable != null ? kotlin.collections.CollectionsKt.plus((java.util.Collection) resolveMainWireframes, (java.lang.Iterable) resolveCheckable) : resolveMainWireframes;
    }

    protected final com.datadog.android.sessionreplay.ImagePrivacy mapInputPrivacyToImagePrivacy(com.datadog.android.sessionreplay.TextAndInputPrivacy inputPrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputPrivacy, "");
        int i = com.datadog.android.sessionreplay.internal.recorder.mapper.CheckableWireframeMapper.WhenMappings.$EnumSwitchMapping$0[inputPrivacy.ordinal()];
        if (i == 1) {
            return com.datadog.android.sessionreplay.ImagePrivacy.MASK_NONE;
        }
        if (i == 2 || i == 3) {
            return com.datadog.android.sessionreplay.ImagePrivacy.MASK_ALL;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.sessionreplay.TextAndInputPrivacy.values().length];
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL_INPUTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
