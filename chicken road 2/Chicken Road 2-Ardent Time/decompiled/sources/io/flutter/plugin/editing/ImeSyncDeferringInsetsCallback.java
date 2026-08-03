package io.flutter.plugin.editing;

@androidx.annotation.Keep
@android.annotation.SuppressLint({"NewApi", "Override"})
/* loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private io.flutter.plugin.editing.a imeVisibilityListener;
    private io.flutter.plugin.editing.b insetsListener;
    private android.view.WindowInsets lastWindowInsets;
    private boolean needsSave;
    private android.view.View view;

    @androidx.annotation.Keep
    public class AnimationCallback extends android.view.WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view != null) {
                        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
            android.view.View view = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view;
            java.lang.reflect.Field field = y.x.f8478a;
            y.Q a2 = y.AbstractC1029q.a(view);
            if (a2 == null || io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.imeVisibilityListener == null) {
                return;
            }
            boolean m2 = a2.f8448a.m(8);
            io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.imeVisibilityListener;
            if (m2) {
                iVar.getClass();
            } else {
                io.flutter.plugin.editing.j jVar = iVar.f7723a;
                jVar.f7725b.restartInput(jVar.f7724a);
            }
        }

        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            int i2;
            android.graphics.Insets insets;
            int i3;
            android.graphics.Insets of;
            android.view.WindowInsets build;
            int navigationBars;
            android.graphics.Insets insets2;
            int typeMask;
            if (io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.animating && !io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.needsSave) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    typeMask = P0.o.j(it.next()).getTypeMask();
                    if ((typeMask & io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                if (android.os.Build.VERSION.SDK_INT < 35 && (windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                    navigationBars = android.view.WindowInsets.Type.navigationBars();
                    insets2 = windowInsets.getInsets(navigationBars);
                    i2 = insets2.bottom;
                } else {
                    i2 = 0;
                }
                P0.AbstractC0051i.k();
                android.view.WindowInsets.Builder h2 = P0.AbstractC0051i.h(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                insets = windowInsets.getInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                i3 = insets.bottom;
                of = android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(i3 - i2, 0));
                h2.setInsets(io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                android.view.View view = io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.this.view;
                build = h2.build();
                view.onApplyWindowInsets(build);
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(android.view.View view) {
        int ime;
        ime = android.view.WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback();
        this.insetsListener = new io.flutter.plugin.editing.b(this);
    }

    public android.view.WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public io.flutter.plugin.editing.a getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public android.view.View.OnApplyWindowInsetsListener getInsetsListener() {
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

    public void setImeVisibilityListener(io.flutter.plugin.editing.a aVar) {
        this.imeVisibilityListener = aVar;
    }
}
