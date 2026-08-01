package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.h.EnumC5207t;

/* renamed from: sg.bigo.ads.n.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5358D extends C5408w {
    public ImageView Q;
    public ImageView R;
    public LinearLayout S;

    public C5358D(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void B() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        boolean E = E();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int measuredWidth = this.D.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (E) {
                marginLayoutParams.rightMargin = -(marginLayoutParams.rightMargin + measuredWidth);
            } else {
                marginLayoutParams.leftMargin = -(marginLayoutParams.leftMargin + measuredWidth);
            }
            this.D.requestLayout();
        }
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void C() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        boolean E = E();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int measuredWidth = this.D.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (E) {
                marginLayoutParams.rightMargin = -(measuredWidth + marginLayoutParams.rightMargin);
            } else {
                marginLayoutParams.leftMargin = -(measuredWidth + marginLayoutParams.leftMargin);
            }
            this.D.requestLayout();
        }
    }

    public boolean E() {
        return this instanceof O;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(ViewGroup viewGroup, View view, E1 e1, int i, int i2, int i3, View... viewArr) {
        super.a(viewGroup, view, new C5356B(), i, i2, i3, viewArr);
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void b(EnumC5207t enumC5207t) {
        Button button = (Button) this.D.findViewById(R.id.inter_btn_cta);
        this.J = button;
        if (button != null) {
            float a2 = AbstractC4963u.a(button.getContext(), 8);
            this.J.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, -1));
            enumC5207t.a(this.J);
        }
    }

    public void c(int i) {
        this.D.getLayoutParams().width = i;
        ImageView imageView = this.R;
        if (imageView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(1);
            LinearLayout linearLayout = this.S;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).addRule(0, this.R.getId());
            }
        }
        this.D.requestLayout();
    }

    @Override // sg.bigo.ads.n.C5408w, sg.bigo.ads.n.AbstractC5391n
    public final void q() {
        super.q();
        if (this.E == null) {
            return;
        }
        boolean E = E();
        ViewGroup.LayoutParams layoutParams = this.E.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (E) {
                layoutParams2.addRule(18, R.id.inter_media_layout);
                layoutParams2.addRule(19, 0);
                return;
            } else {
                layoutParams2.addRule(18, 0);
                layoutParams2.addRule(19, R.id.inter_media_layout);
                return;
            }
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = E ? 3 : 5;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = E ? 3 : 5;
        }
    }

    @Override // sg.bigo.ads.n.C5408w
    public int w() {
        return R.id.inter_component_24;
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void y() {
        int a2;
        super.y();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null || this.D.getMeasuredWidth() <= (a2 = AbstractC4963u.a(realtimeBlurLinearLayout.getContext(), 288))) {
            return;
        }
        c(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00eb, code lost:
    
        r1.setImageResource(r7.f12867a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    @Override // sg.bigo.ads.n.C5408w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(EnumC5207t enumC5207t) {
        ViewGroup.LayoutParams layoutParams;
        sg.bigo.ads.h.Z z;
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        ImageView imageView3;
        Bitmap a2;
        if (!super.a(enumC5207t) || this.D == null) {
            return false;
        }
        boolean E = E();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout == null) {
            layoutParams = null;
        } else {
            ViewGroup.LayoutParams layoutParams2 = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                if (E) {
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(9, 0);
                } else {
                    layoutParams3.addRule(11, 0);
                    layoutParams3.addRule(9);
                }
            } else {
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = E ? 5 : 3;
                } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = E ? 5 : 3;
                }
            }
            layoutParams = layoutParams2;
        }
        layoutParams.width = -2;
        this.D.requestLayout();
        this.S = (LinearLayout) this.D.findViewById(R.id.inter_text_layout);
        this.Q = (ImageView) this.D.findViewById(R.id.inter_star);
        this.R = (ImageView) this.D.findViewById(R.id.inter_more);
        if (enumC5207t.ordinal() != 0) {
            z = sg.bigo.ads.h.Z.WHITE;
            if (this.D != null && (imageView3 = this.Q) != null && (a2 = AbstractC5164f1.a(imageView3.getContext(), this.d, this.y, z, true)) != null) {
                this.Q.setVisibility(0);
                this.Q.setImageBitmap(a2);
            }
            if (this.D != null) {
                imageView = this.R;
                if (imageView != null) {
                }
            }
            textView = this.H;
            if (textView != null) {
                sg.bigo.ads.K0.X.a(textView, new C5357C(this));
            }
            return true;
        }
        z = sg.bigo.ads.h.Z.BLACK;
        if (this.D != null && (imageView2 = this.Q) != null) {
            Bitmap a3 = AbstractC5164f1.a(imageView2.getContext(), this.d, this.y, z, z == sg.bigo.ads.h.Z.WHITE);
            if (a3 != null) {
                this.Q.setVisibility(0);
                this.Q.setImageBitmap(a3);
            }
        }
        if (this.D != null) {
            imageView = this.R;
            if (imageView != null) {
            }
        }
        textView = this.H;
        if (textView != null) {
        }
        return true;
    }

    public void b(int i) {
        TextView textView;
        if (i <= 1 || (textView = this.I) == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
