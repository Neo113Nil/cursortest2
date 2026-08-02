package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;
import org.betup.R;

/* loaded from: classes4.dex */
public final class MoneyView extends LinearLayout {
    private Drawable coinIcon;
    private String numberText;
    private int textSize;

    public MoneyView(Context context) {
        super(context);
        init(null);
    }

    public MoneyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs != null ? context.getTheme().obtainStyledAttributes(attrs, R.styleable.MoneyView, 0, 0) : null);
    }

    public MoneyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs != null ? context.getTheme().obtainStyledAttributes(attrs, R.styleable.MoneyView, 0, 0) : null);
    }

    public void setText(int strRes) {
        setIfValid(getContext().getString(strRes));
        updateView();
    }

    public void setText(String text) {
        setIfValid(text);
        updateView();
    }

    public void setCoinIcon(int coinIcon) {
        this.coinIcon = getContext().getResources().getDrawable(coinIcon);
        updateView();
    }

    private void init(TypedArray array) {
        if (array != null) {
            this.numberText = String.valueOf(array.getInteger(2, 1000));
            Drawable drawable = array.getDrawable(0);
            this.coinIcon = drawable;
            if (drawable == null) {
                this.coinIcon = getContext().getResources().getDrawable(R.drawable.betcoin);
            }
            this.textSize = (int) array.getDimension(1, 14.0f);
        }
        updateView();
    }

    private void setIfValid(String text) {
        if (this.numberText.contains("[a-zA-Z]+")) {
            throw new NumberFormatException("The text provided for MoneyView should contain only numbers!");
        }
        this.numberText = text;
        updateView();
    }

    private void updateView() {
        removeAllViews();
        setOrientation(0);
        setGravity(17);
        addView(fromDrawable(this.coinIcon));
        for (int i = 0; i < this.numberText.length(); i++) {
            addView(newChar(this.numberText.charAt(i)));
        }
    }

    private ImageView newChar(char c) {
        return fromResource(getResourceId(String.format(Locale.getDefault(), "letter_%s", String.valueOf(c)), "drawable", getContext().getPackageName()));
    }

    private ImageView fromDrawable(Drawable res) {
        ImageView imageView = new ImageView(getContext());
        int i = this.textSize;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i * 4, i * 5));
        imageView.setImageDrawable(res);
        return imageView;
    }

    private ImageView fromResource(int res) {
        ImageView imageView = new ImageView(getContext());
        int i = this.textSize;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i * 2, i * 3));
        imageView.setImageResource(res);
        return imageView;
    }

    public int getResourceId(String pVariableName, String pResourcename, String pPackageName) {
        try {
            return getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
