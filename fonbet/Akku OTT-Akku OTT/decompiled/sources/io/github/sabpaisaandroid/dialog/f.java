package io.github.sabpaisaandroid.dialog;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.haryanvi.netstream.R;
import io.github.sabpaisaandroid.activity.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends DialogFragment {
    public static final a Companion = new a();
    public final e.b a;

    public static final class a {
    }

    public f(e.b param) {
        Intrinsics.checkNotNullParameter(param, "param");
        this.a = param;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        setStyle(0, R.style.CustomDialog);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.sabpaisa_dialog_payment_success, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        io.github.sabpaisaandroid.activity.e eVar = new io.github.sabpaisaandroid.activity.e();
        try {
            if (eVar.getApplicationContext() != null) {
                MediaPlayer create = MediaPlayer.create(eVar.getApplicationContext(), R.raw.success);
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                create.start();
            }
        } catch (Exception unused) {
        }
    }
}
