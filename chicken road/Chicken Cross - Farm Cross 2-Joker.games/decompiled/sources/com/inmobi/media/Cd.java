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
public final class Cd extends AbstractC3724g1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(CoroutineScope coroutineScope, Z9 z9) {
        super(coroutineScope, z9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = "Cd";
    }

    @Override // com.inmobi.media.AbstractC3724g1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a("NativeAdSessionManager", "initializeAdSession");
        }
        AbstractC4012q5.a(this.f7114a, new Bd(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z), Y0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }

    @Override // com.inmobi.media.AbstractC3724g1
    public final void a() {
        if (this.e == null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
        } else {
            AbstractC4012q5.a(this.f7114a, new E2(this, null));
        }
    }
}
