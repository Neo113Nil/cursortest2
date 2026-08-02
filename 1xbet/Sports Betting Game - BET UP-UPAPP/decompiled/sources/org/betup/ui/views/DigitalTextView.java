package org.betup.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import io.sentry.Session;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.R;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.IntUtilKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DigitalTextView.kt */
@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\b\u0004*\u00018\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000201H\u0014J\b\u00105\u001a\u000201H\u0002J\b\u00106\u001a\u000201H\u0002J\u0010\u0010:\u001a\u0002012\u0006\u0010(\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R$\u0010+\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0004\n\u0002\u00109¨\u0006;"}, d2 = {"Lorg/betup/ui/views/DigitalTextView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_digitCount", "_bottomBound", "_upperBound", "_randomizer", "Ljava/util/Random;", "_digitalTextHandler", "Landroid/os/Handler;", "_number", "textView", "Landroid/widget/TextView;", "_flickeringAnimationDuration", "", "_isFlickering", "", "digitalTextColor", "value", "bottomBound", "getBottomBound", "()I", "setBottomBound", "(I)V", "upperBound", "getUpperBound", "setUpperBound", "isFlickering", "()Z", "setFlickering", "(Z)V", "number", "getNumber", "setNumber", "delay", "getDelay", "()J", "setDelay", "(J)V", "setup", "", "spTextSize", "", "onDetachedFromWindow", TtmlNode.START, "stop", "runListener", "org/betup/ui/views/DigitalTextView$runListener$1", "Lorg/betup/ui/views/DigitalTextView$runListener$1;", "setNumberInternal", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigitalTextView extends FrameLayout {
    public static final int $stable = 8;
    private int _bottomBound;
    private int _digitCount;
    private final Handler _digitalTextHandler;
    private long _flickeringAnimationDuration;
    private boolean _isFlickering;
    private int _number;
    private final Random _randomizer;
    private int _upperBound;
    private int digitalTextColor;
    private final DigitalTextView$runListener$1 runListener;
    private TextView textView;

    public final int getBottomBound() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.betup.ui.views.DigitalTextView$runListener$1] */
    public DigitalTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._upperBound = 99;
        this._randomizer = new Random();
        this._digitalTextHandler = new Handler();
        this.textView = new TextView(getContext());
        this._flickeringAnimationDuration = 250L;
        this.digitalTextColor = -1;
        this.runListener = new Runnable() { // from class: org.betup.ui.views.DigitalTextView$runListener$1
            @Override // java.lang.Runnable
            public void run() {
                Random random;
                Handler handler;
                random = DigitalTextView.this._randomizer;
                DigitalTextView.this.setNumberInternal(random.nextInt(DigitalTextView.this.get_upperBound() - DigitalTextView.this.getBottomBound()) + DigitalTextView.this.getBottomBound());
                handler = DigitalTextView.this._digitalTextHandler;
                handler.postDelayed(this, 50L);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigitalTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.betup.ui.views.DigitalTextView$runListener$1] */
    public DigitalTextView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._upperBound = 99;
        this._randomizer = new Random();
        this._digitalTextHandler = new Handler();
        this.textView = new TextView(getContext());
        this._flickeringAnimationDuration = 250L;
        this.digitalTextColor = -1;
        this.runListener = new Runnable() { // from class: org.betup.ui.views.DigitalTextView$runListener$1
            @Override // java.lang.Runnable
            public void run() {
                Random random;
                Handler handler;
                random = DigitalTextView.this._randomizer;
                DigitalTextView.this.setNumberInternal(random.nextInt(DigitalTextView.this.get_upperBound() - DigitalTextView.this.getBottomBound()) + DigitalTextView.this.getBottomBound());
                handler = DigitalTextView.this._digitalTextHandler;
                handler.postDelayed(this, 50L);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.DigitalTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(3, 32.0f);
        this._flickeringAnimationDuration = obtainStyledAttributes.getInt(0, 250);
        setFlickering(obtainStyledAttributes.getBoolean(2, false));
        setBottomBound(obtainStyledAttributes.getInt(1, 0));
        setUpperBound(obtainStyledAttributes.getInt(4, 99));
        if (getBottomBound() > get_upperBound()) {
            throw new IllegalArgumentException("Invalid bounds!".toString());
        }
        setNumber(getBottomBound());
        setup(dimension);
        obtainStyledAttributes.recycle();
    }

    public final void setBottomBound(int i) {
        this._bottomBound = i;
    }

    /* renamed from: getUpperBound, reason: from getter */
    public final int get_upperBound() {
        return this._upperBound;
    }

    public final void setUpperBound(int i) {
        if (i >= 0 && i < 2) {
            this._upperBound = 2;
            this._digitCount = 1;
        }
        this._upperBound = i - 1;
        this._digitCount = IntUtilKt.countDigits(i);
    }

    /* renamed from: isFlickering, reason: from getter */
    public final boolean get_isFlickering() {
        return this._isFlickering;
    }

    public final void setFlickering(boolean z) {
        if (!get_isFlickering() && z) {
            start();
        } else {
            if (!get_isFlickering() || z) {
                return;
            }
            stop();
        }
    }

    /* renamed from: getNumber, reason: from getter */
    public final int get_number() {
        return this._number;
    }

    public final void setNumber(int i) {
        int bottomBound;
        int bottomBound2 = getBottomBound();
        if (i >= get_upperBound() || bottomBound2 > i) {
            bottomBound = i < getBottomBound() ? getBottomBound() : get_upperBound();
        } else {
            bottomBound = i;
        }
        this._number = bottomBound;
        stop();
        setNumberInternal(i);
    }

    /* renamed from: getDelay, reason: from getter */
    public final long get_flickeringAnimationDuration() {
        return this._flickeringAnimationDuration;
    }

    public final void setDelay(long j) {
        this._flickeringAnimationDuration = Math.min(15000L, Math.max(1L, j));
    }

    private final void setup(float spTextSize) {
        Paint paint = new Paint();
        Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/digital_strong.ttf");
        paint.setTypeface(createFromAsset);
        paint.setTextSize(DimensionsUtil.getPixelsFromSp(getContext(), spTextSize));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%0" + IntUtilKt.countDigits(get_upperBound()) + "d", Arrays.copyOf(new Object[]{0}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        float measureText = paint.measureText(format);
        TextView textView = this.textView;
        textView.setTypeface(createFromAsset);
        textView.setTextColor(this.digitalTextColor);
        textView.setTextSize(spTextSize);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) measureText, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = DimensionsUtil.getPixelsFromDp(textView.getContext(), 4);
        layoutParams.rightMargin = DimensionsUtil.getPixelsFromDp(textView.getContext(), 4);
        layoutParams.topMargin = DimensionsUtil.getPixelsFromDp(textView.getContext(), 4);
        layoutParams.bottomMargin = DimensionsUtil.getPixelsFromDp(textView.getContext(), 4);
        textView.setLayoutParams(layoutParams);
        addView(this.textView);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setFlickering(false);
        this._digitalTextHandler.removeCallbacks(this.runListener);
    }

    private final void start() {
        this.textView.postDelayed(this.runListener, 0L);
        this._isFlickering = true;
    }

    private final void stop() {
        this._digitalTextHandler.removeCallbacks(this.runListener);
        this._isFlickering = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNumberInternal(int number) {
        TextView textView = this.textView;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%0" + this._digitCount + "d", Arrays.copyOf(new Object[]{Integer.valueOf(number)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
    }
}
