package com.goldenboot.saga.zone;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class StatePort {
    public final LayerUseCase evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler extends ActivityMutator {
        public BounceHandler(Window window, StatePort statePort, AnimMaker animMaker) {
            super(window, statePort, animMaker);
        }

        @Override // com.goldenboot.saga.zone.StatePort.ActivityMutator, com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void releaseHeader(int i) {
            this.growPayload.setSystemBarsBehavior(i);
        }

        public BounceHandler(WindowInsetsController windowInsetsController, StatePort statePort, AnimMaker animMaker) {
            super(windowInsetsController, statePort, animMaker);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class FeedbackFlow extends BounceHandler {
        public FeedbackFlow(Window window, StatePort statePort, AnimMaker animMaker) {
            super(window, statePort, animMaker);
        }

        @Override // com.goldenboot.saga.zone.StatePort.ActivityMutator, com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void detachStream(boolean z) {
            this.growPayload.setSystemBarsAppearance(z ? 8 : 0, 8);
        }

        @Override // com.goldenboot.saga.zone.StatePort.ActivityMutator, com.goldenboot.saga.zone.StatePort.LayerUseCase
        public boolean growPayload() {
            return (this.growPayload.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // com.goldenboot.saga.zone.StatePort.ActivityMutator, com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void injectMetric(boolean z) {
            this.growPayload.setSystemBarsAppearance(z ? 16 : 0, 16);
        }

        public FeedbackFlow(WindowInsetsController windowInsetsController, StatePort statePort, AnimMaker animMaker) {
            super(windowInsetsController, statePort, animMaker);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class LayerUseCase {
        public abstract void clipOrigin(int i);

        public abstract void detachStream(boolean z);

        public abstract void evictLayout(int i);

        public abstract boolean growPayload();

        public abstract void injectMetric(boolean z);

        public abstract void releaseHeader(int i);
    }

    public StatePort(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.evictLayout = new FeedbackFlow(windowInsetsController, this, new AnimMaker(windowInsetsController));
        } else {
            this.evictLayout = new ActivityMutator(windowInsetsController, this, new AnimMaker(windowInsetsController));
        }
    }

    public static StatePort flushSample(WindowInsetsController windowInsetsController) {
        return new StatePort(windowInsetsController);
    }

    public void clipOrigin(int i) {
        this.evictLayout.clipOrigin(i);
    }

    public void detachStream(boolean z) {
        this.evictLayout.detachStream(z);
    }

    public void evictLayout(int i) {
        this.evictLayout.evictLayout(i);
    }

    public boolean growPayload() {
        return this.evictLayout.growPayload();
    }

    public void injectMetric(boolean z) {
        this.evictLayout.injectMetric(z);
    }

    public void releaseHeader(int i) {
        this.evictLayout.releaseHeader(i);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator extends LayerUseCase {
        public final ClipboardCustodian detachStream;
        public final StatePort evictLayout;
        public final WindowInsetsController growPayload;
        public final AnimMaker injectMetric;
        public Window releaseHeader;

        public ActivityMutator(Window window, StatePort statePort, AnimMaker animMaker) {
            this(window.getInsetsController(), statePort, animMaker);
            this.releaseHeader = window;
        }

        public void applyTask(int i) {
            View decorView = this.releaseHeader.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void clipOrigin(int i) {
            if ((i & 8) != 0) {
                this.injectMetric.growPayload();
            }
            this.growPayload.show(i & (-9));
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void detachStream(boolean z) {
            updateTimer(z, ContentOperation.Shape, 8);
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void evictLayout(int i) {
            if ((i & 8) != 0) {
                this.injectMetric.evictLayout();
            }
            this.growPayload.hide(i & (-9));
        }

        public final boolean flushSample(int i, int i2) {
            Window window = this.releaseHeader;
            if (window != null) {
                return (window.getDecorView().getSystemUiVisibility() & i) != 0;
            }
            this.growPayload.setSystemBarsAppearance(0, 0);
            return (this.growPayload.getSystemBarsAppearance() & i2) != 0;
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public boolean growPayload() {
            return flushSample(ContentOperation.Shape, 8);
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void injectMetric(boolean z) {
            updateTimer(z, 16, 16);
        }

        public void popBlueprint(int i) {
            View decorView = this.releaseHeader.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // com.goldenboot.saga.zone.StatePort.LayerUseCase
        public void releaseHeader(int i) {
            Window window = this.releaseHeader;
            if (window == null) {
                this.growPayload.setSystemBarsBehavior(i);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                popBlueprint(6144);
                return;
            }
            if (i == 1) {
                popBlueprint(ContentOperation.TransformOrigin);
                applyTask(ContentOperation.CameraDistance);
            } else {
                if (i != 2) {
                    return;
                }
                popBlueprint(ContentOperation.CameraDistance);
                applyTask(ContentOperation.TransformOrigin);
            }
        }

        public final void updateTimer(boolean z, int i, int i2) {
            if (this.releaseHeader != null) {
                if (z) {
                    applyTask(i);
                    return;
                } else {
                    popBlueprint(i);
                    return;
                }
            }
            if (z) {
                this.growPayload.setSystemBarsAppearance(i2, i2);
            } else {
                this.growPayload.setSystemBarsAppearance(0, i2);
            }
        }

        public ActivityMutator(WindowInsetsController windowInsetsController, StatePort statePort, AnimMaker animMaker) {
            this.detachStream = new ClipboardCustodian();
            this.growPayload = windowInsetsController;
            this.evictLayout = statePort;
            this.injectMetric = animMaker;
        }
    }

    public StatePort(Window window, View view) {
        AnimMaker animMaker = new AnimMaker(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.evictLayout = new FeedbackFlow(window, this, animMaker);
        } else {
            this.evictLayout = new ActivityMutator(window, this, animMaker);
        }
    }
}
