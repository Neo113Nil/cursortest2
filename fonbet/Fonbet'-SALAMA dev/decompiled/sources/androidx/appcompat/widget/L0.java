package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class L0 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8364a;

    public L0(SearchView searchView) {
        this.f8364a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        this.f8364a.r();
        return true;
    }
}
