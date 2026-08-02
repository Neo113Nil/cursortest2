package Ve;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.wd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4730wd implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f32362a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32363b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayoutCompat f32364c;

    public C4730wd(LinearLayoutCompat linearLayoutCompat, SPayTextView sPayTextView, LinearLayoutCompat linearLayoutCompat2) {
        this.f32362a = linearLayoutCompat;
        this.f32363b = sPayTextView;
        this.f32364c = linearLayoutCompat2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f32362a;
    }
}
