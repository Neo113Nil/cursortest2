package p000;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 extends AbstractC0057bc {

    /* JADX INFO: renamed from: d */
    public FiamRelativeLayout f1421d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f1422e;

    /* JADX INFO: renamed from: f */
    public ScrollView f1423f;

    /* JADX INFO: renamed from: g */
    public Button f1424g;

    /* JADX INFO: renamed from: h */
    public View f1425h;

    /* JADX INFO: renamed from: i */
    public ImageView f1426i;

    /* JADX INFO: renamed from: j */
    public TextView f1427j;

    /* JADX INFO: renamed from: k */
    public TextView f1428k;

    /* JADX INFO: renamed from: l */
    public dq0 f1429l;

    /* JADX INFO: renamed from: m */
    public ViewTreeObserverOnGlobalLayoutListenerC0570p6 f1430m;

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: a */
    public final ad0 mo629a() {
        return this.f814b;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: c */
    public final ImageView mo631c() {
        return this.f1426i;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: d */
    public final ViewGroup mo632d() {
        return this.f1421d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: e */
    public final ViewTreeObserver.OnGlobalLayoutListener mo633e(HashMap map, y00 y00Var) {
        C0909yc c0909yc;
        View viewInflate = this.f815c.inflate(R.layout.modal, (ViewGroup) null);
        this.f1423f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f1424g = (Button) viewInflate.findViewById(R.id.button);
        this.f1425h = viewInflate.findViewById(R.id.collapse_button);
        this.f1426i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f1427j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f1428k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f1421d = (FiamRelativeLayout) viewInflate.findViewById(R.id.modal_root);
        this.f1422e = (ViewGroup) viewInflate.findViewById(R.id.modal_content_root);
        zc0 zc0Var = this.f813a;
        if (zc0Var.f9732a.equals(MessageType.MODAL)) {
            dq0 dq0Var = (dq0) zc0Var;
            this.f1429l = dq0Var;
            cc0 cc0Var = dq0Var.f1795e;
            xc1 xc1Var = dq0Var.f1794d;
            xc1 xc1Var2 = dq0Var.f1793c;
            if (cc0Var == null || TextUtils.isEmpty(cc0Var.f1215a)) {
                this.f1426i.setVisibility(8);
            } else {
                this.f1426i.setVisibility(0);
            }
            if (xc1Var2 != null) {
                String str = xc1Var2.f8887b;
                String str2 = xc1Var2.f8886a;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                TextView textView = this.f1428k;
                if (zIsEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    this.f1428k.setText(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f1428k.setTextColor(Color.parseColor(str));
                }
            }
            if (xc1Var != null) {
                String str3 = xc1Var.f8886a;
                if (TextUtils.isEmpty(str3)) {
                    this.f1423f.setVisibility(8);
                    this.f1427j.setVisibility(8);
                } else {
                    this.f1423f.setVisibility(0);
                    this.f1427j.setVisibility(0);
                    this.f1427j.setTextColor(Color.parseColor(xc1Var.f8887b));
                    this.f1427j.setText(str3);
                }
            } else {
                this.f1423f.setVisibility(8);
                this.f1427j.setVisibility(8);
            }
            C0047b2 c0047b2 = this.f1429l.f1796f;
            if (c0047b2 == null || (c0909yc = c0047b2.f685b) == null || TextUtils.isEmpty(c0909yc.f9269a.f8886a)) {
                this.f1424g.setVisibility(8);
            } else {
                AbstractC0057bc.m635g(this.f1424g, c0909yc);
                Button button = this.f1424g;
                View.OnClickListener onClickListener = (View.OnClickListener) map.get(this.f1429l.f1796f);
                if (button != null) {
                    button.setOnClickListener(onClickListener);
                }
                this.f1424g.setVisibility(0);
            }
            ImageView imageView = this.f1426i;
            ad0 ad0Var = this.f814b;
            imageView.setMaxHeight(ad0Var.m177a());
            this.f1426i.setMaxWidth(ad0Var.m178b());
            this.f1425h.setOnClickListener(y00Var);
            this.f1421d.setDismissListener(y00Var);
            AbstractC0057bc.m634f(this.f1422e, this.f1429l.f1797g);
        }
        return this.f1430m;
    }
}
