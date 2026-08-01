package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC4874c;
import com.unity3d.player.a.AbstractC4890t;

/* loaded from: classes7.dex */
public final class X implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC4874c.b;
            if (progressBar != null) {
                if (AbstractC4874c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC4874c.b);
                        viewGroup.removeView(AbstractC4874c.c);
                    }
                    AbstractC4874c.b = null;
                    AbstractC4874c.c = null;
                }
                AbstractC4874c.d = -1;
            }
        } catch (Exception e) {
            AbstractC4890t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
