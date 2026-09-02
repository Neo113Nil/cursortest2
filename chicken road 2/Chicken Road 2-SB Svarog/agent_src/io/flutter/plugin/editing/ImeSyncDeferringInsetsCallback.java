package io.flutter.plugin.editing;

import F.AbstractC0011l;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.Iterator;
import java.util.List;
import m.r;

/* loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private a imeVisibilityListener;
    private b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;

    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                        ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
            View view = ImeSyncDeferringInsetsCallback.this.view;
            int i2 = m.d.f857a;
            r a2 = m.c.a(view);
            if (a2 == null || ImeSyncDeferringInsetsCallback.this.imeVisibilityListener == null) {
                return;
            }
            boolean m2 = a2.f881a.m(8);
            i iVar = (i) ImeSyncDeferringInsetsCallback.this.imeVisibilityListener;
            if (m2) {
                iVar.getClass();
            } else {
                l lVar = iVar.f640a;
                lVar.f647b.restartInput(lVar.f646a);
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i2;
            Insets insets;
            int i3;
            Insets of;
            WindowInsets build;
            int navigationBars;
            Insets insets2;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    typeMask = A.a.h(it.next()).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                    if (Build.VERSION.SDK_INT < 35 && (windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                        navigationBars = WindowInsets.Type.navigationBars();
                        insets2 = windowInsets.getInsets(navigationBars);
                        i2 = insets2.bottom;
                    } else {
                        i2 = 0;
                    }
                    AbstractC0011l.o();
                    WindowInsets.Builder m2 = AbstractC0011l.m(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                    i3 = insets.bottom;
                    of = Insets.of(0, 0, 0, Math.max(i3 - i2, 0));
                    m2.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                    View view = ImeSyncDeferringInsetsCallback.this.view;
                    build = m2.build();
                    view.onApplyWindowInsets(build);
                }
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        int ime;
        ime = WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b(this);
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public a getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }

    public void setImeVisibilityListener(a aVar) {
        this.imeVisibilityListener = aVar;
    }
}
