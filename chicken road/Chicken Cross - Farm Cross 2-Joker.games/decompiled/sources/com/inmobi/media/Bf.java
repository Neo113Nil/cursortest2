package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Bf extends U2 {
    public static final /* synthetic */ int i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(CoroutineScope coroutineScope, Y9 y9) {
        super(coroutineScope, y9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC3724g1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        AbstractC4012q5.a(this.f7114a, new Af(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z), Y0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }
}
