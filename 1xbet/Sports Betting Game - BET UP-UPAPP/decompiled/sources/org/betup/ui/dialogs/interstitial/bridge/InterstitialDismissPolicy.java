package org.betup.ui.dialogs.interstitial.bridge;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InterstitialDismissPolicy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001c\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "", "allowSkip", "", "requireClickToClose", "skipAfterSeconds", "", "onStateChanged", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZILkotlin/jvm/functions/Function0;)V", "onDismissReadyListener", "getOnDismissReadyListener", "()Lkotlin/jvm/functions/Function0;", "setOnDismissReadyListener", "(Lkotlin/jvm/functions/Function0;)V", "mainHandler", "Landroid/os/Handler;", "value", "clicked", "getClicked", "()Z", "countdownDone", "getCountdownDone", "countdownStarted", "countdownRunnable", "Ljava/lang/Runnable;", "notifyStateChanged", "markClicked", "startCountdown", "canDismiss", "cancel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialDismissPolicy {
    public static final int $stable = 8;
    private final boolean allowSkip;
    private boolean clicked;
    private volatile boolean countdownDone;
    private final Runnable countdownRunnable;
    private boolean countdownStarted;
    private final Handler mainHandler;
    private Function0<Unit> onDismissReadyListener;
    private final Function0<Unit> onStateChanged;
    private final boolean requireClickToClose;
    private final int skipAfterSeconds;

    public InterstitialDismissPolicy(boolean z, boolean z2, int i, Function0<Unit> function0) {
        this.allowSkip = z;
        this.requireClickToClose = z2;
        this.skipAfterSeconds = i;
        this.onStateChanged = function0;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.countdownDone = i <= 0;
        this.countdownRunnable = new Runnable() { // from class: org.betup.ui.dialogs.interstitial.bridge.InterstitialDismissPolicy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialDismissPolicy.countdownRunnable$lambda$0(InterstitialDismissPolicy.this);
            }
        };
    }

    public /* synthetic */ InterstitialDismissPolicy(boolean z, boolean z2, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, (i2 & 8) != 0 ? null : function0);
    }

    public final Function0<Unit> getOnDismissReadyListener() {
        return this.onDismissReadyListener;
    }

    public final void setOnDismissReadyListener(Function0<Unit> function0) {
        this.onDismissReadyListener = function0;
    }

    public final boolean getClicked() {
        return this.clicked;
    }

    public final boolean getCountdownDone() {
        return this.countdownDone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void countdownRunnable$lambda$0(InterstitialDismissPolicy interstitialDismissPolicy) {
        interstitialDismissPolicy.countdownDone = true;
        interstitialDismissPolicy.notifyStateChanged();
    }

    private final void notifyStateChanged() {
        Function0<Unit> function0 = this.onStateChanged;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.onDismissReadyListener;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public final void markClicked() {
        if (this.clicked) {
            return;
        }
        this.clicked = true;
        notifyStateChanged();
    }

    public final void startCountdown() {
        if (this.countdownStarted) {
            return;
        }
        this.countdownStarted = true;
        int i = this.skipAfterSeconds;
        if (i <= 0) {
            this.countdownDone = true;
            notifyStateChanged();
        } else {
            this.mainHandler.postDelayed(this.countdownRunnable, i * 1000);
        }
    }

    public final boolean canDismiss() {
        if (this.requireClickToClose && !this.clicked) {
            return false;
        }
        if (this.allowSkip) {
            return true;
        }
        return this.countdownDone;
    }

    public final void cancel() {
        this.mainHandler.removeCallbacks(this.countdownRunnable);
    }
}
