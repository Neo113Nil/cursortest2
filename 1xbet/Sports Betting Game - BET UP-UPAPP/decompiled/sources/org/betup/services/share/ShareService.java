package org.betup.services.share;

import android.content.Intent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.betup.bus.ShareMessage;

/* loaded from: classes2.dex */
public class ShareService {
    private final ShareProviderFactory factory;
    private Map<ShareMessage.Target, ShareProvider> providerMap = new HashMap();

    public ShareService(ShareProviderFactory factory) {
        this.factory = factory;
        init();
    }

    public void makeShare(ShareMessage shareMessage) {
        ShareProvider shareProvider = this.providerMap.get(shareMessage.getTarget());
        if (shareProvider != null) {
            shareProvider.share(shareMessage);
        }
    }

    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator<Map.Entry<ShareMessage.Target, ShareProvider>> it = this.providerMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityResult(requestCode, resultCode, data);
        }
        return true;
    }

    private void init() {
        this.providerMap.put(ShareMessage.Target.FACEBOOK, this.factory.createShareProvider(ShareMessage.Target.FACEBOOK));
        this.providerMap.put(ShareMessage.Target.VK, this.factory.createShareProvider(ShareMessage.Target.VK));
        this.providerMap.put(ShareMessage.Target.FIREBASE, this.factory.createShareProvider(ShareMessage.Target.FIREBASE));
        this.providerMap.put(ShareMessage.Target.OTHER, this.factory.createShareProvider(ShareMessage.Target.OTHER));
    }
}
