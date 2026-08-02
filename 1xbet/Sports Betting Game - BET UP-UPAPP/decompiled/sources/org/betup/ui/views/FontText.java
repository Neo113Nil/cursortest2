package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import org.betup.R;
import org.betup.utils.FontManager;

/* loaded from: classes4.dex */
public class FontText extends AppCompatTextView {
    public FontText(Context context) {
        this(context, null);
    }

    public FontText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FontText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray obtainStyledAttributes;
        if (isInEditMode() || (obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FontText)) == null) {
            return;
        }
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            setPaintFlags(getPaintFlags() | 8);
        }
        if (!TextUtils.isEmpty(string)) {
            int style = getTypeface() != null ? getTypeface().getStyle() : 0;
            Typeface font = ResourcesCompat.getFont(context, (style == 1 || style == 3) ? R.font.open_sans_bold : R.font.open_sans_regular);
            if (font != null) {
                setTypeface(font, style);
            } else {
                font = FontManager.getInstance().getFont(string);
                if (font != null) {
                    setTypeface(font, style);
                }
            }
            if (font == null) {
                Log.d("FontText", String.format("Could not create a font from asset: %s", string));
            }
        }
        obtainStyledAttributes.recycle();
    }
}
