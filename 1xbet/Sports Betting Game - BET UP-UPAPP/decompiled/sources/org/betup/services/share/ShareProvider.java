package org.betup.services.share;

import android.content.Intent;
import org.betup.bus.ShareMessage;

/* loaded from: classes2.dex */
public interface ShareProvider {
    boolean onActivityResult(int requestCode, int resultCode, Intent data);

    void share(final ShareMessage shareMessage);
}
