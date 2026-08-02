package p000;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: ff */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209ff extends AbstractC0057bc {

    /* JADX INFO: renamed from: d */
    public FiamCardView f2383d;

    /* JADX INFO: renamed from: e */
    public AbstractC0612qb f2384e;

    /* JADX INFO: renamed from: f */
    public ScrollView f2385f;

    /* JADX INFO: renamed from: g */
    public Button f2386g;

    /* JADX INFO: renamed from: h */
    public Button f2387h;

    /* JADX INFO: renamed from: i */
    public ImageView f2388i;

    /* JADX INFO: renamed from: j */
    public TextView f2389j;

    /* JADX INFO: renamed from: k */
    public TextView f2390k;

    /* JADX INFO: renamed from: l */
    public C0247gf f2391l;

    /* JADX INFO: renamed from: m */
    public y00 f2392m;

    /* JADX INFO: renamed from: n */
    public ViewTreeObserverOnGlobalLayoutListenerC0570p6 f2393n;

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: a */
    public final ad0 mo629a() {
        return this.f814b;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: b */
    public final View.OnClickListener mo630b() {
        return this.f2392m;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: c */
    public final ImageView mo631c() {
        return this.f2388i;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: d */
    public final ViewGroup mo632d() {
        return this.f2383d;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: e */
    public final ViewTreeObserver.OnGlobalLayoutListener mo633e(HashMap map, y00 y00Var) {
        C0909yc c0909yc;
        String str;
        View viewInflate = this.f815c.inflate(R.layout.card, (ViewGroup) null);
        this.f2385f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f2386g = (Button) viewInflate.findViewById(R.id.primary_button);
        this.f2387h = (Button) viewInflate.findViewById(R.id.secondary_button);
        this.f2388i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f2389j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f2390k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f2383d = (FiamCardView) viewInflate.findViewById(R.id.card_root);
        this.f2384e = (AbstractC0612qb) viewInflate.findViewById(R.id.card_content_root);
        zc0 zc0Var = this.f813a;
        if (zc0Var.f9732a.equals(MessageType.CARD)) {
            C0247gf c0247gf = (C0247gf) zc0Var;
            xc1 xc1Var = c0247gf.f2713c;
            this.f2391l = c0247gf;
            this.f2390k.setText(xc1Var.f8886a);
            this.f2390k.setTextColor(Color.parseColor(xc1Var.f8887b));
            xc1 xc1Var2 = c0247gf.f2714d;
            if (xc1Var2 == null || (str = xc1Var2.f8886a) == null) {
                this.f2385f.setVisibility(8);
                this.f2389j.setVisibility(8);
            } else {
                this.f2385f.setVisibility(0);
                this.f2389j.setVisibility(0);
                this.f2389j.setText(str);
                this.f2389j.setTextColor(Color.parseColor(xc1Var2.f8887b));
            }
            C0247gf c0247gf2 = this.f2391l;
            if (c0247gf2.f2718h == null && c0247gf2.f2719i == null) {
                this.f2388i.setVisibility(8);
            } else {
                this.f2388i.setVisibility(0);
            }
            C0247gf c0247gf3 = this.f2391l;
            C0047b2 c0047b2 = c0247gf3.f2716f;
            C0047b2 c0047b3 = c0247gf3.f2717g;
            AbstractC0057bc.m635g(this.f2386g, c0047b2.f685b);
            Button button = this.f2386g;
            View.OnClickListener onClickListener = (View.OnClickListener) map.get(c0047b2);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
            this.f2386g.setVisibility(0);
            if (c0047b3 == null || (c0909yc = c0047b3.f685b) == null) {
                this.f2387h.setVisibility(8);
            } else {
                AbstractC0057bc.m635g(this.f2387h, c0909yc);
                Button button2 = this.f2387h;
                View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(c0047b3);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.f2387h.setVisibility(0);
            }
            ImageView imageView = this.f2388i;
            ad0 ad0Var = this.f814b;
            imageView.setMaxHeight(ad0Var.m177a());
            this.f2388i.setMaxWidth(ad0Var.m178b());
            this.f2392m = y00Var;
            this.f2383d.setDismissListener(y00Var);
            AbstractC0057bc.m634f(this.f2384e, this.f2391l.f2715e);
        }
        return this.f2393n;
    }
}
