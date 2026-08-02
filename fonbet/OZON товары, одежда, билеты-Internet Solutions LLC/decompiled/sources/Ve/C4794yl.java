package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.yl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4794yl implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32596a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32597b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f32598c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f32599d;

    public C4794yl(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2, RecyclerView recyclerView) {
        this.f32596a = constraintLayout;
        this.f32597b = sPayTextView;
        this.f32598c = sPayTextView2;
        this.f32599d = recyclerView;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f32596a;
    }
}
