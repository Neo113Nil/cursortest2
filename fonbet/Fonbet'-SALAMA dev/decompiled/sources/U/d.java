package U;

import R5.F;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import w1.C1761y0;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f6371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, F f7) {
        super(inputConnection, false);
        this.f6371a = f7;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        C1761y0 c1761y0 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c1761y0 = new C1761y0(new f(inputContentInfo), 9);
        }
        if (this.f6371a.a(c1761y0, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
