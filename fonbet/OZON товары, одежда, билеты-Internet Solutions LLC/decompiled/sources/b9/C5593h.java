package b9;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: b9.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C5593h implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C5593h f55738a = new C5593h();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C5590e.f55729e.e("MobileVisionBase", "Error preloading model resource", exc);
    }
}
