package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class I0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8361a;

    public I0(SearchView searchView) {
        this.f8361a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        SearchView searchView = this.f8361a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f8436e0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z4);
        }
    }
}
