package org.betup.ui.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class ChangeUserPhotoDialog_ViewBinding implements Unbinder {
    private ChangeUserPhotoDialog target;
    private View view7f0a0177;
    private View view7f0a0322;
    private View view7f0a0323;

    public ChangeUserPhotoDialog_ViewBinding(ChangeUserPhotoDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public ChangeUserPhotoDialog_ViewBinding(final ChangeUserPhotoDialog target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.fromGalleryButton, "field 'fromGallery' and method 'fromGalleryClick'");
        target.fromGallery = (Button) Utils.castView(findRequiredView, R.id.fromGalleryButton, "field 'fromGallery'", Button.class);
        this.view7f0a0323 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.ChangeUserPhotoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.fromGalleryClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.fromCameraButton, "field 'fromCamera' and method 'fromCameraClick'");
        target.fromCamera = (Button) Utils.castView(findRequiredView2, R.id.fromCameraButton, "field 'fromCamera'", Button.class);
        this.view7f0a0322 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.ChangeUserPhotoDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.fromCameraClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(source, R.id.cancelPhotoDialog, "field 'cancel' and method 'cancelClick'");
        target.cancel = (Button) Utils.castView(findRequiredView3, R.id.cancelPhotoDialog, "field 'cancel'", Button.class);
        this.view7f0a0177 = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.ChangeUserPhotoDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.cancelClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ChangeUserPhotoDialog changeUserPhotoDialog = this.target;
        if (changeUserPhotoDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        changeUserPhotoDialog.fromGallery = null;
        changeUserPhotoDialog.fromCamera = null;
        changeUserPhotoDialog.cancel = null;
        this.view7f0a0323.setOnClickListener(null);
        this.view7f0a0323 = null;
        this.view7f0a0322.setOnClickListener(null);
        this.view7f0a0322 = null;
        this.view7f0a0177.setOnClickListener(null);
        this.view7f0a0177 = null;
    }
}
