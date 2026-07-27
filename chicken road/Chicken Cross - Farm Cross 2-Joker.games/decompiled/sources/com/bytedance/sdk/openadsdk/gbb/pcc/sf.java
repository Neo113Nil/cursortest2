package com.bytedance.sdk.openadsdk.gbb.pcc;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.oo;
import com.bytedance.sdk.openadsdk.core.wh.vj;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class sf extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context pcc;
    private InterfaceC0186sf vj;
    private List<Object> sf = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> gm = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> oo = new ArrayList();

    /* renamed from: com.bytedance.sdk.openadsdk.gbb.pcc.sf$sf, reason: collision with other inner class name */
    public interface InterfaceC0186sf {
        void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar);
    }

    public void pcc(InterfaceC0186sf interfaceC0186sf) {
        this.vj = interfaceC0186sf;
    }

    public sf(Context context) {
        this.pcc = context.getApplicationContext();
    }

    public void pcc(List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> list) {
        this.gm.clear();
        this.oo.clear();
        if (list != null) {
            long currentTimeMillis = System.currentTimeMillis() - 604800000;
            for (com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar : list) {
                try {
                    if (Long.parseLong(pccVar.wh()) >= currentTimeMillis) {
                        this.gm.add(pccVar);
                    } else {
                        this.oo.add(pccVar);
                    }
                } catch (NumberFormatException unused) {
                    this.gm.add(pccVar);
                }
            }
        }
        pcc();
        notifyDataSetChanged();
    }

    private void pcc() {
        this.sf.clear();
        if (!this.gm.isEmpty()) {
            List<Object> list = this.sf;
            Context context = this.pcc;
            list.add(context.getString(tz.sf(context, "tt_history_this_week")));
            this.sf.addAll(this.gm);
        }
        if (this.oo.isEmpty()) {
            return;
        }
        List<Object> list2 = this.sf;
        Context context2 = this.pcc;
        list2.add(context2.getString(tz.sf(context2, "tt_history_a_week_ago")));
        this.sf.addAll(this.oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.sf.get(i) instanceof String ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            kj kjVar = new kj(this.pcc);
            kjVar.setPadding(pcc(16.0f), pcc(8.0f), 0, pcc(8.0f));
            kjVar.setTextSize(14.0f);
            kjVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
            Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
            if (create != null) {
                kjVar.setTypeface(create);
            }
            kjVar.setTextColor(Color.argb(167, 0, 0, 0));
            kjVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new gm(kjVar);
        }
        return new pcc(sf());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj = this.sf.get(i);
        if (viewHolder.getItemViewType() == 0) {
            ((gm) viewHolder).pcc.setText((String) obj);
        } else {
            ((pcc) viewHolder).pcc((com.bytedance.sdk.openadsdk.gbb.pcc.pcc) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sf.size();
    }

    private vj sf() {
        vj vjVar = new vj(this.pcc);
        vjVar.setOrientation(0);
        vjVar.setLayoutParams(new RecyclerView.LayoutParams(-1, pcc(84.0f)));
        vjVar.setPadding(pcc(16.0f), pcc(10.0f), pcc(16.0f), pcc(10.0f));
        vj vjVar2 = new vj(this.pcc);
        vjVar2.setOrientation(1);
        oo ooVar = new oo(this.pcc);
        ooVar.setId(View.generateViewId());
        ooVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ooVar.setAdjustViewBounds(true);
        ooVar.setLayoutParams(new LinearLayout.LayoutParams(pcc(64.0f), pcc(64.0f)));
        vjVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vjVar2.setPadding(pcc(8.0f), pcc(0.0f), pcc(0.0f), pcc(0.0f));
        kj kjVar = new kj(this.pcc);
        kjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        kjVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
        if (create != null) {
            kjVar.setTypeface(create);
        }
        kjVar.setLineSpacing(0.0f, 1.3f);
        kjVar.setLetterSpacing(0.0067f);
        kjVar.setTextColor(Color.argb(255, 0, 0, 0));
        kjVar.setMaxLines(1);
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        kjVar.setId(View.generateViewId());
        kjVar.setTextSize(0, pcc(14.0f));
        kjVar.setIncludeFontPadding(false);
        kj kjVar2 = new kj(this.pcc);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = pcc(4.0f);
        kjVar2.setLayoutParams(layoutParams);
        Typeface create2 = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 400, false) : null;
        if (create2 != null) {
            kjVar2.setTypeface(create2);
        }
        kjVar2.setLineSpacing(0.0f, 1.3f);
        kjVar2.setLetterSpacing(0.0067f);
        kjVar2.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar2.setMaxLines(1);
        kjVar2.setEllipsize(TextUtils.TruncateAt.END);
        kjVar2.setId(View.generateViewId());
        kjVar2.setTextSize(0, pcc(14.0f));
        kjVar2.setIncludeFontPadding(false);
        kj kjVar3 = new kj(this.pcc);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = pcc(8.0f);
        kjVar3.setLayoutParams(layoutParams2);
        kjVar3.setTextAppearance(R.style.TextAppearance.Material.Caption);
        kjVar3.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar3.setId(View.generateViewId());
        Typeface create3 = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 400, false) : null;
        if (create3 != null) {
            kjVar3.setTypeface(create3);
        }
        kjVar3.setLineSpacing(0.0f, 1.3f);
        kjVar3.setLetterSpacing(0.0067f);
        kjVar3.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar3.setMaxLines(1);
        kjVar3.setEllipsize(TextUtils.TruncateAt.END);
        kjVar3.setId(View.generateViewId());
        kjVar3.setTextSize(0, pcc(12.0f));
        kjVar3.setIncludeFontPadding(false);
        vjVar.addView(ooVar);
        vjVar.addView(vjVar2);
        vjVar2.addView(kjVar);
        vjVar2.addView(kjVar2);
        vjVar2.addView(kjVar3);
        vjVar.setTag(new View[]{ooVar, kjVar, kjVar2, kjVar3});
        return vjVar;
    }

    class gm extends RecyclerView.ViewHolder {
        kj pcc;

        gm(View view) {
            super(view);
            this.pcc = (kj) view;
        }
    }

    class pcc extends RecyclerView.ViewHolder {
        kj gm;
        kj oo;
        oo pcc;
        kj sf;

        pcc(View view) {
            super(view);
            View[] viewArr = (View[]) view.getTag();
            this.pcc = (oo) viewArr[0];
            this.sf = (kj) viewArr[1];
            this.gm = (kj) viewArr[2];
            this.oo = (kj) viewArr[3];
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int adapterPosition = pcc.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object obj = sf.this.sf.get(adapterPosition);
                        if (obj instanceof com.bytedance.sdk.openadsdk.gbb.pcc.pcc) {
                            sf.this.pcc((com.bytedance.sdk.openadsdk.gbb.pcc.pcc) obj);
                        }
                    }
                }
            });
        }

        void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
            try {
                String vj = pccVar.vj();
                this.sf.setText(pccVar.oo());
                this.gm.setText(vj);
                this.oo.setText(new SimpleDateFormat("MMM dd · HH:mm", Locale.US).format(new Date(Long.parseLong(pccVar.wh()))));
                this.pcc.setImageResource(com.bytedance.R.drawable.tt_history_placeholder);
                if (TextUtils.isEmpty(vj)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ork.oo.pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(vj)).gm(1).pcc(this.pcc);
            } catch (Exception e) {
                lo.pcc("IABHSecAdapter", "bind error: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        InterfaceC0186sf interfaceC0186sf = this.vj;
        if (interfaceC0186sf != null) {
            interfaceC0186sf.pcc(pccVar);
        }
    }

    private int pcc(float f) {
        return rj.sf(this.pcc, f);
    }
}
