package Ui;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4069c f27782a;

    public h(C4069c c4069c) {
        this.f27782a = c4069c;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f27782a.f27735d = view.getTop();
    }
}
