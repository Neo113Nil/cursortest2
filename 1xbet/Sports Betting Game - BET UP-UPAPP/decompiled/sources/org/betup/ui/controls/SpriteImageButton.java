package org.betup.ui.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public class SpriteImageButton extends AlphaPressButton {
    private ImageView buttonBackground;
    private ImageView buttonIcon;
    private TextView buttonTitle;
    private int horizontalPadding;
    private int iconRes;
    private int spriteRes;
    private String title;
    private int verticalPadding;

    public SpriteImageButton(Context context) {
        super(context);
        init(null);
    }

    public SpriteImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public SpriteImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attributeSet) {
        setGravity(17);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpriteImageButton);
            this.spriteRes = obtainStyledAttributes.getResourceId(2, 0);
            this.iconRes = obtainStyledAttributes.getResourceId(1, 0);
            this.title = obtainStyledAttributes.getString(3);
            this.verticalPadding = obtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.ok_button_vertical_padding));
            this.horizontalPadding = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(R.dimen.ok_button_horizontal_padding));
            if (this.title == null) {
                this.title = obtainStyledAttributes.getNonResourceString(3);
            }
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.sprite_button_layout, (ViewGroup) this, true);
        this.buttonBackground = (ImageView) findViewById(R.id.buttonBackground);
        this.buttonIcon = (ImageView) findViewById(R.id.buttonIcon);
        this.buttonTitle = (TextView) findViewById(R.id.buttonTitle);
        View findViewById = findViewById(R.id.endMargin);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.rightMargin = this.horizontalPadding;
        findViewById.setLayoutParams(layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.buttonTitle.getLayoutParams();
        layoutParams2.leftMargin = this.horizontalPadding;
        layoutParams2.topMargin = this.verticalPadding;
        layoutParams2.bottomMargin = this.verticalPadding;
        this.buttonTitle.setLayoutParams(layoutParams2);
        updateView();
    }

    private void updateView() {
        if (this.iconRes == 0) {
            this.buttonIcon.setVisibility(8);
        } else {
            this.buttonIcon.setVisibility(0);
            this.buttonIcon.setImageResource(this.iconRes);
        }
        this.buttonTitle.setText(this.title);
        this.buttonBackground.setImageResource(this.spriteRes);
    }

    public int getSpriteRes() {
        return this.spriteRes;
    }

    public void setSpriteRes(int spriteRes) {
        this.spriteRes = spriteRes;
        updateView();
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
        updateView();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
        updateView();
    }
}
