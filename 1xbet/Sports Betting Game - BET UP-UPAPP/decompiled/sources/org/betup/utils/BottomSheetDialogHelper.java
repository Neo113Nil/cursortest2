package org.betup.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import org.betup.R;

/* loaded from: classes4.dex */
public final class BottomSheetDialogHelper {
    private BottomSheetDialogHelper() {
    }

    public static void ensureDialogViewExpanded(final View view, final BottomSheetDialog dialog) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.utils.BottomSheetDialogHelper.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FrameLayout frameLayout;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BottomSheetDialog bottomSheetDialog = dialog;
                if (bottomSheetDialog == null || (frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) == null) {
                    return;
                }
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                from.setState(3);
                from.setPeekHeight(0);
            }
        });
    }
}
