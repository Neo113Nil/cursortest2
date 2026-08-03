package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Kc extends com.inmobi.media.AbstractC2367e1 {
    public static final /* synthetic */ int h = 0;
    public final java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kc(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2799u9 c2799u9) {
        super(coroutineScope, c2799u9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = "Kc";
    }

    @Override // com.inmobi.media.AbstractC2367e1
    public final void a(java.lang.String omsdkScript, java.util.List omidTrackers, java.util.Map macros, java.lang.String str, java.lang.String customReferenceData, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeAdSessionManager", "initializeAdSession");
        }
        com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.Jc(this, com.iab.omid.library.inmobi.adsession.AdSessionConfiguration.createAdSessionConfiguration(com.iab.omid.library.inmobi.adsession.CreativeType.NATIVE_DISPLAY, com.iab.omid.library.inmobi.adsession.ImpressionType.VIEWABLE, com.iab.omid.library.inmobi.adsession.Owner.NATIVE, com.iab.omid.library.inmobi.adsession.Owner.NONE, z), com.inmobi.media.W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }

    @Override // com.inmobi.media.AbstractC2367e1
    public final void a() {
        if (this.e == null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
        } else {
            com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.C2474i2(this, null));
        }
    }
}
