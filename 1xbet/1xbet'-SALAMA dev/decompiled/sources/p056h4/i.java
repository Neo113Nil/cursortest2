package p056h4;

import A1.InterfaceC0025j;
import A1.InterfaceC0027k;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryUUID;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.TracingUtils;
import p048g4.d;
import p048g4.m;
import p048g4.r;
import p068j2.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements d, ScopeCallback, LazyEvaluator.Evaluator, HintUtils.SentryHintFallback, HintUtils.SentryConsumer, InterfaceC0025j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13561a;

    public /* synthetic */ i(int i7) {
        this.f13561a = i7;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        HintUtils.lambda$runIfDoesNotHaveType$0(obj);
    }

    @Override // A1.InterfaceC0025j
    public InterfaceC0027k d(Bundle bundle) {
        float f7;
        int i7;
        int i8;
        float f8;
        boolean z4;
        int i9;
        switch (this.f13561a) {
            case 8:
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    f7 = bundle.getFloat(Integer.toString(4, 36));
                    i7 = bundle.getInt(Integer.toString(5, 36));
                } else {
                    f7 = -3.4028235E38f;
                    i7 = Integer.MIN_VALUE;
                }
                int i10 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f9 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i11 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f8 = bundle.getFloat(Integer.toString(10, 36));
                    i8 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    i8 = Integer.MIN_VALUE;
                    f8 = -3.4028235E38f;
                }
                float f10 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f11 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i9 = bundle.getInt(Integer.toString(13, 36));
                    z4 = true;
                } else {
                    z4 = false;
                    i9 = -16777216;
                }
                return new b(charSequence2, alignment2, alignment4, bitmap2, f7, i7, i10, f9, i11, i8, f8, f10, f11, bundle.getBoolean(Integer.toString(14, 36), false) ? z4 : false, i9, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
            default:
                return new p156w2.b(bundle.getInt(Integer.toString(0, 36), -1), bundle.getByteArray(Integer.toString(3, 36)), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1));
        }
    }

    @Override // p048g4.d
    public Object e(r rVar) {
        switch (this.f13561a) {
            case 0:
                m mVar = ExecutorsRegistrar.f11958a;
                return k.f13568a;
            default:
                return DatabaseRegistrar.lambda$getComponents$0(rVar);
        }
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        return SentryUUID.generateSentryId();
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f13561a) {
            case 3:
                SessionCaptureStrategy.stop$lambda$1(iScope);
                break;
            default:
                TracingUtils.lambda$startNewTrace$1(iScope);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        HintUtils.lambda$runIfHasType$2(obj, cls);
    }
}
