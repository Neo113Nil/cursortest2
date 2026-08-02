package org.betup.services.offer;

import android.os.Bundle;

/* loaded from: classes2.dex */
public interface Offer {
    void init();

    boolean isLoaded();

    void pause();

    void resume();

    boolean show(Bundle bundle, String placementId);
}
