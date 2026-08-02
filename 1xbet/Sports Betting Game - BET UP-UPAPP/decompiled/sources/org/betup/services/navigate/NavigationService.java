package org.betup.services.navigate;

import org.betup.bus.NavigateMessage;
import org.betup.ui.base.BaseActivity;

/* loaded from: classes2.dex */
public interface NavigationService<T> {
    void processNavigation(BaseActivity activity, NavigateMessage<T> navigateMessage);
}
