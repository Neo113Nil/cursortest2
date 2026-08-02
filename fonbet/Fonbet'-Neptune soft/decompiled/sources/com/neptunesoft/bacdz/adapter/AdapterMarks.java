package com.neptunesoft.bacdz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.classobjects.Mark;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class AdapterMarks extends RecyclerView.Adapter {
    private final List list;
    private ItemClickListener mClickListener;

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public AdapterMarks(List list) {
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MarksHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_marks, parent, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        char c;
        char c2;
        Mark mark = (Mark) this.list.get(position);
        MarksHolder marksHolder = (MarksHolder) holder;
        double behavior = ((mark.getBehavior() + mark.getAssumption()) + (mark.getTest() * 2.0d)) / 4.0d;
        marksHolder.txtModuleAvg.setText(mark.getArticle() + " | معدل المادة : " + String.format(Locale.ENGLISH, "%.02f", Double.valueOf(behavior)));
        marksHolder.txtMarks.setText("المعامل : " + String.format(Locale.ENGLISH, TimeModel.NUMBER_FORMAT, Integer.valueOf(mark.getFactor())) + " | التقويم : " + String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getBehavior())) + " | الفروض : " + String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getAssumption())) + " | الإختبار : " + String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getTest())));
        if (mark.isDarkmode()) {
            String article = mark.getArticle();
            article.hashCode();
            switch (article.hashCode()) {
                case -1704134971:
                    if (article.equals("رياضيات")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1152333126:
                    if (article.equals("ت.بدنية")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -567159244:
                    if (article.equals("ع.طبيعية")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107007508:
                    if (article.equals("ع.فيزيائية")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 463656709:
                    if (article.equals("ل.عربية")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1017049382:
                    if (article.equals("ل.أمازيغية")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1111576638:
                    if (article.equals("ع.إسلامية")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1238989689:
                    if (article.equals("إجتماعيات")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1254967882:
                    if (article.equals("ل.إنجليزية")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1527918200:
                    if (article.equals("فلسفة")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1718363526:
                    if (article.equals("ل.فرنسية")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_math_dark);
                    break;
                case 1:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_sport_dark);
                    break;
                case 2:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_science_dark);
                    break;
                case 3:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_physique_dark);
                    break;
                case 4:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_arabic_dark);
                    break;
                case 5:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_tamazight_dark);
                    break;
                case 6:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_islam_dark);
                    break;
                case 7:
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_hisgeo_dark);
                    break;
                case '\b':
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_english_dark);
                    break;
                case '\t':
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_phylosophie_dark);
                    break;
                case '\n':
                    marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_frensh_dark);
                    break;
            }
        }
        String article2 = mark.getArticle();
        article2.hashCode();
        switch (article2.hashCode()) {
            case -1704134971:
                if (article2.equals("رياضيات")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1152333126:
                if (article2.equals("ت.بدنية")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -567159244:
                if (article2.equals("ع.طبيعية")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107007508:
                if (article2.equals("ع.فيزيائية")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 463656709:
                if (article2.equals("ل.عربية")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1017049382:
                if (article2.equals("ل.أمازيغية")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1111576638:
                if (article2.equals("ع.إسلامية")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1238989689:
                if (article2.equals("إجتماعيات")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1254967882:
                if (article2.equals("ل.إنجليزية")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1527918200:
                if (article2.equals("فلسفة")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1718363526:
                if (article2.equals("ل.فرنسية")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_math);
                break;
            case 1:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_sport);
                break;
            case 2:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_science);
                break;
            case 3:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_physique);
                break;
            case 4:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_arabic);
                break;
            case 5:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_tamazight);
                break;
            case 6:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_islam);
                break;
            case 7:
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_hisgeo);
                break;
            case '\b':
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_english);
                break;
            case '\t':
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_phylosophie);
                break;
            case '\n':
                marksHolder.imgItemMarks.setImageResource(R.drawable.ic_module_frensh);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public class MarksHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgItemMarks;
        TextView txtMarks;
        TextView txtModuleAvg;

        MarksHolder(View itemView) {
            super(itemView);
            this.txtModuleAvg = (TextView) itemView.findViewById(R.id.txtModuleAvg);
            this.txtMarks = (TextView) itemView.findViewById(R.id.txtMarks);
            this.imgItemMarks = (ImageView) itemView.findViewById(R.id.imgItemMarks);
            itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AdapterMarks.this.mClickListener != null) {
                AdapterMarks.this.mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
}
