package R5;

import P.C0350f;
import P.InterfaceC0349e;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.webkit.WebStorage;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.firebase.storage.StorageRegistrar;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.flutter.SentryFlutter;
import io.sentry.protocol.Mechanism;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.TracingUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p042f4.InterfaceC0893b;
import p155w1.C1052y0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements A5.b, S5.c, p048g4.d, ScopeCallback, SentryOptions.BeforeSendReplayCallback, HintUtils.SentryHintFallback, Scope.IWithPropagationContext, N4.a, A5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6075b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f6074a = i7;
        this.f6075b = obj;
    }

    public boolean a(C1052y0 c1052y0, int i7, Bundle bundle) {
        InterfaceC0349e hVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i7 & 1) != 0) {
            try {
                ((U.g) c1052y0.f17938b).c();
                Parcelable parcelable = (Parcelable) ((U.g) c1052y0.f17938b).w();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        ClipDescription description = ((U.g) c1052y0.f17938b).getDescription();
        U.g gVar = (U.g) c1052y0.f17938b;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i8 >= 31) {
            hVar = new p033e3.h(clipData, 2);
        } else {
            C0350f c0350f = new C0350f();
            c0350f.f5056b = clipData;
            c0350f.f5057c = 2;
            hVar = c0350f;
        }
        hVar.t(gVar.j());
        hVar.h(bundle);
        return P.U.f((AppCompatEditText) this.f6075b, hVar.b()) == null;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        TracingUtils.lambda$startNewTrace$0((IScope) this.f6075b, propagationContext);
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        switch (this.f6074a) {
            case 15:
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f6075b;
                wVar.getClass();
                ((AtomicReference) wVar.f11336c).set((p026d4.b) bVar.get());
                break;
            default:
                p028d6.k kVar = (p028d6.k) this.f6075b;
                kVar.getClass();
                ((AtomicReference) kVar.f12448c).set((InterfaceC0893b) bVar.get());
                break;
        }
    }

    @Override // S5.c
    public boolean c(View view) {
        int i7 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f6075b;
            if (i7 >= clsArr.length) {
                return false;
            }
            if (clsArr[i7].isInstance(view)) {
                return true;
            }
            i7++;
        }
    }

    public void d(Display display) {
        p156w2.m mVar = (p156w2.m) this.f6075b;
        mVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            mVar.f18039k = refreshRate;
            mVar.f18040l = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            mVar.f18039k = -9223372036854775807L;
            mVar.f18040l = -9223372036854775807L;
        }
    }

    @Override // p048g4.d
    public Object e(p048g4.r rVar) {
        return ((StorageRegistrar) this.f6075b).lambda$getComponents$0(rVar);
    }

    @Override // io.sentry.SentryOptions.BeforeSendReplayCallback
    public SentryReplayEvent execute(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return SentryFlutter.updateReplayOptions$lambda$4((Map) this.f6075b, sentryReplayEvent, hint);
    }

    @Override // A5.c
    public void f(Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((JSONObject) obj).getBoolean(Mechanism.JsonKeys.HANDLED);
            } catch (JSONException e7) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        ((B3.g) ((F) this.f6075b).f6075b).g(z4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // A5.b
    public void i(Object obj, V0 v6) {
        List listW0;
        List listW1;
        List listW2;
        switch (this.f6074a) {
            case 0:
                C0426w c0426w = (C0426w) this.f6075b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0407c) c0426w.f6217a.f3679c).a(jLongValue, new C0425v((String) obj3, c0426w));
                    listW0 = Y4.D.D(null);
                    break;
                } catch (Throwable th) {
                    listW0 = p003a.a.w0(th);
                }
                v6.f(listW0);
                return;
            case 1:
                C0417m c0417m = (C0417m) this.f6075b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i7 = 0;
                Object obj4 = list2.get(0);
                t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj4;
                Object obj5 = list2.get(1);
                t6.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                U u4 = (U) obj5;
                try {
                    switch (u4.ordinal()) {
                        case 0:
                            i7 = 4;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 1:
                            i7 = 1;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 2:
                            i7 = 2;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 3:
                            i7 = 5;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 4:
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 5:
                            i7 = 3;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                        case 6:
                            c0417m.f6191a.getClass();
                            throw new IllegalArgumentException(u4 + " doesn't represent a native value.");
                        default:
                            i7 = -1;
                            listW1 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                            v6.f(listW1);
                            return;
                    }
                } catch (Throwable th2) {
                    listW1 = p003a.a.w0(th2);
                }
                break;
            default:
                C0426w c0426w2 = (C0426w) this.f6075b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj6 = ((List) obj).get(0);
                t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0407c) c0426w2.f6217a.f3679c).a(((Long) obj6).longValue(), WebStorage.getInstance());
                    listW2 = Y4.D.D(null);
                    break;
                } catch (Throwable th3) {
                    listW2 = p003a.a.w0(th3);
                }
                v6.f(listW2);
                return;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f6074a) {
            case 7:
                ((SentryGestureListener) this.f6075b).lambda$stopTracing$1(iScope);
                break;
            case 8:
                BufferCaptureStrategy.captureReplay$lambda$1((BufferCaptureStrategy) this.f6075b, iScope);
                break;
            case 9:
                SessionCaptureStrategy.start$lambda$0((SessionCaptureStrategy) this.f6075b, iScope);
                break;
            default:
                TracingUtils.lambda$setTrace$3((PropagationContext) this.f6075b, iScope);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        switch (this.f6074a) {
            case 11:
                LogUtils.logNotInstanceOf(cls, obj, (ILogger) this.f6075b);
                break;
            default:
                ((HintUtils.SentryNullableConsumer) this.f6075b).accept(obj);
                break;
        }
    }
}
