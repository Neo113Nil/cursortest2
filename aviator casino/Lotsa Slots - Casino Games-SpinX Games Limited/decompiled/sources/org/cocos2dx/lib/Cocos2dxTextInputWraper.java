package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxTextInputWraper implements android.text.TextWatcher, android.widget.TextView.OnEditorActionListener {
    private static final java.lang.String TAG = "Cocos2dxTextInputWraper";
    private final org.cocos2dx.lib.Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private java.lang.String mOriginText;
    private java.lang.String mText;

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public Cocos2dxTextInputWraper(org.cocos2dx.lib.Cocos2dxGLSurfaceView cocos2dxGLSurfaceView) {
        this.mCocos2dxGLSurfaceView = cocos2dxGLSurfaceView;
    }

    private boolean isFullScreenEdit() {
        return ((android.view.inputmethod.InputMethodManager) this.mCocos2dxGLSurfaceView.getCocos2dxEditText().getContext().getSystemService("input_method")).isFullscreenMode();
    }

    public void setOriginText(java.lang.String str) {
        this.mOriginText = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (isFullScreenEdit()) {
            return;
        }
        int length = editable.length() - this.mText.length();
        if (length > 0) {
            this.mCocos2dxGLSurfaceView.insertText(editable.subSequence(this.mText.length(), editable.length()).toString());
        } else {
            while (length < 0) {
                this.mCocos2dxGLSurfaceView.deleteBackward();
                length++;
            }
        }
        this.mText = editable.toString();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.mText = charSequence.toString();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (this.mCocos2dxGLSurfaceView.getCocos2dxEditText() == textView && isFullScreenEdit()) {
            java.lang.String str = this.mOriginText;
            if (str != null) {
                for (int length = str.length(); length > 0; length--) {
                    this.mCocos2dxGLSurfaceView.deleteBackward();
                }
            }
            java.lang.String charSequence = textView.getText().toString();
            if (charSequence != null) {
                if (charSequence.compareTo("") == 0) {
                    charSequence = "\n";
                }
                if ('\n' != charSequence.charAt(charSequence.length() - 1)) {
                    charSequence = charSequence + '\n';
                }
            }
            this.mCocos2dxGLSurfaceView.insertText(charSequence);
        }
        if (i != 6) {
            return false;
        }
        this.mCocos2dxGLSurfaceView.requestFocus();
        return false;
    }
}
