package com.datadog.android.sessionreplay.recorder;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001b"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "systemInformation", "Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;", "imageWireframeHelper", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "", "hasOptionSelectorParent", "Lcom/datadog/android/sessionreplay/recorder/InteropViewCallback;", "interopViewCallback", "<init>", "(Lcom/datadog/android/sessionreplay/recorder/SystemInformation;Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;ZLcom/datadog/android/sessionreplay/recorder/InteropViewCallback;)V", "component1", "()Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "component2", "()Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;", "component3", "()Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "component4", "()Lcom/datadog/android/sessionreplay/ImagePrivacy;", "component5", "()Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "component6", "()Z", "component7", "()Lcom/datadog/android/sessionreplay/recorder/InteropViewCallback;", "copy", "(Lcom/datadog/android/sessionreplay/recorder/SystemInformation;Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;ZLcom/datadog/android/sessionreplay/recorder/InteropViewCallback;)Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getHasOptionSelectorParent", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getImagePrivacy", "Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;", "getImageWireframeHelper", "Lcom/datadog/android/sessionreplay/recorder/InteropViewCallback;", "getInteropViewCallback", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "getSystemInformation", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getTextAndInputPrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "getTouchPrivacyManager"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MappingContext {
    private final boolean hasOptionSelectorParent;
    private final com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy;
    private final com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper;
    private final com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback;
    private final com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation;
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy;
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager;

    public MappingContext(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, boolean z, com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageWireframeHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interopViewCallback, "");
        this.systemInformation = systemInformation;
        this.imageWireframeHelper = imageWireframeHelper;
        this.textAndInputPrivacy = textAndInputPrivacy;
        this.imagePrivacy = imagePrivacy;
        this.touchPrivacyManager = touchPrivacyManager;
        this.hasOptionSelectorParent = z;
        this.interopViewCallback = interopViewCallback;
    }

    public /* synthetic */ MappingContext(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, boolean z, com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(systemInformation, imageWireframeHelper, textAndInputPrivacy, imagePrivacy, touchPrivacyManager, (i & 32) != 0 ? false : z, interopViewCallback);
    }

    public final com.datadog.android.sessionreplay.recorder.SystemInformation getSystemInformation() {
        return this.systemInformation;
    }

    public final com.datadog.android.sessionreplay.utils.ImageWireframeHelper getImageWireframeHelper() {
        return this.imageWireframeHelper;
    }

    public final com.datadog.android.sessionreplay.TextAndInputPrivacy getTextAndInputPrivacy() {
        return this.textAndInputPrivacy;
    }

    public final com.datadog.android.sessionreplay.ImagePrivacy getImagePrivacy() {
        return this.imagePrivacy;
    }

    public final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getTouchPrivacyManager() {
        return this.touchPrivacyManager;
    }

    public final boolean getHasOptionSelectorParent() {
        return this.hasOptionSelectorParent;
    }

    public final com.datadog.android.sessionreplay.recorder.InteropViewCallback getInteropViewCallback() {
        return this.interopViewCallback;
    }

    public final java.lang.String toString() {
        com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation = this.systemInformation;
        com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper = this.imageWireframeHelper;
        com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy = this.textAndInputPrivacy;
        com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy = this.imagePrivacy;
        com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager = this.touchPrivacyManager;
        boolean z = this.hasOptionSelectorParent;
        com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback = this.interopViewCallback;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MappingContext(systemInformation=");
        sb.append(systemInformation);
        sb.append(", imageWireframeHelper=");
        sb.append(imageWireframeHelper);
        sb.append(", textAndInputPrivacy=");
        sb.append(textAndInputPrivacy);
        sb.append(", imagePrivacy=");
        sb.append(imagePrivacy);
        sb.append(", touchPrivacyManager=");
        sb.append(touchPrivacyManager);
        sb.append(", hasOptionSelectorParent=");
        sb.append(z);
        sb.append(", interopViewCallback=");
        sb.append(interopViewCallback);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.systemInformation.hashCode() * 31) + this.imageWireframeHelper.hashCode()) * 31) + this.textAndInputPrivacy.hashCode()) * 31) + this.imagePrivacy.hashCode()) * 31) + this.touchPrivacyManager.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasOptionSelectorParent)) * 31) + this.interopViewCallback.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.recorder.MappingContext)) {
            return false;
        }
        com.datadog.android.sessionreplay.recorder.MappingContext mappingContext = (com.datadog.android.sessionreplay.recorder.MappingContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.systemInformation, mappingContext.systemInformation) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageWireframeHelper, mappingContext.imageWireframeHelper) && this.textAndInputPrivacy == mappingContext.textAndInputPrivacy && this.imagePrivacy == mappingContext.imagePrivacy && kotlin.jvm.internal.Intrinsics.areEqual(this.touchPrivacyManager, mappingContext.touchPrivacyManager) && this.hasOptionSelectorParent == mappingContext.hasOptionSelectorParent && kotlin.jvm.internal.Intrinsics.areEqual(this.interopViewCallback, mappingContext.interopViewCallback);
    }

    public final com.datadog.android.sessionreplay.recorder.MappingContext copy(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, boolean hasOptionSelectorParent, com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageWireframeHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interopViewCallback, "");
        return new com.datadog.android.sessionreplay.recorder.MappingContext(systemInformation, imageWireframeHelper, textAndInputPrivacy, imagePrivacy, touchPrivacyManager, hasOptionSelectorParent, interopViewCallback);
    }

    /* renamed from: component7, reason: from getter */
    public final com.datadog.android.sessionreplay.recorder.InteropViewCallback getInteropViewCallback() {
        return this.interopViewCallback;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasOptionSelectorParent() {
        return this.hasOptionSelectorParent;
    }

    /* renamed from: component5, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getTouchPrivacyManager() {
        return this.touchPrivacyManager;
    }

    /* renamed from: component4, reason: from getter */
    public final com.datadog.android.sessionreplay.ImagePrivacy getImagePrivacy() {
        return this.imagePrivacy;
    }

    /* renamed from: component3, reason: from getter */
    public final com.datadog.android.sessionreplay.TextAndInputPrivacy getTextAndInputPrivacy() {
        return this.textAndInputPrivacy;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.sessionreplay.utils.ImageWireframeHelper getImageWireframeHelper() {
        return this.imageWireframeHelper;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.sessionreplay.recorder.SystemInformation getSystemInformation() {
        return this.systemInformation;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.recorder.MappingContext copy$default(com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, boolean z, com.datadog.android.sessionreplay.recorder.InteropViewCallback interopViewCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            systemInformation = mappingContext.systemInformation;
        }
        if ((i & 2) != 0) {
            imageWireframeHelper = mappingContext.imageWireframeHelper;
        }
        com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper2 = imageWireframeHelper;
        if ((i & 4) != 0) {
            textAndInputPrivacy = mappingContext.textAndInputPrivacy;
        }
        com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy2 = textAndInputPrivacy;
        if ((i & 8) != 0) {
            imagePrivacy = mappingContext.imagePrivacy;
        }
        com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy2 = imagePrivacy;
        if ((i & 16) != 0) {
            touchPrivacyManager = mappingContext.touchPrivacyManager;
        }
        com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager2 = touchPrivacyManager;
        if ((i & 32) != 0) {
            z = mappingContext.hasOptionSelectorParent;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            interopViewCallback = mappingContext.interopViewCallback;
        }
        return mappingContext.copy(systemInformation, imageWireframeHelper2, textAndInputPrivacy2, imagePrivacy2, touchPrivacyManager2, z2, interopViewCallback);
    }
}
