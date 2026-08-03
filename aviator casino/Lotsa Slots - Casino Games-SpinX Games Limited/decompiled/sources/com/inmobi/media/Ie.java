package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ie extends com.inmobi.media.AbstractC2895y2 {
    public static final /* synthetic */ int i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(coroutineScope, interfaceC2772t9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC2367e1
    public final void a(java.lang.String omsdkScript, java.util.List omidTrackers, java.util.Map macros, java.lang.String str, java.lang.String customReferenceData, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        com.iab.omid.library.inmobi.adsession.CreativeType creativeType = com.iab.omid.library.inmobi.adsession.CreativeType.VIDEO;
        com.iab.omid.library.inmobi.adsession.ImpressionType impressionType = com.iab.omid.library.inmobi.adsession.ImpressionType.VIEWABLE;
        com.iab.omid.library.inmobi.adsession.Owner owner = com.iab.omid.library.inmobi.adsession.Owner.NATIVE;
        com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.He(this, com.iab.omid.library.inmobi.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z), com.inmobi.media.W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }
}
