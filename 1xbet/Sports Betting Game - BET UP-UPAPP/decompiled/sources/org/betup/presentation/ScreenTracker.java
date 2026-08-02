package org.betup.presentation;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.protocol.Request;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ScreenTracker.kt */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\tJ\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\tJ\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u001b\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/betup/presentation/ScreenTracker;", "", "presentationScreens", "Lorg/betup/presentation/PresentationScreens;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/presentation/PresentationScreens;)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "", "mainHandler", "Landroid/os/Handler;", "currentScreenKey", "currentContext", "", "getCurrentScreenKey", "getCurrentContext", "setCurrentScreenKey", "screenKey", "setCurrentScreen", "context", "trackFragment", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenTracker {
    private static final String TAG = "PresentationScreenTracker";
    private volatile Map<String, String> currentContext;
    private volatile String currentScreenKey;
    private final CopyOnWriteArrayList<Function1<String, Unit>> listeners;
    private final Handler mainHandler;
    private final PresentationScreens presentationScreens;
    public static final int $stable = 8;

    @Inject
    public ScreenTracker(PresentationScreens presentationScreens) {
        Intrinsics.checkNotNullParameter(presentationScreens, "presentationScreens");
        this.presentationScreens = presentationScreens;
        this.listeners = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.currentScreenKey = "unknown";
        this.currentContext = MapsKt.emptyMap();
    }

    public final String getCurrentScreenKey() {
        return this.currentScreenKey;
    }

    public final Map<String, String> getCurrentContext() {
        return this.currentContext;
    }

    public final void setCurrentScreenKey(String screenKey) {
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        setCurrentScreen(screenKey, MapsKt.emptyMap());
    }

    public final void setCurrentScreen(String screenKey, Map<String, String> context) {
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        Intrinsics.checkNotNullParameter(context, "context");
        final String lowerCase = StringsKt.trim((CharSequence) screenKey).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map<String, String> normalizeContext = this.presentationScreens.normalizeContext(context);
        if (Intrinsics.areEqual(lowerCase, this.currentScreenKey) && Intrinsics.areEqual(normalizeContext, this.currentContext)) {
            return;
        }
        String str = this.currentScreenKey;
        this.currentScreenKey = lowerCase;
        this.currentContext = normalizeContext;
        Log.d(TAG, "Screen changed: " + str + " -> " + this.currentScreenKey + " context=" + this.currentContext);
        Iterator<Function1<String, Unit>> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            final Function1<String, Unit> next = it.next();
            this.mainHandler.post(new Runnable() { // from class: org.betup.presentation.ScreenTracker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Function1.this.invoke(lowerCase);
                }
            });
        }
    }

    public final void trackFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String simpleName = fragment.getClass().getSimpleName();
        if (!this.presentationScreens.shouldTrack(fragment)) {
            Log.d(TAG, "trackFragment: ignoring class=" + simpleName);
            return;
        }
        String resolve = this.presentationScreens.resolve(fragment);
        Map<String, String> resolveContext = this.presentationScreens.resolveContext(fragment);
        Log.d(TAG, "trackFragment: class=" + simpleName + " screenKey=" + resolve + " context=" + resolveContext);
        setCurrentScreen(resolve, resolveContext);
    }

    public final void registerListener(Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void unregisterListener(Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }
}
