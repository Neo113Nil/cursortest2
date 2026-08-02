package a3;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC4928b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36223c;

    public /* synthetic */ RunnableC4928b(int i11, Object obj, Object obj2) {
        this.f36221a = i11;
        this.f36222b = obj;
        this.f36223c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36221a) {
            case 0:
                m violation = (m) this.f36223c;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) this.f36222b), violation);
                throw violation;
            default:
                PlayerView.a((PlayerView) this.f36222b, (Bitmap) this.f36223c);
                return;
        }
    }
}
