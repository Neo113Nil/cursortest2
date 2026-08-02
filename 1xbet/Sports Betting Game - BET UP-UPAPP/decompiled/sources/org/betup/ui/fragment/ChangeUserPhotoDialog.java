package org.betup.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.ui.fragment.home.dialog.BaseDialog;

/* loaded from: classes4.dex */
public class ChangeUserPhotoDialog extends BaseDialog {

    @BindView(R.id.cancelPhotoDialog)
    Button cancel;

    @BindView(R.id.fromCameraButton)
    Button fromCamera;

    @BindView(R.id.fromGalleryButton)
    Button fromGallery;
    private OnPhotoDialogClickListener onPhotoDialogClickListener;

    public interface OnPhotoDialogClickListener {
        void onFromCameraClick();

        void onFromGalleryClick();
    }

    public ChangeUserPhotoDialog(Context context) {
        super(context);
    }

    @Override // org.betup.ui.fragment.home.dialog.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_user_photo);
        ButterKnife.bind(this);
        resizeDialog();
    }

    @OnClick({R.id.fromGalleryButton})
    void fromGalleryClick() {
        this.onPhotoDialogClickListener.onFromGalleryClick();
    }

    @OnClick({R.id.fromCameraButton})
    void fromCameraClick() {
        this.onPhotoDialogClickListener.onFromCameraClick();
    }

    @OnClick({R.id.cancelPhotoDialog})
    void cancelClick() {
        dismiss();
    }

    public ChangeUserPhotoDialog setOnPhotoDialogClickListener(OnPhotoDialogClickListener onPhotoDialogClickListener) {
        this.onPhotoDialogClickListener = onPhotoDialogClickListener;
        return this;
    }
}
