package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* loaded from: classes6.dex */
public class MBFeedBackDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f10364a;
    private Button b;
    private LinearLayout c;
    private com.mbridge.msdk.widget.dialog.b d;
    private Button e;
    private TextView f;
    private int g;
    private int h;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.d != null) {
                MBFeedBackDialog.this.d.b();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.d != null) {
                MBFeedBackDialog.this.d.a();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBFeedBackDialog.this.dismiss();
            if (MBFeedBackDialog.this.d != null) {
                MBFeedBackDialog.this.d.c();
            }
        }
    }

    class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (MBFeedBackDialog.this.d != null) {
                MBFeedBackDialog.this.d.a();
            }
        }
    }

    public MBFeedBackDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(i0.a(context, "mbridge_cm_feedbackview", "layout"), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.d = bVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f = (TextView) inflate.findViewById(i0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                q0.a("MBAlertDialog", e.getMessage());
            }
            try {
                this.c = (LinearLayout) inflate.findViewById(i0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.b = (Button) inflate.findViewById(i0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f10364a = (Button) inflate.findViewById(i0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.e = (Button) inflate.findViewById(i0.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e2) {
                q0.a("MBAlertDialog", e2.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        a();
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public void clear() {
        if (this.d != null) {
            this.d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(4098);
            f1.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z) {
        Button button = this.f10364a;
        if (button != null) {
            button.setClickable(z);
            if (z) {
                this.f10364a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f10364a.setAlpha(1.0f);
            } else {
                this.f10364a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
                this.f10364a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f10364a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.rightMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 16.0f);
            layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            layoutParams.bottomMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 3.0f);
            this.c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f, float f2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (!isScreenOrientationPortrait(getContext())) {
            this.h = displayMetrics.heightPixels;
            this.g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = (int) (this.g * f);
            attributes.height = -1;
            attributes.gravity = 17;
            getWindow().setAttributes(attributes);
            return;
        }
        this.h = displayMetrics.widthPixels;
        this.g = displayMetrics.heightPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = -1;
        attributes2.height = (int) (this.g * f2);
        attributes2.gravity = 80;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(com.mbridge.msdk.widget.dialog.b bVar) {
        this.d = bVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            q0.b("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    private void a() {
        Button button = this.f10364a;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.b;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        Button button3 = this.e;
        if (button3 != null) {
            button3.setOnClickListener(new c());
        }
        setOnCancelListener(new d());
    }
}
