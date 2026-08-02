package B2;

import B2.c;
import I.f;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.concurrent.futures.b;
import androidx.core.view.C5311d;
import androidx.core.view.Y;
import androidx.preference.Preference;
import com.google.common.util.concurrent.m;
import java.io.Serializable;
import java.util.concurrent.Executor;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements c.b, Preference.c, b.c, InterfaceC5104l0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2185a;

    public /* synthetic */ b(Object obj) {
        this.f2185a = obj;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0.a
    public void a(InterfaceC5104l0 interfaceC5104l0) {
        U.a.a((U.a) this.f2185a, interfaceC5104l0);
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.w0((FintechPreferencesFragment) this.f2185a, serializable);
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        f fVar = new f(aVar, 0);
        Executor b11 = H.c.b();
        m mVar = (m) this.f2185a;
        mVar.a(fVar, b11);
        return "transformVoidFuture [" + mVar + "]";
    }

    @Override // B2.c.b
    public boolean d(d dVar, int i11, Bundle bundle) {
        if ((i11 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e11) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e11);
                return false;
            }
        }
        C5311d.a aVar = new C5311d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2);
        aVar.d(dVar.c());
        aVar.b(bundle);
        return Y.w((AppCompatEditText) this.f2185a, aVar.a()) == null;
    }
}
