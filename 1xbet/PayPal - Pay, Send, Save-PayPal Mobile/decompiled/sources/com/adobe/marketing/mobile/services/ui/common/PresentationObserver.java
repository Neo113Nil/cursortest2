package com.adobe.marketing.mobile.services.ui.common;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000bR*\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/PresentationObserver;", "", "<init>", "()V", "", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", "getVisiblePresentations$core_phoneRelease", "()Ljava/util/List;", "presentation", "", "onPresentationInvisible$core_phoneRelease", "(Lcom/adobe/marketing/mobile/services/ui/Presentation;)V", "onPresentationVisible$core_phoneRelease", "", "", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class PresentationObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.services.ui.common.PresentationObserver.Companion INSTANCE = new com.adobe.marketing.mobile.services.ui.common.PresentationObserver.Companion(null);
    private static final kotlin.Lazy<com.adobe.marketing.mobile.services.ui.common.PresentationObserver> INSTANCE$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.services.ui.common.PresentationObserver>() { // from class: com.adobe.marketing.mobile.services.ui.common.PresentationObserver$Companion$INSTANCE$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final com.adobe.marketing.mobile.services.ui.common.PresentationObserver invoke() {
            return new com.adobe.marketing.mobile.services.ui.common.PresentationObserver(null);
        }
    });

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.adobe.marketing.mobile.services.ui.Presentation<?>>> Camera2StreamConfigurationMap;

    private PresentationObserver() {
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/PresentationObserver$Companion;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/common/PresentationObserver;", "INSTANCE$delegate", "Lkotlin/Lazy;", "getINSTANCE$core_phoneRelease", "()Lcom/adobe/marketing/mobile/services/ui/common/PresentationObserver;", "INSTANCE"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.adobe.marketing.mobile.services.ui.common.PresentationObserver getINSTANCE$core_phoneRelease() {
            return (com.adobe.marketing.mobile.services.ui.common.PresentationObserver) com.adobe.marketing.mobile.services.ui.common.PresentationObserver.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onPresentationVisible$core_phoneRelease(com.adobe.marketing.mobile.services.ui.Presentation<?> presentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentation, "");
        this.Camera2StreamConfigurationMap.put(presentation.getId(), new java.lang.ref.WeakReference<>(presentation));
    }

    public final void onPresentationInvisible$core_phoneRelease(com.adobe.marketing.mobile.services.ui.Presentation<?> presentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentation, "");
        this.Camera2StreamConfigurationMap.remove(presentation.getId());
    }

    public final java.util.List<com.adobe.marketing.mobile.services.ui.Presentation<?>> getVisiblePresentations$core_phoneRelease() {
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.adobe.marketing.mobile.services.ui.Presentation<?>>> map = this.Camera2StreamConfigurationMap;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.ref.WeakReference<com.adobe.marketing.mobile.services.ui.Presentation<?>>> entry : map.entrySet()) {
            if (entry.getValue().get() == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.Camera2StreamConfigurationMap.remove((java.lang.String) it.next());
        }
        java.util.Collection<java.lang.ref.WeakReference<com.adobe.marketing.mobile.services.ui.Presentation<?>>> values = this.Camera2StreamConfigurationMap.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = values.iterator();
        while (it2.hasNext()) {
            com.adobe.marketing.mobile.services.ui.Presentation presentation = (com.adobe.marketing.mobile.services.ui.Presentation) ((java.lang.ref.WeakReference) it2.next()).get();
            if (presentation != null) {
                arrayList.add(presentation);
            }
        }
        return arrayList;
    }

    public /* synthetic */ PresentationObserver(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
