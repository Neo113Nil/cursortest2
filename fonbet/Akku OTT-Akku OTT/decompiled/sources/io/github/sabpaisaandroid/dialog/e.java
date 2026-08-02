package io.github.sabpaisaandroid.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.haryanvi.netstream.R;
import io.github.sabpaisaandroid.activity.e;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends DialogFragment {
    public static final a Companion = new a();
    public final e.a a;
    public final boolean b;

    public static final class a {
    }

    public e(e.a param, boolean z) {
        Intrinsics.checkNotNullParameter(param, "param");
        this.a = param;
        this.b = z;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        setStyle(0, R.style.CustomDialog);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.sabpaisa_dialog_payment_error, viewGroup, false);
        if (this.b) {
            ((TextView) inflate.findViewById(R.id.redirecting_text)).setText("Transaction Blocked");
            ((TextView) inflate.findViewById(R.id.during_payment_process)).setText("Please Connect with SabPaisa Team.");
        }
        Button button = (Button) inflate.findViewById(R.id.try_again);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: io.github.sabpaisaandroid.dialog.d
                /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e this$0 = e.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    e.a aVar = this$0.a;
                    ?? r0 = aVar.b;
                    TransactionResponsesModel transactionResponsesModel = aVar.a;
                    if (transactionResponsesModel != null) {
                        r0.invoke(transactionResponsesModel);
                        return;
                    }
                    r0.invoke(null);
                    f fVar = aVar.c.d;
                    if (fVar != null) {
                        fVar.dismiss();
                    }
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
        window.setLayout(-1, -1);
    }
}
