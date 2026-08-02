package org.betup.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import org.betup.R;

/* loaded from: classes4.dex */
public final class LocalToastUtil {
    private LocalToastUtil() {
    }

    public static void showLocalToast(Context context, String str) {
        if (Locale.getDefault().getLanguage().equals("en")) {
            return;
        }
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_border, (ViewGroup) null);
        Toast makeText = Toast.makeText(context, str, 0);
        ((TextView) inflate.findViewById(R.id.text)).setText(str);
        makeText.setView(inflate);
        makeText.show();
    }

    public static void showLocalToast(Context context, int strRes) {
        if (Locale.getDefault().getLanguage().equals("en")) {
            return;
        }
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_border, (ViewGroup) null);
        Toast makeText = Toast.makeText(context, strRes, 0);
        ((TextView) inflate.findViewById(R.id.text)).setText(context.getString(strRes));
        makeText.setView(inflate);
        makeText.show();
    }
}
