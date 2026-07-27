package com.bytedance.sdk.openadsdk.core.gbb;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class kj {
    public static qf pcc(View view, Set<ork> set) {
        AdSession pcc = pcc(CreativeType.VIDEO, set, Owner.NATIVE);
        return new vy(pcc, AdEvents.createAdEvents(pcc), view, MediaEvents.createMediaEvents(pcc));
    }

    public static qf pcc(WebView webView) {
        Partner pcc = vj.pcc();
        if (pcc == null) {
            throw new IllegalArgumentException("Parameter 'partner' may not be null.");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(pcc, webView, "", ""));
        return new qf(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
    }

    private static AdSession pcc(CreativeType creativeType, Set<ork> set, Owner owner) {
        List<VerificationScriptResource> pcc = pcc(set);
        pcc.isEmpty();
        Partner pcc2 = vj.pcc();
        if (pcc2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(pcc2, vj.sf(), pcc, "", ""));
    }

    private static List<VerificationScriptResource> pcc(Set<ork> set) {
        ArrayList arrayList = new ArrayList();
        for (ork orkVar : set) {
            if (!TextUtils.isEmpty(orkVar.pcc()) && !TextUtils.isEmpty(orkVar.sf())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(orkVar.pcc(), orkVar.gm(), orkVar.sf()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(orkVar.gm()));
        }
        return arrayList;
    }
}
