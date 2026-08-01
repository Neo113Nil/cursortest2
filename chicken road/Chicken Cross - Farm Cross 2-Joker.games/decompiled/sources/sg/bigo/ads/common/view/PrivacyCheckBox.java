package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.L0.j;
import sg.bigo.ads.L0.k;
import sg.bigo.ads.L0.l;
import sg.bigo.ads.L0.m;
import sg.bigo.ads.L0.n;
import sg.bigo.ads.L0.o;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public class PrivacyCheckBox extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f12711a;
    public int b;
    public float c;
    public final Paint d;
    public float e;
    public boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final PorterDuffXfermode k;
    public final float l;
    public final k m;
    public n n;

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer((-this.f12711a) / 2.0f, (-this.b) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f12711a / 2, this.b / 2);
        this.m.a(canvas);
        this.m.b(canvas);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = 80;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(80, size) : 80;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            i3 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(80, size2);
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12711a = i;
        this.b = i2;
        this.c = (Math.min(i, i2) / 2.0f) * 0.9f;
        this.e = (Math.min(this.f12711a, this.b) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(n nVar) {
        this.n = nVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new o(this, onClickListener));
    }

    public PrivacyCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivacyCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        k mVar;
        float f = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BigoAd_PrivacyCheckBox, i, 0);
            this.g = obtainStyledAttributes.getColor(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_check_circle_color, -16736769);
            this.h = obtainStyledAttributes.getColor(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_uncheck_circle_color, -1);
            this.i = obtainStyledAttributes.getColor(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_check_hook_color, ViewCompat.MEASURED_STATE_MASK);
            this.j = obtainStyledAttributes.getColor(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_uncheck_hook_color, -1);
            i2 = obtainStyledAttributes.getInt(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_style, 1);
            this.f = obtainStyledAttributes.getBoolean(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_is_check, false);
            this.l = obtainStyledAttributes.getDimension(R.styleable.BigoAd_PrivacyCheckBox_bigo_ad_hcb_line_width, f);
            obtainStyledAttributes.recycle();
        } else {
            this.g = -16736769;
            this.h = -1;
            this.i = ViewCompat.MEASURED_STATE_MASK;
            this.j = -1;
            this.l = f;
            this.f = false;
            i2 = 1;
        }
        if (i2 != 2) {
            mVar = i2 == 1 ? new m(this) : mVar;
            Paint paint = new Paint();
            this.d = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.h);
            paint.setStrokeWidth(this.l);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new j());
        }
        mVar = new l(this);
        this.m = mVar;
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.h);
        paint2.setStrokeWidth(this.l);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new j());
    }
}
