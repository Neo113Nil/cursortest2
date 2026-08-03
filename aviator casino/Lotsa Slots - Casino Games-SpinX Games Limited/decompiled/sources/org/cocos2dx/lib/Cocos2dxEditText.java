package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxEditText extends android.widget.EditText {
    private org.cocos2dx.lib.Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;

    public Cocos2dxEditText(android.content.Context context) {
        super(context);
    }

    public Cocos2dxEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Cocos2dxEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setCocos2dxGLSurfaceView(org.cocos2dx.lib.Cocos2dxGLSurfaceView cocos2dxGLSurfaceView) {
        this.mCocos2dxGLSurfaceView = cocos2dxGLSurfaceView;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        super.onKeyDown(i, keyEvent);
        if (i != 4) {
            return true;
        }
        this.mCocos2dxGLSurfaceView.requestFocus();
        return true;
    }
}
