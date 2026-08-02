package org.betup.ui.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import org.betup.R;
import org.betup.utils.DimensionsUtil;

/* loaded from: classes2.dex */
public class ArcTextView extends View {
    private boolean caps;
    private int color;
    private boolean hasShadow;
    private Paint paint;
    private String text;
    private int textSize;

    public ArcTextView(Context context) {
        super(context);
        init(null);
    }

    public ArcTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ArcTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
        invalidate();
    }

    private void init(AttributeSet attrs) {
        this.textSize = DimensionsUtil.getPixelsFromDp(getContext(), 14);
        this.color = -16777216;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.ArcTextView);
            this.hasShadow = obtainStyledAttributes.getBoolean(0, false);
            this.textSize = obtainStyledAttributes.getDimensionPixelSize(4, this.textSize);
            this.color = obtainStyledAttributes.getColor(3, this.color);
            this.text = obtainStyledAttributes.getString(1);
            this.caps = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setTextSize(this.textSize);
        this.paint.setTextAlign(Paint.Align.CENTER);
        this.paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.paint.setColor(this.color);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.text;
        if (str == null) {
            return;
        }
        if (this.caps) {
            this.text = str.toUpperCase();
        }
        Path path = new Path();
        path.addArc(new RectF(0.0f, (-getHeight()) / 2.0f, getWidth(), getHeight() / 2.0f), 180.0f, -180.0f);
        this.paint.setTextSize(this.textSize);
        float measureText = this.paint.measureText(this.text);
        float width = getWidth();
        int i = this.textSize;
        this.paint.setTextSize(Math.min(i, i / ((measureText * 1.1f) / width)));
        if (this.hasShadow) {
            int pixelsFromDp = DimensionsUtil.getPixelsFromDp(getContext(), 2);
            this.paint.setColor(-16777216);
            float f = pixelsFromDp;
            canvas.drawTextOnPath(this.text, path, f, (this.textSize / 2.0f) + f, this.paint);
            this.paint.setColor(this.color);
            canvas.drawTextOnPath(this.text, path, 0.0f, this.textSize / 2.0f, this.paint);
            return;
        }
        this.paint.setColor(this.color);
        canvas.drawTextOnPath(this.text, path, 0.0f, this.textSize / 2.0f, this.paint);
    }
}
