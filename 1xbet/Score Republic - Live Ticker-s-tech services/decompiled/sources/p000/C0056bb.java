package p000;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: bb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0056bb extends AbstractC0057bc {

    /* JADX INFO: renamed from: d */
    public FiamFrameLayout f805d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f806e;

    /* JADX INFO: renamed from: f */
    public TextView f807f;

    /* JADX INFO: renamed from: g */
    public ResizableImageView f808g;

    /* JADX INFO: renamed from: h */
    public TextView f809h;

    /* JADX INFO: renamed from: i */
    public y00 f810i;

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: a */
    public final ad0 mo629a() {
        return this.f814b;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: b */
    public final View.OnClickListener mo630b() {
        return this.f810i;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: c */
    public final ImageView mo631c() {
        return this.f808g;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: d */
    public final ViewGroup mo632d() {
        return this.f805d;
    }

    @Override // p000.AbstractC0057bc
    /* JADX INFO: renamed from: e */
    public final ViewTreeObserver.OnGlobalLayoutListener mo633e(HashMap map, y00 y00Var) {
        View viewInflate = this.f815c.inflate(R.layout.banner, (ViewGroup) null);
        this.f805d = (FiamFrameLayout) viewInflate.findViewById(R.id.banner_root);
        this.f806e = (ViewGroup) viewInflate.findViewById(R.id.banner_content_root);
        this.f807f = (TextView) viewInflate.findViewById(R.id.banner_body);
        this.f808g = (ResizableImageView) viewInflate.findViewById(R.id.banner_image);
        this.f809h = (TextView) viewInflate.findViewById(R.id.banner_title);
        zc0 zc0Var = this.f813a;
        if (zc0Var.f9732a.equals(MessageType.BANNER)) {
            C0132db c0132db = (C0132db) zc0Var;
            String str = c0132db.f1608g;
            xc1 xc1Var = c0132db.f1605d;
            xc1 xc1Var2 = c0132db.f1604c;
            if (!TextUtils.isEmpty(str)) {
                AbstractC0057bc.m634f(this.f806e, str);
            }
            ResizableImageView resizableImageView = this.f808g;
            cc0 cc0Var = c0132db.f1606e;
            resizableImageView.setVisibility((cc0Var == null || TextUtils.isEmpty(cc0Var.f1215a)) ? 8 : 0);
            if (xc1Var2 != null) {
                String str2 = xc1Var2.f8887b;
                String str3 = xc1Var2.f8886a;
                if (!TextUtils.isEmpty(str3)) {
                    this.f809h.setText(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f809h.setTextColor(Color.parseColor(str2));
                }
            }
            if (xc1Var != null) {
                String str4 = xc1Var.f8887b;
                String str5 = xc1Var.f8886a;
                if (!TextUtils.isEmpty(str5)) {
                    this.f807f.setText(str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.f807f.setTextColor(Color.parseColor(str4));
                }
            }
            ad0 ad0Var = this.f814b;
            int iMin = Math.min(ad0Var.f145d.intValue(), ad0Var.f144c.intValue());
            ViewGroup.LayoutParams layoutParams = this.f805d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.f805d.setLayoutParams(layoutParams);
            this.f808g.setMaxHeight(ad0Var.m177a());
            this.f808g.setMaxWidth(ad0Var.m178b());
            this.f810i = y00Var;
            this.f805d.setDismissListener(y00Var);
            this.f806e.setOnClickListener((View.OnClickListener) map.get(c0132db.f1607f));
        }
        return null;
    }
}
