package sg.bigo.ads.H;

import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public TextView f12313a;
    public TextView b;
    public ViewGroup c;
    public n d;
    public f e;
    public boolean f;

    public final void a(ViewGroup viewGroup, int i, n nVar) {
        if (viewGroup == null) {
            return;
        }
        this.f = false;
        this.d = nVar;
        this.c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f12313a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.b = textView;
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 == null || this.f12313a == null || textView == null) {
            n nVar2 = this.d;
            if (nVar2 != null) {
                nVar2.o();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new e(this));
        this.c.setClickable(false);
        this.f12313a.setTextColor(1728053247);
        this.b.setVisibility(0);
        f fVar = new f(this, i * 1000);
        this.e = fVar;
        fVar.e();
    }
}
