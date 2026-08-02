package org.betup.ui.fragment.home.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import java.util.Locale;
import org.betup.R;
import org.betup.model.remote.entity.user.homescreen.Slide;
import org.betup.utils.DateHelper;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class SliderAdapter extends RecyclerView.Adapter<SlideHolder> {
    private Context context;
    private boolean first;
    private LayoutInflater layoutInflater;
    private SlideClickListener listener;
    private List<Slide> slides;

    public interface SlideClickListener {
        void onSlideClick(Slide slide);
    }

    public class SlideHolder_ViewBinding implements Unbinder {
        private SlideHolder target;
        private View view7f0a038b;

        public SlideHolder_ViewBinding(final SlideHolder target, View source) {
            this.target = target;
            View findRequiredView = Utils.findRequiredView(source, R.id.img, "field 'img' and method 'onImgClick'");
            target.img = (ImageView) Utils.castView(findRequiredView, R.id.img, "field 'img'", ImageView.class);
            this.view7f0a038b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.adapter.SliderAdapter.SlideHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onImgClick(p0);
                }
            });
            target.container = Utils.findRequiredView(source, R.id.container, "field 'container'");
            target.time = (TextView) Utils.findRequiredViewAsType(source, R.id.time, "field 'time'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            SlideHolder slideHolder = this.target;
            if (slideHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            slideHolder.img = null;
            slideHolder.container = null;
            slideHolder.time = null;
            this.view7f0a038b.setOnClickListener(null);
            this.view7f0a038b = null;
        }
    }

    public SliderAdapter(Context context, List<Slide> slides, SlideClickListener listener) {
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.context = context;
        this.slides = slides;
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SlideHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SlideHolder(this.layoutInflater.inflate(R.layout.item_slide, parent, false), this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SlideHolder holder, int position) {
        if (!this.first && position == 0) {
            holder.fadeIn(this.context);
            this.first = true;
        }
        holder.slide = this.slides.get(position);
        PicassoHelper.with(this.context).setImageView(holder.img).setImageUrl(holder.slide.getPhotoUrl()).load();
        if (holder.slide.isShowLabel()) {
            holder.time.setText(String.format(Locale.getDefault(), "%s, %s", DateHelper.getDate(holder.slide.getStartDate()), DateHelper.getTime(holder.slide.getStartDate())));
        } else {
            holder.time.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.slides.size();
    }

    public static class SlideHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.container)
        View container;

        @BindView(R.id.img)
        ImageView img;
        private SlideClickListener listener;
        private Slide slide;

        @BindView(R.id.time)
        TextView time;

        public void fadeOut(Context context) {
            this.container.setAlpha(1.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.container, "alpha", 0.35f);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }

        public void fadeIn(Context context) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.container, "alpha", 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }

        public SlideHolder(View itemView, SlideClickListener listener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            this.listener = listener;
        }

        @OnClick({R.id.img})
        public void onImgClick(View img) {
            this.listener.onSlideClick(this.slide);
        }
    }
}
