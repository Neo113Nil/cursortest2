package J90;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* loaded from: classes3.dex */
public final class h extends View {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Paint f14254a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f14255b;

    /* renamed from: c, reason: collision with root package name */
    private a f14256c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14257d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14258e;

    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            h hVar = h.this;
            hVar.requestLayout();
            hVar.invalidate();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(androidx.core.content.a.getColor(context, R.color.oz_semantic_text_secondary));
        paint.setTextAlign(Paint.Align.RIGHT);
        paint.setTextSize(UiExtKt.toSp(14));
        this.f14254a = paint;
        this.f14257d = UiExtKt.toDp(8);
        this.f14258e = (int) (4 / Resources.getSystem().getDisplayMetrics().density);
    }

    public final void a(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (this.f14255b == textView) {
            return;
        }
        b();
        this.f14255b = textView;
        this.f14254a.setTextSize(textView.getTextSize());
        a aVar = new a();
        this.f14256c = aVar;
        textView.addTextChangedListener(aVar);
        requestLayout();
        invalidate();
    }

    public final void b() {
        TextView textView = this.f14255b;
        if (textView != null) {
            a aVar = this.f14256c;
            if (aVar != null) {
                textView.removeTextChangedListener(aVar);
            }
            this.f14256c = null;
            try {
                textView.setOnScrollChangeListener(null);
            } catch (Throwable th2) {
                L80.a.a("LineNumberView", th2.toString());
            }
        }
        this.f14255b = null;
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Layout layout;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        TextView textView = this.f14255b;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return;
        }
        int scrollY = textView.getScrollY();
        int lineCount = layout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            int compoundPaddingTop = (textView.getCompoundPaddingTop() + layout.getLineBaseline(i11)) - scrollY;
            if (compoundPaddingTop + 1 >= 0) {
                if (compoundPaddingTop - 1 > getHeight()) {
                    return;
                } else {
                    canvas.drawText(String.valueOf(i11 + 1), getWidth() - this.f14257d, compoundPaddingTop, this.f14254a);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        int measuredHeight;
        TextView textView = this.f14255b;
        if (textView == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        Layout layout = textView.getLayout();
        int max = Math.max(textView.getLineCount(), 1);
        int measureText = (int) (this.f14258e + this.f14254a.measureText(String.valueOf(max)) + this.f14257d);
        if (layout != null) {
            compoundPaddingTop = textView.getCompoundPaddingTop() + layout.getLineTop(layout.getLineCount());
            compoundPaddingBottom = textView.getCompoundPaddingBottom();
        } else if (textView.getMeasuredHeight() > 0) {
            measuredHeight = textView.getMeasuredHeight();
            setMeasuredDimension(View.resolveSize(measureText, i11), View.resolveSize(measuredHeight, i12));
        } else {
            compoundPaddingTop = textView.getCompoundPaddingTop() + (textView.getLineHeight() * max);
            compoundPaddingBottom = textView.getCompoundPaddingBottom();
        }
        measuredHeight = compoundPaddingBottom + compoundPaddingTop;
        setMeasuredDimension(View.resolveSize(measureText, i11), View.resolveSize(measuredHeight, i12));
    }
}
