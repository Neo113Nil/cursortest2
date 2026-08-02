package io.github.sabpaisaandroid.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.haryanvi.netstream.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends DialogFragment {
    public static final a Companion = new a();
    public final io.github.sabpaisaandroid.activity.d a;
    public Button b;
    public Button c;

    public static final class a {
    }

    public c(io.github.sabpaisaandroid.activity.d iSelectionCallBack) {
        Intrinsics.checkNotNullParameter(iSelectionCallBack, "iSelectionCallBack");
        this.a = iSelectionCallBack;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.sabpaisa_cancel_layout, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        this.b = (Button) inflate.findViewById(R.id.yes_button);
        this.c = (Button) inflate.findViewById(R.id.no_button);
        Button button = this.b;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: io.github.sabpaisaandroid.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c this$0 = c.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.dismiss();
                    this$0.a.a.invoke(null);
                }
            });
        }
        Button button2 = this.c;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: io.github.sabpaisaandroid.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c this$0 = c.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.dismiss();
                }
            });
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }
}
