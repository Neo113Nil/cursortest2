package C;

import android.text.Editable;
import android.view.View;
import androidx.camera.core.impl.InterfaceC5104l0;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.DebouncedTextWatcher;
import ru.ozon.app.android.session.auth.presentation.viewHolder.FieldVH;

/* loaded from: classes8.dex */
public final /* synthetic */ class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4133c;

    public /* synthetic */ T(int i11, Object obj, Object obj2) {
        this.f4131a = i11;
        this.f4132b = obj;
        this.f4133c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4131a) {
            case 0:
                androidx.camera.core.s sVar = (androidx.camera.core.s) this.f4132b;
                sVar.getClass();
                ((InterfaceC5104l0.a) this.f4133c).a(sVar);
                break;
            case 1:
                DebouncedTextWatcher.afterTextChanged$lambda$0((DebouncedTextWatcher) this.f4132b, (Editable) this.f4133c);
                break;
            default:
                FieldVH.showKeyboardDelayed$lambda$0((FieldVH) this.f4132b, (View) this.f4133c);
                break;
        }
    }
}
