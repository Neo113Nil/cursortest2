package org.betup.services.menu;

import android.app.Activity;
import java.util.List;

/* loaded from: classes2.dex */
public interface BottomMenuProvider {
    List<BottomMenuItem> buildMenu(Activity activity);
}
