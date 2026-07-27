package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* loaded from: classes6.dex */
public class MBNativeRollView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private RollingBCView f9659a;
    private Context b;
    private NativeListener.FilpListener c;

    public interface a {
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9659a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f9659a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.c = filpListener;
            this.f9659a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i) {
        this.f9659a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f9659a = rollingBCView;
        addView(rollingBCView);
        this.f9659a.setLayoutParams(new LinearLayout.LayoutParams((int) (v0.j(context) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
