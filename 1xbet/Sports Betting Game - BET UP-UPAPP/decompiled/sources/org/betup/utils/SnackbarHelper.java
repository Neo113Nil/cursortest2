package org.betup.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SnackbarHelper.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001c\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001c\u0010\u0019\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J,\u0010\u001a\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0007J0\u0010\u001a\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0007J$\u0010\u001f\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J\"\u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0002J \u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J0\u0010\"\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001d\u0010%\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lorg/betup/utils/SnackbarHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "activeMessage", "", "activeExpiryMs", "", "handler", "Landroid/os/Handler;", "clearRunnable", "Ljava/lang/Runnable;", "scheduleClear", "", "durationMs", "getDefaultDurationMs", "registerActiveMessage", "message", "takeActiveMessageForTransfer", "Lorg/betup/utils/SnackbarHelper$TransferredMessage;", "showShortIfForeground", "context", "Landroid/content/Context;", "stringResId", "", "showShort", "showShortWithAction", "messageResId", "actionResId", "onAction", "actionLabel", "showWithDuration", "showInternal", "showInternalMain", "showInternalWithAction", "resolveSnackbarAnchor", "Landroid/view/View;", "styleSnackbar", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "styleSnackbar$app_release", "getActivity", "Landroid/app/Activity;", "isAppInForeground", "", "TransferredMessage", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarHelper {
    private static volatile long activeExpiryMs;
    private static volatile CharSequence activeMessage;
    public static final SnackbarHelper INSTANCE = new SnackbarHelper();
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final Runnable clearRunnable = new Runnable() { // from class: org.betup.utils.SnackbarHelper$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            SnackbarHelper.clearRunnable$lambda$0();
        }
    };
    public static final int $stable = 8;

    @JvmStatic
    public static final long getDefaultDurationMs() {
        return 2500L;
    }

    private SnackbarHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearRunnable$lambda$0() {
        activeMessage = null;
        activeExpiryMs = 0L;
    }

    static /* synthetic */ void scheduleClear$default(SnackbarHelper snackbarHelper, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 2500;
        }
        snackbarHelper.scheduleClear(j);
    }

    private final void scheduleClear(long durationMs) {
        Handler handler2 = handler;
        Runnable runnable = clearRunnable;
        handler2.removeCallbacks(runnable);
        handler2.postDelayed(runnable, durationMs);
    }

    public static /* synthetic */ void registerActiveMessage$default(CharSequence charSequence, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 2500;
        }
        registerActiveMessage(charSequence, j);
    }

    @JvmStatic
    public static final void registerActiveMessage(CharSequence message, long durationMs) {
        Intrinsics.checkNotNullParameter(message, "message");
        activeMessage = message;
        activeExpiryMs = SystemClock.uptimeMillis() + durationMs;
        Handler handler2 = handler;
        Runnable runnable = clearRunnable;
        handler2.removeCallbacks(runnable);
        handler2.postDelayed(runnable, durationMs);
    }

    /* compiled from: SnackbarHelper.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/utils/SnackbarHelper$TransferredMessage;", "", "message", "", "remainingMs", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/CharSequence;J)V", "getMessage", "()Ljava/lang/CharSequence;", "getRemainingMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransferredMessage {
        public static final int $stable = 8;
        private final CharSequence message;
        private final long remainingMs;

        public static /* synthetic */ TransferredMessage copy$default(TransferredMessage transferredMessage, CharSequence charSequence, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = transferredMessage.message;
            }
            if ((i & 2) != 0) {
                j = transferredMessage.remainingMs;
            }
            return transferredMessage.copy(charSequence, j);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final long getRemainingMs() {
            return this.remainingMs;
        }

        public final TransferredMessage copy(CharSequence message, long remainingMs) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TransferredMessage(message, remainingMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferredMessage)) {
                return false;
            }
            TransferredMessage transferredMessage = (TransferredMessage) other;
            return Intrinsics.areEqual(this.message, transferredMessage.message) && this.remainingMs == transferredMessage.remainingMs;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Long.hashCode(this.remainingMs);
        }

        public String toString() {
            return "TransferredMessage(message=" + ((Object) this.message) + ", remainingMs=" + this.remainingMs + ")";
        }

        public TransferredMessage(CharSequence message, long j) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.remainingMs = j;
        }

        public final CharSequence getMessage() {
            return this.message;
        }

        public final long getRemainingMs() {
            return this.remainingMs;
        }
    }

    @JvmStatic
    public static final TransferredMessage takeActiveMessageForTransfer() {
        CharSequence charSequence = activeMessage;
        if (charSequence == null) {
            return null;
        }
        long j = activeExpiryMs;
        handler.removeCallbacks(clearRunnable);
        activeMessage = null;
        activeExpiryMs = 0L;
        long coerceAtLeast = RangesKt.coerceAtLeast(j - SystemClock.uptimeMillis(), 0L);
        if (coerceAtLeast <= 0) {
            return null;
        }
        return new TransferredMessage(charSequence, coerceAtLeast);
    }

    @JvmStatic
    public static final void showShortIfForeground(Context context, int stringResId) {
        if (context == null || stringResId == 0) {
            return;
        }
        SnackbarHelper snackbarHelper = INSTANCE;
        if (snackbarHelper.isAppInForeground(context)) {
            String string = context.getString(stringResId);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            snackbarHelper.showInternal(context, string, 2500L);
        }
    }

    @JvmStatic
    public static final void showShortIfForeground(Context context, CharSequence message) {
        if (context == null || message == null || StringsKt.isBlank(message)) {
            return;
        }
        SnackbarHelper snackbarHelper = INSTANCE;
        if (snackbarHelper.isAppInForeground(context)) {
            snackbarHelper.showInternal(context, message, 2500L);
        }
    }

    @JvmStatic
    public static final void showShort(Context context, int stringResId) {
        if (context == null || stringResId == 0) {
            return;
        }
        SnackbarHelper snackbarHelper = INSTANCE;
        String string = context.getString(stringResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        snackbarHelper.showInternal(context, string, 2500L);
    }

    @JvmStatic
    public static final void showShort(Context context, CharSequence message) {
        if (context == null || message == null || StringsKt.isBlank(message)) {
            return;
        }
        INSTANCE.showInternal(context, message, 2500L);
    }

    @JvmStatic
    public static final void showShortWithAction(Context context, int messageResId, int actionResId, Runnable onAction) {
        if (context == null || messageResId == 0 || actionResId == 0 || onAction == null) {
            return;
        }
        showShortWithAction(context, context.getString(messageResId), context.getString(actionResId), onAction);
    }

    @JvmStatic
    public static final void showShortWithAction(Context context, CharSequence message, CharSequence actionLabel, Runnable onAction) {
        if (!SharedPrefs.areInAppMessagesEnabled(context != null ? context.getApplicationContext() : null) || context == null || message == null || StringsKt.isBlank(message) || actionLabel == null || StringsKt.isBlank(actionLabel) || onAction == null) {
            return;
        }
        INSTANCE.showInternalWithAction(context, message, actionLabel, onAction, 2500L);
    }

    @JvmStatic
    public static final void showWithDuration(Context context, CharSequence message, long durationMs) {
        if (context == null || message == null || StringsKt.isBlank(message)) {
            return;
        }
        INSTANCE.showInternal(context, message, RangesKt.coerceIn(durationMs, 1500L, 12000L));
    }

    static /* synthetic */ void showInternal$default(SnackbarHelper snackbarHelper, Context context, CharSequence charSequence, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 2500;
        }
        snackbarHelper.showInternal(context, charSequence, j);
    }

    private final void showInternal(final Context context, final CharSequence message, final long durationMs) {
        if (SharedPrefs.areInAppMessagesEnabled(context.getApplicationContext())) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.betup.utils.SnackbarHelper$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SnackbarHelper.showInternal$lambda$1(context, message, durationMs);
                    }
                });
            } else {
                showInternalMain(context, message, durationMs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInternal$lambda$1(Context context, CharSequence charSequence, long j) {
        INSTANCE.showInternalMain(context, charSequence, j);
    }

    private final void showInternalMain(Context context, CharSequence message, long durationMs) {
        View resolveSnackbarAnchor = resolveSnackbarAnchor(context);
        if (resolveSnackbarAnchor == null) {
            Toast.makeText(context.getApplicationContext(), message, 0).show();
            return;
        }
        activeMessage = message;
        activeExpiryMs = SystemClock.uptimeMillis() + durationMs;
        scheduleClear(durationMs);
        Snackbar make = Snackbar.make(resolveSnackbarAnchor, message, RangesKt.coerceIn((int) durationMs, 500, Integer.MAX_VALUE));
        Intrinsics.checkNotNullExpressionValue(make, "make(...)");
        make.addCallback(new Snackbar.Callback() { // from class: org.betup.utils.SnackbarHelper$showInternalMain$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(Snackbar transientBottomBar, int event) {
                SnackbarHelper snackbarHelper = SnackbarHelper.INSTANCE;
                SnackbarHelper.activeMessage = null;
                SnackbarHelper snackbarHelper2 = SnackbarHelper.INSTANCE;
                SnackbarHelper.activeExpiryMs = 0L;
            }
        });
        styleSnackbar$app_release(context, make);
        make.show();
    }

    private final void showInternalWithAction(final Context context, final CharSequence message, final CharSequence actionLabel, final Runnable onAction, final long durationMs) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            handler.post(new Runnable() { // from class: org.betup.utils.SnackbarHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SnackbarHelper.showInternalWithAction$lambda$3(context, message, actionLabel, onAction, durationMs);
                }
            });
            return;
        }
        View resolveSnackbarAnchor = resolveSnackbarAnchor(context);
        if (resolveSnackbarAnchor == null) {
            Toast.makeText(context.getApplicationContext(), message, 1).show();
            return;
        }
        activeMessage = message;
        activeExpiryMs = SystemClock.uptimeMillis() + durationMs;
        scheduleClear(durationMs);
        Snackbar make = Snackbar.make(resolveSnackbarAnchor, message, RangesKt.coerceIn((int) durationMs, 500, Integer.MAX_VALUE));
        Intrinsics.checkNotNullExpressionValue(make, "make(...)");
        make.setAction(actionLabel, new View.OnClickListener() { // from class: org.betup.utils.SnackbarHelper$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnackbarHelper.showInternalWithAction$lambda$5(onAction, view);
            }
        });
        make.addCallback(new Snackbar.Callback() { // from class: org.betup.utils.SnackbarHelper$showInternalWithAction$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(Snackbar transientBottomBar, int event) {
                SnackbarHelper snackbarHelper = SnackbarHelper.INSTANCE;
                SnackbarHelper.activeMessage = null;
                SnackbarHelper snackbarHelper2 = SnackbarHelper.INSTANCE;
                SnackbarHelper.activeExpiryMs = 0L;
            }
        });
        styleSnackbar$app_release(context, make);
        make.setActionTextColor(ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor()));
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInternalWithAction$lambda$3(Context context, CharSequence charSequence, CharSequence charSequence2, Runnable runnable, long j) {
        INSTANCE.showInternalWithAction(context, charSequence, charSequence2, runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInternalWithAction$lambda$5(Runnable runnable, View view) {
        handler.removeCallbacks(clearRunnable);
        activeMessage = null;
        activeExpiryMs = 0L;
        runnable.run();
    }

    private final View resolveSnackbarAnchor(Context context) {
        Window window;
        View decorView;
        View findViewById;
        Activity activity = getActivity(context);
        if (activity != null && (findViewById = activity.findViewById(R.id.coordinator_layout)) != null) {
            return findViewById;
        }
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.findViewById(android.R.id.content);
    }

    public final void styleSnackbar$app_release(Context context, Snackbar snackbar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(snackbar, "snackbar");
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.snackbar_background);
        int m5222toArgb8_81llA = ColorKt.m5222toArgb8_81llA(ComposeUtils.AppColorPalette.White.INSTANCE.getColor());
        snackbar.getView().setBackground(drawable);
        snackbar.setTextColor(m5222toArgb8_81llA);
        Typeface font = ResourcesCompat.getFont(context, R.font.open_sans_medium);
        TextView textView = (TextView) snackbar.getView().findViewById(R.id.snackbar_text);
        if (textView != null) {
            textView.setGravity(1);
            textView.setTextAlignment(4);
            textView.setTypeface(font);
            textView.setTextSize(2, 14.0f);
            textView.setMaxLines(8);
        }
    }

    private final Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return getActivity(baseContext);
    }

    private final boolean isAppInForeground(Context context) {
        Context applicationContext = context.getApplicationContext();
        BetUpApp betUpApp = applicationContext instanceof BetUpApp ? (BetUpApp) applicationContext : null;
        if (betUpApp == null) {
            return false;
        }
        return betUpApp.isInForeground();
    }
}
