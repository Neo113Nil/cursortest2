package R5;

import P.C0350f;
import P.InterfaceC0349e;
import a.AbstractC0603a;
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
import d4.InterfaceC0965b;
import d6.C0977k;
import e3.C1023h;
import f4.InterfaceC1090b;
import g4.C1145r;
import g4.InterfaceC1131d;
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
import w1.C1761y0;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements A5.b, S5.c, InterfaceC1131d, ScopeCallback, SentryOptions.BeforeSendReplayCallback, HintUtils.SentryHintFallback, Scope.IWithPropagationContext, N4.a, A5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6075b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f6074a = i7;
        this.f6075b = obj;
    }

    public boolean a(C1761y0 c1761y0, int i7, Bundle bundle) {
        InterfaceC0349e interfaceC0349e;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i7 & 1) != 0) {
            try {
                ((U.g) c1761y0.f17932b).c();
                Parcelable parcelable = (Parcelable) ((U.g) c1761y0.f17932b).w();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        ClipDescription description = ((U.g) c1761y0.f17932b).getDescription();
        U.g gVar = (U.g) c1761y0.f17932b;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i8 >= 31) {
            interfaceC0349e = new C1023h(clipData, 2);
        } else {
            C0350f c0350f = new C0350f();
            c0350f.f5056b = clipData;
            c0350f.f5057c = 2;
            interfaceC0349e = c0350f;
        }
        interfaceC0349e.t(gVar.j());
        interfaceC0349e.h(bundle);
        return P.U.f((AppCompatEditText) this.f6075b, interfaceC0349e.b()) == null;
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
                ((AtomicReference) wVar.f11336c).set((InterfaceC0965b) bVar.get());
                break;
            default:
                C0977k c0977k = (C0977k) this.f6075b;
                c0977k.getClass();
                ((AtomicReference) c0977k.f12442c).set((InterfaceC1090b) bVar.get());
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
        w2.m mVar = (w2.m) this.f6075b;
        mVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            mVar.f18033k = refreshRate;
            mVar.f18034l = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            mVar.f18033k = -9223372036854775807L;
            mVar.f18034l = -9223372036854775807L;
        }
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        com.google.firebase.storage.g lambda$getComponents$0;
        lambda$getComponents$0 = ((StorageRegistrar) this.f6075b).lambda$getComponents$0(c1145r);
        return lambda$getComponents$0;
    }

    @Override // io.sentry.SentryOptions.BeforeSendReplayCallback
    public SentryReplayEvent execute(SentryReplayEvent sentryReplayEvent, Hint hint) {
        SentryReplayEvent updateReplayOptions$lambda$4;
        updateReplayOptions$lambda$4 = SentryFlutter.updateReplayOptions$lambda$4((Map) this.f6075b, sentryReplayEvent, hint);
        return updateReplayOptions$lambda$4;
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
    public void i(Object obj, V0 v02) {
        List w02;
        List w03;
        List w04;
        switch (this.f6074a) {
            case 0:
                C0426w c0426w = (C0426w) this.f6075b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0407c) c0426w.f6217a.f3679c).a(longValue, new C0425v((String) obj3, c0426w));
                    w02 = Y4.D.D(null);
                } catch (Throwable th) {
                    w02 = AbstractC0603a.w0(th);
                }
                v02.f(w02);
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
                } catch (Throwable th2) {
                    w03 = AbstractC0603a.w0(th2);
                }
                switch (u4.ordinal()) {
                    case 0:
                        i7 = 4;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 1:
                        i7 = 1;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 2:
                        i7 = 2;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 3:
                        i7 = 5;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 4:
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 5:
                        i7 = 3;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                    case 6:
                        c0417m.f6191a.getClass();
                        throw new IllegalArgumentException(u4 + " doesn't represent a native value.");
                    default:
                        i7 = -1;
                        w03 = Y4.D.D(Boolean.valueOf(sslError.hasError(i7)));
                        v02.f(w03);
                        return;
                }
            default:
                C0426w c0426w2 = (C0426w) this.f6075b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj6 = ((List) obj).get(0);
                t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0407c) c0426w2.f6217a.f3679c).a(((Long) obj6).longValue(), WebStorage.getInstance());
                    w04 = Y4.D.D(null);
                } catch (Throwable th3) {
                    w04 = AbstractC0603a.w0(th3);
                }
                v02.f(w04);
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
