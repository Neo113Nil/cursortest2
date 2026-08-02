package S2;

import T2.C0432j;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class h extends RelativeLayout {

    /* renamed from: k, reason: collision with root package name */
    public final C0432j f5325k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5326l;

    public h(Context context, String str, String str2, String str3) {
        super(context);
        C0432j c0432j = new C0432j(context);
        c0432j.f5708c = str;
        this.f5325k = c0432j;
        c0432j.f5710e = str2;
        c0432j.f5709d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5326l) {
            return false;
        }
        this.f5325k.a(motionEvent);
        return false;
    }
}
