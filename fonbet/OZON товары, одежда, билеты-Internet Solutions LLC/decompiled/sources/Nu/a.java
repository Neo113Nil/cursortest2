package Nu;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import io.sentry.android.ndk.f;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.accesscontrol.presentation.author.view.AuthorImageStackView$loadImage$1;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DebouncedTextWatcher;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19671c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f19669a = i11;
        this.f19670b = obj;
        this.f19671c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19669a) {
            case 0:
                DebouncedTextWatcher.onTextChanged$lambda$0((DebouncedTextWatcher) this.f19670b, (CharSequence) this.f19671c);
                break;
            case 1:
                AuthorImageStackView$loadImage$1.onLoadSuccessful$lambda$0((ImageView) this.f19670b, (Bitmap) this.f19671c);
                break;
            case 2:
                View this_showDelayedKeyboard = (View) this.f19670b;
                Intrinsics.checkNotNullParameter(this_showDelayedKeyboard, "$this_showDelayedKeyboard");
                View view = (View) this.f19671c;
                Intrinsics.checkNotNullParameter(view, "$view");
                Context context = this_showDelayedKeyboard.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.requestFocus()) {
                    Object systemService = context.getSystemService("input_method");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).showSoftInput(view, 1);
                    break;
                }
                break;
            default:
                f.v((f) this.f19670b, (String) this.f19671c);
                break;
        }
    }
}
