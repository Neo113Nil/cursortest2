package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxHandler extends android.os.Handler {
    public static final int HANDLER_SHOW_DIALOG = 1;
    public static final int HANDLER_SHOW_EDITBOX_DIALOG = 2;
    private java.lang.ref.WeakReference<org.cocos2dx.lib.Cocos2dxActivity> mActivity;

    public Cocos2dxHandler(org.cocos2dx.lib.Cocos2dxActivity cocos2dxActivity) {
        this.mActivity = new java.lang.ref.WeakReference<>(cocos2dxActivity);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            showDialog(message);
        } else {
            if (i != 2) {
                return;
            }
            showEditBoxDialog(message);
        }
    }

    private void showDialog(android.os.Message message) {
        org.cocos2dx.lib.Cocos2dxActivity cocos2dxActivity = this.mActivity.get();
        org.cocos2dx.lib.Cocos2dxHandler.DialogMessage dialogMessage = (org.cocos2dx.lib.Cocos2dxHandler.DialogMessage) message.obj;
        new android.app.AlertDialog.Builder(cocos2dxActivity).setTitle(dialogMessage.titile).setMessage(dialogMessage.message).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() { // from class: org.cocos2dx.lib.Cocos2dxHandler.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
            }
        }).create().show();
    }

    private void showEditBoxDialog(android.os.Message message) {
        org.cocos2dx.lib.Cocos2dxHandler.EditBoxMessage editBoxMessage = (org.cocos2dx.lib.Cocos2dxHandler.EditBoxMessage) message.obj;
        new org.cocos2dx.lib.Cocos2dxEditBoxDialog(this.mActivity.get(), editBoxMessage.title, editBoxMessage.content, editBoxMessage.inputMode, editBoxMessage.inputFlag, editBoxMessage.returnType, editBoxMessage.maxLength).show();
    }

    public static class DialogMessage {
        public java.lang.String message;
        public java.lang.String titile;

        public DialogMessage(java.lang.String str, java.lang.String str2) {
            this.titile = str;
            this.message = str2;
        }
    }

    public static class EditBoxMessage {
        public java.lang.String content;
        public int inputFlag;
        public int inputMode;
        public int maxLength;
        public int returnType;
        public java.lang.String title;

        public EditBoxMessage(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
            this.content = str2;
            this.title = str;
            this.inputMode = i;
            this.inputFlag = i2;
            this.returnType = i3;
            this.maxLength = i4;
        }
    }
}
