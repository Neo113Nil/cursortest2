package com.bytedance.sdk.openadsdk.gbb.pcc.sf;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.wh.gm;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.vj;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class pcc extends gm {
    private InterfaceC0185pcc gm;
    private Context pcc;
    private vj sf;

    /* renamed from: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0185pcc {
        void pcc();

        void sf();
    }

    public pcc(Context context) {
        super(context);
        this.pcc = context;
        sf();
    }

    private void sf() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        vj vjVar = new vj(this.pcc);
        this.sf = vjVar;
        vjVar.setOrientation(1);
        this.sf.setGravity(80);
        this.sf.setPadding(pcc(0.0f), 0, pcc(0.0f), pcc(34.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(pcc(16.0f));
        gradientDrawable.setColor(-1);
        this.sf.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = pcc(16.0f);
        this.sf.setLayoutParams(layoutParams);
        vj vjVar2 = new vj(this.pcc);
        vjVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, pcc(52.0f)));
        vjVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pcc.this.gm != null) {
                    pcc.this.gm.pcc();
                }
            }
        });
        Context context = this.pcc;
        String string = context.getString(tz.sf(context, "tt_history_delete_all"));
        kj kjVar = new kj(this.pcc);
        kjVar.setText(string);
        kjVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        kjVar.setTextColor(SupportMenu.CATEGORY_MASK);
        kjVar.setTextSize(2, 15.0f);
        kjVar.setGravity(17);
        vjVar2.addView(kjVar);
        vjVar2.setGravity(17);
        this.sf.addView(vjVar2);
        vj vjVar3 = new vj(this.pcc);
        vjVar3.setLayoutParams(new LinearLayout.LayoutParams(-1, pcc(8.0f)));
        vjVar3.setBackgroundColor(Color.argb(8, 22, 24, 35));
        this.sf.addView(vjVar3);
        vj vjVar4 = new vj(this.pcc);
        vjVar4.setLayoutParams(new LinearLayout.LayoutParams(-1, pcc(52.0f)));
        vjVar4.setGravity(17);
        vjVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pcc.this.gm != null) {
                    pcc.this.gm.sf();
                }
            }
        });
        kj kjVar2 = new kj(this.pcc);
        Context context2 = this.pcc;
        kjVar2.setText(context2.getString(tz.sf(context2, "tt_history_cancel")));
        kjVar2.setTextAppearance(R.style.TextAppearance.Material.Medium);
        kjVar2.setTextColor(Color.parseColor("#000000"));
        kjVar2.setTextSize(2, 15.0f);
        kjVar2.setGravity(17);
        vjVar4.addView(kjVar2);
        this.sf.addView(vjVar4);
        addView(this.sf);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    Rect rect = new Rect();
                    pcc.this.sf.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        pcc.this.pcc();
                    }
                }
                return true;
            }
        });
    }

    public void pcc(View view) {
        View findViewById = view.getRootView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        if (getParent() == null) {
            ((ViewGroup) findViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void pcc() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0185pcc interfaceC0185pcc) {
        this.gm = interfaceC0185pcc;
    }

    private int pcc(float f) {
        return rj.sf(this.pcc, f);
    }
}
