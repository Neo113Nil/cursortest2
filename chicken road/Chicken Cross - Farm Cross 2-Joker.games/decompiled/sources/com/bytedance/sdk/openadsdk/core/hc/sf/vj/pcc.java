package com.bytedance.sdk.openadsdk.core.hc.sf.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.adsdk.ugeno.yoga.sf.gm;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class pcc extends FrameLayout {
    private final C0159pcc gm;
    private oo oo;
    private final RecyclerView pcc;
    private final List<gm> sf;

    public pcc(Context context) {
        super(context);
        this.sf = new CopyOnWriteArrayList();
        C0159pcc c0159pcc = new C0159pcc();
        this.gm = c0159pcc;
        RecyclerView recyclerView = new RecyclerView(context);
        this.pcc = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0159pcc);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            this.pcc.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.pcc.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        oo ooVar = this.oo;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.wh();
        }
        super.onLayout(z, i, i2, i3, i4);
        oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void pcc(gm<View> gmVar) {
        if (gmVar == null) {
            return;
        }
        this.sf.add(gmVar);
        C0159pcc c0159pcc = this.gm;
        if (c0159pcc != null) {
            c0159pcc.notifyDataSetChanged();
        }
    }

    public void pcc(oo ooVar) {
        this.oo = ooVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.sf.vj.sf sfVar) {
        ViewGroup.LayoutParams layoutParams = this.pcc.getLayoutParams();
        layoutParams.width = sfVar.nn();
        layoutParams.height = sfVar.rnn();
        this.pcc.setLayoutParams(layoutParams);
    }

    private static class sf extends RecyclerView.ViewHolder {
        private final ViewGroup pcc;

        public sf(View view) {
            super(view);
            this.pcc = (ViewGroup) view;
        }

        public void pcc(gm gmVar) {
            View vh = gmVar.vh();
            ViewParent parent = vh.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(vh);
            }
            this.pcc.removeAllViews();
            this.pcc.addView(vh, new gm.pcc(gmVar.nn(), gmVar.rnn()));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.sf.vj.pcc$pcc, reason: collision with other inner class name */
    private class C0159pcc extends RecyclerView.Adapter<sf> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        private C0159pcc() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public sf onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.bytedance.adsdk.ugeno.yoga.sf.gm gmVar = new com.bytedance.adsdk.ugeno.yoga.sf.gm(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.sf.gm gmVar2 = (com.bytedance.adsdk.ugeno.sf.gm) pcc.this.sf.get(i);
            gmVar.setLayoutParams(new ViewGroup.LayoutParams(gmVar2.nn(), gmVar2.rnn()));
            return new sf(gmVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(sf sfVar, int i) {
            sfVar.pcc((com.bytedance.adsdk.ugeno.sf.gm) pcc.this.sf.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return pcc.this.sf.size();
        }
    }
}
