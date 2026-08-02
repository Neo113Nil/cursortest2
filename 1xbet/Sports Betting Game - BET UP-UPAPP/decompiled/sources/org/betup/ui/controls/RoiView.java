package org.betup.ui.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.Locale;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.RoiUtil;
import org.betup.utils.TooltipUtil;

/* loaded from: classes2.dex */
public class RoiView extends LinearLayout implements View.OnClickListener {
    private ImageView arrow;
    private double currentValue;
    private ScaleRatingBar roiView;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    public RoiView(Context context) {
        super(context);
    }

    public RoiView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RoiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        setOnClickListener(this);
        setOrientation(0);
        setGravity(17);
        this.arrow = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DimensionsUtil.getPixelsFromDp(getContext(), 16), DimensionsUtil.getPixelsFromDp(getContext(), 16));
        layoutParams.rightMargin = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        this.arrow.setLayoutParams(layoutParams);
        this.roiView = new ScaleRatingBar(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        layoutParams2.bottomMargin = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        layoutParams2.leftMargin = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        layoutParams2.rightMargin = DimensionsUtil.getPixelsFromDp(getContext(), 2);
        this.roiView.setStarWidth(DimensionsUtil.getPixelsFromDp(getContext(), 16));
        this.roiView.setStarHeight(DimensionsUtil.getPixelsFromDp(getContext(), 16));
        this.roiView.setStarPadding(DimensionsUtil.getPixelsFromDp(getContext(), 2));
        this.roiView.setNumStars(5);
        this.roiView.setLayoutParams(layoutParams2);
        addView(this.roiView);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        TooltipUtil.displayTooltip(this.roiView, String.format(Locale.getDefault(), "%d %%", Integer.valueOf((int) this.currentValue)));
    }

    public void setValue(double roi, double change) {
        this.currentValue = roi;
        this.roiView.setRating(RoiUtil.getStars((float) roi));
    }
}
