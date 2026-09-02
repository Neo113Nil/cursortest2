package com.goldenboot.saga.zone;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class AlphaProcessor extends MultiAutoCompleteTextView {
    public static final int[] attachConfig = {R.attr.popupBackground};
    public final FocusEntry connectPatch;
    public final DpadRevision notifyMessage;
    public final SurfaceArbitrator reduceScope;

    public AlphaProcessor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlphaEncoder.peekRevision);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            surfaceArbitrator.growPayload();
        }
        DpadRevision dpadRevision = this.notifyMessage;
        if (dpadRevision != null) {
            dpadRevision.growPayload();
        }
    }

    public void evictLayout(FocusEntry focusEntry) {
        KeyListener keyListener = getKeyListener();
        if (focusEntry.growPayload(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener evictLayout = focusEntry.evictLayout(keyListener);
            if (evictLayout == keyListener) {
                return;
            }
            super.setKeyListener(evictLayout);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            return surfaceArbitrator.injectMetric();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            return surfaceArbitrator.detachStream();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.notifyMessage.popBlueprint();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.notifyMessage.drawField();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.connectPatch.releaseHeader(SelectionExtractor.evictLayout(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            surfaceArbitrator.clipOrigin(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            surfaceArbitrator.flushSample(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        DpadRevision dpadRevision = this.notifyMessage;
        if (dpadRevision != null) {
            dpadRevision.notifyMessage();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        DpadRevision dpadRevision = this.notifyMessage;
        if (dpadRevision != null) {
            dpadRevision.notifyMessage();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(CarouselPool.growPayload(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.connectPatch.clipOrigin(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.connectPatch.evictLayout(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            surfaceArbitrator.applyTask(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SurfaceArbitrator surfaceArbitrator = this.reduceScope;
        if (surfaceArbitrator != null) {
            surfaceArbitrator.popBlueprint(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.notifyMessage.gatherAdapter(colorStateList);
        this.notifyMessage.growPayload();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.notifyMessage.decodePath(mode);
        this.notifyMessage.growPayload();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        DpadRevision dpadRevision = this.notifyMessage;
        if (dpadRevision != null) {
            dpadRevision.connectPatch(context, i);
        }
    }

    public AlphaProcessor(Context context, AttributeSet attributeSet, int i) {
        super(MenuEvent.growPayload(context), attributeSet, i);
        LegacySerializer.evictLayout(this, getContext());
        BackgroundDemux drawRequest = BackgroundDemux.drawRequest(getContext(), attributeSet, attachConfig, i, 0);
        if (drawRequest.resetDelta(0)) {
            setDropDownBackgroundDrawable(drawRequest.flushSample(0));
        }
        drawRequest.decodePath();
        SurfaceArbitrator surfaceArbitrator = new SurfaceArbitrator(this);
        this.reduceScope = surfaceArbitrator;
        surfaceArbitrator.releaseHeader(attributeSet, i);
        DpadRevision dpadRevision = new DpadRevision(this);
        this.notifyMessage = dpadRevision;
        dpadRevision.peekRevision(attributeSet, i);
        dpadRevision.growPayload();
        FocusEntry focusEntry = new FocusEntry(this);
        this.connectPatch = focusEntry;
        focusEntry.detachStream(attributeSet, i);
        evictLayout(focusEntry);
    }
}
