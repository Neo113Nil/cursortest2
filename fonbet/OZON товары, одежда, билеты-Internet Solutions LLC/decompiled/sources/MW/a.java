package MW;

import C.I;
import Ve.C4592rj;
import Ve.M7;
import Ve.P7;
import android.webkit.WebView;
import android.widget.ProgressBar;
import io.sentry.android.core.C7102c;
import io.sentry.logger.d;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInput;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17741b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f17740a = i11;
        this.f17741b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17740a) {
            case 0:
                ((SelectionFormInput) this.f17741b).preventFocusChange = false;
                return;
            case 1:
                C4592rj this$0 = (C4592rj) this.f17741b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isAdded()) {
                    X4.a aVar = this$0.f28693b;
                    if (aVar == null) {
                        throw M7.f29463a;
                    }
                    P7 p72 = (P7) aVar;
                    WebView spayTdsBindingWv = p72.f29680c;
                    Intrinsics.checkNotNullExpressionValue(spayTdsBindingWv, "spayTdsBindingWv");
                    spayTdsBindingWv.setVisibility(0);
                    ProgressBar spayTdsBindingLoading = p72.f29679b;
                    Intrinsics.checkNotNullExpressionValue(spayTdsBindingLoading, "spayTdsBindingLoading");
                    spayTdsBindingLoading.setVisibility(8);
                    return;
                }
                return;
            case 2:
                ((C7102c) this.f17741b).f67068a.a().e();
                return;
            case 3:
                r0.f68068d.c(((d) this.f17741b).f68065a.getShutdownTimeoutMillis());
                return;
            case 4:
                ((I.i) this.f17741b).clear();
                return;
            default:
                ((androidx.media3.ui.d) this.f17741b).r0();
                return;
        }
    }
}
